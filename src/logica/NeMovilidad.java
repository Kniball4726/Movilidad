/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import enums.TipoMovilidad;
import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author glrd4
 */
public class NeMovilidad {
    private String solicitante;
    private String carrera;
    private String motivo;
    private String lugarSalida;
    private String lugarDestino;
    private int pasajeros;
    private LocalDate fechaSalida;
    private LocalDate fechaRegreso;
    private LocalTime horaSalida;
    private LocalTime horaRegreso;
    private TipoMovilidad tipo;
    private String observaciones;

    public NeMovilidad() {
    }

    public NeMovilidad(String solicitante, String carrera, String motivo, String lugarSalida, String lugarDestino,
            int pasajeros, LocalDate fechaSalida, LocalDate fechaRegreso, LocalTime horaSalida, LocalTime horaRegreso,
            TipoMovilidad tipo, String observaciones) {
        this.solicitante = solicitante;
        this.carrera = carrera;
        this.motivo = motivo;
        this.lugarSalida = lugarSalida;
        this.lugarDestino = lugarDestino;
        this.pasajeros = pasajeros;
        this.fechaSalida = fechaSalida;
        this.fechaRegreso = fechaRegreso;
        this.horaSalida = horaSalida;
        this.horaRegreso = horaRegreso;
        this.tipo = tipo;
        this.observaciones = observaciones;
    }

    public String getSolicitante() {
        return solicitante;
    }

    public void setSolicitante(String solicitante) {
        this.solicitante = solicitante;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getLugarSalida() {
        return lugarSalida;
    }

    public void setLugarSalida(String lugarSalida) {
        this.lugarSalida = lugarSalida;
    }

    public String getLugarDestino() {
        return lugarDestino;
    }

    public void setLugarDestino(String lugarDestino) {
        this.lugarDestino = lugarDestino;
    }

    public int getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }

    public LocalDate getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(LocalDate fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public LocalDate getFechaRegreso() {
        return fechaRegreso;
    }

    public void setFechaRegreso(LocalDate fechaRegreso) {
        this.fechaRegreso = fechaRegreso;
    }

    public LocalTime getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(LocalTime horaSalida) {
        this.horaSalida = horaSalida;
    }

    public LocalTime getHoraRegreso() {
        return horaRegreso;
    }

    public void setHoraRegreso(LocalTime horaRegreso) {
        this.horaRegreso = horaRegreso;
    }

    public TipoMovilidad getTipo() {
        return tipo;
    }

    public void setTipo(TipoMovilidad tipo) {
        this.tipo = tipo;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    @Override
    public String toString() {
        return "NeMovilidad [solicitante=" + solicitante + ", carrera=" + carrera + ", motivo=" + motivo
                + ", lugarSalida=" + lugarSalida + ", lugarDestino=" + lugarDestino + ", pasajeros=" + pasajeros
                + ", fechaSalida=" + fechaSalida + ", fechaRegreso=" + fechaRegreso + ", horaSalida=" + horaSalida
                + ", horaRegreso=" + horaRegreso + ", tipo=" + tipo + ", observaciones=" + observaciones
                + ", getSolicitante()=" + getSolicitante() + ", getCarrera()=" + getCarrera() + ", getMotivo()="
                + getMotivo() + ", getLugarSalida()=" + getLugarSalida() + ", getLugarDestino()=" + getLugarDestino()
                + ", getPasajeros()=" + getPasajeros() + ", getFechaSalida()=" + getFechaSalida()
                + ", getFechaRegreso()=" + getFechaRegreso() + ", getHoraSalida()=" + getHoraSalida()
                + ", getHoraRegreso()=" + getHoraRegreso() + ", getTipo()=" + getTipo() + ", getObservaciones()="
                + getObservaciones() + "]";
    }

    
}
