# Diseño de Arquitectura del Menú y Consola - Almacén "El Mercadito"

## 1. Estructura de Ejecución (`Main.java`)
El sistema se ejecuta a través de un bucle interactivo (`do-while`) controlado por una variable numérica de opción. Utiliza la clase `Scanner` para la captura de entradas por consola y se comunica directamente con la clase gestora `Almacen`.

## 2. Flujo de Opciones del Menú Principal
El menú despliega 7 opciones operativas:
1. **Registrar producto:** Pide código, nombre, stock inicial y sector (1, 2 o 3). Valida mediante expresiones lógicas antes de invocar el método `alta()` de la clase `Almacen`.
2. **Aumentar stock:** Solicita el código del producto y la cantidad a sumar para actualizar el inventario.
3. **Disminuir stock:** Solicita el código y la cantidad a retirar, validando que exista suficiente stock disponible.
4. **Consultar producto:** Busca el artículo por su código en los sectores y muestra sus detalles completos por pantalla.
5. **Eliminar producto:** Da de baja un artículo del sistema utilizando su código identificador.
6. **Listar productos:** Despliega por consola el inventario completo organizado por sectores.
7. **Salir:** Cierra el flujo de ejecución y finaliza el programa.
