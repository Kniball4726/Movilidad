/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

/**
 *
 * @author glrd4
 */
public class Usuario extends Trabajador{
    private int idUsuario;
    private String usuario;
    private String contrasena;
    private String rol;

    public Usuario() {
    }

    public Usuario(int idUsuario, String usuario, String contrasena, String rol) {
        this.idUsuario = idUsuario;
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.rol = rol;
    }

    public Usuario(int idUsuario, String usuario, String contrasena, String rol, int idPersona, String nombre, String id, String cargo, String dependencia) {
        super(idPersona, nombre, id, cargo, dependencia);
        this.idUsuario = idUsuario;
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.rol = rol;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

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
