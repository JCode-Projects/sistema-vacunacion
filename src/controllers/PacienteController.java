package controllers;

import javax.swing.JTable;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import java.util.ArrayList;
import models.PacienteModel;
import access.PacienteDAO;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author JCode
 */
public class PacienteController {
    private JTable tablaPacientes = null;
    private ArrayList<PacienteModel> pacientes = null;
    
    public void fillTablePacientes(JTable tabla) {
        pacientes = new PacienteDAO().getAllPacientes();
        tablaPacientes = tabla;
        
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
        modeloTabla.addColumn("Edad");
        modeloTabla.addColumn("Teléfono");
        modeloTabla.addColumn("Ultimo Acceso");
        
        for(PacienteModel paciente : pacientes) {
            String[] row = {
                String.valueOf(paciente.getIdentificacion()),
                paciente.getPrimerNombre(),
                paciente.getSegundoNombre(),
                paciente.getPrimerApellido(),
                paciente.getSegundoApellido(),
                paciente.getEmail(),
                String.valueOf(paciente.getEdad()),
                paciente.getTelefono(),
                paciente.getUltimoAcceso()
            };
            
            modeloTabla.addRow(row);
        }
        
        
        tablaPacientes.setModel(modeloTabla);
        
        TableColumnModel modeloColumnas = tablaPacientes.getColumnModel();
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
    
    public boolean insertOnePaciente(String[] data) {
        boolean insertado = false;
        
        PacienteModel nuevoPaciente = new PacienteModel(
            data[0],
            data[1],
            Integer.parseInt(data[2]),
            0,
            getFecha(),
            Integer.parseInt(data[3]),
            data[4], 
            data[5], 
            data[6], 
            data[7], 
            data[8],
            "USU"
        );
        
        boolean insertadoDB = new PacienteDAO().insertOnePaciente(nuevoPaciente);
        
        if(insertadoDB) {
            insertado = true;
            fillTablePacientes(tablaPacientes);
        }
        
        return insertado;
    }
    
    public boolean updateOnePaciente(String[] data, int identificacion) {
        boolean actualizado = false;
        
        PacienteModel nuevoPaciente = new PacienteModel(
            data[0],
            data[1],
            Integer.parseInt(data[2]),
            0,
            getFecha(),
            Integer.parseInt(data[3]),
            data[4], 
            data[5], 
            data[6], 
            data[7], 
            data[8],
            "USU"
        );
        
        boolean insertadoDB = new PacienteDAO().updateOnePaciente(nuevoPaciente, identificacion);
        
        if(insertadoDB) {
            actualizado=  true;
            fillTablePacientes(tablaPacientes);
        }
        
        return  actualizado;
    }
    
    public void deleteOnePaciente(int identificacion) {
        if(JOptionPane.showConfirmDialog(null, "¿Seguro que desea eliminar el registro?", "Confirmación", 1) == 0) {
            boolean exito = new PacienteDAO().deleteOnePaciente(identificacion);

            if(exito) {
                JOptionPane.showMessageDialog(null, "Paciente eliminado correctamente", "Eliminación Exitosa", 1);
                fillTablePacientes(tablaPacientes);
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo eliminar el paciente.", "Eliminación Fallida", 0); 
            }
        }
    }
    
    public String getFecha() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        return dtf.format(LocalDateTime.now()).toString();
    }
}
