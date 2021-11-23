package access;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import static javax.swing.JOptionPane.showMessageDialog;
import models.VacunaModel;
import utils.DBConnection;

/**
 *
 * @author JCode
 */
public class VacunaDAO {

    private Connection conn = null;

    public VacunaModel getOneVacuna(int id) {
        VacunaModel vacuna = null;

        try {
            if (conn == null) {
                conn = DBConnection.getDBConnection();
            }

            String query = "SELECT id_vacuna, farmaceutica, refuerzo "
                    + "FROM vacuna "
                    + "WHERE id_vacuna = " + id + ";";

            Statement statement = conn.createStatement();
            ResultSet result = statement.executeQuery(query);

            while (result.next()) {
                vacuna = new VacunaModel(result.getInt(1), result.getString(2), result.getInt(3));
            }
        } catch (SQLException ex) {
            showMessageDialog(null, "Se ha producido un error al obtener la vacuna.", "Error Consulta", 0);
        }

        return vacuna;
    }

    public ArrayList<VacunaModel> getAllVacunas() {
        ArrayList<VacunaModel> vacunas = new ArrayList<VacunaModel>();

        try {
            if (conn == null) {
                conn = DBConnection.getDBConnection();
            }

            String query = "SELECT id_vacuna, farmaceutica, refuerzo FROM vacuna;";

            Statement statement = conn.createStatement();
            ResultSet result = statement.executeQuery(query);

            while (result.next()) {
                vacunas.add(new VacunaModel(result.getInt(1), result.getString(2), result.getInt(3)));
            }
        } catch (SQLException ex) {
            showMessageDialog(null, "Se ha producido un error al obtener la lista de vacunas.", "Error Consulta", 0);
        }

        return vacunas;
    }

    public boolean insertOneVacuna(VacunaModel vacuna) {
        boolean insertado = false;

        try {
            if (conn == null) {
                conn = DBConnection.getDBConnection();
            }

            String query = "INSERT INTO vacuna (farmaceutica, refuerzo) VALUES (?, ?);";

            PreparedStatement statement = conn.prepareStatement(query);
            statement.setString(1, vacuna.getFarmaceutica());
            statement.setInt(2, vacuna.getRefuerzo());

            int affectedRows = statement.executeUpdate();

            if (affectedRows > 0) {
                insertado = true;
            }

        } catch (SQLException ex) {
            showMessageDialog(null, "Se ha producido un error al insertar la vacuna\n verifica la información e intenta nuevamente.", "Error Consulta", 0);
        }

        return insertado;
    }

    public boolean updateOneVacuna(VacunaModel vacuna, int id) {
        boolean actualizado = false;

        try {
            if (conn == null) {
                conn = DBConnection.getDBConnection();
            }

            String query = "UPDATE vacuna SET farmaceutica = ?, refuerzo = ? WHERE id_vacuna = ?;";

            PreparedStatement statement = conn.prepareStatement(query);
            statement.setString(1, vacuna.getFarmaceutica());
            statement.setInt(2, vacuna.getRefuerzo());
            statement.setInt(3, id);

            int affectedRows = statement.executeUpdate();

            if (affectedRows > 0) {
                actualizado = true;
            }
        } catch (SQLException ex) {
            showMessageDialog(null, "No se pudo actualizar la vacuna, recuerda que \nel número de identificación no se debe modificar.", "Error Actualización", 0);
        }

        return actualizado;
    }

    public boolean deleteOneVacuna(int id) {
        boolean eliminado = false;

        try {
            if (conn == null) {
                conn = DBConnection.getDBConnection();
            }

            String query = "DELETE FROM vacuna WHERE id_vacuna = ?;";

            PreparedStatement statement = conn.prepareStatement(query);
            statement.setInt(1, id);

            int affectedRows = statement.executeUpdate();

            if (affectedRows > 0) {
                eliminado = true;
            }
        } catch (SQLException ex) {
            showMessageDialog(null, "No se pudo eliminar la vacuna.", "Error Actualización", 0);
        }

        return eliminado;
    }
}
