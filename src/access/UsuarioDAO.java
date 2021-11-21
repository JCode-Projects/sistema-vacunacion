package access;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import static javax.swing.JOptionPane.showMessageDialog;
import models.UsuarioModel;
import utils.DBConnection;

/**
 *
 * @author JCode
 */
public class UsuarioDAO {
    private Connection conn = null;
    
    public UsuarioModel getOneUsuario(int identificacion) {
        UsuarioModel usuario = null;
        
        try {
            if(conn == null)
                conn = DBConnection.getDBConnection();
            
            String query = "SELECT identificacion, primer_nombre, segundo_nombre, primer_apellido, segundo_apellido, contraseña, telefono, tipo, ultimo_acceso FROM usuario WHERE identificacion = " + identificacion + ";";
            
            Statement statement = conn.createStatement();
            ResultSet result = statement.executeQuery(query);
            
            while(result.next()) {
                usuario = new UsuarioModel(result.getInt(1), result.getString(2), result.getString(3), result.getString(4), result.getString(5), result.getString(6), result.getString(7), result.getString(8), result.getString(9));
            }
        } catch (SQLException ex) {
            showMessageDialog(null, "Se ha producido un error al obtener el usuario.", "Error Consulta", 0);
        }
        
        return usuario;
    }
    
    public void setFechaUltimoAcceso(int identificacion, String fecha) {
        try {
            if(conn == null)
                conn = DBConnection.getDBConnection();
            
            String query = "UPDATE usuario SET ultimo_acceso = ? WHERE identificacion = ?;";
            
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setString(1, fecha);
            statement.setInt(2, identificacion);
            
            int affectedRows = statement.executeUpdate();
            
            if(affectedRows < 1) {
                showMessageDialog(null, "Algo ha salido mal, vuelve a ejecutar el programa.", "Error Desconocido", 0);
                System.exit(0);
            }
        } catch (SQLException ex) {
            showMessageDialog(null, "Se ha producido un error al obtener el usuario.", "Error Consulta", 0);
        }
    }
    
    public boolean setContraseña(String contraseña, int identificacion) {
        boolean exito = false;
        
        try {
            if(conn == null)
                conn = DBConnection.getDBConnection();
            
            String query = "UPDATE usuario SET contraseña = ? WHERE identificacion = ?;";
            
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setString(1, contraseña);
            statement.setInt(2, identificacion);
            
            int affectedRows = statement.executeUpdate();
            
            if(affectedRows > 0) {
                exito = true;
            }
        } catch (SQLException ex) {
            showMessageDialog(null, "Se ha producido un error al obtener el usuario.", "Error Consulta", 0);
        }
        
        return exito; 
    }
}
