/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

/**
 *
 * @author glrd4
 */
public class Vehiculo {
    private String marca;
    private String modelo;
    private String patente;
    private String tipo;  
    private String estado;
    private int capacidad;

    public Vehiculo() {
    }


    public Vehiculo(String marca, String modelo, String patente, String tipo, String estado, int capacidad) {
        this.marca = marca;
        this.modelo = modelo;
        this.patente = patente;
        this.tipo = tipo;
        this.estado = estado;
        this.capacidad = capacidad;
    }


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "marca=" + marca + ", modelo=" + modelo + ", patente=" + patente + ", tipo=" + tipo + ", estado=" + estado + ", capacidad=" + capacidad + '}';
    }

    

    
    
    
}
