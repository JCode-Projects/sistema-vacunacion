/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
