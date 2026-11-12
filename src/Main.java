
public class Main {

	public static void main(String[] args) {
		
	}

}

package Main;

import java.util.Scanner;

import Almacen.Almacen;
import Almacen.Articulo;

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Almacen almacen = new Almacen();

        int opcion;

        do {
            System.out.println("\n=== ALMACEN EL MERCADITO ===");
            System.out.println("1. Registrar producto");
            System.out.println("2. Aumentar stock");
            System.out.println("3. Disminuir stock");
            System.out.println("4. Consultar producto");
            System.out.println("5. Eliminar producto");
            System.out.println("6. Listar productos");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opcion: ");

            opcion = Integer.parseInt(teclado.nextLine());

            int codigo;
            int cantidad;

            switch (opcion) {

                case 1:
                    System.out.print("Codigo: ");
                    codigo = Integer.parseInt(teclado.nextLine());

                    System.out.print("Nombre: ");
                    String nombre = teclado.nextLine();

                    System.out.print("Stock inicial: ");
                    cantidad = Integer.parseInt(teclado.nextLine());

                    System.out.print("Sector (1, 2 o 3): ");
                    int sector = Integer.parseInt(teclado.nextLine());

                    if (codigo > 0 && !nombre.isBlank() && cantidad >= 0
                            && almacen.alta(new Articulo(codigo, nombre, cantidad), sector)) {
                        System.out.println("Producto registrado correctamente.");
                    } else {
                        System.out.println("No se pudo registrar el producto (código existente o sector inválido).");
                    }
                    break;

                case 2:
                    System.out.print("Codigo del producto: ");
                    codigo = Integer.parseInt(teclado.nextLine());

                    System.out.print("Cantidad a agregar: ");
                    cantidad = Integer.parseInt(teclado.nextLine());

                    if (almacen.aumentarStock(codigo, cantidad)) {
                        System.out.println("Stock aumentado correctamente.");
                    } else {
                        System.out.println("No se pudo actualizar el stock.");
                    }
                    break;

                case 3:
                    System.out.print("Codigo del producto: ");
                    codigo = Integer.parseInt(teclado.nextLine());

                    System.out.print("Cantidad a retirar: ");
                    cantidad = Integer.parseInt(teclado.nextLine());

                    if (almacen.disminuirStock(codigo, cantidad)) {
                        System.out.println("Stock disminuido correctamente.");
                    } else {
                        System.out.println("Stock insuficiente o producto inexistente.");
                    }
                    break;

                case 4:
                    System.out.print("Codigo del producto: ");
                    codigo = Integer.parseInt(teclado.nextLine());

                    Articulo encontrado = almacen.buscar(codigo);

                    if (encontrado != null) {
                        System.out.println(encontrado);
                    } else {
                        System.out.println("Producto no encontrado.");
                    }
                    break;

                case 5:
                    System.out.print("Codigo del producto: ");
                    codigo = Integer.parseInt(teclado.nextLine());

                    if (almacen.baja(codigo)) {
                        System.out.println("Producto eliminado.");
                    } else {
                        System.out.println("Producto no encontrado.");
                    }
                    break;

                case 6:
                    almacen.listar();
                    break;

                case 7:
                    System.out.println("Programa finalizado.");
                    break;

                default:
                    System.out.println("Opcion incorrecta.");
            }

        } while (opcion != 7);

        teclado.close();
    }
