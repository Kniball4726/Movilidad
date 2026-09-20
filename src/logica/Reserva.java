/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import enums.Estado;

/**
 *
 * @author glrd4
 */
public class Reserva {
    private Estado estado;
    private NeMovilidad movilidad;
    private Vehiculo vehiculo;
    private Conductor conductor;

    public Reserva() {
    }

    public Reserva(Estado estado, NeMovilidad movilidad, Vehiculo vehiculo, Conductor conductor) {
        this.estado = estado;
        this.movilidad = movilidad;
        this.vehiculo = vehiculo;
        this.conductor = conductor;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public NeMovilidad getMovilidad() {
        return movilidad;
    }

    public void setMovilidad(NeMovilidad movilidad) {
        this.movilidad = movilidad;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Conductor getConductor() {
        return conductor;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }

    @Override
    public String toString() {
        return "Reserva{" + "estado=" + estado + ", movilidad=" + movilidad + ", vehiculo=" + vehiculo + ", conductor=" + conductor + '}';
    }
    
}