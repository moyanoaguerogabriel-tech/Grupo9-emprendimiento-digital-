# Análisis y Requerimientos - Almacén "El Mercadito"

## 1. Historias de Usuario

* **HU01: Alta de Artículos**
  * **Como** repositor del almacén,
  * **Quiero** registrar un nuevo artículo indicando su nombre, código, precio, stock y categoría,
  * **Para** incorporarlo al inventario y que esté disponible para la venta.

* **HU02: Baja de Artículos**
  * **Como** encargado del almacén,
  * **Quiero** dar de baja (eliminar) un artículo del sistema utilizando su código,
  * **Para** mantener el stock actualizado ante productos descontinuados.

* **HU03: Búsqueda de Artículos**
  * **Como** cajero del almacén,
  * **Quiero** buscar un producto por su código o por su nombre,
  * **Para** verificar rápidamente su precio y disponibilidad en stock.

* **HU04: Listado por Categoría**
  * **Como** administrador del negocio,
  * **Quiero** ver los productos agrupados por sus respectivas categorías,
  * **Para** analizar el inventario de forma organizada.

## 2. Requerimientos Funcionales

* **RF-01 (Validación de Código):** El sistema no debe permitir registrar dos artículos con el mismo código identificador.
* **RF-02 (Estructura de Datos):** El inventario debe sostenerse mediante una colección de listas (`List<List<Articulo>>`), donde cada sublista corresponde a una categoría específica.
* **RF-03 (Control de Stock):** Las cantidades de stock ingresadas deben ser valores numéricos enteros mayores o iguales a cero.

## 3. Casos de Uso Iniciales

### CU01: Registrar nuevo producto en el almacén
- **Actor:** Repositor / Encargado.
- **Flujo principal:**
  1. El usuario selecciona la opción de registrar producto.
  2. Ingresa código, nombre, precio, stock y categoría.
  3. El sistema valida que el código no exista previamente.
  4. El sistema guarda el artículo en la lista correspondiente y confirma el alta.

### CU02: Consultar inventario por categoría
- **Actor:** Administrador / Cajero.
- **Flujo principal:**
  1. El usuario elige consultar el listado general.
  2. El sistema recorre las listas (colección de colecciones) y despliega los artículos agrupados por su categoría.

### CU03: Eliminar producto descontinuado
- **Actor:** Encargado.
- **Flujo principal:**
  1. El usuario ingresa el código del producto a dar de baja.
  2. El sistema busca el artículo en la lista.
  3. Si lo encuentra, lo remueve de la colección y muestra mensaje de éxito.
     
