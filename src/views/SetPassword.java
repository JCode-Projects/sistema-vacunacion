/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import static javax.swing.JOptionPane.showMessageDialog;
import models.FuncionarioModel;
import models.PacienteModel;
import controllers.ConfirmacionController;

/**
 *
 * @author JCode
 */
public class SetPassword extends javax.swing.JDialog {

    private FuncionarioModel funcionario = null;
    private PacienteModel paciente = null;
    
    public SetPassword(java.awt.Frame parent, boolean modal, FuncionarioModel funcionario) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(parent);
        this.funcionario = funcionario;
    }
    
    public SetPassword(java.awt.Frame parent, boolean modal, PacienteModel paciente) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(parent);
        this.paciente = paciente;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtConfirmarPassword = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        txtPassword = new javax.swing.JPasswordField();
        jPanelButton1 = new javax.swing.JPanel();
        btnValidar = new javax.swing.JLabel();
        jPanelButton = new javax.swing.JPanel();
        btnCancelar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Asignación Contraseña");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/password_50px.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel14.setBackground(new java.awt.Color(51, 51, 51));
        jLabel14.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 102, 102));
        jLabel14.setText("Llena los dos campos de texto con la contraseña que");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, -1));

        jLabel15.setBackground(new java.awt.Color(51, 51, 51));
        jLabel15.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(102, 102, 102));
        jLabel15.setText("desees, de aquí en adelante iniciarás sesión con");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, -1, -1));

        jLabel13.setBackground(new java.awt.Color(51, 51, 51));
        jLabel13.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 102, 102));
        jLabel13.setText("tú numero de cédula y esta contraseña.");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, -1, -1));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Contraseña:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, -1, -1));

        txtConfirmarPassword.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtConfirmarPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtConfirmarPassword.setBorder(null);
        jPanel1.add(txtConfirmarPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 350, 30));

        jSeparator1.setBackground(new java.awt.Color(0, 102, 204));
        jSeparator1.setForeground(new java.awt.Color(0, 102, 204));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 152, 349, 10));

        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Confirmar Contraseña:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, -1, -1));

        jSeparator2.setBackground(new java.awt.Color(0, 102, 204));
        jSeparator2.setForeground(new java.awt.Color(0, 102, 204));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 222, 349, 10));

        txtPassword.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPassword.setBorder(null);
        jPanel1.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 350, 30));

        jPanelButton1.setBackground(new java.awt.Color(0, 102, 204));

        btnValidar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnValidar.setForeground(new java.awt.Color(255, 255, 255));
        btnValidar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnValidar.setText("Registrar");
        btnValidar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnValidar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnValidarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelButton1Layout = new javax.swing.GroupLayout(jPanelButton1);
        jPanelButton1.setLayout(jPanelButton1Layout);
        jPanelButton1Layout.setHorizontalGroup(
            jPanelButton1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnValidar, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        jPanelButton1Layout.setVerticalGroup(
            jPanelButton1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnValidar, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanelButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, -1, -1));

        jPanelButton.setBackground(new java.awt.Color(255, 51, 102));

        btnCancelar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnCancelar.setText("Cancelar");
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelButtonLayout = new javax.swing.GroupLayout(jPanelButton);
        jPanelButton.setLayout(jPanelButtonLayout);
        jPanelButtonLayout.setHorizontalGroup(
            jPanelButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        jPanelButtonLayout.setVerticalGroup(
            jPanelButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanelButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 150, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 553, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public boolean validarPassword(String password, String confirmacion){
        boolean iguales = false;
        
        if(password.equals(confirmacion))
            iguales = true;
        
        return iguales;
    }
    
    private void btnValidarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnValidarMouseClicked
        boolean iguales = validarPassword(new String(txtPassword.getPassword()), new String(txtConfirmarPassword.getPassword()));
        boolean validarCtr = validarCaracteres(new String(txtPassword.getPassword()));
        if(validarCtr) {
            if(iguales) {
                if(funcionario != null) {
                    if(new ConfirmacionController(this).setContraseñaDB(new String(txtPassword.getPassword()), funcionario.getIdentificacion(), funcionario.getTipo())) {
                        showMessageDialog(null, "Ya puedes iniciar sesión en nuestra aplicación.", "Error Coincidencia", 2);
                        setVisible(false);
                        dispose();
                    }
                } else if(paciente != null) {
                    if(new ConfirmacionController(this).setContraseñaDB(new String(txtPassword.getPassword()), paciente.getIdentificacion(), paciente.getTipo())) {
                        showMessageDialog(null, "Ya puedes iniciar sesión en nuestra aplicación.", "Error Coincidencia", 2);
                        setVisible(false);
                        dispose();
                    }
                }
            } else {
                showMessageDialog(null, "Las contraseñas ingresadas no son iguales, \nverifica e intenta nuevamente.", "Error Coincidencia", 0);
            }
        }
    }//GEN-LAST:event_btnValidarMouseClicked

    private boolean validarCaracteres(String contraseña) {
        boolean valido = false;
        
        try {
            if(!contraseña.contains("$") && !contraseña.contains("%") && !contraseña.contains("&") && !contraseña.contains("/") && !contraseña.contains("*") && !contraseña.contains("-") && !contraseña.contains("ñ")) {
                valido = true;
            } else {
                throw new Exception("Los caracteres enviados no son válidos.");
            }
        } catch(Exception error) {
            showMessageDialog(null, "No se admiten caracteres especiales '$,%,&,/,*,-,ñ'.", "Error Tipado", 0);
        }
        
        return valido;
    }
    
    private void btnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseClicked
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_btnCancelarMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnCancelar;
    private javax.swing.JLabel btnValidar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelButton;
    private javax.swing.JPanel jPanelButton1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPasswordField txtConfirmarPassword;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables
}
