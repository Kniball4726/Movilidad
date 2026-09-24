/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import enums.Estado;

/** Vincula una necesidad de movilidad con un vehículo y un conductor. */
public class Reserva {
    private Estado estado;
    private NeMovilidad movilidad;
    private Vehiculo vehiculo;
    private Conductor conductor;

    /** Crea una reserva sin datos iniciales. */
    public Reserva() {
    }

    /**
     * Crea una reserva completa.
     * @param estado estado de la reserva
     * @param movilidad necesidad de movilidad asociada
     * @param vehiculo vehículo asignado
     * @param conductor conductor asignado
     */
    public Reserva(Estado estado, NeMovilidad movilidad, Vehiculo vehiculo, Conductor conductor) {
        this.estado = estado;
        this.movilidad = movilidad;
        this.vehiculo = vehiculo;
        this.conductor = conductor;
    }

    /** @return estado de la reserva */
    public Estado getEstado() {
        return estado;
    }

    /** @param estado nuevo estado */
    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    /** @return necesidad de movilidad asociada */
    public NeMovilidad getMovilidad() {
        return movilidad;
    }

    /** @param movilidad nueva necesidad asociada */
    public void setMovilidad(NeMovilidad movilidad) {
        this.movilidad = movilidad;
    }

    /** @return vehículo asignado */
    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    /** @param vehiculo nuevo vehículo asignado */
    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    /** @return conductor asignado */
    public Conductor getConductor() {
        return conductor;
    }

    /** @param conductor nuevo conductor asignado */
    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }

    /** @return representación textual de la reserva */
    @Override
    public String toString() {
        return "Reserva{" + "estado=" + estado + ", movilidad=" + movilidad + ", vehiculo=" + vehiculo + ", conductor=" + conductor + '}';
    }
    
}