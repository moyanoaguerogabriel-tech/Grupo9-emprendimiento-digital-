package Main;
import java.util.Scanner;
import Almacen.Almacen;
import Almacen.Articulo;

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Almacen almacen = new Almacen();

        int opcion = 0;

        do {
            System.out.println("\n=== ALMACEN EL MERCADITO ===");
            System.out.println("1. Registrar producto");
            System.out.println("2. Aumentar stock");
            System.out.println("3. Disminuir stock");
            System.out.println("4. Consultar producto");
            System.out.println("5. Eliminar producto");
            System.out.println("6. Listar productos");
            System.out.println("7. Salir");

            // Bucle para validar  que la persona ingrese datos correctos 
            boolean opcionValida = false;
            while (!opcionValida) {
                System.out.print("Seleccione una opcion: ");
                try {
                    opcion = Integer.parseInt(teclado.nextLine());
                    if (opcion >= 1 && opcion <= 7) {
                        opcionValida = true;
                    } else {
                        System.out.println("Error: Ingrese un número entre 1 y 7.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Error: Debe ingresar solo números enteros.");
                }
            }

            int codigo = 0;
            int cantidad = 0;

            switch (opcion) {

                case 1: // Registrar producto nuevo 
                    boolean codigoValido = false;
                    while (!codigoValido) {
                        System.out.print("Codigo (solo números enteros positivos): ");
                        try {
                            codigo = Integer.parseInt(teclado.nextLine());
                            if (codigo >= 0) codigoValido = true;
                            else System.out.println("Error: No se permiten números negativos.");
                        } catch (NumberFormatException e) {
                            System.out.println("Error: Ingrese un número válido.");
                        }
                    }

                    System.out.print("Nombre: ");
                    String nombre = teclado.nextLine();

                    boolean stockValido = false;
                    while (!stockValido) {
                        System.out.print("Stock inicial (solo números enteros positivos): ");
                        try {
                            cantidad = Integer.parseInt(teclado.nextLine());
                            if (cantidad >= 0) stockValido = true;
                            else System.out.println("Error: No se permiten números negativos.");
                        } catch (NumberFormatException e) {
                            System.out.println("Error: Ingrese un número válido.");
                        }
                    }
                    
                    boolean sectorValido = false;
                    int sector = 0;
                    while (!sectorValido) {
                        System.out.print("Sector (1, 2 o 3): ");
                        try {
                            sector = Integer.parseInt(teclado.nextLine());
                            if (sector >= 1 && sector <= 3) sectorValido = true;
                            else System.out.println("Error: El sector debe ser 1, 2 o 3.");
                        } catch (NumberFormatException e) {
                            System.out.println("Error: Ingrese un número válido.");
                        }
                    }

                    if (codigo > 0 && !nombre.isBlank() && cantidad >= 0
                            && almacen.alta(new Articulo(codigo, nombre, cantidad), sector)) {
                        System.out.println("Producto registrado correctamente.");
                    } else {
                        System.out.println("No se pudo registrar el producto (código existente o sector inválido).");
                    }
                    break;

                case 2: // Aumentar stock
                    boolean codVal2 = false;
                    while (!codVal2) {
                        System.out.print("Codigo del producto: ");
                        try {
                            codigo = Integer.parseInt(teclado.nextLine());
                            if (codigo >= 0) codVal2 = true;
                            else System.out.println("Error: No se permiten números negativos.");
                        } catch (NumberFormatException e) {
                            System.out.println("Error: Ingrese un número válido.");
                        }
                    }

                    boolean cantVal2 = false;
                    while (!cantVal2) {
                        System.out.print("Cantidad a agregar: ");
                        try {
                            cantidad = Integer.parseInt(teclado.nextLine());
                            if (cantidad >= 0) cantVal2 = true;
                            else System.out.println("Error: No se permiten números negativos.");
                        } catch (NumberFormatException e) {
                            System.out.println("Error: Ingrese un número válido.");
                        }
                    }

                    if (almacen.aumentarStock(codigo, cantidad)) {
                        System.out.println("Stock aumentado correctamente.");
                    } else {
                        System.out.println("No se pudo actualizar el stock.");
                    }
                    break;

                case 3: // Disminuir stock
                    boolean codVal3 = false;
                    while (!codVal3) {
                        System.out.print("Codigo del producto: ");
                        try {
                            codigo = Integer.parseInt(teclado.nextLine());
                            if (codigo >= 0) codVal3 = true;
                            else System.out.println("Error: No se permiten números negativos.");
                        } catch (NumberFormatException e) {
                            System.out.println("Error: Ingrese un número válido.");
                        }
                    }

                    boolean cantVal3 = false;
                    while (!cantVal3) {
                        System.out.print("Cantidad a retirar: ");
                        try {
                            cantidad = Integer.parseInt(teclado.nextLine());
                            if (cantidad >= 0) cantVal3 = true;
                            else System.out.println("Error: No se permiten números negativos.");
                        } catch (NumberFormatException e) {
                            System.out.println("Error: Ingrese un número válido.");
                        }
                    }

                    if (almacen.disminuirStock(codigo, cantidad)) {
                        System.out.println("Stock disminuido correctamente.");
                    } else {
                        System.out.println("Stock insuficiente o producto inexistente.");
                    }
                    break;

                case 4: // Consultar producto
                    boolean codVal4 = false;
                    while (!codVal4) {
                        System.out.print("Codigo del producto a consultar: ");
                        try {
                            codigo = Integer.parseInt(teclado.nextLine());
                            if (codigo >= 0) codVal4 = true;
                            else System.out.println("Error: No se permiten números negativos.");
                        } catch (NumberFormatException e) {
                            System.out.println("Error: Ingrese un número válido.");
                        }
                    }

                    Articulo encontrado = almacen.buscar(codigo);
                    if (encontrado != null) {
                        System.out.println(encontrado);
                    } else {
                        System.out.println("Producto no encontrado.");
                    }
                    break;

                case 5: // Eliminar producto
                    boolean codVal5 = false;
                    while (!codVal5) {
                        System.out.print("Codigo del producto a eliminar: ");
                        try {
                            codigo = Integer.parseInt(teclado.nextLine());
                            if (codigo >= 0) codVal5 = true;
                            else System.out.println("Error: No se permiten números negativos.");
                        } catch (NumberFormatException e) {
                            System.out.println("Error: Ingrese un número válido.");
                        }
                    }

                    if (almacen.baja(codigo)) {
                        System.out.println("Producto eliminado.");
                    } else {
                        System.out.println("Producto no encontrado.");
                    }
                    break;

                case 6: // Listar
                    almacen.listar();
                    break;

                case 7:
                    System.out.println("Programa finalizado.");
                    break;
            }

        } while (opcion != 7);

        teclado.close();
    }
}//12/11/2026