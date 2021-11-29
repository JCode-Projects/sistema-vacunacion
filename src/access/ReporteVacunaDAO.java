package access;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import static javax.swing.JOptionPane.showMessageDialog;
import models.ReporteVacunaModel;
import utils.DBConnection;

/**
 *
 * @author JCode
 */
public class ReporteVacunaDAO {

    private Connection conn = null;

    public ReporteVacunaModel getOneReporteVacuna(int id) {
        ReporteVacunaModel reporteVacuna = null;

        try {
            if (conn == null) {
                conn = DBConnection.getDBConnection();
            }

            String query = " SELECT rv.id_reporte, rv.fecha_aplicacion, rv.fecha_refuerzo, "
                    + "rv.id_paciente, pc.id_usuario, rv.id_funcionario, fn.id_usuario, "
                    + "rv.id_lote, lv.id_vacuna, vc.farmaceutica "
                    + "FROM reporte_vacuna AS rv "
                    + "INNER JOIN paciente AS pc ON rv.id_paciente = pc.id_paciente "
                    + "INNER JOIN funcionario AS fn ON rv.id_funcionario = fn.id_funcionario "
                    + "INNER JOIN lote_vacuna AS lv ON rv.id_lote = lv.id_lote "
                    + "INNER JOIN vacuna AS vc ON lv.id_vacuna = vc.id_vacuna "
                    + "WHERE rv.id_reporte = " + id + ";";

            Statement statement = conn.createStatement();
            ResultSet result = statement.executeQuery(query);

            while (result.next()) {
                reporteVacuna = new ReporteVacunaModel(result.getInt(1), result.getString(2), result.getString(3), result.getInt(4), result.getInt(5), result.getInt(6), result.getInt(7), result.getInt(8), result.getInt(9), result.getString(10));
            }
        } catch (SQLException ex) {
            showMessageDialog(null, "Se ha producido un error al obtener el reporte.", "Error Consulta", 0);
        }

        return reporteVacuna;
    }
    
    public ReporteVacunaModel getOneReporteVacunaByIdUsuario(int id) {
        ReporteVacunaModel reporteVacuna = null;

        try {
            if (conn == null) {
                conn = DBConnection.getDBConnection();
            }

            String query = " SELECT rv.id_reporte, rv.fecha_aplicacion, rv.fecha_refuerzo, "
                    + "rv.id_paciente, pc.id_usuario, rv.id_funcionario, fn.id_usuario, "
                    + "rv.id_lote, lv.id_vacuna, vc.farmaceutica "
                    + "FROM reporte_vacuna AS rv "
                    + "INNER JOIN paciente AS pc ON rv.id_paciente = pc.id_paciente "
                    + "INNER JOIN funcionario AS fn ON rv.id_funcionario = fn.id_funcionario "
                    + "INNER JOIN lote_vacuna AS lv ON rv.id_lote = lv.id_lote "
                    + "INNER JOIN vacuna AS vc ON lv.id_vacuna = vc.id_vacuna "
                    + "WHERE pc.id_usuario = " + id + ";";

            Statement statement = conn.createStatement();
            ResultSet result = statement.executeQuery(query);

            while (result.next()) {
                reporteVacuna = new ReporteVacunaModel(result.getInt(1), result.getString(2), result.getString(3), result.getInt(4), result.getInt(5), result.getInt(6), result.getInt(7), result.getInt(8), result.getInt(9), result.getString(10));
            }
        } catch (SQLException ex) {
            showMessageDialog(null, "Se ha producido un error al obtener el reporte.", "Error Consulta", 0);
        }

        return reporteVacuna;
    }

    public ArrayList<ReporteVacunaModel> getAllReportesVacunas() {
        ArrayList<ReporteVacunaModel> reporteVacunas = new ArrayList<ReporteVacunaModel>();

        try {
            if (conn == null) {
                conn = DBConnection.getDBConnection();
            }

            String query = " SELECT rv.id_reporte, rv.fecha_aplicacion, rv.fecha_refuerzo, "
                    + "rv.id_paciente, pc.id_usuario, rv.id_funcionario, fn.id_usuario, "
                    + "rv.id_lote, lv.id_vacuna, vc.farmaceutica "
                    + "FROM reporte_vacuna AS rv "
                    + "INNER JOIN paciente AS pc ON rv.id_paciente = pc.id_paciente "
                    + "INNER JOIN funcionario AS fn ON rv.id_funcionario = fn.id_funcionario "
                    + "INNER JOIN lote_vacuna AS lv ON rv.id_lote = lv.id_lote "
                    + "INNER JOIN vacuna AS vc ON lv.id_vacuna = vc.id_vacuna ";

            Statement statement = conn.createStatement();
            ResultSet result = statement.executeQuery(query);

            while (result.next()) {
                reporteVacunas.add(new ReporteVacunaModel(result.getInt(1), result.getString(2), result.getString(3), result.getInt(4), result.getInt(5), result.getInt(6), result.getInt(7), result.getInt(8), result.getInt(9), result.getString(10)));
            }
        } catch (SQLException ex) {
            showMessageDialog(null, "Se ha producido un error al obtener la lista de reportes.", "Error Consulta", 0);
        }

        return reporteVacunas;
    }

