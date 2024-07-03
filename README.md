# Filtro Java

**Intregrantes:**

- Natalia Giraldo

- Duván Camilo Arenas

Este proyecto es una aplicación Java diseñada para gestionar la información relacionada con la operación de cines utilizando una arquitectura en capas. La aplicación permite realizar operaciones CRUD (Crear, Leer, Actualizar, Eliminar) en una base de datos MySQL.

## Estructura del Proyecto

El proyecto está organizado en las siguientes capas:

- **Domain:** Contiene los modelos de las entidades y las interfaces de los repositorios.
- **Infrastructure:** Implementaciones de los repositorios que interactúan con la base de datos.
- **Application:** Contiene los servicios que implementan la lógica de negocio.
- **Adapters:** Proporciona adaptadores de entrada (consola) y salida (repositorios).

## Objetivos

- Crear una base de datos en MySQL siguiendo el esquema proporcionado en el DER.
- Desarrollar una aplicación en Java utilizando Maven para la gestión de dependencias.
- Implementar las funcionalidades CRUD (Crear, Leer, Actualizar, Eliminar) para las diferentes entidades del sistema.
- Diseñar un menú interactivo en la consola para navegar entre las distintas funcionalidades.