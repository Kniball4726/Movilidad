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
    private LocalDate fechaSalida;
    private LocalDate fechaRegreso;
    private LocalTime horaSalida;
    private LocalTime horaRegreso;
    private TipoMovilidad tipo;
    
    public NeMovilidad() {
    }

    public NeMovilidad(LocalDate fechaSalida, LocalDate fechaRegreso, LocalTime horaSalida, LocalTime horaRegreso, TipoMovilidad tipo) {
        this.fechaSalida = fechaSalida;
        this.fechaRegreso = fechaRegreso;
        this.horaSalida = horaSalida;
        this.horaRegreso = horaRegreso;
        this.tipo = tipo;
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

    public TipoMovilidad getTipo() {
        return tipo;
    }

    public void setTipo(TipoMovilidad tipo) {
        this.tipo = tipo;
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

    @Override
    public String toString() {
        return "NeMovilidad{" + "fechaSalida=" + fechaSalida + ", fechaRegreso=" + fechaRegreso + ", horaSalida=" + horaSalida + ", horaRegreso=" + horaRegreso + ", tipo=" + tipo + '}';
    }

   
    
    
    
    
    
    
}
