/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

/** Representa los datos comunes de una persona trabajadora. */
public abstract class Trabajador {
    protected int idPersona;
    protected String nombre;
    protected String id;
    protected String cargo;
    protected String dependencia;

    /** Crea un trabajador sin datos iniciales. */
    public Trabajador() {
    }

    /**
     * Crea un trabajador con sus datos de identificación y laborales.
     * @param idPersona identificador numérico de la persona
     * @param nombre nombre completo
     * @param id identificador institucional
     * @param cargo cargo que desempeña
     * @param dependencia dependencia a la que pertenece
     */
    public Trabajador(int idPersona, String nombre, String id, String cargo, String dependencia) {
        this.idPersona = idPersona;
        this.nombre = nombre;
        this.id = id;
        this.cargo = cargo;
        this.dependencia = dependencia;
    }

    /** @return identificador numérico de la persona */
    public int getIdPersona() {
        return idPersona;
    }

    /** @param idPersona nuevo identificador numérico */
    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    /** @return nombre de la persona */
    public String getNombre() {
        return nombre;
    }

    /** @param nombre nuevo nombre */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /** @return identificador institucional */
    public String getId() {
        return id;
    }

    /** @param id nuevo identificador institucional */
    public void setId(String id) {
        this.id = id;
    }

    /** @return cargo de la persona */
    public String getCargo() {
        return cargo;
    }

    /** @param cargo nuevo cargo */
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    /** @return dependencia de la persona */
    public String getDependencia() {
        return dependencia;
    }

    /** @param dependencia nueva dependencia */
    public void setDependencia(String dependencia) {
        this.dependencia = dependencia;
    }

    /** @return representación textual de los datos del trabajador */
    @Override
    public String toString() {
        return "Trabajador{" + "idPersona=" + idPersona + ", nombre=" + nombre + ", id=" + id + ", cargo=" + cargo + ", dependencia=" + dependencia +'}';
    }

    
}
