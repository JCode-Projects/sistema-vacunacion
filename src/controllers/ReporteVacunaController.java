package controllers;

import javax.swing.JTable;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import java.util.ArrayList;
import models.ReporteVacunaModel;
import access.ReporteVacunaDAO;
import access.LoteVacunaDAO;

/**
 *
 * @author JCode
 */
public class ReporteVacunaController {
    private JTable tablaReporteVacunas = null;
    private ArrayList<ReporteVacunaModel> reporteVacunas = null;
    
    public void fillTableReportes(JTable tabla) {
        reporteVacunas = new ReporteVacunaDAO().getAllReportesVacunas();
        tablaReporteVacunas = tabla;
        
        DefaultTableModel modeloTabla = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        
        modeloTabla.addColumn("Id Reporte");
        modeloTabla.addColumn("Fecha Aplicación");
        modeloTabla.addColumn("Fecha Refuerzo");
        modeloTabla.addColumn("Id Paciente");
        modeloTabla.addColumn("Identificación Paciente");
        modeloTabla.addColumn("Id Funcionario");
        modeloTabla.addColumn("Identificación Funcionario");
        modeloTabla.addColumn("Id Lote");
        modeloTabla.addColumn("Id Vacuna");
        modeloTabla.addColumn("Farmaceutica");
        
        for(ReporteVacunaModel reporte : reporteVacunas) {
            String[] row = {
                String.valueOf(reporte.getIdReporte()),
                reporte.getFechaAplicacion(),
                reporte.getFechaRefuerzo(),
                String.valueOf(reporte.getIdPaciente()),
                String.valueOf(reporte.getIdentificacionPaciente()),
                String.valueOf(reporte.getIdFuncionario()),
                String.valueOf(reporte.getIdentificacionFuncionario()),
                String.valueOf(reporte.getIdLoteVacuna()),
                String.valueOf(reporte.getIdVacuna()),
                reporte.getFarmaceuticaVacuna()
            };
            
            modeloTabla.addRow(row);
        }
        
        
        tablaReporteVacunas.setModel(modeloTabla);
        
        TableColumnModel modeloColumnas = tablaReporteVacunas.getColumnModel();
        modeloColumnas.getColumn(0).setPreferredWidth(60);
        modeloColumnas.getColumn(1).setPreferredWidth(130);
        modeloColumnas.getColumn(2).setPreferredWidth(130);
        modeloColumnas.getColumn(3).setPreferredWidth(130);
        modeloColumnas.getColumn(4).setPreferredWidth(130);
        modeloColumnas.getColumn(5).setPreferredWidth(130);
        modeloColumnas.getColumn(6).setPreferredWidth(130);
        modeloColumnas.getColumn(7).setPreferredWidth(130);
        modeloColumnas.getColumn(8).setPreferredWidth(130);
        modeloColumnas.getColumn(9).setPreferredWidth(130);
    }
    
    public ReporteVacunaModel getOneReporteByIdUsuario(int id) {
        return new ReporteVacunaDAO().getOneReporteVacunaByIdUsuario(id);
    }
    
    public boolean insertOneReporteVacuna(String[] data) {
        boolean insertado = false;
        
        ReporteVacunaModel nuevaReporte = new ReporteVacunaModel(data[0], data[1], Integer.parseInt(data[2]), Integer.parseInt(data[3]), Integer.parseInt(data[4]));
        
        boolean registroAplicacion = new LoteVacunaDAO().vacunaAplicada(nuevaReporte.getIdLoteVacuna());
        if(registroAplicacion) {
            boolean insertadoDB = new ReporteVacunaDAO().insertOneReporteVacuna(nuevaReporte);
            if(insertadoDB) {
                insertado = true;
                fillTableReportes(tablaReporteVacunas);
            }
        }
        
        return insertado;
    }
    
    public boolean updateOneReporte(String[] data, int id) {
        boolean actualizado = false;
        
        ReporteVacunaModel nuevoReporte = new ReporteVacunaModel(data[0], data[1], Integer.parseInt(data[2]), Integer.parseInt(data[3]), Integer.parseInt(data[4]));
        
        boolean insertadoDB = new ReporteVacunaDAO().updateOneReporteVacuna(nuevoReporte, id);
        
        if(insertadoDB) {
            actualizado=  true;
            fillTableReportes(tablaReporteVacunas);
        }
        
        return  actualizado;
    }
    
    public void deleteOneVacuna(int id) {
        if(JOptionPane.showConfirmDialog(null, "¿Seguro que desea eliminar el registro?", "Confirmación", 1) == 0) {
            boolean exito = new ReporteVacunaDAO().deleteOneReporteVacuna(id);

            if(exito) {
                JOptionPane.showMessageDialog(null, "Reporte eliminado correctamente", "Eliminación Exitosa", 1);
                fillTableReportes(tablaReporteVacunas);
            }
        }
    }
}
