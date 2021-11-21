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
public class FuncionarioModel extends UsuarioModel {
    private String cargo;
    private String email;
    private int verificado = 0;
    private String fechaCreacion;

    // Constructor con toda la información
    public FuncionarioModel(String cargo, String email, int verificado, String fechaCreacion,int identificacion, String primerNombre, String segundoNombre, String primerApellido, String segundoApellido, String contraseña, String telefono, String tipo, String ultimoAcceso) {
        super(identificacion, primerNombre, segundoNombre, primerApellido, segundoApellido, contraseña, telefono, tipo, ultimoAcceso);
        this.cargo = cargo;
        this.email = email;
        this.verificado = verificado;
        this.fechaCreacion = fechaCreacion;
    }
    
    // Constructor para registro básico
    public FuncionarioModel(String cargo, String email,int identificacion, String primerNombre, String segundoNombre, String primerApellido, String segundoApellido, String telefono, String tipo) {
        super(identificacion, primerNombre, segundoNombre, primerApellido, segundoApellido, telefono, tipo);
        this.cargo = cargo;
        this.email = email;
    }

    public String getCargo() {
        return cargo;
    }

    public String getEmail() {
        return email;
    }

    public int getVerificado() {
        return verificado;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public void setVerificado(int verificado) {
        this.verificado = verificado;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
}