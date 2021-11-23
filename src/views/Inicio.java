package views;

import javax.swing.JOptionPane;
import controllers.PacienteController;
import controllers.FuncionarioController;
import controllers.VacunaController;
import javax.swing.table.DefaultTableModel;

public class Inicio extends javax.swing.JFrame {
    private String[] modelos = {"PAC", "APL", "FUN", "LOT", "VAC"};
    private String modeloActual = modelos[0];
    
    public Inicio() {
        initComponents();
        customTable();
        new PacienteController().fillTablePacientes(tblRegistros);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanelButton = new javax.swing.JPanel();
        btnPacientes = new javax.swing.JLabel();
        jPanelButton1 = new javax.swing.JPanel();
        btnVacunacion = new javax.swing.JLabel();
        jPanelButton2 = new javax.swing.JPanel();
        btnFuncionarios = new javax.swing.JLabel();
        jPanelButton3 = new javax.swing.JPanel();
        btnLotesVacunacion = new javax.swing.JLabel();
        jPanelButton4 = new javax.swing.JPanel();
        btnVacunas = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRegistros = new javax.swing.JTable();
        jPanelButton5 = new javax.swing.JPanel();
        btnCerrarSesion = new javax.swing.JLabel();
        jPanelButton6 = new javax.swing.JPanel();
        btnAgregar = new javax.swing.JLabel();
        jPanelButton7 = new javax.swing.JPanel();
        btnEliminar = new javax.swing.JLabel();
        jPanelButton8 = new javax.swing.JPanel();
        btnEditar = new javax.swing.JLabel();
        lblTabla = new javax.swing.JLabel();
        jPanelButton9 = new javax.swing.JPanel();
        btnReporte = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inicio");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/world_health_organization_50px.png"))); // NOI18N
        jLabel1.setText("Hospital las Mercedes");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 40));

        jPanelButton.setBackground(new java.awt.Color(0, 102, 204));

        btnPacientes.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        btnPacientes.setForeground(new java.awt.Color(255, 255, 255));
        btnPacientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/people_working_together_35px.png"))); // NOI18N
        btnPacientes.setText("Pacientes");
        btnPacientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPacientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPacientesMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelButtonLayout = new javax.swing.GroupLayout(jPanelButton);
        jPanelButton.setLayout(jPanelButtonLayout);
        jPanelButtonLayout.setHorizontalGroup(
            jPanelButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnPacientes, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        jPanelButtonLayout.setVerticalGroup(
            jPanelButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnPacientes, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanelButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 200, 40));

        jPanelButton1.setBackground(new java.awt.Color(0, 102, 204));

        btnVacunacion.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        btnVacunacion.setForeground(new java.awt.Color(255, 255, 255));
        btnVacunacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/syringe_35px.png"))); // NOI18N
        btnVacunacion.setText("Vacunación");
        btnVacunacion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVacunacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVacunacionMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelButton1Layout = new javax.swing.GroupLayout(jPanelButton1);
        jPanelButton1.setLayout(jPanelButton1Layout);
        jPanelButton1Layout.setHorizontalGroup(
            jPanelButton1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnVacunacion, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        jPanelButton1Layout.setVerticalGroup(
            jPanelButton1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnVacunacion, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanelButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 200, 40));

        jPanelButton2.setBackground(new java.awt.Color(0, 102, 204));

        btnFuncionarios.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        btnFuncionarios.setForeground(new java.awt.Color(255, 255, 255));
        btnFuncionarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/doctor_male_35px.png"))); // NOI18N
        btnFuncionarios.setText("Funcionarios");
        btnFuncionarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFuncionarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFuncionariosMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelButton2Layout = new javax.swing.GroupLayout(jPanelButton2);
        jPanelButton2.setLayout(jPanelButton2Layout);
        jPanelButton2Layout.setHorizontalGroup(
            jPanelButton2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnFuncionarios, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        jPanelButton2Layout.setVerticalGroup(
            jPanelButton2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnFuncionarios, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanelButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 200, 40));

        jPanelButton3.setBackground(new java.awt.Color(0, 102, 204));

        btnLotesVacunacion.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        btnLotesVacunacion.setForeground(new java.awt.Color(255, 255, 255));
        btnLotesVacunacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/documents_folder_35px.png"))); // NOI18N
        btnLotesVacunacion.setText("Lotes Vacunación");
        btnLotesVacunacion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLotesVacunacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLotesVacunacionMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelButton3Layout = new javax.swing.GroupLayout(jPanelButton3);
        jPanelButton3.setLayout(jPanelButton3Layout);
        jPanelButton3Layout.setHorizontalGroup(
            jPanelButton3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnLotesVacunacion, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        jPanelButton3Layout.setVerticalGroup(
            jPanelButton3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnLotesVacunacion, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanelButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 200, 40));

        jPanelButton4.setBackground(new java.awt.Color(0, 102, 204));

        btnVacunas.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        btnVacunas.setForeground(new java.awt.Color(255, 255, 255));
        btnVacunas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/dose_35px.png"))); // NOI18N
        btnVacunas.setText("Vacunas");
        btnVacunas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVacunas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVacunasMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelButton4Layout = new javax.swing.GroupLayout(jPanelButton4);
        jPanelButton4.setLayout(jPanelButton4Layout);
        jPanelButton4Layout.setHorizontalGroup(
            jPanelButton4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnVacunas, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        jPanelButton4Layout.setVerticalGroup(
            jPanelButton4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnVacunas, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanelButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 200, 40));

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
        tblRegistros.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tblRegistros.setGridColor(new java.awt.Color(255, 255, 255));
        tblRegistros.setInheritsPopupMenu(true);
        tblRegistros.setIntercellSpacing(new java.awt.Dimension(2, 0));
        tblRegistros.setRequestFocusEnabled(false);
        tblRegistros.setRowHeight(30);
        tblRegistros.setSelectionBackground(new java.awt.Color(0, 102, 255));
        tblRegistros.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tblRegistros.setSurrendersFocusOnKeystroke(true);
        jScrollPane1.setViewportView(tblRegistros);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, 620, 390));

        jPanelButton5.setBackground(new java.awt.Color(255, 0, 51));

        btnCerrarSesion.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        btnCerrarSesion.setForeground(new java.awt.Color(255, 255, 255));
        btnCerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close_window_35px.png"))); // NOI18N
        btnCerrarSesion.setText("Cerrar Sesión");
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

        jPanel1.add(jPanelButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, 200, 40));

        jPanelButton6.setBackground(new java.awt.Color(0, 204, 51));

        btnAgregar.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAgregar.setText("Agregar Paciente");
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

        jPanel1.add(jPanelButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 490, 200, 40));

        jPanelButton7.setBackground(new java.awt.Color(255, 51, 51));

        btnEliminar.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnEliminar.setText("Eliminar Paciente");
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelButton7Layout = new javax.swing.GroupLayout(jPanelButton7);
        jPanelButton7.setLayout(jPanelButton7Layout);
        jPanelButton7Layout.setHorizontalGroup(
            jPanelButton7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        jPanelButton7Layout.setVerticalGroup(
            jPanelButton7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanelButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 490, 200, 40));

        jPanelButton8.setBackground(new java.awt.Color(0, 102, 204));

        btnEditar.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnEditar.setText("Editar Paciente");
        btnEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelButton8Layout = new javax.swing.GroupLayout(jPanelButton8);
        jPanelButton8.setLayout(jPanelButton8Layout);
        jPanelButton8Layout.setHorizontalGroup(
            jPanelButton8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        jPanelButton8Layout.setVerticalGroup(
            jPanelButton8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanelButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 490, 200, 40));

        lblTabla.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        lblTabla.setForeground(new java.awt.Color(255, 0, 51));
        lblTabla.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTabla.setText("Pacientes");
        jPanel1.add(lblTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(502, 40, 380, -1));

        jPanelButton9.setBackground(new java.awt.Color(255, 153, 0));

        btnReporte.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        btnReporte.setForeground(new java.awt.Color(255, 255, 255));
        btnReporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/document_35px.png"))); // NOI18N
        btnReporte.setText("Reporte Vacunas");
        btnReporte.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReporte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnReporteMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelButton9Layout = new javax.swing.GroupLayout(jPanelButton9);
        jPanelButton9.setLayout(jPanelButton9Layout);
        jPanelButton9Layout.setHorizontalGroup(
            jPanelButton9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnReporte, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        jPanelButton9Layout.setVerticalGroup(
            jPanelButton9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnReporte, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanelButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 200, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 907, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 546, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnPacientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPacientesMouseClicked
        btnAgregar.setText("Agregar Paciente");
        btnEditar.setText("Editar Paciente");
        btnEliminar.setText("Eliminar Paciente");
        lblTabla.setText("Pacientes");
        modeloActual = modelos[0];
        
        new PacienteController().fillTablePacientes(tblRegistros);
    }//GEN-LAST:event_btnPacientesMouseClicked

    private void btnVacunacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVacunacionMouseClicked
        btnAgregar.setText("Agregar Vacunación");
        btnEditar.setText("Editar Vacunación");
        btnEliminar.setText("Eliminar Vacunación");
        lblTabla.setText("Vacunaciones");
        modeloActual = modelos[1];
    }//GEN-LAST:event_btnVacunacionMouseClicked

    private void btnFuncionariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFuncionariosMouseClicked
        btnAgregar.setText("Agregar Funcionario");
        btnEditar.setText("Editar Funcionario");
        btnEliminar.setText("Eliminar Funcionario");
        lblTabla.setText("Funcionarios");
        modeloActual = modelos[2];
        
        new FuncionarioController().fillTableFuncionarios(tblRegistros);
    }//GEN-LAST:event_btnFuncionariosMouseClicked

    private void btnLotesVacunacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLotesVacunacionMouseClicked
        btnAgregar.setText("Agregar Lote");
        btnEditar.setText("Editar Lote");
        btnEliminar.setText("Eliminar Lote");
        lblTabla.setText("Lotes Vacunas");
        modeloActual = modelos[3];
    }//GEN-LAST:event_btnLotesVacunacionMouseClicked

    private void btnVacunasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVacunasMouseClicked
        btnAgregar.setText("Agregar Vacuna");
        btnEditar.setText("Editar Vacuna");
        btnEliminar.setText("Eliminar Vacuna");
        lblTabla.setText("Vacunas");
        modeloActual = modelos[4];
        
        new VacunaController().fillTableVacunas(tblRegistros);
    }//GEN-LAST:event_btnVacunasMouseClicked

    private void btnCerrarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarSesionMouseClicked
        int seleccion = JOptionPane.showConfirmDialog(null, "¿Está seguro de querer cerrar sesión?", "Cerrar Sesión", 0);
        if(seleccion == 0) {
            new Login().setVisible(true);
            setVisible(false);
            dispose();
        }
    }//GEN-LAST:event_btnCerrarSesionMouseClicked

    private void btnAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseClicked
        if(modeloActual.equals(modelos[0])) {
            new FormularioPaciente(this, false, tblRegistros).setVisible(true);
        } else if(modeloActual.equals(modelos[1])) {
            new FormularioVacunacion(this, false).setVisible(true);
        } else if(modeloActual.equals(modelos[2])) {
            new FormularioFuncionario(this, false, tblRegistros).setVisible(true);
        } else if(modeloActual.equals(modelos[3])) {
            new FormularioLoteVacuna(this, false).setVisible(true);
        } else if(modeloActual.equals(modelos[4])) {
            new FormularioVacuna(this, false, tblRegistros).setVisible(true);
        }
    }//GEN-LAST:event_btnAgregarMouseClicked

    private void btnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseClicked
        int rowIndex = tblRegistros.getSelectedRow();
        
        if(rowIndex != -1) {
            DefaultTableModel datos = (DefaultTableModel) tblRegistros.getModel();
            
            if(modeloActual.equals(modelos[0])) {
                PacienteController controlador = new PacienteController();
                controlador.fillTablePacientes(tblRegistros);
                controlador.deleteOnePaciente(Integer.parseInt((String) datos.getValueAt(rowIndex, 0)));
            } else if(modeloActual.equals(modelos[1])) {
                
            } else if(modeloActual.equals(modelos[2])) {
                FuncionarioController controlador = new FuncionarioController();
                controlador.fillTableFuncionarios(tblRegistros);
                controlador.deleteOneFuncionario(Integer.parseInt((String) datos.getValueAt(rowIndex, 0)));
            } else if(modeloActual.equals(modelos[3])) {
                
            } else if(modeloActual.equals(modelos[4])) {
                VacunaController controlador = new VacunaController();
                controlador.fillTableVacunas(tblRegistros);
                controlador.deleteOneVacuna(Integer.parseInt((String) datos.getValueAt(rowIndex, 0)));
            }
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Seleccione en la tabla el registro que deseas actualizar.", "Error Selección", 0);
        }
    }//GEN-LAST:event_btnEliminarMouseClicked

    private void btnEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseClicked
        int rowIndex = tblRegistros.getSelectedRow();
        
        if(rowIndex != -1) {
            DefaultTableModel datos = (DefaultTableModel) tblRegistros.getModel();
            
            if(modeloActual.equals(modelos[0])) {
                new FormularioPaciente(this, false, (String) datos.getValueAt(rowIndex, 0), tblRegistros).setVisible(true);
            } else if(modeloActual.equals(modelos[1])) {
                new FormularioVacunacion(this, false, "").setVisible(true);
            } else if(modeloActual.equals(modelos[2])) {
                new FormularioFuncionario(this, false, (String) datos.getValueAt(rowIndex, 0), tblRegistros).setVisible(true);
            } else if(modeloActual.equals(modelos[3])) {
                new FormularioLoteVacuna(this, false, "").setVisible(true);
            } else if(modeloActual.equals(modelos[4])) {
                new FormularioVacuna(this, false, (String) datos.getValueAt(rowIndex, 0), tblRegistros).setVisible(true);
            }
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Seleccione en la tabla el registro que deseas actualizar.", "Error Selección", 0);
        }
    }//GEN-LAST:event_btnEditarMouseClicked

    private void btnReporteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReporteMouseClicked
        new ReporteVacunacion().setVisible(true);
        setVisible(false);
        dispose();
    }//GEN-LAST:event_btnReporteMouseClicked

    public void customTable() {
        tblRegistros.getTableHeader().setFont(new java.awt.Font("Century Gothic", 1, 16));
        tblRegistros.getTableHeader().setBackground(new java.awt.Color(0,102,204));
        tblRegistros.getTableHeader().setForeground(new java.awt.Color(255, 255, 255));
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnAgregar;
    private javax.swing.JLabel btnCerrarSesion;
    private javax.swing.JLabel btnEditar;
    private javax.swing.JLabel btnEliminar;
    private javax.swing.JLabel btnFuncionarios;
    private javax.swing.JLabel btnLotesVacunacion;
    private javax.swing.JLabel btnPacientes;
    private javax.swing.JLabel btnReporte;
    private javax.swing.JLabel btnVacunacion;
    private javax.swing.JLabel btnVacunas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelButton;
    private javax.swing.JPanel jPanelButton1;
    private javax.swing.JPanel jPanelButton2;
    private javax.swing.JPanel jPanelButton3;
    private javax.swing.JPanel jPanelButton4;
    private javax.swing.JPanel jPanelButton5;
    private javax.swing.JPanel jPanelButton6;
    private javax.swing.JPanel jPanelButton7;
    private javax.swing.JPanel jPanelButton8;
    private javax.swing.JPanel jPanelButton9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTabla;
    private javax.swing.JTable tblRegistros;
    // End of variables declaration//GEN-END:variables
}
