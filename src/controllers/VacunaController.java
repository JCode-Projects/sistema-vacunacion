package controllers;

import javax.swing.JTable;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import java.util.ArrayList;
import models.VacunaModel;
import access.VacunaDAO;

/**
 *
 * @author JCode
 */
public class VacunaController {
    private JTable tablaVacunas = null;
    private ArrayList<VacunaModel> vacunas = null;
    
    public void fillTableVacunas(JTable tabla) {
        vacunas = new VacunaDAO().getAllVacunas();
        tablaVacunas = tabla;
        
        DefaultTableModel modeloTabla = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        
        modeloTabla.addColumn("Id Vacuna");
        modeloTabla.addColumn("Farmaceutica Vacuna");
        modeloTabla.addColumn("Requiere Refuerzo");
        
        for(VacunaModel vacuna : vacunas) {
            String[] row = {
                String.valueOf(vacuna.getIdVacuna()),
                vacuna.getFarmaceutica(),
                vacuna.getRefuerzo() == 0 ? "No requiere" : "Si requiere"
            };
            
            modeloTabla.addRow(row);
        }
        
        
        tablaVacunas.setModel(modeloTabla);
        
        TableColumnModel modeloColumnas = tablaVacunas.getColumnModel();
        modeloColumnas.getColumn(0).setPreferredWidth(130);
        modeloColumnas.getColumn(1).setPreferredWidth(287);
        modeloColumnas.getColumn(2).setPreferredWidth(200);
    }
    
    public boolean insertOneVacuna(String[] data) {
        boolean insertado = false;
        
        VacunaModel nuevaVacuna = new VacunaModel(0, data[0], Integer.parseInt(data[1]));
        
        boolean insertadoDB = new VacunaDAO().insertOneVacuna(nuevaVacuna);
        
        if(insertadoDB) {
            insertado = true;
            fillTableVacunas(tablaVacunas);
        }
        
        return insertado;
    }
    
    public boolean updateOneVacuna(String[] data, int id) {
        boolean actualizado = false;
        
        VacunaModel nuevaVacuna = new VacunaModel(0, data[0], Integer.parseInt(data[1]));
        
        boolean insertadoDB = new VacunaDAO().updateOneVacuna(nuevaVacuna, id);
        
        if(insertadoDB) {
            actualizado=  true;
            fillTableVacunas(tablaVacunas);
        }
        
        return  actualizado;
    }
    
    public void deleteOneVacuna(int id) {
        if(JOptionPane.showConfirmDialog(null, "¿Seguro que desea eliminar el registro?", "Confirmación", 1) == 0) {
            boolean exito = new VacunaDAO().deleteOneVacuna(id);

            if(exito) {
                JOptionPane.showMessageDialog(null, "Vacuna eliminada correctamente", "Eliminación Exitosa", 1);
                fillTableVacunas(tablaVacunas);
            }
        }
    }
}
