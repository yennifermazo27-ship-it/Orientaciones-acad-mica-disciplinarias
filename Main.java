    import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Inventario inventario = new Inventario();
        int opcion;

        do {
            System.out.println("\n===== SISTEMA DE INVENTARIO =====");
            System.out.println("1. Registrar producto");
            System.out.println("2. Agregar unidades");
            System.out.println("3. Retirar unidades");
            System.out.println("4. Mostrar inventario");
            System.out.println("5. Mostrar bajo stock");
            System.out.println("6. Calcular valor total");
            System.out.println("7. Salir");

            System.out.print("Seleccione opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:
                    System.out.print("Código: ");
                    String codigo = sc.nextLine();

                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();

                    System.out.print("Precio: ");
                    double precio = sc.nextDouble();

                    System.out.print("Stock inicial: ");
                    int stock = sc.nextInt();

                    Producto nuevo = new Producto(codigo, nombre, precio, stock);

                    if (inventario.registrarProducto(nuevo)) {
                        System.out.println("Producto registrado correctamente");
                    } else {
                        System.out.println("Error al registrar producto");
                    }
                    break;

                case 2:
                    System.out.print("Código: ");
                    codigo = sc.nextLine();

                    System.out.print("Cantidad a agregar: ");
                    int cantidad = sc.nextInt();

                    if (inventario.agregarUnidades(codigo, cantidad)) {
                        System.out.println("Stock actualizado");
                    } else {
                        System.out.println("Error al agregar unidades");
                    }
                    break;


