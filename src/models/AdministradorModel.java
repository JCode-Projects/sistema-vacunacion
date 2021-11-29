package models;

/**
 *
 * @author JCode
 */
public class AdministradorModel extends UsuarioModel {
    // Propio de la clase
    private int idAdministrador;
    private String cargo;
    private int idUsuario;

    // Constructor con toda la información
    public AdministradorModel(int idAdmistrador, String cargo, int idUsuario,int identificacion, String primerNombre, String segundoNombre, String primerApellido, String segundoApellido, String contraseña, String telefono, String tipo, String ultimoAcceso) {
        super(identificacion, primerNombre, segundoNombre, primerApellido, segundoApellido, contraseña, telefono, tipo, ultimoAcceso);
        this.idAdministrador = idAdmistrador;
        this.cargo = cargo;
        this.idUsuario = idUsuario;
    }
    
    // Constructor para registro básico
    public AdministradorModel(int identificacion, String primerNombre, String segundoNombre, String primerApellido, String segundoApellido, String telefono, String tipo, String cargo) {
        super(identificacion, primerNombre, segundoNombre, primerApellido, segundoApellido, telefono, tipo);
        this.cargo = cargo;
    }

    public int getIdAdministrador() {
        return idAdministrador;
    }

    public String getCargo() {
        return cargo;
    }

    public int getIdUsuario() {
        return idUsuario;
    }   
}
