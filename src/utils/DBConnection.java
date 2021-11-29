package utils;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import org.json.simple.*;
import org.json.simple.parser.*;

import static javax.swing.JOptionPane.showMessageDialog;

/**
 * Crear l conexión con MySQL Server
 * 
 * @author JCode
 */

public class DBConnection {
    public static Connection getDBConnection() {
        JSONParser json = new JSONParser();
        Connection conn = null;
        
        try {
            String dataConnectionPath = System.getProperty("user.dir") + "/src/utils/credenciales.json";
            JSONObject objJSON = (JSONObject) json.parse(new FileReader(dataConnectionPath));

            // Obtiene las credenciales del archivo JSON
            String dbHost = (String) objJSON.get("db_host");
            String dbPort = (String) objJSON.get("db_port");
            String dbUser = (String) objJSON.get("db_user");
            String dbPassword = (String) objJSON.get("db_password");
            String dbName = (String) objJSON.get("db_name");

            // Contiene la cadena de conexión
            String urlConnection = "jdbc:mysql://" + dbHost + ":" + dbPort + "/" + dbName;

            // Por último se crea la conexión
            conn = DriverManager.getConnection(urlConnection, dbUser, dbPassword);
        } catch (FileNotFoundException | SQLException ex) {
            showMessageDialog(null, "No se pudo crear la conexión con la base de datos, \nsi no tienes la base de datos creada revisa la carpeta \nsrc/utils, ahí estará el archivo db.sql \nel cual debes ejecutar en el servidor de MySQL.\nTambién no te olvides de ajustar las credenciales \nde acceso a la base de datos.", "Error Conexión", 0);
            System.exit(0);
        } catch (ParseException | IOException ex ) {
            showMessageDialog(null, "Se ha producido un error, revisa el archivo de \ncredenciales y ajustalo según las credenciales de \ntu localhost.", "Error Archivo JSON", 0);
            System.exit(0);
        }
        
        return conn;
    }
}