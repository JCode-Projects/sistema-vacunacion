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
public class UsuarioModel {
    private int identificacion;
    private String primerNombre;
    private String segundoNombre;
    private String primerApellido;
    private String segundoApellido;
    private String telefono;
    private String contraseña;
    private String tipo;
    private String ultimoAcceso;

    // Constructor para traer toda la información del usuario
    public UsuarioModel(int identificacion, String primerNombre, String segundoNombre, String primerApellido, String segundoApellido, String contraseña, String telefono, String tipo, String ultimoAcceso) {
        this.identificacion = identificacion;
        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.telefono = telefono;
        this.contraseña = contraseña;
        this.tipo = tipo;
        this.ultimoAcceso = ultimoAcceso;
    }
    
    // Constructor para el registro básico
    public UsuarioModel(int identificacion, String primerNombre, String segundoNombre, String primerApellido, String segundoApellido, String telefono, String tipo) {
        this.identificacion = identificacion;
        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.telefono = telefono;
        this.tipo = tipo;
    }
    
    // Constructor para credenciales de acceso
    public UsuarioModel(int identificacion, String contraseña) {
        this.identificacion = identificacion;
        this.contraseña = contraseña;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getContraseña() {
        return contraseña;
    }
    
    public String getTipo() {
        return tipo;
    }

    public String getUltimoAcceso() {
        return ultimoAcceso;
    }
}
