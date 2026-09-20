/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import logica.Usuario;

/**
 *
 * @author glrd4
 */
public class Movilidad {

    /**
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
       ingreso();
    }
    
    public static void ingreso(){
        int contador=0;
        List<Usuario> usuarios = new ArrayList<>();
        
        Usuario user1 = new Usuario(1,"Admin","grupo1","Admin");
        Usuario user2 = new Usuario(2,"Secretario","secretaria","User");
        
        usuarios.add(user1);
        usuarios.add(user2);

            while (contador < 3){
        
            System.out.println("\nIngreso al sistema");
            System.out.println("\nIndique usuario: ");
            String usuario = leerString();
            System.out.println("Indique contraseña: ");
            String clave = leerString();
        
                boolean existen = usuarios.stream().anyMatch(user ->
                    usuario.equals(user.getUsuario()) &&
                    clave.equals(user.getContrasena()));
        
            if (existen){
                menuPrincipal();
                break;
            }else{
                System.out.println("\nUsuario o contraseña incorrectos");
                contador +=1;
            }
          }
        
            if (contador == 3){
                System.out.println("\nIntrodujo mal clave y/o contraseña 3 veces");
            }
        
    }
    
    public static void menuPrincipal(){
        System.out.println("\n\n\nBienvenidos al sistema de reservas\n ");
        System.out.println("1.- Gestionar Reservas");
        System.out.println("2.- Gestionar trabajadores");
        System.out.println("3.- Gestionar conductores");
        System.out.println("4.- Gestionar vehiculos");
        System.out.println("5.- Gestionar usuarios");
        System.out.println("0.- Salir");
        
        int seleccion = leerInt();
        
        switch (seleccion){
            case 1 -> {
                menuReservas();
            }
            case 2 -> {
                menuTrabajador();
            }
            case 3 -> {
                menuConductor();
            }
            case 4 -> {
                menuVehiculo();
             
            }
            case 5 ->{
                menuUsuario();
            }
            case 0 -> {
                System.out.println("Saliendo . . .");

                break;
            }
            default -> {
                System.out.println("Debe introducir un número del menu");
                menuPrincipal();
            }
    
        }
                
    }
    
    public static void menuReservas(){
        System.out.println("\n\n\nBienvenido al menú de reservas");
        System.out.println("1.- Crear reserva");
        System.out.println("2.- Modificar reserva");
        System.out.println("3.- Buscar reserva");
        System.out.println("4.- Suspender reserva");
        System.out.println("5.- Eliminar reserva");
        System.out.println("0.- Volver");
        
        int seleccion = leerInt();
        
        switch (seleccion){
            case 1 ->{
                System.out.println("\nCrear reserva");
                
            }
            case 2 ->{
                System.out.println("\nModificar reserva");
            }
            case 3 ->{
                System.out.println("Buscar reserva");
            }
            case 4 ->{
                System.out.println("Suspender reserva");
            }
            case 5 ->{
                System.out.println("Eliminar reserva");
            }
            case 0 -> {
                menuPrincipal();
            }
            default -> {
                System.out.println("Introduzca un número dentro del menú");
                menuReservas();
            }
        }
    }
    
public static void menuTrabajador(){
        System.out.println("\n\n\nBienvenido al menú de trabajadores");
        System.out.println("1.- Agregar trabajador");
        System.out.println("2.- Modificar trabajador");
        System.out.println("3.- Buscar trabajador");
        System.out.println("5.- Eliminar trabajador");
        System.out.println("0.- Volver");
        
        int seleccion = leerInt();
        
        switch (seleccion){
            case 1 ->{
                System.out.println("\nAgregar trabajador");
                
            }
            case 2 ->{
                System.out.println("\nModificar trabajador");
            }
            case 3 ->{
                System.out.println("\nBuscar trabajador");
            }
            case 4 ->{
                System.out.println("\nEliminar trabajador");
            }
            case 0 -> {
                menuPrincipal();
            }
            default -> {
                System.out.println("Introduzca un número dentro del menú");
                menuTrabajador();
            }
        }
    }

public static void menuConductor(){
    System.out.println("\n\n\nBienvenido al menú de Conductores");
        System.out.println("1.- Agregar conductor");
        System.out.println("2.- Modificar conductor");
        System.out.println("3.- Buscar conductor");
        System.out.println("5.- Eliminar conductgor");
        System.out.println("0.- Volver");
        
        int seleccion = leerInt();
        
        switch (seleccion){
            case 1 ->{
                System.out.println("\nAgregar conductor");
                
            }
            case 2 ->{
                System.out.println("\nModificar conductor");
            }
            case 3 ->{
                System.out.println("\nBuscar conductor");
            }
            case 4 ->{
                System.out.println("\nEliminar conductor");
            }
            case 0 -> {
                menuPrincipal();
            }
            default -> {
                System.out.println("Introduzca un número dentro del menú");
                menuConductor();
            }
        }
    }

public static void menuVehiculo(){
    System.out.println("\n\n\nBienvenido al menú de Vehiculo");
        System.out.println("1.- Agregar vehiculo");
        System.out.println("2.- Modificar vehiculo");
        System.out.println("3.- Buscar vehiculo");
        System.out.println("5.- Eliminar vehiculo");
        System.out.println("0.- Volver");
        
        int seleccion = leerInt();

        switch (seleccion){
            case 1 ->{
                System.out.println("\nAgregar vehiculo");
                
            }
            case 2 ->{
                System.out.println("\nModificar vehiculo");
            }
            case 3 ->{
                System.out.println("\nBuscar vehiculo");
            }
            case 4 ->{
                System.out.println("\nEliminar vehiculo");
            }
            case 0 -> {
                menuPrincipal();
            }
            default -> {
                System.out.println("Introduzca un número dentro del menú");
                menuVehiculo();
            }
        }
    }


public static void menuUsuario(){
    System.out.println("\n\n\nBienvenido al menú de usuarios");
        System.out.println("1.- Agregar usuario");
        System.out.println("2.- Modificar usuario");
        System.out.println("3.- Buscar usuario");
        System.out.println("5.- Eliminar usuario");
        System.out.println("0.- Volver");
        
        int seleccion = leerInt();
        
        switch (seleccion){
            case 1 ->{
                System.out.println("\nAgregar usuario");
                
            }
            case 2 ->{
                System.out.println("\nModificar usuario");
            }
            case 3 ->{
                System.out.println("\nBuscar usuario");
            }
            case 4 ->{
                System.out.println("\nEliminar usuario");
            }
            case 0 -> {
                menuPrincipal();
            }
            default -> {
                System.out.println("Introduzca un número dentro del menú");
                menuUsuario();
            }
        }
    }
    
    
    public static String leerString(){
        Scanner teclado = new Scanner(System.in);
        String datos = teclado.nextLine();
        return datos;
    }
    
    public static int leerInt(){
        Scanner teclado = new Scanner(System.in);
        int datos = teclado.nextInt();
        return datos;
        
    }
    
    public static double leerDouble(){
        Scanner teclado = new Scanner(System.in);
        double datos = teclado.nextDouble();
        return datos;
        
    }
   
}