    public boolean insertOneReporteVacuna(ReporteVacunaModel reporteVacuna) {
        boolean insertado = false;

        try {
            if (conn == null) {
                conn = DBConnection.getDBConnection();
            }
            
            PreparedStatement statement;

            if(reporteVacuna.getFechaRefuerzo().trim().equals("0")) {
                String query = "INSERT INTO reporte_vacuna (fecha_aplicacion, id_paciente, id_funcionario, id_lote) VALUES (?, ?, ?, ?);";
                
                statement = conn.prepareStatement(query);
                
                statement.setString(1, reporteVacuna.getFechaAplicacion());
                statement.setInt(2, reporteVacuna.getIdPaciente());
                statement.setInt(3, reporteVacuna.getIdFuncionario());
                statement.setInt(4, reporteVacuna.getIdLoteVacuna());
            } else {
                String query = "INSERT INTO reporte_vacuna (fecha_aplicacion, fecha_refuerzo, id_paciente, id_funcionario, id_lote) VALUES (?, ?, ?, ?, ?);";
                
                statement = conn.prepareStatement(query);
                
                statement.setString(1, reporteVacuna.getFechaAplicacion());
                statement.setString(2, reporteVacuna.getFechaRefuerzo());
                statement.setInt(3, reporteVacuna.getIdPaciente());
                statement.setInt(4, reporteVacuna.getIdFuncionario());
                statement.setInt(5, reporteVacuna.getIdLoteVacuna());
            }

            int affectedRows = statement.executeUpdate();

            if (affectedRows > 0) {
                insertado = true;
            }

        } catch (SQLException ex) {
            showMessageDialog(null, "Se ha producido un error al insertar el reporte\n verifica la información e intenta nuevamente.", "Error Consulta", 0);
        }

        return insertado;
    }

    public boolean updateOneReporteVacuna(ReporteVacunaModel reporteVacuna, int id) {
        boolean actualizado = false;

        try {
            if (conn == null) {
                conn = DBConnection.getDBConnection();
            }

            PreparedStatement statement;
            
            if(reporteVacuna.getFechaRefuerzo().trim().equals("0")) {
                String query = "UPDATE reporte_vacuna SET fecha_aplicacion = ?, id_paciente = ?, id_funcionario = ?, id_lote = ? WHERE id_reporte = ?;";

                statement = conn.prepareStatement(query);
                
                statement.setString(1, reporteVacuna.getFechaAplicacion());
                statement.setInt(2, reporteVacuna.getIdPaciente());
                statement.setInt(3, reporteVacuna.getIdFuncionario());
                statement.setInt(4, reporteVacuna.getIdLoteVacuna());
                statement.setInt(5, id);
            } else {
                String query = "UPDATE reporte_vacuna SET fecha_aplicacion = ?, fecha_refuerzo = ?, id_paciente = ?, id_funcionario = ?, id_lote = ? WHERE id_reporte = ?;";

                statement = conn.prepareStatement(query);
                
                statement.setString(1, reporteVacuna.getFechaAplicacion());
                statement.setString(2, reporteVacuna.getFechaRefuerzo());
                statement.setInt(3, reporteVacuna.getIdPaciente());
                statement.setInt(4, reporteVacuna.getIdFuncionario());
                statement.setInt(5, reporteVacuna.getIdLoteVacuna());
                statement.setInt(6, id);
            }
            

            int affectedRows = statement.executeUpdate();

            if (affectedRows > 0) {
                actualizado = true;
            }
        } catch (SQLException ex) {
            showMessageDialog(null, "No se pudo actualizar el reporte.", "Error Actualización", 0);
        }

        return actualizado;
    }

    public boolean deleteOneReporteVacuna(int id) {
        boolean eliminado = false;

        try {
            if (conn == null) {
                conn = DBConnection.getDBConnection();
            }

            String query = "DELETE FROM reporte_vacuna WHERE id_reporte = ?;";

            PreparedStatement statement = conn.prepareStatement(query);
            statement.setInt(1, id);

            int affectedRows = statement.executeUpdate();

            if (affectedRows > 0) {
                eliminado = true;
            }
        } catch (SQLException ex) {
            showMessageDialog(null, "No se pudo eliminar el reporte.", "Error Eliminación", 0);
        }

        return eliminado;
    }
}
