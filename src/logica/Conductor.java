/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

/**
 *
 * @author glrd4
 */
public class Conductor extends Trabajador {
    private String licencia;
    private String grado;
    private String estado;

    public Conductor() {
    }

    public Conductor(String licencia, String grado, String estado) {
        this.licencia = licencia;
        this.grado = grado;
        this.estado = estado;
    }

    public Conductor(String licencia, String grado, String estado, int idPersona, String nombre, String id, String cargo, String dependencia) {
        super(idPersona, nombre, id, cargo, dependencia);
        this.licencia = licencia;
        this.grado = grado;
        this.estado = estado;
    }

    public String getLicencia() {
        return licencia;
    }

    public void setLicencia(String licencia) {
        this.licencia = licencia;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
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
        return "Conductores{" + "licencia=" + licencia + ", grado=" + grado + ", estado=" + estado + '}';
    }

    
}
