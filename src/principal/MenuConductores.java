package principal;

import logica.Conductor;

/** Gestiona las operaciones disponibles para conductores. */
public final class MenuConductores {
    public static void mostrar() {
        
        while (true) {
            System.out.println("\n===========================================");
            System.out.println("Bienvenido al menú de Conductores");
            System.out.println("===========================================");
            System.out.println("1.- Agregar conductor");
            System.out.println("2.- Ver conductor");
            System.out.println("3.- Modificar conductor");
            System.out.println("4.- Buscar conductor");
            System.out.println("5.- Eliminar conductgor");
            System.out.println("0.- Volver");

            switch (Movilidad.leerInt()) {
                case 1 -> registrar();
                case 2 -> {
                    System.out.println("\nVer conductor");
                    for (Conductor conductor : Movilidad.conductor) {
                        System.out.println(conductor);
                    }
                }
                case 3 -> modificar();
                case 4 -> buscar();
                case 5 -> eliminar();
                case 0 -> { return; }
                default -> System.out.println("Introduzca un número dentro del menú");
            }
        }
    }

    static void registrar() {
        System.out.println("======================");
        System.out.println("Registrar Conductor");
        System.out.println("======================");
        System.out.println("Identificador numérico:");
        int idPersona = Movilidad.leerInt();
        System.out.println("Nombre:");
        String nombre = Movilidad.leerString();
        System.out.println("Identificador institucional:");
        String id = Movilidad.leerString();
        System.out.println("Cargo:");
        String cargo = Movilidad.leerString();
        System.out.println("Dependencia:");
        String dependencia = Movilidad.leerString();
        System.out.println("Licencia:");
        String licencia = Movilidad.leerString();
        System.out.println("Grado:");
        String grado = Movilidad.leerString();

        Movilidad.conductor.add(new Conductor(licencia, grado, "Disponible", idPersona, nombre, id, cargo, dependencia));
        System.out.println("Conductor registrado.");
    }

    private static Conductor seleccionar() {
        if (Movilidad.conductor.isEmpty()) {
            System.out.println("No hay conductores registrados.");
            return null;
        }
        for (int i = 0; i < Movilidad.conductor.size(); i++) {
            System.out.println((i + 1) + ".- " + Movilidad.conductor.get(i));
        }
        System.out.println("Seleccione el número de conductor (0 para cancelar):");
        int seleccion = Movilidad.leerInt();
        if (seleccion < 1 || seleccion > Movilidad.conductor.size()) {
            if (seleccion != 0) {
                System.out.println("Selección no válida.");
            }
            return null;
        }
        return Movilidad.conductor.get(seleccion - 1);
    }

    private static void modificar() {
        Conductor conductor = seleccionar();
        if (conductor == null) {
            return;
        }
        System.out.println("Nuevo nombre:");
        conductor.setNombre(Movilidad.leerString());
        System.out.println("Nueva dependencia:");
        conductor.setDependencia(Movilidad.leerString());
        System.out.println("Nueva licencia:");
        conductor.setLicencia(Movilidad.leerString());
        System.out.println("Nuevo grado:");
        conductor.setGrado(Movilidad.leerString());
        System.out.println("Nuevo estado:");
        conductor.setEstado(Movilidad.leerString());
        System.out.println("Conductor modificado.");
    }

    private static void buscar() {
        System.out.println("Ingrese identificador institucional:");
        String id = Movilidad.leerString();
        for (Conductor conductor : Movilidad.conductor) {
            if (conductor.getId().equalsIgnoreCase(id)) {
                System.out.println(conductor);
                return;
            }
        }
        System.out.println("Conductor no encontrado.");
    }

    private static void eliminar() {
        Conductor conductor = seleccionar();
        if (conductor != null) {
            Movilidad.conductor.remove(conductor);
            System.out.println("Conductor eliminado.");
        }
    }
}