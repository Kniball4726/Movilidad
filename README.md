# Sistema de Gestión de Movilidad

Aplicación de consola en Java para registrar necesidades de movilidad y crear reservas asociadas a una necesidad, un vehículo y un conductor. La información se mantiene en memoria durante la ejecución.

## Descripción

El sistema ofrece un flujo de consola para autenticar usuarios, registrar necesidades de movilidad, administrar vehículos y conductores, y crear reservas asociadas a los recursos disponibles. Los datos se mantienen en memoria durante la ejecución.

## Objetivos

- Registrar solicitudes de movilidad y asociarlas a recursos registrados.
- Mantener reservas, vehículos, conductores y usuarios en colecciones en memoria.
- Proporcionar un flujo de consola validado para las operaciones del sistema.

## Funcionalidades principales

- Inicio de sesión con usuarios de ejemplo `Admin` y `User`.
- Alta, listado, búsqueda, modificación, suspensión y eliminación de necesidades de movilidad.
- Alta, listado, búsqueda, modificación y eliminación de vehículos.
- Alta, listado, búsqueda, modificación y eliminación de conductores.
- Alta, listado, búsqueda, modificación y eliminación de usuarios.
- Creación, listado, búsqueda, modificación, suspensión y eliminación de reservas.
- Validación de números, fechas, horas, cantidad de pasajeros y selección de opciones.
- Validación de fechas y horas de regreso posteriores o iguales a las de salida.
- Validación de capacidad y disponibilidad de vehículos y conductores antes de crear una reserva.
- Cambio del estado de los recursos a `En Uso` al asignarlos a una reserva.

## Tecnologías

- Java
- NetBeans / Apache Ant
- Programación orientada a objetos
- Estructuras de datos en memoria

## Requisitos

- JDK 26 o superior (el proyecto está configurado con `javac.source=26` y `javac.target=26`)
- NetBeans IDE o cualquier entorno Java compatible
- Sistema operativo Windows, Linux o macOS

## Estructura del proyecto

```text
Movilidad/
├── src/
│   ├── enums/
│   │   ├── Estado.java
│   │   └── TipoMovilidad.java
│   ├── logica/
│   │   ├── Conductor.java
│   │   ├── NeMovilidad.java
│   │   ├── Reserva.java
│   │   ├── Trabajador.java
│   │   ├── Usuario.java
│   │   └── Vehiculo.java
│   └── principal/
│       └── Movilidad.java
├── build.xml
├── manifest.mf
├── LICENSE
├── README.md
└── nbproject/
```

## Ejecución

### Desde NetBeans

1. Abre el proyecto en NetBeans.
2. Selecciona la clase principal `principal.Movilidad`.
3. Ejecuta el proyecto con la opción Run.

### Desde línea de comandos

En Windows PowerShell:

```powershell
javac -encoding UTF-8 -source 26 -target 26 -d build/classes (Get-ChildItem -Path src -Recurse -Filter *.java | ForEach-Object FullName)
java -cp build/classes principal.Movilidad
```

En Linux o macOS:

```bash
javac -d build/classes $(find src -name "*.java")
java -cp build/classes principal.Movilidad
```

## Generar documentación Javadoc

La documentación se escribe en los comentarios `/** ... */` de las clases y métodos públicos. Para generarla en Windows PowerShell:

```powershell
javadoc -d build\javadoc -sourcepath src -subpackages enums:logica:principal
```

Después de ejecutar el comando, abre `build\javadoc\index.html` en el navegador. La documentación incluye las clases de `enums`, `logica` y `principal`, junto con sus constructores, parámetros, valores devueltos y descripciones.

En NetBeans también puedes usar la opción **Run > Generate Javadoc**. El proyecto está configurado para usar `dist/javadoc` cuando la tarea de documentación de Ant se ejecuta desde el IDE.

## Credenciales de acceso por defecto

El sistema incluye dos usuarios de ejemplo:

- Usuario: `Admin` | Contraseña: `grupo1`
- Usuario: `User` | Contraseña: `grupo2`

## Uso del sistema

Una vez iniciada la aplicación, el usuario accede a los menús de:

- Necesidades de movilidad
- Reservas
- Conductores
- Vehículos
- Usuarios

El flujo para crear una reserva es:

1. Registrar una necesidad de movilidad. Las fechas se ingresan como `AAAA-MM-DD` y las horas como `HH:MM`.
2. Registrar un vehículo y un conductor desde sus respectivos menús.
3. Crear la reserva y seleccionar la necesidad, el vehículo y el conductor de las listas mostradas.

Si falta cualquiera de los tres registros, la reserva no se crea. El vehículo debe tener capacidad suficiente y tanto el vehículo como el conductor deben estar disponibles. Al crear la reserva, ambos recursos pasan a estado `En Uso`.

Las entradas inválidas muestran un mensaje y solicitan nuevamente el dato correspondiente. Las opciones `0` permiten volver al menú anterior.

Los datos se pierden al cerrar el programa; la aplicación no utiliza persistencia en archivos ni base de datos.

## Estado del proyecto

La versión actual implementa y valida los flujos de administración de necesidades, vehículos, conductores, usuarios y reservas. La persistencia en archivos o base de datos queda fuera del alcance y los datos continúan almacenándose únicamente en memoria.

## Licencia

Este proyecto se distribuye bajo la licencia indicada en el archivo LICENSE.

## Autor

Proyecto desarrollado como ejercicio de programación en Java.
