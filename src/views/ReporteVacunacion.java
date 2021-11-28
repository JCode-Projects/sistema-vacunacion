/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import models.UsuarioModel;

/**
 *
 * @author JCode
 */
public class ReporteVacunacion extends javax.swing.JFrame {
    private UsuarioModel usuario = null;
    
    public ReporteVacunacion(UsuarioModel usuario) {
        initComponents();
        this.usuario = usuario;
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
        cbxTipoVacuna1 = new javax.swing.JComboBox<>();
        jPanelButton5 = new javax.swing.JPanel();
        btnCerrarSesion = new javax.swing.JLabel();

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
        cbxTipoVacuna.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opción", "Pfizer", "AstraZeneca", "Jannsen" }));
        cbxTipoVacuna.setBorder(null);
        cbxTipoVacuna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxTipoVacunaActionPerformed(evt);
            }
        });
        jPanel1.add(cbxTipoVacuna, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 300, 40));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Categoría Paciente:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 60, -1, -1));

        cbxTipoVacuna1.setBackground(new java.awt.Color(255, 255, 255));
        cbxTipoVacuna1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        cbxTipoVacuna1.setForeground(new java.awt.Color(51, 51, 51));
        cbxTipoVacuna1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opción", "1", "2", "3" }));
        cbxTipoVacuna1.setBorder(null);
        cbxTipoVacuna1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxTipoVacuna1ActionPerformed(evt);
            }
        });
        jPanel1.add(cbxTipoVacuna1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 90, 300, 40));

        jPanelButton5.setBackground(new java.awt.Color(255, 0, 51));

        btnCerrarSesion.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        btnCerrarSesion.setForeground(new java.awt.Color(255, 255, 255));
        btnCerrarSesion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnCerrarSesion.setText("Regresar");
        btnCerrarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCerrarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCerrarSesionMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelButton5Layout = new javax.swing.GroupLayout(jPanelButton5);
        jPanelButton5.setLayout(jPanelButton5Layout);
        jPanelButton5Layout.setHorizontalGroup(
            jPanelButton5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnCerrarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        jPanelButton5Layout.setVerticalGroup(
            jPanelButton5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnCerrarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(jPanelButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 410, 200, 40));

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
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxTipoVacunaActionPerformed

    private void cbxTipoVacuna1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxTipoVacuna1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxTipoVacuna1ActionPerformed

    private void btnCerrarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarSesionMouseClicked
        new Inicio(usuario).setVisible(true);
        setVisible(false);
        dispose();
    }//GEN-LAST:event_btnCerrarSesionMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnCerrarSesion;
    private javax.swing.JComboBox<String> cbxTipoVacuna;
    private javax.swing.JComboBox<String> cbxTipoVacuna1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelButton5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblRegistros;
    // End of variables declaration//GEN-END:variables
}
