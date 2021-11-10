package models;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JCode
 */
public class PacienteModel extends UsuarioModel {
    private String email;
    private String direccion;
    private int edad;
    private int verificado = 0;
    private String fechaCreacion;

    // Constructor para obtener toda la información
    public PacienteModel(String email, String direccion, int edad, int verificado, String fechaCreacion,int identificacion, String primerNombre, String segundoNombre, String primerApellido, String segundoApellido, String contraseña, String telefono, String ultimoAcceso) {
        super(identificacion, primerNombre, segundoNombre, primerApellido, segundoApellido, contraseña, telefono, ultimoAcceso);
        this.email = email;
        this.direccion = direccion;
        this.edad = edad;
        this.verificado = verificado;
        this.fechaCreacion = fechaCreacion;
    }
    
    // Constructor para generar la información básica
    public PacienteModel(String email, String direccion, int edad, int verificado, String fechaCreacion, int identificacion, String primerNombre, String segundoNombre, String primerApellido, String segundoApellido, String telefono) {
        super(identificacion, primerNombre, segundoNombre, primerApellido, segundoApellido, telefono);
        this.email = email;
        this.direccion = direccion;
        this.edad = edad;
        this.verificado = verificado;
        this.fechaCreacion = fechaCreacion;
    }

    public String getEmail() {
        return email;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getEdad() {
        return edad;
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
}
