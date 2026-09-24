# Sistema de Gestión de Movilidad

Sistema de gestión desarrollado en Java para administrar necesidades de movilidad, reservas, conductores, vehículos y usuarios dentro de un entorno de consola. El proyecto está pensado para apoyar la organización y control operativo de desplazamientos en una institución o empresa.

## Descripción

El sistema permite registrar y consultar necesidades de movilidad, asignar reservas, controlar el estado de los vehículos y conductores, así como gestionar usuarios con distintos roles. Su enfoque principal es facilitar la administración de servicios relacionados con traslados y moviliación interna.

## Objetivos

- Centralizar la información de necesidades de movilidad.
- Gestionar reservas de forma ordenada y eficiente.
- Controlar conductores y vehículos disponibles.
- Mantener usuarios y permisos dentro del sistema.
- Brindar una interfaz de consola simple y funcional para uso administrativo.

## Funcionalidades principales

- Inicio de sesión con usuarios predefinidos.
- Gestión de usuarios.
- Registro y visualización de necesidades de movilidad.
- Gestión de reservas.
- Administración de conductores.
- Administración de vehículos.
- Consulta por distintos criterios.
- Manejo de estados mediante enumeraciones.

## Tecnologías

- Java
- NetBeans / Apache Ant
- Programación orientada a objetos
- Estructuras de datos en memoria

## Requisitos

- JDK 8 o superior
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

```bash
javac -d build/classes $(find src -name "*.java")
java -cp build/classes principal.Movilidad
```

> En sistemas Windows, la ejecución puede hacerse desde PowerShell o desde el IDE configurado para Java.

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

Una vez iniciada la aplicación, el usuario puede acceder al menú principal y elegir entre las opciones de:

- Necesidades de movilidad
- Reservas
- Conductores
- Vehículos
- Usuarios

Cada módulo ofrece operaciones de consulta, registro y administración básica, siguiendo una lógica orientada a consola.

## Estado del proyecto

Este proyecto corresponde a una implementación inicial y funcional de gestión de movilidad en Java, orientada a la práctica académica y al aprendizaje del paradigma orientado a objetos.

## Licencia

Este proyecto se distribuye bajo la licencia indicada en el archivo LICENSE.

## Autor

Proyecto desarrollado como ejercicio de programación en Java.
