package principal;

import logica.Vehiculo;

public final class MenuVehiculos{

    public static void mostrar(){
        while (true) {
        System.out.println("\n===========================================");
        System.out.println("Bienvenido al menú de Vehiculo");
        System.out.println("===========================================");
        System.out.println("1.- Agregar vehiculo");
        System.out.println("2.- Ver vehiculo");
        System.out.println("3.- Modificar vehiculo");
        System.out.println("4.- Buscar vehiculo");
        System.out.println("5.- Eliminar vehiculo");
        System.out.println("0.- Volver");

        switch (Movilidad.leerInt()){
            case 1 -> registrar();
            case 2 -> verVehiculo();
            case 3 -> modificarVehiculo();
            case 4 -> buscarVehiculo();
            case 5 -> eliminarVehiculo();
            case 0 -> { return; }
            default -> System.out.println("\nIntroduzca un numero dentro del menu");
    }

    }
}

public static void registrar() {
        System.out.println("======================");
        System.out.println("Registrar Vehiculo");
        System.out.println("======================");
        System.out.println("Marca:");
        String marca = Movilidad.leerString();
        System.out.println("Modelo:");
        String modelo = Movilidad.leerString();
        System.out.println("Patente:");
        String patente = Movilidad.leerString();
        System.out.println("Tipo de vehículo:");
        String tipo = Movilidad.leerString();
        System.out.println("Capacidad de pasajeros:");
        int capacidad = Movilidad.leerInt();

        Movilidad.vehiculo.add(new Vehiculo(marca, modelo, patente, tipo, "Disponible", capacidad));
        System.out.println("Vehículo registrado.");
    }

private static void verVehiculo (){
    System.out.println("=======================");
    System.out.println("Ver vehiculo");
    System.out.println("=======================");
                
        if (Movilidad.vehiculo.isEmpty()) {
        System.out.println("No hay vehículos registrados.");
            return;
    }else{
        for(Vehiculo vehiculo : Movilidad.vehiculo){
            System.out.println(vehiculo);
        };
    
}
}

private static void buscarVehiculo() {
    System.out.println("============================");
    System.out.println("Buscar Vehiculo");
    System.out.println("============================");
    System.out.println("Ingrese patente a buscar:");
    String patente = Movilidad.leerString();
        
    boolean encontrado = false;
    for (Vehiculo vehiculo : Movilidad.vehiculo) {
        if (vehiculo.getPatente().equalsIgnoreCase(patente)) {
            System.out.println("\nVehículo encontrado:");
            System.out.println(vehiculo);
            encontrado = true;
            break;
        }
    }
    if (!encontrado) {
        System.out.println("Vehículo no encontrado con la patente especificada.");
    }
    }

private static void modificarVehiculo() {
    System.out.println("=======================");
    System.out.println("Modificar Vehiculo");
    System.out.println("=======================");
   
    System.out.println("Ingrese patente del vehículo a modificar:");
    
    String patente = Movilidad.leerString();

    for (Vehiculo vehiculo : Movilidad.vehiculo) {
        if (vehiculo.getPatente().equalsIgnoreCase(patente)) {
            System.out.println("Vehículo encontrado: " + vehiculo);
                
            System.out.println("Ingrese nueva marca:");
            vehiculo.setMarca(Movilidad.leerString());
                
            System.out.println("Ingrese nuevo modelo:");
            vehiculo.setModelo(Movilidad.leerString());
                
            System.out.println("Ingrese nuevo tipo:");
            vehiculo.setTipo(Movilidad.leerString());
                
            System.out.println("Ingrese nuevo estado (ej. Disponible, En Mantenimiento, En Uso):");
            vehiculo.setEstado(Movilidad.leerString());
                
            System.out.println("Ingrese nueva capacidad de pasajeros:");
            vehiculo.setCapacidad(Movilidad.leerInt());

            System.out.println("Vehículo modificado exitosamente.");
            return;
        }
    }

        System.out.println("Vehículo no encontrado.");
    }

    private static void eliminarVehiculo() {
        System.out.println("=======================");
        System.out.println("Eliminar Vehiculo");
        System.out.println("=======================");
        if (Movilidad.vehiculo.isEmpty()) {
            System.out.println("No hay vehículos registrados.");
            return;
        }
        System.out.println("Ingrese patente del vehículo a eliminar:");
        String patente = Movilidad.leerString();
        
        for (int i = 0; i < Movilidad.vehiculo.size(); i++) {
            if (Movilidad.vehiculo.get(i).getPatente().equalsIgnoreCase(patente)) {
                Movilidad.vehiculo.remove(i);
                System.out.println("Vehículo eliminado exitosamente.");
                return;
            }
        }

        System.out.println("Vehículo no encontrado.");
    }
}