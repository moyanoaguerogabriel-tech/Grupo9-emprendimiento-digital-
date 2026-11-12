package Almacen;

public class Articulo {

    private int codigo;
    private String nombre;
    private int stock;

    public Articulo(int codigo, String nombre, int stock) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.stock = stock;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getStock() {
        return stock;
    }

    public void aumentarStock(int cantidad) {
        if (cantidad > 0) {
            stock += cantidad;
        }
    }

    public boolean disminuirStock(int cantidad) {
        if (cantidad > 0 && cantidad <= stock) {
            stock -= cantidad;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Codigo: " + codigo +
               " | Producto: " + nombre +
               " | Stock disponible: " + stock;
    }
}