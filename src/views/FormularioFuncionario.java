package views;

import javax.swing.JOptionPane;
import models.FuncionarioModel;
import access.FuncionarioDAO;
import controllers.FuncionarioController;

/**
 *
 * @author JCode
 */
public class FormularioFuncionario extends javax.swing.JDialog {
    javax.swing.JTable tabla = null;
    FuncionarioModel funcionario = null;
    int identificacion = 0;
    
    public FormularioFuncionario(java.awt.Frame parent, boolean modal, javax.swing.JTable tabla) {
        super(parent, modal);
        this.tabla = tabla;
        initComponents();
    }
    
    public FormularioFuncionario(java.awt.Frame parent, boolean modal, String funcionario, javax.swing.JTable tabla) {
        super(parent, modal);
        this.tabla = tabla;
        this.funcionario = new FuncionarioDAO().getOneFuncionario(Integer.parseInt(funcionario));
        identificacion = this.funcionario.getIdentificacion();
        initComponents();
        llenarCampos();
        lblTitulo.setText("Actualizar Funcionario");
        btnAgregar.setText("ACTUALIZAR");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtIdentificacion = new javax.swing.JTextField();
        lblTitulo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        txtPrimerNombre = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        txtSegundoNombre = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        txtPrimerApellido = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        txtSegundoApellido = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        txtCargo = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        jPanelButton6 = new javax.swing.JPanel();
        btnAgregar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Manejo Funcionario");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Identificación:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        txtIdentificacion.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtIdentificacion.setForeground(new java.awt.Color(51, 51, 51));
        txtIdentificacion.setBorder(null);
        jPanel1.add(txtIdentificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 300, 30));

