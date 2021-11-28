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
    private int identificacionPaciente;
    private int idFuncionario;
    private int identificacionFuncionario;
    private int idLoteVacuna;
    private int idVacuna;
    private String farmaceuticaVacuna;

    // Constructor para obtener toda la información
    public ReporteVacunaModel(int idReporte, String fechaAplicacion, String fechaRefuerzo, int idPaciente, int identificacionPaciente, int idFuncionario, int identificacionFuncionario, int idLoteVacuna, int idVacuna, String farmaceuticaVacuna) {
        this.idReporte = idReporte;
        this.fechaAplicacion = fechaAplicacion;
        this.fechaRefuerzo = fechaRefuerzo;
        this.idPaciente = idPaciente;
        this.identificacionPaciente = identificacionPaciente;
        this.idFuncionario = idFuncionario;
        this.identificacionFuncionario = identificacionFuncionario;
        this.idLoteVacuna = idLoteVacuna;
        this.idVacuna = idVacuna;
        this.farmaceuticaVacuna = farmaceuticaVacuna;
    }

    // Constructor para obtener la información básica
    public ReporteVacunaModel(String fechaAplicacion, String fechaRefuerzo, int idPaciente, int idFuncionario, int idVacuna) {
        this.fechaAplicacion = fechaAplicacion;
        this.fechaRefuerzo = fechaRefuerzo;
        this.idPaciente = idPaciente;
        this.idFuncionario = idFuncionario;
        this.idLoteVacuna = idVacuna;
    }
    
    public int getIdVacuna() {
        return idVacuna;
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

    public int getIdLoteVacuna() {
        return idLoteVacuna;
    }
    
     public int getIdentificacionPaciente() {
        return identificacionPaciente;
    }

    public int getIdentificacionFuncionario() {
        return identificacionFuncionario;
    }

    public String getFarmaceuticaVacuna() {
        return farmaceuticaVacuna;
    }
}
