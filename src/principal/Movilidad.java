/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package principal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import logica.Conductor;
import logica.NeMovilidad;
import logica.Reserva;
import logica.Usuario;
import logica.Vehiculo;

/**
 *
 * @author glrd4
 */
public class Movilidad {
    
    public static List<Usuario> usuarios = new ArrayList<>();
    public static List<Vehiculo> vehiculo = new ArrayList<>();
    public static List<Reserva> reserva = new ArrayList<>();
    public static List<Conductor> conductor = new ArrayList<>();
    public static List<NeMovilidad> movilidad = new ArrayList<>();
    
    public static void main(String[] args) throws InterruptedException {
       ingreso();
    }
    
    public static String ingreso(){

        Usuario usuarioAdmin = new Usuario(1, "Admin", "grupo1", "Admin");
        Usuario user = new Usuario(2,"User","grupo2","User");

        usuarios.add(usuarioAdmin);
        usuarios.add(user);
        
        int contador=0;
       
        while (contador < 3){
            System.out.println("\n===========================================");
            System.out.println("Sistema SiReAu: Gestión VDG (Modo terminal)");
            System.out.println("===========================================");
            System.out.println("Ingreso al sistema");
            System.out.println("\nIndique usuario: ");
            String usuario = leerString();
            System.out.println("Indique contraseña: ");
            String clave = leerString();
        
            if (usuario.equals(usuarioAdmin.getUsuario()) || usuario.equals(user.getUsuario()) && clave.equals(usuarioAdmin.getContrasena()) || clave.equals(user.getContrasena())){
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
        
        return usuarioAdmin.getRol();
    }
    
 public static void menuPrincipal(){
        System.out.println("\n===========================================");
        System.out.println("Bienvenidos al sistema de reservas ");
        System.out.println("===========================================");
        System.out.println("1.- Registrar necesidades de movilidad");
        System.out.println("2.- Gestionar Reservas");
        System.out.println("3.- Gestionar conductores");
        System.out.println("4.- Gestionar vehiculos");
        System.out.println("5.- Gestionar usuarios");
        System.out.println("0.- Salir");
        
        int seleccion = leerInt();
        
        switch (seleccion){
            case 1 -> {
                menuMovilidad();
            }
            case 2 -> {
                menuReservas();
            }
            case 3 -> {
                menuConductor();
            }
            case 4 -> {
                menuVehiculo();
            }
            case 5 -> {
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

    public static void menuMovilidad(){
        System.out.println("\n===========================================");
        System.out.println("Bienvenido al menú de necesidades de movilidad");
        System.out.println("===========================================");
        System.out.println("1.- Crear necesidad de movilidad");
        System.out.println("2.- Ver necesidades de movilidad");
        System.out.println("3.- Modificar necesidad de movilidad");
        System.out.println("4.- Buscar necesidad de movilidad");
        System.out.println("5.- Suspender necesidad de movilidad");
        System.out.println("6.- Eliminar necesidad de movilidad");
        System.out.println("0.- Volver");
        
        int seleccion = leerInt();
        
        switch (seleccion){
            case 1 ->{
                System.out.println("\nCrear necesidad de movilidad");
                
            }
            case 2 ->{
                System.out.println("\nVer necesidades de movilidad");
                for(NeMovilidad movi: movilidad){
                    System.out.println(movi);
                }
            }
            case 3 ->{
                System.out.println("Modificar necesidad de movilidad");
            }
            case 4 ->{
                System.out.println("Buscar necesidad de movilidad");
            }
            case 5 ->{
                System.out.println("Suspender necesidad de movilidad");
            }
            case 6 ->{
                System.out.println("Eliminar necesidad de movilidad");
            }
            case 0 -> {
                menuPrincipal();
            }
            default -> {
                System.out.println("Introduzca un número dentro del menú");
                menuMovilidad();
            }
        }
    }
    
    public static void menuReservas(){
        System.out.println("\n===========================================");
        System.out.println("Bienvenido al menú de reservas");
        System.out.println("===========================================");
        System.out.println("1.- Crear reserva");
        System.out.println("2.- Ver reservas");
        System.out.println("3.- Modificar reserva");
        System.out.println("4.- Buscar reserva");
        System.out.println("5.- Suspender reserva");
        System.out.println("6.- Eliminar reserva");
        System.out.println("0.- Volver");
        
        int seleccion = leerInt();
        
        switch (seleccion){
            case 1 ->{
                System.out.println("\nCrear reserva");
                
            }
            case 2 ->{
                System.out.println("\nVer reservas");
                for(Reserva reservan: reserva){
                    System.out.println(reservan);
                }
            }
            case 3 ->{
                System.out.println("Modificar reserva");
            }
            case 4 ->{
                System.out.println("Buscar reserva");
            }
            case 5 ->{
                System.out.println("Suspender reserva");
            }
            case 6 ->{
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
    


public static void menuConductor(){
    System.out.println("\n===========================================");
    System.out.println("Bienvenido al menú de Conductores");
    System.out.println("===========================================");
        System.out.println("1.- Agregar conductor");
        System.out.println("2.- Ver conductor");
        System.out.println("3.- Modificar conductor");
        System.out.println("4.- Buscar conductor");
        System.out.println("5.- Eliminar conductgor");
        System.out.println("0.- Volver");
        
        int seleccion = leerInt();
        
        switch (seleccion){
            case 1 ->{
                System.out.println("\nAgregar conductor");
                
            }
            case 2 ->{
                System.out.println("\nVer conductor");
                for(Conductor conductores: conductor){
                    System.out.println(conductores);
                }
            }
            case 3 ->{
                System.out.println("\nModificar conductor");
            }
            case 4 ->{
                System.out.println("\nBuscar conductor");
            }
            case 5 ->{
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
    System.out.println("\n===========================================");
    System.out.println("Bienvenido al menú de Vehiculo");
    System.out.println("===========================================");
        System.out.println("1.- Agregar vehiculo");
        System.out.println("2.- Ver vehiculo");
        System.out.println("3.- Modificar vehiculo");
        System.out.println("4.- Buscar vehiculo");
        System.out.println("5.- Eliminar vehiculo");
        System.out.println("0.- Volver");
        
        int seleccion = leerInt();

        switch (seleccion){
            case 1 ->{
                System.out.println("\nAgregar vehiculo");
                
            }
            case 2 ->{
                System.out.println("\nVer vehiculo");
                for(Vehiculo vehiculos: vehiculo){
                    System.out.println(vehiculos);
                }
            }
            case 3 ->{
                System.out.println("\nModificar vehiculo");
            }
            case 4 ->{
                System.out.println("\nBuscar vehiculo");
            }
            case 5 ->{
                System.out.println("Eliminar Vehiculo");
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
    System.out.println("\n===========================================");
    System.out.println("Bienvenido al menú de usuarios");
    System.out.println("===========================================");
        System.out.println("1.- Agregar usuario");
        System.out.println("2.- Ver usuarios");
        System.out.println("3.- Buscar usuarios");
        System.out.println("4.- Modificar usuario");
        System.out.println("5.- Eliminar usuario");
        System.out.println("0.- Volver");
        
        int seleccion = leerInt();
        
        switch (seleccion){
            case 1 ->{
                System.out.println("\nAgregar usuario");
                System.out.println("Ingrese idUsuario: ");
                int idUsuario = leerInt();
                System.out.println("Ingrese usuario: ");
                String usuario = leerString();
                System.out.println("Ingrese contraseña: ");
                String contrasena = leerString();
                System.out.println("Ingrese rol: ");
                String rol = leerString();

                Usuario nuevoUsuario = new Usuario(idUsuario, usuario, contrasena, rol);
                usuarios.add(nuevoUsuario);
            }
            case 2 ->{
                System.out.println("\nVer usuarios");
                for(Usuario usuario: usuarios){
                    System.out.println(usuario);
                }
            }
            case 3 ->{
                System.out.println("\nBuscar usuario");
                System.out.println("Ingrese usuario: ");
                String usuario = leerString();
                for(Usuario u: usuarios){
                    if(u.getUsuario().equals(usuario)){
                        System.out.println(u);
                        break;
                    }else{
                        System.out.println("Usuario no encontrado");
                    }
                }
            }
            case 4 ->{
                System.out.println("\nModificar usuario");
                System.out.println("Ingrese usuario: ");
                String usuario = leerString();
                for(Usuario u: usuarios){
                    if(u.getUsuario().equals(usuario)){
                        System.out.println("Usuario encontrado");
                        System.out.println("\nIngrese nuevo usuario: ");
                        String nuevoUsuario = leerString();
                        u.setUsuario(nuevoUsuario);
                        System.out.println("Usuario modificado");
                        System.out.println("\nIngrese nueva contraseña: ");
                        String nuevaContrasena = leerString();
                        u.setContrasena(nuevaContrasena);
                        System.out.println("Contraseña modificada");
                        System.out.println("\nIngrese nuevo rol: ");
                        String nuevoRol = leerString();
                        u.setRol(nuevoRol);
                        System.out.println("Rol modificada");
                        break;
                    }else{
                        System.out.println("Usuario no encontrado");
                    }
                }
            }
            case 5 ->{
                System.out.println("\nEliminar usuario");
                System.out.println("Ingrese usuario: ");
                String usuario = leerString();
                for(Usuario u: usuarios){
                    if(u.getUsuario().equals(usuario)){
                        usuarios.remove(u);
                        System.out.println("Usuario eliminado");
                        break;
                    }else{
                        System.out.println("Usuario no encontrado");
                    }
                }
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