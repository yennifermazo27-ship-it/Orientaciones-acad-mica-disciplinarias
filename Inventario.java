import java.util.ArrayList;

public class Inventario {

    private ArrayList<Producto> listaProductos;

    public Inventario() {
        listaProductos = new ArrayList<>();
    }

    
    public Producto buscarProducto(String codigo) {
        for (Producto p : listaProductos) {
            if (p.getCodigo().equalsIgnoreCase(codigo)) {
                return p;
            }
        }
        return null;
    }
}