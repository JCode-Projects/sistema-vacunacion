package access;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import static javax.swing.JOptionPane.showMessageDialog;
import models.ReporteModel;
import utils.DBConnection;

/**
 *
 * @author JCode
 */
public class ReporteDAO {

    private Connection conn = null;

    public ArrayList<ReporteModel> getAllVacunadosAsTipoVacuna(String farmaceutica) {
        ArrayList<ReporteModel> reportes = new ArrayList<ReporteModel>();

        try {
            if (conn == null) {
                conn = DBConnection.getDBConnection();
            }

            String query = "SELECT us.identificacion, us.primer_nombre, us.primer_apellido, vc.farmaceutica, rv.fecha_aplicacion " +
                    "FROM reporte_vacuna AS rv " +
                    "INNER JOIN paciente AS pc ON rv.id_paciente = pc.id_paciente " +
                    "INNER JOIN usuario AS us ON pc.id_usuario = us.identificacion " +
                    "INNER JOIN lote_vacuna AS lv ON rv.id_lote = lv.id_lote " +
                    "INNER JOIN vacuna AS vc ON lv.id_vacuna = vc.id_vacuna " +
                    "WHERE vc.farmaceutica = '" + farmaceutica + "';";

            Statement statement = conn.createStatement();
            ResultSet result = statement.executeQuery(query);

            while (result.next()) {
                reportes.add(new ReporteModel(result.getInt(1), result.getString(2), result.getString(3), result.getString(4), result.getString(5)));
            }
        } catch (SQLException ex) {
            showMessageDialog(null, "Se ha producido un error al obtener la lista de vacunados.", "Error Consulta", 0);
        }

        return reportes;
    }
    
    public ArrayList<ReporteModel> getAllVacunadosAsIdentificacion(String identificacion) {
        ArrayList<ReporteModel> reportes = new ArrayList<ReporteModel>();

        try {
            if (conn == null) {
                conn = DBConnection.getDBConnection();
            }

            String query = "SELECT us.identificacion, us.primer_nombre, us.primer_apellido, vc.farmaceutica, rv.fecha_aplicacion " +
                    "FROM reporte_vacuna AS rv " +
                    "INNER JOIN paciente AS pc ON rv.id_paciente = pc.id_paciente " +
                    "INNER JOIN usuario AS us ON pc.id_usuario = us.identificacion " +
                    "INNER JOIN lote_vacuna AS lv ON rv.id_lote = lv.id_lote " +
                    "INNER JOIN vacuna AS vc ON lv.id_vacuna = vc.id_vacuna " +
                    "WHERE us.identificacion LIKE '%" + identificacion + "%';";

            Statement statement = conn.createStatement();
            ResultSet result = statement.executeQuery(query);

            while (result.next()) {
                reportes.add(new ReporteModel(result.getInt(1), result.getString(2), result.getString(3), result.getString(4), result.getString(5)));
            }
        } catch (SQLException ex) {
            showMessageDialog(null, "Se ha producido un error al obtener la lista de vacunados.", "Error Consulta", 0);
        }

        return reportes;
    }
}