        lblTitulo.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(51, 51, 51));
        lblTitulo.setText("Añadir Funcionario");
        jPanel1.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 300, 10));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Primer Nombre:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, -1, -1));

        txtPrimerNombre.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtPrimerNombre.setForeground(new java.awt.Color(51, 51, 51));
        txtPrimerNombre.setBorder(null);
        jPanel1.add(txtPrimerNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 90, 300, 30));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, 300, 10));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Segundo Nombre:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        txtSegundoNombre.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtSegundoNombre.setForeground(new java.awt.Color(51, 51, 51));
        txtSegundoNombre.setBorder(null);
        jPanel1.add(txtSegundoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 300, 30));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 300, 10));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Primer Apellido:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, -1, -1));

        txtPrimerApellido.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtPrimerApellido.setForeground(new java.awt.Color(51, 51, 51));
        txtPrimerApellido.setBorder(null);
        jPanel1.add(txtPrimerApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, 300, 30));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 200, 300, 10));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Segundo Apellido:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        txtSegundoApellido.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtSegundoApellido.setForeground(new java.awt.Color(51, 51, 51));
        txtSegundoApellido.setBorder(null);
        jPanel1.add(txtSegundoApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 300, 30));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 300, 10));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Cargo:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, -1, -1));

        txtCargo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtCargo.setForeground(new java.awt.Color(51, 51, 51));
        txtCargo.setBorder(null);
        jPanel1.add(txtCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 250, 300, 30));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 280, 300, 10));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Email:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        txtEmail.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(51, 51, 51));
        txtEmail.setBorder(null);
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 300, 30));
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 300, 10));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Télefono:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 300, -1, -1));

        txtTelefono.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtTelefono.setForeground(new java.awt.Color(51, 51, 51));
        txtTelefono.setBorder(null);
        jPanel1.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 330, 300, 30));
        jPanel1.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 360, 300, 10));

        jPanelButton6.setBackground(new java.awt.Color(0, 204, 51));

        btnAgregar.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAgregar.setText("Agregar");
        btnAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelButton6Layout = new javax.swing.GroupLayout(jPanelButton6);
        jPanelButton6.setLayout(jPanelButton6Layout);
        jPanelButton6Layout.setHorizontalGroup(
            jPanelButton6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        jPanelButton6Layout.setVerticalGroup(
            jPanelButton6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanelButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 400, 200, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 675, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseClicked
        boolean valido = validarFormulario();
        if (valido) {
            String[] data = {
                txtCargo.getText(),
                txtEmail.getText(),
                txtIdentificacion.getText(),
                txtPrimerNombre.getText(),
                txtSegundoNombre.getText(),
                txtPrimerApellido.getText(),
                txtSegundoApellido.getText(),
                txtTelefono.getText()
            };
            
            if (funcionario == null) {
                FuncionarioController controlador = new FuncionarioController();
                controlador.fillTableFuncionarios(tabla);
                boolean insertado = controlador.insertOneFuncionario(data);

                if (insertado) {
                    JOptionPane.showMessageDialog(this, "Funcionario agregado correctamente.", "Proceso Exitoso", 1);
                    this.setVisible(false);
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(this, "No se pudo agregar el nuevo funcionario.", "Proceso Fallido", 1);
                }
            } else {
                FuncionarioController controlador = new FuncionarioController();
                controlador.fillTableFuncionarios(tabla);
                boolean actualizado = controlador.updateOneFuncionario(data, identificacion);
                
                if (actualizado) {
                    JOptionPane.showMessageDialog(this, "Funcionario actualizado correctamente.", "Proceso Exitoso", 1);
                    this.setVisible(false);
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(this, "No se pudo actualizar el funcionario.", "Proceso Fallido", 1);
                }
            }
        }
    }//GEN-LAST:event_btnAgregarMouseClicked

    private boolean validarFormulario() {
        boolean valido = false;

        try {
            if (txtIdentificacion.getText().trim().equals("")) {
                JOptionPane.showMessageDialog(this, "Ingresa el número de identificación.", "Error", 0);
            } else if (txtPrimerNombre.getText().trim().equals("")) {
                JOptionPane.showMessageDialog(this, "Ingresa el primer nombre.", "Error", 0);
            } else if (txtSegundoNombre.getText().trim().equals("")) {
                JOptionPane.showMessageDialog(this, "Ingresa el segundo nombre.", "Error", 0);
            } else if (txtPrimerApellido.getText().trim().equals("")) {
                JOptionPane.showMessageDialog(this, "Ingresa el primer apellido.", "Error", 0);
            } else if (txtSegundoApellido.getText().trim().equals("")) {
                JOptionPane.showMessageDialog(this, "Ingresa el segundo apellido.", "Error", 0);
            } else if (txtCargo.getText().trim().equals("")) {
                JOptionPane.showMessageDialog(this, "Ingresa el cargo desempeñado.", "Error", 0);
            } else if (txtEmail.getText().trim().equals("")) {
                JOptionPane.showMessageDialog(this, "Ingresa el correo electrónico.", "Error", 0);
            } else if (txtTelefono.getText().trim().equals("")) {
                JOptionPane.showMessageDialog(this, "Ingresa el número de teléfono.", "Error", 0);
            } else {
                Integer.parseInt(txtIdentificacion.getText());
                valido = true;
            }
        } catch (java.lang.NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Recuerda ingresar un número de identificación válido.", "Error", 0);
        }

        return valido;
    }

    
    private void llenarCampos() {
        txtIdentificacion.setText(String.valueOf(funcionario.getIdentificacion()));
        txtPrimerNombre.setText(funcionario.getPrimerNombre());
        txtSegundoNombre.setText(funcionario.getSegundoNombre());
        txtPrimerApellido.setText(funcionario.getPrimerApellido());
        txtSegundoApellido.setText(funcionario.getSegundoApellido());
        txtCargo.setText(funcionario.getCargo());
        txtEmail.setText(funcionario.getEmail());
        txtTelefono.setText(funcionario.getTelefono());
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnAgregar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelButton6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtCargo;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtIdentificacion;
    private javax.swing.JTextField txtPrimerApellido;
    private javax.swing.JTextField txtPrimerNombre;
    private javax.swing.JTextField txtSegundoApellido;
    private javax.swing.JTextField txtSegundoNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
