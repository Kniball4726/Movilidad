/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package principal;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import logica.Conductor;
import logica.NeMovilidad;
import logica.Reserva;
import logica.Usuario;
import logica.Vehiculo;


/** Punto de entrada y estado compartido de la aplicación. */
public class Movilidad {
    private static final Scanner teclado = new Scanner(System.in);
    public static List<Usuario> usuarios = new ArrayList<>();
    public static List<Vehiculo> vehiculo = new ArrayList<>();
    public static List<Reserva> reserva = new ArrayList<>();
    public static List<Conductor> conductor = new ArrayList<>();
    public static List<NeMovilidad> movilidad = new ArrayList<>();

    public static void main(String[] args) {
        ingreso();
    }

    /** Carga los datos iniciales y autentica antes de mostrar los menús. */
    public static String ingreso() {
        usuarios.add(new Usuario(1, "Admin", "grupo1", "Admin"));
        usuarios.add(new Usuario(2, "User", "grupo2", "User"));
        vehiculo.add(new Vehiculo("Toyota", "Corolla", "ABC123", "Sedan", "Disponible", 4));
        conductor.add(new Conductor("B", "Senior", "Disponible", 1, "Juan Pérez", "JP001", "Conductor", "Transporte"));

        int intentos = 0;
        while (intentos < 3) {
            System.out.println("\n===========================================");
            System.out.println("Sistema SiReAu: Gestión VDG (Modo terminal)");
            System.out.println("===========================================");
            System.out.println("Ingreso al sistema");
            System.out.println("\nIndique usuario: ");
            String usuario = leerString();
            System.out.println("Indique contraseña: ");
            String clave = leerString();

                boolean autenticado = usuarios.stream()
                    .anyMatch(candidato -> candidato.getUsuario().equals(usuario)
                    && candidato.getContrasena().equals(clave));
                    
                if (autenticado) {
                new MenuPrincipal().mostrar();
                break;
            }

            System.out.println("\nUsuario o contraseña incorrectos");
            intentos++;
        }

        if (intentos == 3) {
            System.out.println("\nIntrodujo mal clave y/o contraseña 3 veces");
        }

        return usuarios.get(0).getRol();
    }

    public static String leerString() {
        return teclado.nextLine();
    }

    public static int leerInt() {
        while (true) {
            try {
                return Integer.parseInt(leerString().trim());
            } catch (NumberFormatException e) {
                System.out.println("Debe introducir un número entero válido.");
            }
        }
    }

    public static LocalDate leerFecha() {
        while (true) {
            try {
                return LocalDate.parse(leerString().trim());
            } catch (DateTimeParseException e) {
                System.out.println("Fecha inválida. Use el formato AAAA-MM-DD.");
            }
        }
    }

    public static LocalTime leerHora() {
        while (true) {
            try {
                return LocalTime.parse(leerString().trim());
            } catch (DateTimeParseException e) {
                System.out.println("Hora inválida. Use el formato HH:MM.");
            }
        }
    }
}