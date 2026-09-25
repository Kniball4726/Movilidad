/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

/** Representa a un conductor disponible para una reserva. */
public class Conductor extends Trabajador {
    private String licencia;
    private String grado;
    private String estado;

    /** Crea un conductor sin datos iniciales. */
    public Conductor() {
    }

    /**
     * Crea un conductor con sus datos operativos.
     * @param licencia tipo o número de licencia
     * @param grado grado del conductor
     * @param estado estado actual del conductor
     */
    public Conductor(String licencia, String grado, String estado) {
        this.licencia = licencia;
        this.grado = grado;
        this.estado = estado;
    }

    /**
     * Crea un conductor con datos operativos y laborales.
     * @param licencia tipo o número de licencia
     * @param grado grado del conductor
     * @param estado estado actual del conductor
     * @param idPersona identificador numérico de la persona
     * @param nombre nombre completo
     * @param id identificador institucional
     * @param cargo cargo que desempeña
     * @param dependencia dependencia a la que pertenece
     */
    public Conductor(String licencia, String grado, String estado, int idPersona, String nombre, String id, String cargo, String dependencia) {
        super(idPersona, nombre, id, cargo, dependencia);
        this.licencia = licencia;
        this.grado = grado;
        this.estado = estado;
    }

    /** @return licencia del conductor */
    public String getLicencia() {
        return licencia;
    }

    /** @param licencia nueva licencia */
    public void setLicencia(String licencia) {
        this.licencia = licencia;
    }

    /** @return grado del conductor */
    public String getGrado() {
        return grado;
    }

    /** @param grado nuevo grado */
    public void setGrado(String grado) {
        this.grado = grado;
    }

    /** @return estado del conductor */
    public String getEstado() {
        return estado;
    }

    /** @param estado nuevo estado */
    public void setEstado(String estado) {
        this.estado = estado;
    }
    /** @return representación textual del conductor */
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
        return "Conductor{" + super.toString() + ", licencia=" + licencia + ", grado=" + grado + ", estado=" + estado + '}';
    }

    
}
