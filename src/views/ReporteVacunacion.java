package views;

import java.util.ArrayList;

import models.UsuarioModel;
import models.VacunaModel;
import access.VacunaDAO;
import controllers.ReporteController;

/**
 *
 * @author JCode
 */
public class ReporteVacunacion extends javax.swing.JFrame {
    private UsuarioModel usuario = null;
    
    public ReporteVacunacion(UsuarioModel usuario) {
        initComponents();
        this.usuario = usuario;
        customTable();
        llenarCampos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRegistros = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cbxTipoVacuna = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jPanelButton5 = new javax.swing.JPanel();
        btnRegresar = new javax.swing.JLabel();
        txtIdentificacion = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Reporte Vacunación");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblRegistros.setBackground(new java.awt.Color(204, 204, 204));
        tblRegistros.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        tblRegistros.setForeground(new java.awt.Color(0, 0, 0));
        tblRegistros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblRegistros.setGridColor(new java.awt.Color(255, 255, 255));
        tblRegistros.setInheritsPopupMenu(true);
        tblRegistros.setIntercellSpacing(new java.awt.Dimension(2, 0));
        tblRegistros.setRequestFocusEnabled(false);
        tblRegistros.setRowHeight(30);
        tblRegistros.setSelectionBackground(new java.awt.Color(0, 102, 255));
        tblRegistros.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tblRegistros.setSurrendersFocusOnKeystroke(true);
        jScrollPane1.setViewportView(tblRegistros);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 640, 240));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/syringe_35px.png"))); // NOI18N
        jLabel1.setText("Reporte Vacunación");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 40));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Tipo Vacuna:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        cbxTipoVacuna.setBackground(new java.awt.Color(255, 255, 255));
        cbxTipoVacuna.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        cbxTipoVacuna.setForeground(new java.awt.Color(51, 51, 51));
        cbxTipoVacuna.setBorder(null);
        cbxTipoVacuna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxTipoVacunaActionPerformed(evt);
            }
        });
        jPanel1.add(cbxTipoVacuna, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 300, 40));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Identificación Paciente:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 60, -1, -1));

        jPanelButton5.setBackground(new java.awt.Color(255, 0, 51));

        btnRegresar.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        btnRegresar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegresar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnRegresar.setText("Regresar");
        btnRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegresarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelButton5Layout = new javax.swing.GroupLayout(jPanelButton5);
        jPanelButton5.setLayout(jPanelButton5Layout);
        jPanelButton5Layout.setHorizontalGroup(
            jPanelButton5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnRegresar, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        jPanelButton5Layout.setVerticalGroup(
            jPanelButton5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnRegresar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(jPanelButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 410, 200, 40));

        txtIdentificacion.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtIdentificacion.setForeground(new java.awt.Color(51, 51, 51));
        txtIdentificacion.setBorder(null);
        txtIdentificacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdentificacionKeyTyped(evt);
            }
        });
        jPanel1.add(txtIdentificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 90, 300, 30));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 122, 300, 15));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 684, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cbxTipoVacunaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxTipoVacunaActionPerformed
        if(cbxTipoVacuna.getSelectedIndex() == 0) {
            new ReporteController().eventTextFiel(tblRegistros, txtIdentificacion.getText());
        } else {
            txtIdentificacion.setText("");
            new ReporteController().eventListBox(tblRegistros, cbxTipoVacuna.getSelectedItem().toString());
        }
    }//GEN-LAST:event_cbxTipoVacunaActionPerformed

    private void btnRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegresarMouseClicked
        new Inicio(usuario).setVisible(true);
        setVisible(false);
        dispose();
    }//GEN-LAST:event_btnRegresarMouseClicked

    private void txtIdentificacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdentificacionKeyTyped
        cbxTipoVacuna.setSelectedIndex(0);
        new ReporteController().eventTextFiel(tblRegistros, txtIdentificacion.getText());
    }//GEN-LAST:event_txtIdentificacionKeyTyped

    public void llenarCampos() {
        ArrayList<VacunaModel> vacunas = new VacunaDAO().getAllVacunas();
        cbxTipoVacuna.addItem("Todos los registros");
        for(VacunaModel vacuna : vacunas) {
            cbxTipoVacuna.addItem(vacuna.getFarmaceutica());
        }
    }
    
    public void customTable() {
        tblRegistros.getTableHeader().setFont(new java.awt.Font("Century Gothic", 1, 16));
        tblRegistros.getTableHeader().setBackground(new java.awt.Color(0,102,204));
        tblRegistros.getTableHeader().setForeground(new java.awt.Color(255, 255, 255));
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnRegresar;
    private javax.swing.JComboBox<String> cbxTipoVacuna;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelButton5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable tblRegistros;
    private javax.swing.JTextField txtIdentificacion;
    // End of variables declaration//GEN-END:variables
}
