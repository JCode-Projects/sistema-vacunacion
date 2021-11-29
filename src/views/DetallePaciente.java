package views;

import access.VacunaDAO;
import models.PacienteModel;
import controllers.ReporteVacunaController;
import models.ReporteVacunaModel;
import models.VacunaModel;

/**
 *
 * @author JCode
 */
public class DetallePaciente extends javax.swing.JFrame {

    private PacienteModel paciente = null;
    ReporteVacunaModel reporte = null;
    VacunaModel vacuna = null;
    
    public DetallePaciente(PacienteModel paciente) {
        initComponents();
        this.paciente = paciente;
        setLocationRelativeTo(null);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        obtenerInformacionAdicional();
        llenarDatos();
    }
    
    public DetallePaciente(PacienteModel paciente, boolean dispose) {
        initComponents();
        this.paciente = paciente;
        setLocationRelativeTo(null);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        obtenerInformacionAdicional();
        llenarDatos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        container = new javax.swing.JPanel();
        lblNombrePaciente = new javax.swing.JLabel();
        lblIdentificacion = new javax.swing.JLabel();
        lblFarmaceuticaVacuna = new javax.swing.JLabel();
        lblCorreo = new javax.swing.JLabel();
        lblSegundoApellido = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblTipo = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblDireccion = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblPrimerNombre = new javax.swing.JLabel();
        lblSegundoNombre = new javax.swing.JLabel();
        lblPrimerApellido = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lblTipo1 = new javax.swing.JLabel();
        lblEdad = new javax.swing.JLabel();
        lblFechaAplicacion = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        lblRefuerzo = new javax.swing.JLabel();
        lblFechaRefuerzo = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Detalles Paciente");
        setResizable(false);

        container.setBackground(new java.awt.Color(255, 255, 255));
        container.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNombrePaciente.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        lblNombrePaciente.setForeground(new java.awt.Color(0, 0, 0));
        lblNombrePaciente.setText("Zaque Camilo");
        container.add(lblNombrePaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, -1));

