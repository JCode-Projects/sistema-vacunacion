/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author JCode
 */
public class ReporteVacunaModel {
    private int idReporte;
    private String fechaAplicacion;
    private String fechaRefuerzo;
    private int idPaciente;
    private int idFuncionario;
    private int idVacuna;

    // Constructor para obtener toda la información
    public ReporteVacunaModel(int idReporte, String fechaAplicacion, String fechaRefuerzo, int idPaciente, int idFuncionario, int idVacuna) {
        this.idReporte = idReporte;
        this.fechaAplicacion = fechaAplicacion;
        this.fechaRefuerzo = fechaRefuerzo;
        this.idPaciente = idPaciente;
        this.idFuncionario = idFuncionario;
        this.idVacuna = idVacuna;
    }

    // Constructor para obtener la información básica
    public ReporteVacunaModel(String fechaAplicacion, String fechaRefuerzo, int idPaciente, int idFuncionario, int idVacuna) {
        this.fechaAplicacion = fechaAplicacion;
        this.fechaRefuerzo = fechaRefuerzo;
        this.idPaciente = idPaciente;
        this.idFuncionario = idFuncionario;
        this.idVacuna = idVacuna;
    }

    public int getIdReporte() {
        return idReporte;
    }

    public String getFechaAplicacion() {
        return fechaAplicacion;
    }

    public String getFechaRefuerzo() {
        return fechaRefuerzo;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public int getIdFuncionario() {
        return idFuncionario;
    }

    public int getIdVacuna() {
        return idVacuna;
    }
}
