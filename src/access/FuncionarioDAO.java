package access;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import static javax.swing.JOptionPane.showMessageDialog;
import models.FuncionarioModel;
import utils.DBConnection;

/**
 *
 * @author JCode
 */
public class FuncionarioDAO {
    private Connection conn = null;
    
    public int validateFuncionario(int identificacion) {
        int verificado = 0;
        
        try {
            if(conn == null)
                conn = DBConnection.getDBConnection();
            
            String query = " SELECT verificado FROM funcionario WHERE id_usuario = " + identificacion + ";";
            
            Statement statement = conn.createStatement();
            ResultSet result = statement.executeQuery(query);
            
            while(result.next()) {
                verificado = result.getInt(1);
            }
        } catch (SQLException ex) {
            showMessageDialog(null, "Se ha producido un error al obtener la validación del funcionario.", "Error Consulta", 0);
        }
        
        return verificado;
    }
    
    public FuncionarioModel getOneFuncionario(int identificacion) {
        FuncionarioModel funcionario = null;
        
        try {
            if(conn == null)
                conn = DBConnection.getDBConnection();
            
            String query = "SELECT f.cargo, f.email, f.verificado, f.fecha_creacion, u.identificacion, "
                    + "u.primer_nombre, u.segundo_nombre, u.primer_apellido, u.segundo_apellido, "
                    + "u.contraseña, u.telefono, u.tipo, u.ultimo_acceso "
                    + "FROM funcionario AS f "
                    + "INNER JOIN usuario AS u "
                    + "ON f.id_usuario = u.identificacion "
                    + "WHERE u.identificacion = " + identificacion + ";";
            
            
            Statement statement = conn.createStatement();
            ResultSet result = statement.executeQuery(query);
            
            while(result.next()) {
                funcionario = new FuncionarioModel(result.getString(1), result.getString(2), result.getInt(3), result.getString(4), result.getInt(5), result.getString(6), result.getString(7), result.getString(8), result.getString(9), result.getString(10), result.getString(11), result.getString(12), result.getString(13));
            }
        } catch (SQLException ex) {
            showMessageDialog(null, "Se ha producido un error al obtener el funcionario.", "Error Consulta", 0);
        }
        
        return  funcionario;
    }
    
    public boolean setVerificado(int identificacion) {
        boolean exito = false;
        
        try {
            if(conn == null)
                conn = DBConnection.getDBConnection();
            
            String query = "UPDATE funcionario SET verificado = 1 WHERE id_usuario = ?;";
            
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setInt(1, identificacion);
            
            int affectedRows = statement.executeUpdate();
            
            if(affectedRows > 0) {
                exito = true;
            }
        } catch (SQLException ex) {
            showMessageDialog(null, "Se ha producido un error al actualizar el estado de verificación.", "Error Consulta", 0);
        }
        
        return exito;
    }
}
