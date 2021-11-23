import utils.DBConnection;
import views.Login;

/**
 *
 * @author JCode
 */
public class Execute {
    public static void main(String[] args) {
        DBConnection.getDBConnection();
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }
}
