package views;

import access.LoteVacunaDAO;
import access.VacunaDAO;
import controllers.LoteVacunaController;
import controllers.VacunaController;
import java.util.ArrayList;
import javax.swing.ComboBoxModel;
import javax.swing.JOptionPane;
import models.LoteVacunaModel;
import models.VacunaModel;

/**
 *
 * @author JCode
 */
public class FormularioLoteVacuna extends javax.swing.JDialog {
    
    javax.swing.JTable tabla = null;
    LoteVacunaModel lote = null;
    int id = 0;
    
    public FormularioLoteVacuna(java.awt.Frame parent, boolean modal, javax.swing.JTable tabla) {
        super(parent, modal);
        this.tabla = tabla;
        initComponents();
        llenarComboBox();
    }
    
    public FormularioLoteVacuna(java.awt.Frame parent, boolean modal, String idLote, javax.swing.JTable tabla) {
        super(parent, modal);
        this.tabla = tabla;
        this.lote = new LoteVacunaDAO().getOneLoteVacuna(Integer.parseInt(idLote));
        this.id = this.lote.getIdLote();
        initComponents();
        llenarComboBox();
        llenarCampos();
        lblTitulo.setText("Actualizar Lote Vacunas");
        btnAgregar.setText("ACTUALIZAR");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanelButton6 = new javax.swing.JPanel();
        btnAgregar = new javax.swing.JLabel();
        cbxTipoVacuna = new javax.swing.JComboBox<>();
        txtNumeroDosis = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Manejo Lotes Vacunas");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Número Dosis:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        lblTitulo.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(51, 51, 51));
        lblTitulo.setText("Añadir Lote Vacunas");
        jPanel1.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Tipo Vacuna:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, -1, -1));

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

        jPanel1.add(jPanelButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 200, 40));

        cbxTipoVacuna.setBackground(new java.awt.Color(255, 255, 255));
        cbxTipoVacuna.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        cbxTipoVacuna.setForeground(new java.awt.Color(51, 51, 51));
        cbxTipoVacuna.setBorder(null);
        jPanel1.add(cbxTipoVacuna, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 90, 300, 40));

        txtNumeroDosis.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtNumeroDosis.setForeground(new java.awt.Color(51, 51, 51));
        txtNumeroDosis.setBorder(null);
        jPanel1.add(txtNumeroDosis, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 300, 40));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 300, 10));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 675, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void llenarComboBox() {
        ArrayList<VacunaModel> vacunas = new VacunaDAO().getAllVacunas();
        cbxTipoVacuna.addItem("Seleccione una opción");
        for(VacunaModel vacuna : vacunas) {
            cbxTipoVacuna.addItem(vacuna.getIdVacuna() + " " + vacuna.getFarmaceutica());
        }
    }
    
    private void llenarCampos() {
        txtNumeroDosis.setText(String.valueOf(lote.getNumeroDosis()));
        cbxTipoVacuna.setSelectedItem(String.valueOf(lote.getIdVacuna() + " " + lote.getFarmaceuticaVacuna()));
    }
    
    private boolean validarFormulario() {
        boolean valido = false;

        try {
            if (txtNumeroDosis.getText().trim().equals("")) {
                JOptionPane.showMessageDialog(this, "Ingresa número de dosis.", "Error", 0);
            } else if (cbxTipoVacuna.getSelectedIndex() == 0) {
                JOptionPane.showMessageDialog(this, "Selecciona el campo de vacuna.", "Error", 0);
            } else {
                valido = true;
            }
        } catch (java.lang.NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Algo ha salido mal al validar el formulario.", "Error", 0);
        }

        return valido;
    }
    
    private void btnAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseClicked
        boolean valido = validarFormulario();
        if (valido) {
            String[] data = {
                txtNumeroDosis.getText(),
                txtNumeroDosis.getText(),
                cbxTipoVacuna.getSelectedItem().toString().split(" ")[0]
            };
            
            if (lote == null) {
                LoteVacunaController controlador = new LoteVacunaController();
                controlador.fillTableLoteVacunas(tabla);
                boolean insertado = controlador.insertOneLoteVacuna(data);

                if (insertado) {
                    JOptionPane.showMessageDialog(this, "Lote agregado correctamente.", "Proceso Exitoso", 1);
                    this.setVisible(false);
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(this, "No se pudo agregar el lote.", "Proceso Fallido", 1);
                }
            } else {
                LoteVacunaController controlador = new LoteVacunaController();
                controlador.fillTableLoteVacunas(tabla);
                boolean actualizado = controlador.updateOneLoteVacuna(data, id);
                
                if (actualizado) {
                    JOptionPane.showMessageDialog(this, "Lote actualizado correctamente.", "Proceso Exitoso", 1);
                    this.setVisible(false);
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(this, "No se pudo actualizar el lote.", "Proceso Fallido", 1);
                }
            }
        }
    }//GEN-LAST:event_btnAgregarMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnAgregar;
    private javax.swing.JComboBox<String> cbxTipoVacuna;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelButton6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtNumeroDosis;
    // End of variables declaration//GEN-END:variables
}
