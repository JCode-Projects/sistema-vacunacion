package access;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import static javax.swing.JOptionPane.showMessageDialog;
import models.PacienteModel;
import utils.DBConnection;

/**
 *
 * @author JCode
 */
public class PacienteDAO {
    private Connection conn = null;
    
    public int validatePaciente(int identificacion) {
        int verificado = 0;
        
        try {
            if(conn == null)
                conn = DBConnection.getDBConnection();
            
            String query = " SELECT verificado FROM paciente WHERE id_usuario = " + identificacion + ";";
            
            Statement statement = conn.createStatement();
            ResultSet result = statement.executeQuery(query);
            
            while(result.next()) {
                verificado = result.getInt(1);
            }
        } catch (SQLException ex) {
            showMessageDialog(null, "Se ha producido un error al obtener la validación del paciente.", "Error Consulta", 0);
        }
        
        return verificado;
    }
    
    public int getIdPacienteWhitIdentificacion(int identificacion) {
        int id = 0;
        
        try {
            if(conn == null)
                conn = DBConnection.getDBConnection();
            
            String query = "SELECT id_paciente FROM paciente WHERE id_usuario = " + identificacion + ";";
            
            Statement statement = conn.createStatement();
            ResultSet result = statement.executeQuery(query);
            
            while(result.next()) {
                id = result.getInt(1);
            }
        } catch (SQLException ex) {
            showMessageDialog(null, "Se ha producido un error al obtener el id.", "Error Consulta", 0);
        }
        
        return id;
    }
    
    public int getIdentificacionWhitIdPaciente(int id) {
        int identificacion = 0;
        
        try {
            if(conn == null)
                conn = DBConnection.getDBConnection();
            
            String query = "SELECT id_usuario FROM paciente WHERE id_paciente = " + identificacion + ";";
            
            Statement statement = conn.createStatement();
            ResultSet result = statement.executeQuery(query);
            
            while(result.next()) {
                identificacion = result.getInt(1);
            }
        } catch (SQLException ex) {
            showMessageDialog(null, "Se ha producido un error al obtener la identificación.", "Error Consulta", 0);
        }
        
        return identificacion;
    }
    
    public PacienteModel getOnePaciente(int identificacion) {
        PacienteModel paciente = null;
        
        try {
            if(conn == null)
                conn = DBConnection.getDBConnection();
            
            String query = "SELECT p.email, p.direccion, p.edad, p.verificado, p.fecha_creacion, u.identificacion, "
                    + "u.primer_nombre, u.segundo_nombre, u.primer_apellido, u.segundo_apellido, u.contraseña, "
                    + "u.telefono, u.tipo, u.ultimo_acceso "
                    + "FROM paciente AS p "
                    + "INNER JOIN usuario AS u "
                    + "ON p.id_usuario = u.identificacion "
                    + "WHERE u.identificacion = " + identificacion + ";";
            
            
            Statement statement = conn.createStatement();
            ResultSet result = statement.executeQuery(query);
            
            while(result.next()) {
                paciente = new PacienteModel(result.getString(1), result.getString(2), result.getInt(3), result.getInt(4), result.getString(5), result.getInt(6), result.getString(7), result.getString(8), result.getString(9), result.getString(10), result.getString(11), result.getString(12), result.getString(13), result.getString(14));
            }
        } catch (SQLException ex) {
            showMessageDialog(null, "Se ha producido un error al obtener el paciente.", "Error Consulta", 0);
        }
        
        return  paciente;
    }
    
    public ArrayList<PacienteModel> getAllPacientes() {
        ArrayList<PacienteModel> pacientes = new ArrayList<PacienteModel>();
        
        try {
            if(conn == null)
                conn = DBConnection.getDBConnection();
            
            String query = "SELECT p.email, p.direccion, p.edad, p.verificado, p.fecha_creacion, u.identificacion, "
                    + "u.primer_nombre, u.segundo_nombre, u.primer_apellido, u.segundo_apellido, u.contraseña, "
                    + "u.telefono, u.tipo, u.ultimo_acceso "
                    + "FROM paciente AS p "
                    + "INNER JOIN usuario AS u "
                    + "ON p.id_usuario = u.identificacion;";
            
            
            Statement statement = conn.createStatement();
            ResultSet result = statement.executeQuery(query);
            
            while(result.next()) {
                pacientes.add(new PacienteModel(result.getString(1), result.getString(2), result.getInt(3), result.getInt(4), result.getString(5), result.getInt(6), result.getString(7), result.getString(8), result.getString(9), result.getString(10), result.getString(11), result.getString(12), result.getString(13), result.getString(14)));
            }
        } catch (SQLException ex) {
            showMessageDialog(null, "Se ha producido un error al obtener la lista de pacientes.", "Error Consulta", 0);
        }
        
        return pacientes;
    }
    
