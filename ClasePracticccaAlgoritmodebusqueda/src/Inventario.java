import java.util.Scanner;

public class Inventario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de productos en el inventario:");
        int cantidad = Integer.parseInt(scanner.nextLine());

        String[] productos = new String[cantidad];

        for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingrese el nombre del producto " + (i + 1) + ":");
            productos[i] = scanner.nextLine();
        }

        System.out.println("Ingrese el nombre del producto a buscar:");
        String productoBuscado = scanner.nextLine();

        boolean encontrado = busquedaLineal(productos, productoBuscado);

        if (encontrado) {
            System.out.println("El producto se encuentra en el inventario.");
        } else {
            System.out.println("El producto no está disponible.");
        }
    }

    public static boolean busquedaLineal(String[] productos, String productoBuscado) {
        for (String producto : productos) {
            if (producto.equalsIgnoreCase(productoBuscado)) {
                return true;
            }
        }
        return false;
    }
}