        lblIdentificacion.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblIdentificacion.setForeground(new java.awt.Color(0, 0, 0));
        lblIdentificacion.setText("107856367");
        container.add(lblIdentificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, -1, -1));

        lblFarmaceuticaVacuna.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        lblFarmaceuticaVacuna.setForeground(new java.awt.Color(0, 0, 0));
        lblFarmaceuticaVacuna.setText("Moderna");
        container.add(lblFarmaceuticaVacuna, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, -1, -1));

        lblCorreo.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblCorreo.setForeground(new java.awt.Color(0, 0, 0));
        lblCorreo.setText("correo@correo.com");
        container.add(lblCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, -1, -1));

        lblSegundoApellido.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblSegundoApellido.setForeground(new java.awt.Color(0, 0, 0));
        lblSegundoApellido.setText("Bautista");
        container.add(lblSegundoApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 150, -1, -1));

        lblTelefono.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblTelefono.setForeground(new java.awt.Color(0, 0, 0));
        lblTelefono.setText("3126547894");
        container.add(lblTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, -1, -1));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Correo:");
        container.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        lblTipo.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblTipo.setForeground(new java.awt.Color(0, 0, 0));
        lblTipo.setText("Paciente");
        container.add(lblTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, -1, -1));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Teléfono:");
        container.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        lblDireccion.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblDireccion.setForeground(new java.awt.Color(0, 0, 0));
        lblDireccion.setText("Gachetá");
        container.add(lblDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, -1, -1));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Identificación:");
        container.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        lblPrimerNombre.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblPrimerNombre.setForeground(new java.awt.Color(0, 0, 0));
        lblPrimerNombre.setText("Yeferson");
        container.add(lblPrimerNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 60, -1, -1));

        lblSegundoNombre.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblSegundoNombre.setForeground(new java.awt.Color(0, 0, 0));
        lblSegundoNombre.setText("Camilo");
        container.add(lblSegundoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 90, -1, -1));

        lblPrimerApellido.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblPrimerApellido.setForeground(new java.awt.Color(0, 0, 0));
        lblPrimerApellido.setText("Zaque");
        container.add(lblPrimerApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 120, -1, -1));

        jLabel13.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Primer Nombre:");
        container.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, -1, -1));

        jLabel14.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Segundo Nombre:");
        container.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, -1, -1));

        jLabel15.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Primer Apellido:");
        container.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, -1, -1));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Segundo Apellido:");
        container.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, -1, -1));

        jLabel11.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Tipo:");
        container.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        lblTipo1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblTipo1.setForeground(new java.awt.Color(0, 0, 0));
        lblTipo1.setText("Paciente");
        container.add(lblTipo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, -1, -1));

        lblEdad.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblEdad.setForeground(new java.awt.Color(0, 0, 0));
        lblEdad.setText("65 Años");
        container.add(lblEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 180, -1, -1));

        lblFechaAplicacion.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblFechaAplicacion.setForeground(new java.awt.Color(0, 0, 0));
        lblFechaAplicacion.setText("23/11/2021");
        container.add(lblFechaAplicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, -1, -1));

        jLabel17.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("Edad:");
        container.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, -1, -1));
        container.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 690, 10));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Paciente:");
        container.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));
        container.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 690, 10));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Vacuna:");
        container.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        jLabel18.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("Dirección:");
        container.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        lblRefuerzo.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblRefuerzo.setForeground(new java.awt.Color(0, 0, 0));
        lblRefuerzo.setText("Si");
        container.add(lblRefuerzo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, -1, -1));

        lblFechaRefuerzo.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblFechaRefuerzo.setForeground(new java.awt.Color(0, 0, 0));
        lblFechaRefuerzo.setText("23/12/2021");
        container.add(lblFechaRefuerzo, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 270, -1, -1));

        jLabel21.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setText("Requiere Refuerzo:");
        container.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        jLabel22.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 0, 0));
        jLabel22.setText("Fecha Aplicación:");
        container.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        jLabel23.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 0, 0));
        jLabel23.setText("Fecha Refuerzo:");
        container.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 270, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(container, javax.swing.GroupLayout.DEFAULT_SIZE, 741, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(container, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void llenarDatos() {
        lblNombrePaciente.setText(paciente.getPrimerNombre() + " " + paciente.getPrimerApellido());
        lblIdentificacion.setText(String.valueOf(paciente.getIdentificacion()));
        lblCorreo.setText(paciente.getEmail());
        lblTelefono.setText(paciente.getTelefono());
        lblTipo.setText("Paciente");
        lblDireccion.setText(paciente.getDireccion());
        lblPrimerNombre.setText(paciente.getPrimerNombre());
        lblSegundoNombre.setText(paciente.getSegundoNombre());
        lblPrimerApellido.setText(paciente.getPrimerApellido());
        lblSegundoApellido.setText(paciente.getSegundoApellido());
        lblEdad.setText(String.valueOf(paciente.getEdad()) + " Años");
        
        if(reporte != null) {
            lblFarmaceuticaVacuna.setText(reporte.getFarmaceuticaVacuna());
            lblFechaAplicacion.setText(reporte.getFechaAplicacion());
            lblFechaRefuerzo.setText(reporte.getFechaRefuerzo() == null ? "No registrado" : reporte.getFechaRefuerzo());
            lblRefuerzo.setText(vacuna.getRefuerzo()== 0 ? "No requiere" : "Si requiere");
        } else {
            lblFarmaceuticaVacuna.setText("No registra");
            lblFechaAplicacion.setText("No registra");
            lblFechaRefuerzo.setText("No registra");
            lblRefuerzo.setText("No registra");
        }
    }
    
    private void obtenerInformacionAdicional() {
        reporte = new ReporteVacunaController().getOneReporteByIdUsuario(paciente.getIdentificacion());
        if(reporte != null) {
            vacuna = new VacunaDAO().getOneVacuna(reporte.getIdVacuna());
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel container;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblEdad;
    private javax.swing.JLabel lblFarmaceuticaVacuna;
    private javax.swing.JLabel lblFechaAplicacion;
    private javax.swing.JLabel lblFechaRefuerzo;
    private javax.swing.JLabel lblIdentificacion;
    private javax.swing.JLabel lblNombrePaciente;
    private javax.swing.JLabel lblPrimerApellido;
    private javax.swing.JLabel lblPrimerNombre;
    private javax.swing.JLabel lblRefuerzo;
    private javax.swing.JLabel lblSegundoApellido;
    private javax.swing.JLabel lblSegundoNombre;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JLabel lblTipo1;
    // End of variables declaration//GEN-END:variables
}
