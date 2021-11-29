package views;

import access.FuncionarioDAO;
import access.LoteVacunaDAO;
import controllers.ReporteVacunaController;
import models.ReporteVacunaModel;
import access.ReporteVacunaDAO;
import access.PacienteDAO;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import models.FuncionarioModel;
import models.LoteVacunaModel;

/**
 *
 * @author JCode
 */
public class FormularioVacunacion extends javax.swing.JDialog {
    javax.swing.JTable tabla = null;
    ReporteVacunaModel reporte = null;
    int id = 0;
    
    public FormularioVacunacion(java.awt.Frame parent, boolean modal, javax.swing.JTable tabla) {
        super(parent, modal);
        this.tabla = tabla;
        initComponents();
        llenarComboBox();
    }
    
    public FormularioVacunacion(java.awt.Frame parent, boolean modal, String reporte, javax.swing.JTable tabla) {
        super(parent, modal);
        this.tabla = tabla;
        this.reporte = new ReporteVacunaDAO().getOneReporteVacuna(Integer.parseInt(reporte));
        this.id = this.reporte.getIdReporte();
        initComponents();
        llenarComboBox();
        llenarCampos();
        lblTitulo.setText("Actualizar Registro Vacunación");
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
        txtFechaAplicacion = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        txtFechaRefuerzo = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        txtIdentificacion = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        cbxLoteVacuna = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        cbxFuncionario = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Manejo Vacunación");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Fecha Aplicación:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        lblTitulo.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(51, 51, 51));
        lblTitulo.setText("Añadir Registro Vacunación");
        jPanel1.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Fecha Refuerzo:");
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

        jPanel1.add(jPanelButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, 200, 40));

