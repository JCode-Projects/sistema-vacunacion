package controllers;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import access.UsuarioDAO;
import access.FuncionarioDAO;
import access.PacienteDAO;
import models.UsuarioModel;
import views.Inicio;
import views.DetallePaciente;

/**
 *
 * @author JCode
 */
public class UsuarioController {
    private UsuarioModel usuario = null;
    private JFrame target = null;
    
    public UsuarioController(JFrame target) {
        this.target = target;
    }
    
    private void ocultarVista() {
        target.setVisible(false);
        target.dispose();
    }
    
    public void loginUsuario(int identificacion, String contraseña) {
        usuario = new UsuarioDAO().getOneUsuario(identificacion);
        if(usuario != null) {
            String rol = usuario.getTipo();
            
            if(rol.equals("ADM")) {
                boolean ingreso = validateContraseña(contraseña, usuario.getContraseña());
                if(ingreso) {
                    ocultarVista();
                    new UsuarioDAO().setFechaUltimoAcceso(usuario.getIdentificacion(), getFecha());
                    new Inicio(usuario).setVisible(true);
                }
            } else if(rol.equals("FUN")) {
                int valido = new FuncionarioDAO().validateFuncionario(usuario.getIdentificacion());
                if(valido == 0) {
                    JOptionPane.showMessageDialog(null, "El acceso ha sido denegado, si crees que ya estás \nregistrado da click en '¡Validar Usuario!'.", "Acceso Denegado", 0);    
                } else {
                    boolean ingreso = validateContraseña(contraseña, usuario.getContraseña());
                    if(ingreso) {
                        ocultarVista();
                        new UsuarioDAO().setFechaUltimoAcceso(usuario.getIdentificacion(), getFecha());
                        new Inicio(usuario).setVisible(true);
                    }
                }
            } else if(rol.equals("USU")) {
                int valido = new PacienteDAO().validatePaciente(usuario.getIdentificacion());
                if(valido == 0) {
                    JOptionPane.showMessageDialog(null, "El acceso ha sido denegado, si crees que ya estás \nregistrado da click en '¡Validar Usuario!'.", "Acceso Denegado", 0); 
                } else {
                    boolean ingreso = validateContraseña(contraseña, usuario.getContraseña());
                    if(ingreso) {
                        ocultarVista();
                        new UsuarioDAO().setFechaUltimoAcceso(usuario.getIdentificacion(), getFecha());
                        new DetallePaciente(new PacienteDAO().getOnePaciente(identificacion)).setVisible(true);
                    }
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "No existe ningún usuario con el número de identificación ingresado", "Acceso Denegado", 0);
        }
    }
    
    public boolean validateContraseña(String contraseñaIgresada, String contraseñaGuardada) {
        boolean valida = false;
        
        if(contraseñaGuardada.equals(contraseñaIgresada)) {
            valida = true;
        } else {
            JOptionPane.showMessageDialog(null, "La contraseña ingresada no es válida.", "Acceso Denegado", 0);
        }
        
        return valida;
    }
    
    public String getFecha() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        return dtf.format(LocalDateTime.now()).toString();
    }
}
