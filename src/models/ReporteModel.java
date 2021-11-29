package models;

/**
 *
 * @author JCode
 */
public class ReporteModel {
    private int identificacion;
    private String primerNombre;
    private String primerApellido;
    private String farmaceutica;
    private String fechaAplicacion;

    public ReporteModel(int identificacion, String primerNombre, String primerApellido, String farmaceutica, String fechaAplicacion) {
        this.identificacion = identificacion;
        this.primerNombre = primerNombre;
        this.primerApellido = primerApellido;
        this.farmaceutica = farmaceutica;
        this.fechaAplicacion = fechaAplicacion;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public String getFarmaceutica() {
        return farmaceutica;
    }

    public String getFechaAplicacion() {
        return fechaAplicacion;
    }
}
