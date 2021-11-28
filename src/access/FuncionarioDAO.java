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
            
            String query = "SELECT f.id_funcionario, f.cargo, f.email, f.verificado, f.fecha_creacion, u.identificacion, "
                    + "u.primer_nombre, u.segundo_nombre, u.primer_apellido, u.segundo_apellido, "
                    + "u.contraseña, u.telefono, u.tipo, u.ultimo_acceso "
                    + "FROM funcionario AS f "
                    + "INNER JOIN usuario AS u "
                    + "ON f.id_usuario = u.identificacion "
                    + "WHERE u.identificacion = " + identificacion + ";";
            
            
            Statement statement = conn.createStatement();
            ResultSet result = statement.executeQuery(query);
            
            while(result.next()) {
                funcionario = new FuncionarioModel(result.getInt(1), result.getString(2), result.getString(3), result.getInt(4), result.getString(5), result.getInt(6), result.getString(7), result.getString(8), result.getString(9), result.getString(10), result.getString(11), result.getString(12), result.getString(13), result.getString(14));
            }
        } catch (SQLException ex) {
            showMessageDialog(null, "Se ha producido un error al obtener el funcionario.", "Error Consulta", 0);
        }
        
        return  funcionario;
    }
    
    public ArrayList<FuncionarioModel> getAllFuncionarios() {
        ArrayList<FuncionarioModel> funcionarios = new ArrayList<FuncionarioModel>();
        
        try {
            if(conn == null)
                conn = DBConnection.getDBConnection();
            
            String query = "SELECT f.id_funcionario, f.cargo, f.email, f.verificado, f.fecha_creacion, u.identificacion, "
                    + "u.primer_nombre, u.segundo_nombre, u.primer_apellido, u.segundo_apellido, "
                    + "u.contraseña, u.telefono, u.tipo, u.ultimo_acceso "
                    + "FROM funcionario AS f "
                    + "INNER JOIN usuario AS u "
                    + "ON f.id_usuario = u.identificacion";
            
            
            Statement statement = conn.createStatement();
            ResultSet result = statement.executeQuery(query);
            
            while(result.next()) {
                funcionarios.add(new FuncionarioModel(result.getInt(1), result.getString(2), result.getString(3), result.getInt(4), result.getString(5), result.getInt(6), result.getString(7), result.getString(8), result.getString(9), result.getString(10), result.getString(11), result.getString(12), result.getString(13), result.getString(14)));
            }
        } catch (SQLException ex) {
            showMessageDialog(null, "Se ha producido un error al obtener la lista de pacientes.", "Error Consulta", 0);
        }
        
        return funcionarios;
    }
    
    public boolean insertOneFuncionario(FuncionarioModel funcionario) {
        boolean insertado = false;
        
        try {
            if(conn == null)
                conn = DBConnection.getDBConnection();
            
            String query = " INSERT INTO usuario (identificacion, primer_nombre, segundo_nombre, primer_apellido, segundo_apellido, telefono, tipo) "
                    + "VALUES (?, ?, ?, ?, ?, ?, ?);";
            
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setInt(1, funcionario.getIdentificacion());
            statement.setString(2, funcionario.getPrimerNombre());
            statement.setString(3, funcionario.getSegundoNombre());
            statement.setString(4, funcionario.getPrimerApellido());
            statement.setString(5, funcionario.getSegundoApellido());
            statement.setString(6, funcionario.getTelefono());
            statement.setString(7, "FUN");
            
            int affectedRows = statement.executeUpdate();
            
            if(affectedRows > 0) {
                query = "INSERT INTO funcionario (cargo, email, verificado, fecha_creacion, id_usuario) "
                        + "VALUES (?, ?, ?, ?, ?);";
                
                statement = conn.prepareStatement(query);
                statement.setString(1, funcionario.getCargo());
                statement.setString(2, funcionario.getEmail());
                statement.setInt(3, funcionario.getVerificado());
                statement.setString(4, funcionario.getFechaCreacion());
                statement.setInt(5, funcionario.getIdentificacion());
                
                affectedRows = statement.executeUpdate();
                
                if(affectedRows > 0) {
                    insertado = true;
                }
            }
        } catch (SQLException ex) {
            showMessageDialog(null, "Se ha producido un error al insertar el funcionario\n verifica la información e intenta nuevamente.", "Error Consulta", 0);
        }
        
        return insertado;
    }
    
    public boolean updateOneFuncionario(FuncionarioModel paciente, int identificacion) {
        boolean actualizado = false;
        
        try {
            if(conn == null)
                conn = DBConnection.getDBConnection();
            
            String query = "UPDATE usuario SET identificacion = ?, primer_nombre = ?, "
                    + "segundo_nombre = ?, primer_apellido = ?, segundo_apellido = ?, "
                    + "telefono = ? WHERE identificacion = ?;";
            
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setInt(1, paciente.getIdentificacion());
            statement.setString(2, paciente.getPrimerNombre());
            statement.setString(3, paciente.getSegundoNombre());
            statement.setString(4, paciente.getPrimerApellido());
            statement.setString(5, paciente.getSegundoApellido());
            statement.setString(6, paciente.getTelefono());
            statement.setInt(7, identificacion);
            
            int affectedRows = statement.executeUpdate();
            
            if(affectedRows > 0) {
                query = "UPDATE funcionario SET cargo = ?, email = ? WHERE id_usuario = ?;";
                
                statement = conn.prepareStatement(query);
                statement.setString(1, paciente.getCargo());
                statement.setString(2, paciente.getEmail());
                statement.setInt(3, paciente.getIdentificacion());
                
                affectedRows = statement.executeUpdate();
                
                if(affectedRows > 0) {
                    actualizado = true;
                }
            }
        } catch (SQLException ex) {
            showMessageDialog(null, "No se pudo actualizar el funcionario, recuerda que \nel número de identificación no se debe modificar.", "Error Actualización", 0);
        }
        
        return actualizado;
    }
    
    public boolean deleteOneFuncionario(int identificacion) {
        boolean eliminado = false;
        
        try {
            if(conn == null)
                conn = DBConnection.getDBConnection();
            
            String query = "DELETE fun, usu "
                    + "FROM funcionario AS fun "
                    + "LEFT JOIN usuario AS usu ON fun.id_usuario = usu.identificacion "
                    + "WHERE fun.id_usuario = ?;";
            
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setInt(1, identificacion);
            
            int affectedRows = statement.executeUpdate();
            
            if(affectedRows > 0) {
                eliminado = true;
            }
        } catch (SQLException ex) {
            showMessageDialog(null, "No se pudo eliminar el funcionario, algo ha salido mal.", "Error Eliminación", 0);
        }
        
        return eliminado;
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
