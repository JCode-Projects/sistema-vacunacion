package access;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import static javax.swing.JOptionPane.showMessageDialog;
import models.LoteVacunaModel;
import utils.DBConnection;

/**
 *
 * @author JCode
 */
public class LoteVacunaDAO {

    private Connection conn = null;

    public LoteVacunaModel getOneLoteVacuna(int id) {
        LoteVacunaModel loteVacuna = null;

        try {
            if (conn == null) {
                conn = DBConnection.getDBConnection();
            }

            String query = "SELECT lv.id_lote, lv.numero_dosis, lv.numero_dosis_restante, lv.id_vacuna, v.farmaceutica "
                    + "FROM lote_vacuna AS lv "
                    + "INNER JOIN vacuna AS v ON lv.id_vacuna = v.id_vacuna "
                    + "WHERE lv.id_lote = " + id + ";";

            Statement statement = conn.createStatement();
            ResultSet result = statement.executeQuery(query);

            while (result.next()) {
                loteVacuna = new LoteVacunaModel(result.getInt(1), result.getInt(2), result.getInt(3), result.getInt(4), result.getString(5));
            }
        } catch (SQLException ex) {
            showMessageDialog(null, "Se ha producido un error al obtener la vacuna.", "Error Consulta", 0);
        }

        return loteVacuna;
    }

    public ArrayList<LoteVacunaModel> getAllLoteVacunas() {
        ArrayList<LoteVacunaModel> loteVacunas = new ArrayList<LoteVacunaModel>();

        try {
            if (conn == null) {
                conn = DBConnection.getDBConnection();
            }

            String query = "SELECT lv.id_lote, lv.numero_dosis, lv.numero_dosis_restante, lv.id_vacuna, v.farmaceutica "
                    + "FROM lote_vacuna AS lv "
                    + "INNER JOIN vacuna AS v ON lv.id_vacuna = v.id_vacuna";

            Statement statement = conn.createStatement();
            ResultSet result = statement.executeQuery(query);

            while (result.next()) {
                loteVacunas.add(new LoteVacunaModel(result.getInt(1), result.getInt(2), result.getInt(3), result.getInt(4), result.getString(5)));
            }
        } catch (SQLException ex) {
            showMessageDialog(null, "Se ha producido un error al obtener la lista de lotes.", "Error Consulta", 0);
        }

        return loteVacunas;
    }

    public boolean insertOneLoteVacuna(LoteVacunaModel loteVacuna) {
        boolean insertado = false;

        try {
            if (conn == null) {
                conn = DBConnection.getDBConnection();
            }

            String query = "INSERT INTO lote_vacuna (numero_dosis, numero_dosis_restante, id_vacuna) VALUES (?, ?, ?);";

            PreparedStatement statement = conn.prepareStatement(query);
            statement.setInt(1, loteVacuna.getNumeroDosis());
            statement.setInt(2, loteVacuna.getNumeroDosisRestantes());
            statement.setInt(3, loteVacuna.getIdVacuna());

            int affectedRows = statement.executeUpdate();

            if (affectedRows > 0) {
                insertado = true;
            }

        } catch (SQLException ex) {
            showMessageDialog(null, "Se ha producido un error al insertar el lote de vacuna\n verifica la información e intenta nuevamente.", "Error Consulta", 0);
        }

        return insertado;
    }

    public boolean updateOneLoteVacuna(LoteVacunaModel loteVacuna, int id) {
        boolean actualizado = false;

        try {
            if (conn == null) {
                conn = DBConnection.getDBConnection();
            }

            String query = "UPDATE lote_vacuna SET numero_dosis = ?, numero_dosis_restante = ?, id_vacuna = ? WHERE id_lote = ?;";

            PreparedStatement statement = conn.prepareStatement(query);
            statement.setInt(1, loteVacuna.getNumeroDosis());
            statement.setInt(2, loteVacuna.getNumeroDosisRestantes());
            statement.setInt(3, loteVacuna.getIdVacuna());
            statement.setInt(4, id);

            int affectedRows = statement.executeUpdate();

            if (affectedRows > 0) {
                actualizado = true;
            }
        } catch (SQLException ex) {
            showMessageDialog(null, "No se pudo actualizar el lote de vacunas.", "Error Actualización", 0);
        }

        return actualizado;
    }

    public boolean deleteOneLoteVacunas(int id) {
        boolean eliminado = false;

        try {
            if (conn == null) {
                conn = DBConnection.getDBConnection();
            }

            String query = "DELETE FROM lote_vacuna WHERE id_lote = ?;";

            PreparedStatement statement = conn.prepareStatement(query);
            statement.setInt(1, id);

            int affectedRows = statement.executeUpdate();

            if (affectedRows > 0) {
                eliminado = true;
            }
        } catch (SQLException ex) {
            showMessageDialog(null, "No se pudo eliminar el lote de vacunas.", "Error Actualización", 0);
        }

        return eliminado;
    }
}
