package models;

/**
 *
 * @author JCode
 */
public class FuncionarioModel extends UsuarioModel {
    private int idFuncionario;
    private String cargo;
    private String email;
    private int verificado = 0;
    private String fechaCreacion;

    // Constructor con toda la información
    public FuncionarioModel(int idFuncionario, String cargo, String email, int verificado, String fechaCreacion,int identificacion, String primerNombre, String segundoNombre, String primerApellido, String segundoApellido, String contraseña, String telefono, String tipo, String ultimoAcceso) {
        super(identificacion, primerNombre, segundoNombre, primerApellido, segundoApellido, contraseña, telefono, tipo, ultimoAcceso);
        this.idFuncionario = idFuncionario;
        this.cargo = cargo;
        this.email = email;
        this.verificado = verificado;
        this.fechaCreacion = fechaCreacion;
    }
    
    // Constructor para registro básico
    public FuncionarioModel(String cargo, String email, int verificado, String fechaCreacion, int identificacion, String primerNombre, String segundoNombre, String primerApellido, String segundoApellido, String telefono, String tipo) {
        super(identificacion, primerNombre, segundoNombre, primerApellido, segundoApellido, telefono, tipo);
        this.cargo = cargo;
        this.email = email;
        this.verificado = verificado;
        this.fechaCreacion = fechaCreacion;
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

    public int getIdFuncionario() {
        return idFuncionario;
    }
    
}