        txtFechaAplicacion.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtFechaAplicacion.setForeground(new java.awt.Color(51, 51, 51));
        txtFechaAplicacion.setBorder(null);
        jPanel1.add(txtFechaAplicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 300, 40));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 300, 10));

        txtFechaRefuerzo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtFechaRefuerzo.setForeground(new java.awt.Color(51, 51, 51));
        txtFechaRefuerzo.setBorder(null);
        jPanel1.add(txtFechaRefuerzo, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 90, 300, 40));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 130, 300, 10));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Identificación Paciente:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        txtIdentificacion.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtIdentificacion.setForeground(new java.awt.Color(51, 51, 51));
        txtIdentificacion.setBorder(null);
        jPanel1.add(txtIdentificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 300, 40));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 221, 300, 10));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Lote Vacuna Aplicada:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, -1, -1));

        cbxLoteVacuna.setBackground(new java.awt.Color(255, 255, 255));
        cbxLoteVacuna.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        cbxLoteVacuna.setForeground(new java.awt.Color(51, 51, 51));
        cbxLoteVacuna.setBorder(null);
        jPanel1.add(cbxLoteVacuna, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 178, 300, 40));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Funcionario Aplica:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, -1, -1));

        cbxFuncionario.setBackground(new java.awt.Color(255, 255, 255));
        cbxFuncionario.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        cbxFuncionario.setForeground(new java.awt.Color(51, 51, 51));
        cbxFuncionario.setBorder(null);
        jPanel1.add(cbxFuncionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 300, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 675, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 395, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseClicked
        boolean valido = validarFormulario();
        
        if (valido) {
            int idPaciente = new PacienteDAO().getIdPacienteWhitIdentificacion(Integer.parseInt(txtIdentificacion.getText()));
            if(idPaciente != 0) {
                String[] data = {
                    txtFechaAplicacion.getText(),
                    txtFechaRefuerzo.getText(),
                    String.valueOf(idPaciente),
                    cbxFuncionario.getSelectedItem().toString().split(" ")[0],
                    cbxLoteVacuna.getSelectedItem().toString().split(" ")[0]
                };

                if (reporte == null) {
                    ReporteVacunaController controlador = new ReporteVacunaController();
                    controlador.fillTableReportes(tabla);
                    boolean insertado = controlador.insertOneReporteVacuna(data);

                    if (insertado) {
                        JOptionPane.showMessageDialog(this, "Reporte agregado correctamente.", "Proceso Exitoso", 1);
                        this.setVisible(false);
                        this.dispose();
                    } else {
                        JOptionPane.showMessageDialog(this, "No se pudo agregar el reporte.", "Proceso Fallido", 1);
                    }
                } else {
                    ReporteVacunaController controlador = new ReporteVacunaController();
                    controlador.fillTableReportes(tabla);
                    boolean actualizado = controlador.updateOneReporte(data, id);

                    if (actualizado) {
                        JOptionPane.showMessageDialog(this, "Reporte actualizado correctamente.", "Proceso Exitoso", 1);
                        this.setVisible(false);
                        this.dispose();
                    } else {
                        JOptionPane.showMessageDialog(this, "No se pudo actualizar el reporte.", "Proceso Fallido", 1);
                    }
                }
            } else {
                JOptionPane.showMessageDialog(this, "No existe ningún paciente con esa identificación.", "Proceso Fallido", 1);
            }
        }
    }//GEN-LAST:event_btnAgregarMouseClicked

    private void llenarComboBox() {
        ArrayList<LoteVacunaModel> lotes = new LoteVacunaDAO().getAllLoteVacunas();
        ArrayList<FuncionarioModel> funcionarios = new FuncionarioDAO().getAllFuncionarios();
        
        cbxFuncionario.addItem("Seleccione una opción");
        for(FuncionarioModel funcionario : funcionarios) {
            cbxFuncionario.addItem(String.valueOf(funcionario.getIdFuncionario()) + " " + funcionario.getPrimerNombre() + " " + funcionario.getPrimerApellido());
        }
        
        cbxLoteVacuna.addItem("Seleccione una opción");
        for(LoteVacunaModel lote : lotes) {
            cbxLoteVacuna.addItem(String.valueOf(lote.getIdLote() + " " + lote.getFarmaceuticaVacuna()));
        }
        
        txtFechaAplicacion.setText(getFecha());
    }
    
    private void llenarCampos() {
        FuncionarioModel funcionario = new FuncionarioDAO().getOneFuncionario(reporte.getIdentificacionFuncionario());
        LoteVacunaModel lote = new LoteVacunaDAO().getOneLoteVacuna(reporte.getIdLoteVacuna());
        
        txtFechaAplicacion.setText(reporte.getFechaAplicacion());
        txtFechaRefuerzo.setText(reporte.getFechaRefuerzo() == null ? "0" : reporte.getFechaRefuerzo());
        txtIdentificacion.setText(String.valueOf(reporte.getIdentificacionPaciente()));
        cbxFuncionario.setSelectedItem(String.valueOf(funcionario.getIdFuncionario()) + " " + funcionario.getPrimerNombre() + " " + funcionario.getPrimerApellido());
        cbxLoteVacuna.setSelectedItem(String.valueOf(lote.getIdLote() + " " + lote.getFarmaceuticaVacuna()));
    }
    
    private boolean validarFormulario() {
        boolean valido = false;

        try {
            if (txtFechaAplicacion.getText().trim().equals("")) {
                JOptionPane.showMessageDialog(this, "Ingresa la fecha de aplicación.", "Error", 0);
            } else if (txtFechaRefuerzo.getText().trim().equals("")) {
                JOptionPane.showMessageDialog(this, "Ingresa la fecha de refuerzo, en caso de \nno requerir dijita 0 en el campo.", "Error", 0);
            } else if(txtIdentificacion.getText().trim().equals("")) {
                JOptionPane.showMessageDialog(this, "Ingresa la identificación del paciente.", "Error", 0);
            } else if(cbxLoteVacuna.getSelectedIndex() == 0) {
                JOptionPane.showMessageDialog(this, "Selecciona un funcionario.", "Error", 0);
            } else if(cbxFuncionario.getSelectedIndex() == 0) {
                JOptionPane.showMessageDialog(this, "Selecciona un lote de vacunas.", "Error", 0);
            } else {
                valido = true;
            }
        } catch (java.lang.NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Algo ha salido mal al validar el formulario.", "Error", 0);
        }

        return valido;
    }
    
    public String getFecha() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return dtf.format(LocalDateTime.now()).toString();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnAgregar;
    private javax.swing.JComboBox<String> cbxFuncionario;
    private javax.swing.JComboBox<String> cbxLoteVacuna;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelButton6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtFechaAplicacion;
    private javax.swing.JTextField txtFechaRefuerzo;
    private javax.swing.JTextField txtIdentificacion;
    // End of variables declaration//GEN-END:variables
}
