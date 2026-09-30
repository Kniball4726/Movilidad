package principal;

import enums.Estado;
import java.util.Arrays;
import java.util.List;
import logica.Conductor;
import logica.NeMovilidad;
import logica.Reserva;
import logica.Vehiculo;

/** Gestiona la creación y consulta de reservas. */
public final class MenuReservas {
    private final MenuNecesidades menuNecesidades;
    private final MenuConductores menuConductores;
    private final MenuVehiculos menuVehiculos;

    public MenuReservas(MenuNecesidades menuNecesidades, MenuConductores menuConductores,
            MenuVehiculos menuVehiculos) {
        this.menuNecesidades = menuNecesidades;
        this.menuConductores = menuConductores;
        this.menuVehiculos = menuVehiculos;
    }

    public void mostrar() {
        
        while (true) {
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

            switch (Movilidad.leerInt()) {
                case 1 -> crear();
                case 2 -> listar();
                case 3 -> modificar();
                case 4 -> buscar();
                case 5 -> suspender();
                case 6 -> eliminar();
                case 0 -> { return; }
                default -> System.out.println("Introduzca un número dentro del menú");
            }
        }
    }

    private void listar() {
        System.out.println("===========================");
        System.out.println("Ver reservas");
        System.out.println("===========================");
        if (Movilidad.reserva.isEmpty()) {
            System.out.println("No hay reservas registradas.");
            return;
        }
        for (int i = 0; i < Movilidad.reserva.size(); i++) {
            System.out.println((i + 1) + ".- " + Movilidad.reserva.get(i));
        }
    }

    private void modificar() {
        System.out.println("===========================");
        System.out.println("Modificar reserva");
        System.out.println("===========================");
        Reserva reserva = seleccionarReserva();
        if (reserva == null) {
            return;
        }

        System.out.println("¿Qué desea modificar?");
        System.out.println("1.- Necesidad de movilidad");
        System.out.println("2.- Vehículo");
        System.out.println("3.- Conductor");
        System.out.println("4.- Estado");
        System.out.println("0.- Cancelar");

        switch (Movilidad.leerInt()) {
            case 1 -> {
                NeMovilidad necesidad = seleccionar("la nueva necesidad de movilidad", Movilidad.movilidad);
                if (necesidad != null) {
                    reserva.setMovilidad(necesidad);
                    System.out.println("Necesidad de movilidad actualizada.");
                }
            }
            case 2 -> {
                Vehiculo vehiculo = seleccionar("el nuevo vehículo", Movilidad.vehiculo);
                if (vehiculo != null) {
                    reserva.setVehiculo(vehiculo);
                    System.out.println("Vehículo actualizado.");
                }
            }
            case 3 -> {
                Conductor conductor = seleccionar("el nuevo conductor", Movilidad.conductor);
                if (conductor != null) {
                    reserva.setConductor(conductor);
                    System.out.println("Conductor actualizado.");
                }
            }
            case 4 -> {
                Estado estado = seleccionar("el nuevo estado", Arrays.asList(Estado.values()));
                if (estado != null) {
                    reserva.setEstado(estado);
                    System.out.println("Estado actualizado.");
                }
            }
            case 0 -> System.out.println("Modificación cancelada.");
            default -> System.out.println("Selección no válida.");
        }
    }

    private void buscar() {
        System.out.println("===========================");
        System.out.println("Buscar reserva");
        System.out.println("===========================");
        if (Movilidad.reserva.isEmpty()) {
            System.out.println("No hay reservas registradas.");
            return;
        }   
        Reserva reserva = seleccionarReserva();
        if (reserva != null) {
            System.out.println("\nReserva encontrada:");
            System.out.println(reserva);
        }
    }

    private void suspender() {
        System.out.println("===========================");
        System.out.println("Suspender reserva");
        System.out.println("===========================");
        if (Movilidad.reserva.isEmpty()) {
            System.out.println("No hay reservas registradas.");
            return;
        }
            Reserva reserva = seleccionarReserva();
            if (reserva != null) {
                reserva.setEstado(Estado.SUSPENDIDA);
                System.out.println("Reserva suspendida.");
        }
    }

