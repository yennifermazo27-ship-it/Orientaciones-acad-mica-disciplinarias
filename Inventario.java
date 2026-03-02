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
public boolean registrarProducto(Producto producto) {

        if (buscarProducto(producto.getCodigo()) != null) {
            return false; 
        }

        if (producto.getPrecio() < 0 || producto.getStock() < 0) {
            return false; 
        }

        listaProductos.add(producto);
        return true;
    }

    
    public boolean agregarUnidades(String codigo, int cantidad) {
        Producto p = buscarProducto(codigo);
        if (p != null && cantidad > 0) {
            p.aumentarStock(cantidad);
            return true;
        }
        return false;
    }

   
    public boolean retirarUnidades(String codigo, int cantidad) {
        Producto p = buscarProducto(codigo);
        if (p != null) {
            return p.disminuirStock(cantidad);
        }
        return false;
    }

    
    public void mostrarProductos() {
        for (Producto p : listaProductos) {
            System.out.println(p);
        }
    }

    
    public void mostrarBajoStock() {
        for (Producto p : listaProductos) {
            if (p.getStock() < 5) {
                System.out.println(p);
            }
        }
    }

    
    public double calcularValorInventario() {
        double total = 0;
        for (Producto p : listaProductos) {
            total += p.calcularValorTotal();
        }
        return total;
    }
}