package controllers;

import javax.swing.JTable;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import java.util.ArrayList;
import models.FuncionarioModel;
import access.FuncionarioDAO;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author JCode
 */
public class FuncionarioController {
    private JTable tablaFuncionarios = null;
    private ArrayList<FuncionarioModel> funcionarios = null;
    
    public void fillTableFuncionarios(JTable tabla) {
        funcionarios = new FuncionarioDAO().getAllFuncionarios();
        tablaFuncionarios = tabla;
        
        DefaultTableModel modeloTabla = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        
        modeloTabla.addColumn("Identificación");
        modeloTabla.addColumn("Primer Nombre");
        modeloTabla.addColumn("Segundo Nombre");
        modeloTabla.addColumn("Primer Apellido");
        modeloTabla.addColumn("Segundo Apellido");
        modeloTabla.addColumn("Correo Electrónico");
        modeloTabla.addColumn("Cargo");
        modeloTabla.addColumn("Teléfono");
        modeloTabla.addColumn("Ultimo Acceso");
        
        for(FuncionarioModel funcionario : funcionarios) {
            String[] row = {
                String.valueOf(funcionario.getIdentificacion()),
                funcionario.getPrimerNombre(),
                funcionario.getSegundoNombre(),
                funcionario.getPrimerApellido(),
                funcionario.getSegundoApellido(),
                funcionario.getEmail(),
                funcionario.getCargo(),
                funcionario.getTelefono(),
                funcionario.getUltimoAcceso()
            };
            
            modeloTabla.addRow(row);
        }
        
        
        tablaFuncionarios.setModel(modeloTabla);
        
        TableColumnModel modeloColumnas = tablaFuncionarios.getColumnModel();
        modeloColumnas.getColumn(0).setPreferredWidth(130);
        modeloColumnas.getColumn(1).setPreferredWidth(150);
        modeloColumnas.getColumn(2).setPreferredWidth(150);
        modeloColumnas.getColumn(3).setPreferredWidth(150);
        modeloColumnas.getColumn(4).setPreferredWidth(150);
        modeloColumnas.getColumn(5).setPreferredWidth(170);
        modeloColumnas.getColumn(6).setPreferredWidth(60);
        modeloColumnas.getColumn(7).setPreferredWidth(100);
        modeloColumnas.getColumn(8).setPreferredWidth(130);
    }
    
    public boolean insertOneFuncionario(String[] data) {
        boolean insertado = false;
        
        FuncionarioModel nuevoFuncionario = new FuncionarioModel(
            data[0],
            data[1],
            0,
            getFecha(),
            Integer.parseInt(data[2]),
            data[3],
            data[4],
            data[5],
            data[6],
            data[7],
            "FUN"
        );
        
        boolean insertadoDB = new FuncionarioDAO().insertOneFuncionario(nuevoFuncionario);
        
        if(insertadoDB) {
            insertado = true;
            fillTableFuncionarios(tablaFuncionarios);
        }
        
        return insertado;
    }
    
    public boolean updateOneFuncionario(String[] data, int identificacion) {
        boolean actualizado = false;
        
        FuncionarioModel nuevoFuncionario = new FuncionarioModel(
            data[0],
            data[1],
            0,
            getFecha(),
            Integer.parseInt(data[2]),
            data[3],
            data[4],
            data[5],
            data[6],
            data[7],
            "FUN"
        );
        
        boolean insertadoDB = new FuncionarioDAO().updateOneFuncionario(nuevoFuncionario, identificacion);
        
        if(insertadoDB) {
            actualizado=  true;
            fillTableFuncionarios(tablaFuncionarios);
        }
        
        return  actualizado;
    }
    
    public void deleteOneFuncionario(int identificacion) {
        if(JOptionPane.showConfirmDialog(null, "¿Seguro que desea eliminar el registro?", "Confirmación", 1) == 0) {
            boolean exito = new FuncionarioDAO().deleteOneFuncionario(identificacion);

            if(exito) {
                JOptionPane.showMessageDialog(null, "Funcionario eliminado correctamente", "Eliminación Exitosa", 1);
                fillTableFuncionarios(tablaFuncionarios);
            }
        }
    }
    
    public String getFecha() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        return dtf.format(LocalDateTime.now()).toString();
    }
}
