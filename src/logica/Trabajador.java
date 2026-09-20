/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

/**
 *
 * @author glrd4
 */
public abstract class Trabajador {
    protected int idPersona;
    protected String nombre;
    protected String id;
    protected String cargo;
    protected String dependencia;
    protected double sueldo;

    public Trabajador() {
    }

    public Trabajador(int idPersona, String nombre, String id, String cargo, String dependencia, double sueldo) {
        this.idPersona = idPersona;
        this.nombre = nombre;
        this.id = id;
        this.cargo = cargo;
        this.dependencia = dependencia;
        this.sueldo = sueldo;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getDependencia() {
        return dependencia;
    }

    public void setDependencia(String dependencia) {
        this.dependencia = dependencia;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Trabajador{" + "idPersona=" + idPersona + ", nombre=" + nombre + ", id=" + id + ", cargo=" + cargo + ", dependencia=" + dependencia + ", sueldo=" + sueldo + '}';
    }

    
}
