package models;

/**
 *
 * @author JCode
 */
public class LoteVacunaModel {
    private int idLote;
    private int numeroDosis;
    private int numeroDosisRestantes;
    
    private int idVacuna;
    private String farmaceuticaVacuna;
    
    public LoteVacunaModel(int idLote, int numeroDosis, int numeroDosisRestantes, int idVacuna) {
        this.idLote = idLote;
        this.numeroDosis = numeroDosis;
        this.numeroDosisRestantes = numeroDosisRestantes;
        this.idVacuna = idVacuna;
    }

    public LoteVacunaModel(int idLote, int numeroDosis, int numeroDosisRestantes, int idVacuna, String farmaceuticaVacuna) {
        this.idLote = idLote;
        this.numeroDosis = numeroDosis;
        this.numeroDosisRestantes = numeroDosisRestantes;
        this.idVacuna = idVacuna;
        this.farmaceuticaVacuna = farmaceuticaVacuna;
    }

    public String getFarmaceuticaVacuna() {
        return farmaceuticaVacuna;
    }

    public int getIdLote() {
        return idLote;
    }

    public int getNumeroDosis() {
        return numeroDosis;
    }

    public int getNumeroDosisRestantes() {
        return numeroDosisRestantes;
    }

    public int getIdVacuna() {
        return idVacuna;
    }
}
