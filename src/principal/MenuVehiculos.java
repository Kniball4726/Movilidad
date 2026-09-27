package principal;

import logica.Vehiculo;

public final class MenuVehiculos{

    public void mostrar(){
        boolean volver = false;
        while (!volver) {
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
            case 0 -> volver = true;
            default -> {
                System.out.println("\nIntroduzca un numero dentro del menu"); 
                mostrar();
        }
    }

    }
}

public void registrar() {
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
        System.out.println("\nDesea registrar otro vehiculo? (s/n)");
        String crear = Movilidad.leerString();

        if (crear.toLowerCase().equals("s")){
            registrar();
        }else if(crear.toLowerCase().equals("n")){
            mostrar();
        }else{
            System.out.println("Debe introducir un dato valido");
            mostrar();
        }
    }

private void verVehiculo (){
    System.out.println("=======================");
    System.out.println("Ver vehiculo");
    System.out.println("=======================");
                
    if (Movilidad.vehiculo.isEmpty()) {
        System.out.println("No hay vehículos registrados.");
        System.out.println("Desea registrar un vehiculo? (s/n)");
        String crear = Movilidad.leerString();
        if (crear.toLowerCase().equals("s")){
           registrar();
        }else if(crear.toLowerCase().equals("n")){
            mostrar();
        }else{
            System.out.println("Debe seleccionar una opcion valida");
            mostrar();
        }
    }else{
        for(Vehiculo v : Movilidad.vehiculo){
            System.out.println(v);
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
        
    for (Vehiculo v : Movilidad.vehiculo) {
        if (v.getPatente().equalsIgnoreCase(patente)) {
            System.out.println("\nVehículo encontrado:");
            System.out.println(v);
            encontrado = true;
            break;
        }
    }
        
        if (!encontrado) {
            System.out.println("Vehículo no encontrado con la patente especificada.");
        }
    }

private static void modificarVehiculo() {
   
    System.out.println("Ingrese patente del vehículo a modificar:");
    
    String patente = Movilidad.leerString();
    
    boolean encontrado = false;
    for (Vehiculo v : Movilidad.vehiculo) {
        if (v.getPatente().equalsIgnoreCase(patente)) {
            System.out.println("Vehículo encontrado: " + v);
                
            System.out.println("Ingrese nueva marca:");
            v.setMarca(Movilidad.leerString());
                
            System.out.println("Ingrese nuevo modelo:");
            v.setModelo(Movilidad.leerString());
                
            System.out.println("Ingrese nuevo tipo:");
            v.setTipo(Movilidad.leerString());
                
            System.out.println("Ingrese nuevo estado (ej. Disponible, En Mantenimiento, En Uso):");
            v.setEstado(Movilidad.leerString());
                
            System.out.println("Ingrese nueva capacidad de pasajeros:");
            v.setCapacidad(Movilidad.leerInt());

            System.out.println("Vehículo modificado exitosamente.");
            encontrado = true;
            break;
        }
    }

        if (!encontrado) {
            System.out.println("Vehículo no encontrado.");
        }
    }

    private static void eliminarVehiculo() {
        System.out.println("Ingrese patente del vehículo a eliminar:");
        String patente = Movilidad.leerString();
        boolean encontrado = false;

        for (int i = 0; i < Movilidad.vehiculo.size(); i++) {
            if (Movilidad.vehiculo.get(i).getPatente().equalsIgnoreCase(patente)) {
                Movilidad.vehiculo.remove(i);
                System.out.println("Vehículo eliminado exitosamente.");
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Vehículo no encontrado.");
        }
    }
}