    private void eliminar() {
        System.out.println("===========================");
        System.out.println("Eliminar reserva");
        System.out.println("===========================");

        Reserva reserva = seleccionarReserva();
            if (reserva == null) {
                System.out.println("No se seleccionó ninguna reserva para eliminar.");
                return;
            }

        System.out.println("¿Confirma que desea eliminar esta reserva? (s/n)");
        if (Movilidad.leerString().trim().equalsIgnoreCase("s")) {
            Movilidad.reserva.remove(reserva);
            System.out.println("Reserva eliminada.");
        } else {
            System.out.println("Eliminación cancelada.");
        }
    }

    private Reserva seleccionarReserva() {
        System.out.println("===========================");
        System.out.println("Seleccione una reserva");
        System.out.println("===========================");
        if (Movilidad.reserva.isEmpty()) {
            System.out.println("No hay reservas registradas.");
            return null;
        }

        listar();
        System.out.println("Seleccione el número de reserva (0 para cancelar):");
        int seleccion = Movilidad.leerInt();
        if (seleccion == 0) {
            return null;
        }
        if (seleccion < 1 || seleccion > Movilidad.reserva.size()) {
            System.out.println("Selección no válida.");
            return null;
        }
        return Movilidad.reserva.get(seleccion - 1);
    }

    private void crear() {
        System.out.println("===========================");
        System.out.println("Crear reserva");
        System.out.println("===========================");
        if (Movilidad.movilidad.isEmpty()) {
            System.out.println("No hay necesidades de movilidad registradas. Registre una antes de crear una reserva.");
            MenuNecesidades.mostrar();
            if (Movilidad.movilidad.isEmpty()) {
                System.out.println("No hay necesidades de movilidad registradas.");
                return;
            }
        }
        if (Movilidad.vehiculo.isEmpty()) {
            System.out.println("Registre un vehículo para continuar.");
            MenuVehiculos.registrar();
        }
        if (Movilidad.conductor.isEmpty()) {
            System.out.println("Registre un conductor para continuar.");
            MenuConductores.registrar();
        }

        NeMovilidad necesidad = seleccionar("la necesidad de movilidad", Movilidad.movilidad);
        Vehiculo vehiculo = seleccionar("el vehículo", Movilidad.vehiculo);
        Conductor conductor = seleccionar("el conductor", Movilidad.conductor);
        if (necesidad == null || vehiculo == null || conductor == null) {
            return;
        }
        if (vehiculo.getCapacidad() < necesidad.getPasajeros()) {
            System.out.println("El vehículo no tiene capacidad suficiente para esta necesidad.");
            return;
        }
        if (!"Disponible".equalsIgnoreCase(vehiculo.getEstado())
                || !"Disponible".equalsIgnoreCase(conductor.getEstado())) {
            System.out.println("El vehículo y el conductor deben estar disponibles.");
            return;
        }

        Movilidad.reserva.add(new Reserva(Estado.INICIADA, necesidad, vehiculo, conductor));
        vehiculo.setEstado("En Uso");
        conductor.setEstado("En Uso");
        System.out.println("Reserva creada con la necesidad, el vehículo y el conductor seleccionados.");
    }

    private <T> T seleccionar(String descripcion, List<T> opciones) {
        System.out.println("Seleccione " + descripcion + ":");
        System.out.println("===========================");
        
        for (int i = 0; i < opciones.size(); i++) {
            System.out.println((i + 1) + ".- " + opciones.get(i));
        }
        int seleccion = Movilidad.leerInt();
        if (seleccion < 1 || seleccion > opciones.size()) {
            System.out.println("Selección no válida; no se creó la reserva.");
            return null;
        }
        return opciones.get(seleccion - 1);
    }
}