    public boolean setVerificado(int identificacion) {
        boolean exito = false;
        
        try {
            if(conn == null)
                conn = DBConnection.getDBConnection();
            
            String query = "UPDATE paciente SET verificado = 1 WHERE id_usuario = ?;";
            
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
    
    public boolean insertOnePaciente(PacienteModel paciente) {
        boolean insertado = false;
        
        try {
            if(conn == null)
                conn = DBConnection.getDBConnection();
            
            String query = " INSERT INTO usuario (identificacion, primer_nombre, segundo_nombre, primer_apellido, segundo_apellido, telefono, tipo) "
                    + "VALUES (?, ?, ?, ?, ?, ?, ?);";
            
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setInt(1, paciente.getIdentificacion());
            statement.setString(2, paciente.getPrimerNombre());
            statement.setString(3, paciente.getSegundoNombre());
            statement.setString(4, paciente.getPrimerApellido());
            statement.setString(5, paciente.getSegundoApellido());
            statement.setString(6, paciente.getTelefono());
            statement.setString(7, "USU");
            
            int affectedRows = statement.executeUpdate();
            
            if(affectedRows > 0) {
                query = "INSERT INTO paciente (email, direccion, edad, verificado, fecha_creacion, id_usuario) "
                        + "VALUES (?, ?, ?, ?, ?, ?);";
                
                statement = conn.prepareStatement(query);
                statement.setString(1, paciente.getEmail());
                statement.setString(2, paciente.getDireccion());
                statement.setInt(3, paciente.getEdad());
                statement.setInt(4, paciente.getVerificado());
                statement.setString(5, paciente.getFechaCreacion());
                statement.setInt(6, paciente.getIdentificacion());
                
                affectedRows = statement.executeUpdate();
                
                if(affectedRows > 0) {
                    insertado = true;
                }
            }
        } catch (SQLException ex) {
            showMessageDialog(null, "Se ha producido un error al insertar el paciente\n verifica la información e intenta nuevamente.", "Error Consulta", 0);
        }
        
        return insertado;
    }
    
    public boolean updateOnePaciente(PacienteModel paciente, int identificacion) {
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
                query = "UPDATE paciente SET email = ?, direccion = ?, edad = ? WHERE id_usuario = ?;";
                
                statement = conn.prepareStatement(query);
                statement.setString(1, paciente.getEmail());
                statement.setString(2, paciente.getDireccion());
                statement.setInt(3, paciente.getEdad());
                statement.setInt(4, paciente.getIdentificacion());
                
                affectedRows = statement.executeUpdate();
                
                if(affectedRows > 0) {
                    actualizado = true;
                }
            }
        } catch (SQLException ex) {
            showMessageDialog(null, "No se pudo actualizar el paciente, recuerda que \nel número de identificación no se debe modificar.", "Error Actualización", 0);
        }
        
        return actualizado;
    }
    
    public boolean deleteOnePaciente(int identificacion) {
        boolean eliminado = false;
        
        try {
            if(conn == null)
                conn = DBConnection.getDBConnection();
            
            String query = "DELETE pac, usu "
                    + "FROM paciente AS pac "
                    + "LEFT JOIN usuario AS usu ON pac.id_usuario = usu.identificacion "
                    + "WHERE pac.id_usuario = ?;";
            
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setInt(1, identificacion);
            
            int affectedRows = statement.executeUpdate();
            
            if(affectedRows > 0) {
                eliminado = true;
            }
        } catch (SQLException ex) {
            showMessageDialog(null, "No se pudo eliminar el paciente, verifica que no \nexista un registro de vacunación para el.", "Error Actualización", 0);
        }
        
        return eliminado;
    }
}
