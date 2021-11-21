package controllers;

import javax.swing.JOptionPane;
import javax.swing.JDialog;
import models.FuncionarioModel;
import models.UsuarioModel;
import models.PacienteModel;
import access.FuncionarioDAO;
import access.PacienteDAO;
import access.UsuarioDAO;
import views.SetPassword;

/**
 *
 * @author JCode
 */
public class ConfirmacionController {
    private JDialog vista = null;
    private UsuarioModel usuario = null;

    public ConfirmacionController(JDialog vista) {
        this.vista = vista;
    }
    
    public void validarUsuario(int identificacion, String correo) {
        usuario = new UsuarioDAO().getOneUsuario(identificacion);
        
        if(usuario != null) {
            if(usuario.getTipo().equals("ADM")) {
                JOptionPane.showMessageDialog(vista, "Este proceso no es válido para su usuario.");
                ocultarVista();
            } else if(usuario.getTipo().equals("FUN")) {
                FuncionarioModel funcionario = new FuncionarioDAO().getOneFuncionario(usuario.getIdentificacion());
                if(funcionario.getVerificado() == 0) {
                    if(funcionario.getEmail().trim().equals(correo.trim())) {
                        ocultarVista();
                        new SetPassword(null, true, funcionario).setVisible(true);
                    } else {
                        JOptionPane.showMessageDialog(vista, "Los datos no coinciden, verifica e intenta nuevamente, también recuerda \nque todo acto de suplantación será penalizado.", "Acceso Denegado", 0);
                    }
                } else {
                    JOptionPane.showMessageDialog(vista, "Esta cuenta ya está verificada, inicia \nsesión con tus credenciales.", "Acceso Denegado", 0);
                    ocultarVista();
                } 
            } else if(usuario.getTipo().equals("USU")) {
                PacienteModel paciente = new PacienteDAO().getOnePaciente(usuario.getIdentificacion());
                if(paciente.getVerificado() == 0) {
                    if(paciente.getEmail().trim().equals(correo.trim())) {
                        ocultarVista();
                        new SetPassword(null, true, paciente).setVisible(true);
                    } else {
                        JOptionPane.showMessageDialog(vista, "Los datos no coinciden, verifica e intenta nuevamente, también recuerda \nque todo acto de suplantación será penalizado.", "Acceso Denegado", 0);
                    }
                } else {
                    JOptionPane.showMessageDialog(vista, "Esta cuenta ya está verificada, inicia \nsesión con tus credenciales.", "Acceso Denegado", 0);
                    ocultarVista();
                } 
            }
        } else {
            JOptionPane.showMessageDialog(vista, "No estás registrado para este proceso de validación", "Acceso Denegado", 0);
        }
    }
    
    public boolean setContraseñaDB(String contraseña, int identificacion, String tipo) {
        boolean exito = false;
        
        boolean setPass = new UsuarioDAO().setContraseña(contraseña, identificacion);
        if(tipo.equals("FUN")) {
            if(setPass) {
                new FuncionarioDAO().setVerificado(identificacion);
                exito = true;
            }
        } else if(tipo.equals("USU")) {
            if(setPass) {
                new PacienteDAO().setVerificado(identificacion);
                exito = true;
            }
        }
        
        return exito;
    }
    
    private void ocultarVista() {
        this.vista.setVisible(false);
        this.vista.dispose();
    }
}
