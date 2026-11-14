Bitácora de Avance Diario - Grupo 9

##Día 1 (09/11/2026)

Qué hicimos

Definimos el emprendimiento "El Mercadito" (almacén de barrio) y acordamos el mínimo técnico obligatorio para el tema de Colecciones y Listas (Clase 6).

Creamos el repositorio en GitHub con el archivo .gitignore para Java y estructuramos las carpetas obligatorias (/src, /docs, /pruebas, /kanban).

Redactamos el README.md inicial con la descripción del problema, tecnologías y enlace al tablero Trello.

Configuramos el tablero Kanban en Trello y registramos la primera captura de pantalla de avance.

Quién hizo qué

Definición del alcance de "El Mercadito" y reglas del proyecto: Integrante Miño.

Creación del repositorio en GitHub y carpetas: Integrante Olavarria.

Redacción del README.md y armado del tablero: Integrante Miño.

Creación de la Bitácora (bitacora.md) y organización del tablero: Integrante Moyano.

Qué nos trabó

Ninguna traba relevante. El equipo se organizó rápidamente en la división de tareas y en la elección del emprendimiento.

Qué sigue (Día 2 - Análisis)

Realizar los documentos de análisis en la carpeta /docs (historias de usuario / requerimientos del sistema para la gestión de productos y lista de compras por cliente).

Captura del tablero
[DIA 1](https://github.com/moyanoaguerogabriel-tech/Grupo9-emprendimiento-digital-/blob/55af110ab20918acbaf7c7fea2956fe83d36c4b4/Dia1.png)

## Día 2 (10/11/2026)
- **Qué hicimos:** Redacción completa de las historias de usuario y requerimientos funcionales en `/docs`, diseño detallado del modelo de datos (`Articulo` y la estructura `List<List<Articulo>>`), y documentación de los casos de uso iniciales.
- **Quién hizo qué:** 
  - Olavarria: Historias de usuario, requerimientos y diseño del modelo de datos.
  - Moyano: Estructura de la carpeta `/docs`, redacción de los casos de uso iniciales y actualización de la bitácora del día.
  - *Nota:* El integrante Miño no pudo participar de la jornada de hoy debido a un corte de luz provocado por tormentas, situación preavisada y aceptada por el grupo.
- **Qué nos trabó:** Ningún inconveniente técnico; se reestructuró la carga de trabajo del día de forma fluida entre los integrantes presentes.
- **Qué sigue:** Mañana (Día 3 - Diseño), las tareas específicas de diseño y arranque técnico están por definirse al retomar la actividad con el equipo completo.
- **Captura del tablero:** [DIA 2](https://github.com/moyanoaguerogabriel-tech/Grupo9-emprendimiento-digital-/blob/0978c819200a8e9aef9b68a90bfdeee9365a1530/Dia2.png)


## Día 3 (11/11/2026)
- **Qué hicimos:** Desarrollo e implementación del código base en la clase `Main` con el menú interactivo por consola (opciones de alta, baja, aumento/disminución de stock, consulta y listado), diseño lógico de los métodos gestores y estructuración de la tabla de casos de prueba previos.
- **Quién hizo qué:** 
  - Miño: Definición de la firma y lógica de los métodos obligatorios del sistema sobre la colección de listas (`List<List<Articulo>>`).
  - Moyano: Implementación de la estructura del menú interactivo en la clase `Main`, armado de la arquitectura en `/docs`, redacción de la bitácora y captura del tablero Kanban.
  - Olavarria: Preparación y documentación de los casos de prueba previos orientados al Anexo C.
- **Qué nos trabó:** Ningún inconveniente técnico mayor; el flujo del menú por consola se integró correctamente con las opciones del almacén.
- **Qué sigue:** Mañana (Día 4 - Desarrollo I), avanzaremos de lleno con la implementación del código interno para los métodos lógicos de gestión en las clases correspondientes.
- **Captura del tablero:** [DIA 3](https://github.com/moyanoaguerogabriel-tech/Grupo9-emprendimiento-digital-/blob/025ca55e2de0c6b1d493cf11b315dfc47884e21d/Dia3.png)

## Día 4 (12/11/2026)
- **Qué hicimos:** Pruebas de funcionamiento y correcciones de la lógica del código agregando condiciones para que en el ingreso del código del producto solo se pueda agregar valores tipo entero sin que dé error.
- **Quién hizo qué:** 
  - Miño: Optimización de la estructura de la clase gestora y métodos internos.
  - Moyano: Pruebas de entorno local, redacción de la bitácora y actualización del tablero Kanban.
  - Olavarria: Revisión cruzada de requerimientos y consistencia del código.
- **Qué nos trabó:** El inconveniente mayor fue desarrollar la implementación del código para evitar que el programa falle ante entradas inválidas del usuario.
- **Qué sigue:** Mañana (Día 5 - Desarrollo II), avanzaremos de lleno con la implementación del código interno para los métodos lógicos de gestión en las clases correspondientes.
- **Captura del tablero:** [DIA 4](https://github.com/moyanoaguerogabriel-tech/Grupo9-emprendimiento-digital-/blob/main/Dia4.png)

## Día 5 (13/11/2026)
- **Qué hicimos:** Implementación y conexión definitiva de los métodos de alta, baja, búsqueda y control de stock en las clases correspondientes, asegurando su correcto funcionamiento con la estructura de colección de listas (`List<List<Articulo>>`).
- **Quién hizo qué:** 
  - Miño: Codificación y pruebas de la lógica interna de los métodos de gestión de inventario y alta de artículos.
  - Moyano: Integración general del sistema, redacción de la bitácora de la jornada y actualización del tablero Kanban.
  - Olavarria: Verificación y pruebas funcionales de los listados por sector y de las opciones de consulta.
- **Qué nos trabó:** Pequeños ajustes en el manejo de los índices de las listas anidadas para que coincidan de forma exacta con los sectores (1, 2 y 3), resueltos fluidamente en equipo.
- **Qué sigue:** Mañana (Día 6 - Pruebas y Depuración), realizaremos las pruebas finales utilizando la tabla de casos de prueba del Anexo C para garantizar la robustez total de la aplicación.
- **Captura del tablero:** [DIA 5](https://github.com/moyanoaguerogabriel-tech/Grupo9-emprendimiento-digital-/blob/aa3ba98b7ae26630b4eec33e733aa76e3fa8d5ed/Dia5.png)
