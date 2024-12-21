# Sistema de Recursos Humanos

Este proyecto es una aplicación backend desarrollada con Spring Boot para la gestión de recursos humanos. La aplicación permite realizar operaciones CRUD (Crear, Leer, Actualizar, Eliminar) sobre empleados en una base de datos MySQL.

## Tecnologías Utilizadas

- **Spring Boot**: Framework para el desarrollo de aplicaciones Java.
- **Spring Data JPA**: Para la interacción con la base de datos.
- **MySQL**: Base de datos relacional.
- **Lombok**: Biblioteca para reducir el código boilerplate en Java.
- **SLF4J**: API de logging.

## Estructura del Proyecto

- **`src/main/java/gm/rh`**: Contiene la clase principal [`RhApplication`](src/main/java/gm/rh/RhApplication.java) que inicia la aplicación.
- **`src/main/java/gm/rh/controlador`**: Contiene el controlador [`EmpleadoControlador`](src/main/java/gm/rh/controlador/EmpleadoControlador.java) que maneja las solicitudes HTTP.
- **`src/main/java/gm/rh/servicio`**: Contiene la interfaz [`IEmpleadoServicio`](src/main/java/gm/rh/servicio/IEmpleadoServicio.java) y su implementación [`EmpleadoServicio`](src/main/java/gm/rh/servicio/EmpleadoServicio.java) que contienen la lógica de negocio.
- **`src/main/java/gm/rh/repositorio`**: Contiene el repositorio [`EmpleadoRepositorio`](src/main/java/gm/rh/repositorio/EmpleadoRepositorio.java) que interactúa con la base de datos.
- **`src/main/java/gm/rh/modelo`**: Contiene la entidad [`Empleado`](src/main/java/gm/rh/modelo/Empleado.java) que representa la tabla de empleados en la base de datos.
- **`src/main/java/gm/rh/excepcion`**: Contiene la excepción personalizada [`RecursoNoEncontradoExcepcion`](src/main/java/gm/rh/excepcion/RecursoNoEncontradoExcepcion.java) para manejar errores de recursos no encontrados.

## Configuración de la Base de Datos

La configuración de la base de datos se encuentra en el archivo [`application.properties`](src/main/resources/application.properties):

## Endpoints

- **GET /rh.app/empleados**: Obtiene la lista de empleados.
- **POST /rh.app/empleados**: Agrega un nuevo empleado.
- **GET /rh.app/empleados/{id}**: Obtiene un empleado por su ID.
- **PUT /rh.app/empleados/{id}**: Actualiza un empleado existente.
- **DELETE /rh.app/empleados/{id}**: Elimina un empleado por su ID.
