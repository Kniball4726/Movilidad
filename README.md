# Sistema de Gestión de Movilidad

Aplicación de consola en Java para registrar necesidades de movilidad y crear reservas asociadas a una necesidad, un vehículo y un conductor. La información se mantiene en memoria durante la ejecución.

## Descripción

El sistema ofrece un flujo inicial de registro de solicitudes y recursos, junto con la creación de reservas. Es una versión en desarrollo: varias opciones de modificación, búsqueda, suspensión y eliminación todavía son marcadores sin funcionalidad.

## Objetivos

- Registrar solicitudes de movilidad y asociarlas a recursos registrados.
- Mantener reservas, vehículos, conductores y usuarios en colecciones en memoria.
- Proporcionar un flujo de consola para las operaciones implementadas.

## Funcionalidades principales

- Inicio de sesión con usuarios de ejemplo `Admin` y `User`.
- Registro y listado de necesidades de movilidad.
- Registro y listado de vehículos y conductores.
- Creación de reservas seleccionando una necesidad, un vehículo y un conductor registrados. La reserva se crea con estado `INICIADA`.
- Validación para impedir reservas si falta una necesidad, un vehículo o un conductor.
- Operaciones de alta, listado, búsqueda, modificación y eliminación de usuarios.
- Las demás opciones de modificación, búsqueda, suspensión y eliminación de necesidades, reservas, vehículos y conductores están pendientes.

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
javac -d build/classes (Get-ChildItem -Path src -Recurse -Filter *.java | ForEach-Object FullName)
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

Si falta cualquiera de los tres registros, la reserva no se crea. Los datos se pierden al cerrar el programa; todavía no hay persistencia en archivos ni base de datos.

## Estado del proyecto

El proyecto tiene implementados los flujos básicos de alta de necesidades, vehículos y conductores, la creación de reservas vinculadas a esos registros y la gestión básica de usuarios. La persistencia, la validación de disponibilidad/capacidad de recursos y las operaciones de administración restantes están pendientes.

## Licencia

Este proyecto se distribuye bajo la licencia indicada en el archivo LICENSE.

## Autor

Proyecto desarrollado como ejercicio de programación en Java.
