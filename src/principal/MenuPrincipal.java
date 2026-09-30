package principal;

/** Coordina el menú principal y sus módulos. */
public final class MenuPrincipal {

        public void mostrar() {
        while (true) {
            System.out.println("\n===========================================");
            System.out.println("Bienvenidos al sistema de reservas ");
            System.out.println("===========================================");
            System.out.println("1.- Registrar necesidades de movilidad");
            System.out.println("2.- Gestionar Reservas");
            System.out.println("3.- Gestionar conductores");
            System.out.println("4.- Gestionar vehiculos");
            System.out.println("5.- Gestionar usuarios");
            System.out.println("0.- Salir");

            switch (Movilidad.leerInt()) {
                case 1 -> MenuNecesidades.mostrar();
                case 2 -> new MenuReservas(new MenuNecesidades(), new MenuConductores(), new MenuVehiculos()).mostrar();
                case 3 -> MenuConductores.mostrar();
                case 4 -> MenuVehiculos.mostrar();
                case 5 -> MenuUsuarios.mostrar();
                case 0 -> {
                    System.out.println("Saliendo . . .");
                    return;
                }
                default -> System.out.println("Debe introducir un número del menu");
            }
        }
    }
}