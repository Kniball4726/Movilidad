/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

/** Representa una cuenta de usuario del sistema. */
public class Usuario extends Trabajador{
    private int idUsuario;
    private String usuario;
    private String contrasena;
    private String rol;

    /** Crea un usuario sin datos iniciales. */
    public Usuario() {
    }

    /**
     * Crea un usuario con sus credenciales y rol.
     * @param idUsuario identificador del usuario
     * @param usuario nombre de usuario
     * @param contrasena contraseña
     * @param rol rol asignado
     */
    public Usuario(int idUsuario, String usuario, String contrasena, String rol) {
        this.idUsuario = idUsuario;
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.rol = rol;
    }

    /**
     * Crea un usuario con credenciales, rol y datos laborales.
     * @param idUsuario identificador del usuario
     * @param usuario nombre de usuario
     * @param contrasena contraseña
     * @param rol rol asignado
     * @param idPersona identificador de la persona
     * @param nombre nombre completo
     * @param id identificador institucional
     * @param cargo cargo que desempeña
     * @param dependencia dependencia a la que pertenece
     */
    public Usuario(int idUsuario, String usuario, String contrasena, String rol, int idPersona, String nombre, String id, String cargo, String dependencia) {
        super(idPersona, nombre, id, cargo, dependencia);
        this.idUsuario = idUsuario;
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.rol = rol;
    }

    /** @return identificador del usuario */
    public int getIdUsuario() {
        return idUsuario;
    }

    /** @param idUsuario nuevo identificador */
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    /** @return nombre de usuario */
    public String getUsuario() {
        return usuario;
    }

    /** @param usuario nuevo nombre de usuario */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /** @return contraseña configurada */
    public String getContrasena() {
        return contrasena;
    }

    /** @param contrasena nueva contraseña */
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    /** @return rol del usuario */
    public String getRol() {
        return rol;
    }

    /** @param rol nuevo rol */
    public void setRol(String rol) {
        this.rol = rol;
    }

    /** @return representación textual del usuario */
    @Override
    public int getIdPersona() {
        return idPersona;
    }

    @Override
    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String getCargo() {
        return cargo;
    }

    @Override
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String getDependencia() {
        return dependencia;
    }

    @Override
    public void setDependencia(String dependencia) {
        this.dependencia = dependencia;
    }

    
    @Override
    public String toString() {
        return """
               Usuario
               idUsuario: """ + idUsuario + "\nusuario: " + usuario + "\ncontrasena: " + contrasena + "\nrol: " + rol;
    }

    

}
