package controllers;

import javax.swing.JTable;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import java.util.ArrayList;
import models.LoteVacunaModel;
import access.LoteVacunaDAO;

/**
 *
 * @author JCode
 */
public class LoteVacunaController {
    private JTable tablaLoteVacunas = null;
    private ArrayList<LoteVacunaModel> loteVacunas = null;
    
    public void fillTableLoteVacunas(JTable tabla) {
        loteVacunas = new LoteVacunaDAO().getAllLoteVacunas();
        tablaLoteVacunas = tabla;
        
        DefaultTableModel modeloTabla = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        
        modeloTabla.addColumn("Id Lote");
        modeloTabla.addColumn("Número Dosis");
        modeloTabla.addColumn("Número Dosis Restantes");
        modeloTabla.addColumn("Id Vacuna");
        modeloTabla.addColumn("Farmaceutica Vacuna");
        
        for(LoteVacunaModel lote : loteVacunas) {
            String[] row = {
                String.valueOf(lote.getIdLote()),
                String.valueOf(lote.getNumeroDosis()),
                String.valueOf(lote.getNumeroDosisRestantes()),
                String.valueOf(lote.getIdVacuna()),
                lote.getFarmaceuticaVacuna()
            };
            
            modeloTabla.addRow(row);
        }
        
        
        tablaLoteVacunas.setModel(modeloTabla);
        
        TableColumnModel modeloColumnas = tablaLoteVacunas.getColumnModel();
        modeloColumnas.getColumn(0).setPreferredWidth(100);
        modeloColumnas.getColumn(1).setPreferredWidth(125);
        modeloColumnas.getColumn(2).setPreferredWidth(150);
        modeloColumnas.getColumn(3).setPreferredWidth(125);
        modeloColumnas.getColumn(4).setPreferredWidth(125);
    }
    
    public boolean insertOneLoteVacuna(String[] data) {
        boolean insertado = false;
        
        LoteVacunaModel nuevoLote = new LoteVacunaModel(0, Integer.parseInt(data[0]), Integer.parseInt(data[1]), Integer.parseInt(data[2]));
        
        boolean insertadoDB = new LoteVacunaDAO().insertOneLoteVacuna(nuevoLote);
        
        if(insertadoDB) {
            insertado = true;
            fillTableLoteVacunas(tablaLoteVacunas);
        }
        
        return insertado;
    }
    
    public boolean updateOneLoteVacuna(String[] data, int id) {
        boolean actualizado = false;
        
        LoteVacunaModel nuevoLote = new LoteVacunaModel(0, Integer.parseInt(data[0]), Integer.parseInt(data[1]), Integer.parseInt(data[2]));
        
        boolean insertadoDB = new LoteVacunaDAO().updateOneLoteVacuna(nuevoLote, id);
        
        if(insertadoDB) {
            actualizado=  true;
            fillTableLoteVacunas(tablaLoteVacunas);
        }
        
        return  actualizado;
    }
    
    public void deleteOneLoteVacuna(int id) {
        if(JOptionPane.showConfirmDialog(null, "¿Seguro que desea eliminar el registro?", "Confirmación", 1) == 0) {
            boolean exito = new LoteVacunaDAO().deleteOneLoteVacunas(id);

            if(exito) {
                JOptionPane.showMessageDialog(null, "Lote eliminado correctamente", "Eliminación Exitosa", 1);
                fillTableLoteVacunas(tablaLoteVacunas);
            }
        }
    }
}
