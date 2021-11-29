package controllers;

import javax.swing.JTable;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import java.util.ArrayList;
import models.ReporteModel;
import access.ReporteDAO;

/**
 *
 * @author JCode
 */
public class ReporteController {
    private JTable tablaVacunados = null;
    private ArrayList<ReporteModel> vacunados = null;
    
    public void fillTableVacunas(JTable tabla ,ArrayList<ReporteModel> data) {
        vacunados = data;
        tablaVacunados = tabla;
        
        DefaultTableModel modeloTabla = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        
        if(!data.isEmpty()) {
            modeloTabla.addColumn("Identificacion");
            modeloTabla.addColumn("Primer Nombre");
            modeloTabla.addColumn("Primer Apellido");
            modeloTabla.addColumn("Farmaceutica");
            modeloTabla.addColumn("Fecha Aplicación");


            for(ReporteModel vacunado : vacunados) {
                String[] row = {
                    String.valueOf(vacunado.getIdentificacion()),
                    vacunado.getPrimerNombre(),
                    vacunado.getPrimerApellido(),
                    vacunado.getFarmaceutica(),
                    vacunado.getFechaAplicacion()
                };

                modeloTabla.addRow(row);
            }
        } else {
            modeloTabla.addColumn("Detalles");
            String[] row = {"No hay ningún vacunado con los parametros de busqueda."};
            modeloTabla.addRow(row);
        }
        
        
        tablaVacunados.setModel(modeloTabla);
    }
    
    public void eventListBox(JTable tabla, String farmaceutica) {
        ArrayList<ReporteModel> vacunados = new ReporteDAO().getAllVacunadosAsTipoVacuna(farmaceutica);
        fillTableVacunas(tabla, vacunados);
    }
    
    public void eventTextFiel(JTable tabla, String identificacion) {
        ArrayList<ReporteModel> vacunados = new ReporteDAO().getAllVacunadosAsIdentificacion(identificacion);
        fillTableVacunas(tabla, vacunados);
    }
}
