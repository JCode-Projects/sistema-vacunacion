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
public class VacunaModel {
    private int idVacuna;
    private String farmaceutica;
    private int refuerzo;

    public VacunaModel(int idVacuna, String farmaceutica, int refuerzo) {
        this.idVacuna = idVacuna;
        this.farmaceutica = farmaceutica;
        this.refuerzo = refuerzo;
    }

    public int getIdVacuna() {
        return idVacuna;
    }

    public String getFarmaceutica() {
        return farmaceutica;
    }

    public int getRefuerzo() {
        return refuerzo;
    }
}
