# Almacén "El Mercadito"

Integrantes:
* Miño Antonio
* Gabriel Moyano
* Luciano Olavarria

Tablero Kanban: https://trello.com/invite/b/6af261a6d34b97e3a4b3751e/ATTI22bbb93ae02ffead00cc125ecc73706c6F3F809C/📋-tablero-kanban-grupo-9-aed2

## Descripción del negocio

Un almacén barrial tradicional que gestiona la venta de productos de consumo masivo a los vecinos de la zona.

## Problema que resuelve:

El proyecto busca solucionar el problema operativo que sufre el almacén al llevar el control de stock, altas, bajas y listados de productos de forma manual, centralizando la información en un sistema automatizado.

Tema elegido: clase 6: Colecciones y Listas: Elegimos la Clase 6 porque las listas (List) nos permiten manejar el stock del almacén sin límites de tamaño fijo. y usamos una colección de listas (List<List<Articulo>>) para agrupar los artículos por categoría.

## Tecnologías

* Java (versión de JDK utilizada)
* Eclipse IDE
* Maven
* Git / GitHub
* Trello (Tablero Kanban)

## Cómo ejecutar el proyecto

1. Clonar el repositorio.
2. Importar el proyecto como proyecto Java/Maven existente en Eclipse.
3. Ejecutar la clase principal (`Main.java`).

## Funcionalidades

* Registrar  artículos en el inventario.
* Aumentar Stock
* Disminuir Stock.
* Consultar productos por codigo.
* Eliminar prodcuto
* Listar productos
  

## Capturas de pantalla

![kanban](https://github.com/moyanoaguerogabriel-tech/Grupo9-emprendimiento-digital-/blob/743d64bdd5fda265dbcd1e0b3aab1069a8786903/Kanban.md)

## Pruebas realizadas

Para validar el funcionamiento del sistema y el manejo de errores por consola, ejecutamos los siguientes casos de prueba:

* **Alta de producto válido:** Al ingresar el código `2010`, nombre `"Pan Lactal"` y stock inicial `100`, el sistema guarda el artículo correctamente.
* **Consulta de producto:** Al buscar por el código `2010`, muestra las existencias actuales del artículo.
* **Validación de tipo de dato en código:** Al intentar cargar un código no numérico (ej. `q23`), el sistema captura el error, avisa que espera números enteros y vuelve a solicitar el dato.
* **Validación de stock negativo:** Al intentar ingresar cantidades negativas, el sistema rechaza la carga y solicita un valor válido.
* **Detección de código duplicado (falla lógica detectada en pruebas):** Durante las pruebas iniciales se detectó que al intentar registrar un código ya existente, el sistema lo tomaba sin advertir; a partir de esta prueba se corrigió la validación en el alta.

## Conclusiones

* **Aplicación práctica de colecciones y POO:** El desarrollo de **Almacén El Mercadito** permitió aplicar los conceptos de colecciones y listas en Java (`List`, `ArrayList` y estructuras anidadas por sector) junto con el encapsulamiento en clases (`Articulo`, `Almacen` y `Main`) para resolver un problema concreto de control de stock.
* **Alcance claro y validaciones:** Mantener el sistema enfocado exclusivamente en el alta, baja, consulta, listado y actualización de existencias por sector —sin mezclar precios ni ventas— ayudó a construir una lógica ordenada y con controles de entrada y stock.
* **Organización y trazabilidad:** El uso de un tablero Kanban, la bitácora diaria y los casos de prueba permitió ordenar las tareas del equipo, detectar fallos lógicos durante las pruebas y documentar el avance del proyecto.
* **Mejoras futuras:** Como próximos pasos, se propone incorporar persistencia de datos (mediante archivos o base de datos) para conservar el inventario al cerrar el programa, además de alertas de stock mínimo y reportes por sector.
