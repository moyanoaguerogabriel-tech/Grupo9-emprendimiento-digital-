package Almacen;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Almacen {

    private List<List<Articulo>> sectores = new ArrayList<>();

    public Almacen() {
        for (int i = 0; i < 3; i++) {
            sectores.add(new ArrayList<>());
        }
    }

    // Registrar producto
    public boolean alta(Articulo articulo, int sector) {
        if (sector < 1 || sector > 3) {
            return false;
        }

        if (buscar(articulo.getCodigo()) != null) {
            return false; // El producto ya existe
        }

        sectores.get(sector - 1).add(articulo);
        return true;
    }

    // Buscar producto
    public Articulo buscar(int codigo) {
        for (List<Articulo> lista : sectores) {
            for (Articulo articulo : lista) {
                if (articulo.getCodigo() == codigo) {
                    return articulo;
                }
            }
        }
        return null;
    }

    // Aumentar stock
    public boolean aumentarStock(int codigo, int cantidad) {
        Articulo articulo = buscar(codigo);

        if (articulo != null && cantidad > 0) {
            articulo.aumentarStock(cantidad);
            return true;
        }

        return false;
    }

    // Disminuir stock
    public boolean disminuirStock(int codigo, int cantidad) {
        Articulo articulo = buscar(codigo);

        if (articulo != null && cantidad > 0) {
            return articulo.disminuirStock(cantidad);
        }

        return false;
    }

    // Eliminar producto
    public boolean baja(int codigo) {
        for (List<Articulo> lista : sectores) {
            Iterator<Articulo> iterator = lista.iterator();
            while (iterator.hasNext()) {
                Articulo articulo = iterator.next();
                if (articulo.getCodigo() == codigo) {
                    iterator.remove();
                    return true;
                }
            }
        }

        return false;
    }

    // Listar productos
    public void listar() {
        for (int i = 0; i < sectores.size(); i++) {
            System.out.println("\n--- SECTOR " + (i + 1) + " ---");
            
            if (sectores.get(i).isEmpty()) {
                System.out.println("(Vacío)");
            } else {
                for (Articulo articulo : sectores.get(i)) {
                    System.out.println(articulo);
                }
            }
        }
    }
}