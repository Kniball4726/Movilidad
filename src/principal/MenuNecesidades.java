package principal;

import enums.TipoMovilidad;
import java.time.LocalDate;
import java.time.LocalTime;
import logica.NeMovilidad;

/** Gestiona el registro y la consulta de necesidades de movilidad. */
public final class MenuNecesidades {
    public static void mostrar() {
        while (true) {
            System.out.println("\n================================================");
            System.out.println("Bienvenido al menú de necesidades de movilidad");
            System.out.println("==================================================");
            System.out.println("1.- Crear necesidad de movilidad");
            System.out.println("2.- Ver necesidades de movilidad");
            System.out.println("3.- Modificar necesidad de movilidad");
            System.out.println("4.- Buscar necesidad de movilidad");
            System.out.println("5.- Suspender necesidad de movilidad");
            System.out.println("6.- Eliminar necesidad de movilidad");
            System.out.println("0.- Volver");

            switch (Movilidad.leerInt()) {
                case 1 -> {
                    registrar();
                    System.out.println("Desea registrar otra necesidad de movilidad? (s/n)");
                    if (Movilidad.leerString().equalsIgnoreCase("s")) {
                        registrar();
                    }
                }
                case 2 -> mostrarNecesidades();
                case 3 -> modificar();
                case 4 -> buscar();
                case 5 -> suspender();
                case 6 -> eliminar();
                case 0 -> { return; }
                default -> System.out.println("Introduzca un número dentro del menú");
            }
        }
    }

    private static void mostrarNecesidades() {
        if (Movilidad.movilidad.isEmpty()) {
            System.out.println("No existe alguna necesidad de movilidad");
            System.out.println("Desea crear una necesidad de movilidad? (s/n)");
            if (Movilidad.leerString().equalsIgnoreCase("s")) {
                registrar();
            }
            return;
        }

        System.out.println("===============================");
        System.out.println("Ver necesidades de movilidad");
        System.out.println("===============================");
        for (NeMovilidad necesidad : Movilidad.movilidad) {
            System.out.println(necesidad);
        }
    }

    static void registrar() {
        System.out.println("\n=====================================");
        System.out.println("Registro de necesidad de Movilidad");
        System.out.println("======================================");
        System.out.println("\nIndique Solicitante:");
        String solicitante = Movilidad.leerString();
        System.out.println("Carrera o unidad:");
        String carrera = Movilidad.leerString();
        System.out.println("Motivo del viaje:");
        String motivo = Movilidad.leerString();
        System.out.println("Lugar de salida:");
        String lugarSalida = Movilidad.leerString();
        System.out.println("Lugar de destino:");
        String lugarDestino = Movilidad.leerString();
        System.out.println("Cantidad de pasajeros:");
        int pasajeros;
        do {
            pasajeros = Movilidad.leerInt();
            if (pasajeros <= 0) {
                System.out.println("La cantidad de pasajeros debe ser mayor que cero.");
            }
        } while (pasajeros <= 0);
        System.out.println("Fecha de salida (AAAA-MM-DD):");
        LocalDate fechaSalida = Movilidad.leerFecha();
        System.out.println("Fecha de regreso (AAAA-MM-DD):");
        LocalDate fechaRegreso;
        do {
            fechaRegreso = Movilidad.leerFecha();
            if (fechaRegreso.isBefore(fechaSalida)) {
                System.out.println("La fecha de regreso no puede ser anterior a la fecha de salida.");
            }
        } while (fechaRegreso.isBefore(fechaSalida));
        System.out.println("Hora de salida (HH:MM):");
        LocalTime horaSalida = Movilidad.leerHora();
        System.out.println("Hora de regreso (HH:MM):");
        LocalTime horaRegreso;
        do {
            horaRegreso = Movilidad.leerHora();
            if (fechaSalida.equals(fechaRegreso) && horaRegreso.isBefore(horaSalida)) {
                System.out.println("La hora de regreso no puede ser anterior a la hora de salida.");
            }
        } while (fechaSalida.equals(fechaRegreso) && horaRegreso.isBefore(horaSalida));

        TipoMovilidad[] tipos = TipoMovilidad.values();
        for (int i = 0; i < tipos.length; i++) {
            System.out.println((i + 1) + ".- " + tipos[i]);
        }
        System.out.println("\nSeleccione el tipo de movilidad:\n");
        int opcionTipo = Movilidad.leerInt();
        if (opcionTipo < 1 || opcionTipo > tipos.length) {
            System.out.println("Tipo de movilidad no válido; no se registró la necesidad.");
            return;
        }
        System.out.println("Observaciones:");
        String observaciones = Movilidad.leerString();

        Movilidad.movilidad.add(new NeMovilidad(solicitante, carrera, motivo, lugarSalida, lugarDestino,
                pasajeros, fechaSalida, fechaRegreso, horaSalida, horaRegreso, tipos[opcionTipo - 1], observaciones));
        System.out.println("Necesidad de movilidad registrada.");
    }

    private static void modificar() {
        NeMovilidad necesidad = seleccionar();
        if (necesidad == null) {
            return;
        }
        System.out.println("Nuevo motivo:");
        necesidad.setMotivo(Movilidad.leerString());
        System.out.println("Nuevo lugar de salida:");
        necesidad.setLugarSalida(Movilidad.leerString());
        System.out.println("Nuevo lugar de destino:");
        necesidad.setLugarDestino(Movilidad.leerString());
        System.out.println("Necesidad modificada.");
    }

    private static void buscar() {
        System.out.println("Indique solicitante a buscar:");
        String solicitante = Movilidad.leerString();
        for (NeMovilidad necesidad : Movilidad.movilidad) {
            if (necesidad.getSolicitante().equalsIgnoreCase(solicitante)) {
                System.out.println(necesidad);
                return;
            }
        }
        System.out.println("Necesidad no encontrada.");
    }

    private static void eliminar() {
        NeMovilidad necesidad = seleccionar();
        if (necesidad != null) {
            Movilidad.movilidad.remove(necesidad);
            System.out.println("Necesidad eliminada.");
        }
    }

    private static void suspender() {
        NeMovilidad necesidad = seleccionar();
        if (necesidad != null) {
            necesidad.setSuspendida(true);
            System.out.println("Necesidad suspendida.");
        }
    }

    private static NeMovilidad seleccionar() {
        if (Movilidad.movilidad.isEmpty()) {
            System.out.println("No hay necesidades registradas.");
            return null;
        }
        mostrarNecesidades();
        System.out.println("Seleccione el número de necesidad (0 para cancelar):");
        int seleccion = Movilidad.leerInt();
        if (seleccion < 1 || seleccion > Movilidad.movilidad.size()) {
            if (seleccion != 0) {
                System.out.println("Selección no válida.");
            }
            return null;
        }
        return Movilidad.movilidad.get(seleccion - 1);
    }
}