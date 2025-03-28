import java.util.Scanner;

public class CalculoEnvio {
    public static double calcularCostoEnvio(double peso, String zona) {
        double costoEnvio = 0;
        if (zona.equalsIgnoreCase("Nacional")) {
            costoEnvio = peso * 5; // $5 por kg
        } else if (zona.equalsIgnoreCase("Internacional")) {
            costoEnvio = peso * 10; // $10 por kg
        } else {
            System.out.println("Error: Zona inválida.");
        }
        return costoEnvio;
    }

    public static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        return precioProducto + costoEnvio;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el precio del producto: ");
        double precioProducto = scanner.nextDouble();

        System.out.print("Ingrese el peso del paquete en kg: ");
        double peso = scanner.nextDouble();

        System.out.print("Ingrese la zona de envío (Nacional/Internacional): ");
        String zona = scanner.next();

        double costoEnvio = calcularCostoEnvio(peso, zona);

        if (costoEnvio > 0) {
            double totalCompra = calcularTotalCompra(precioProducto, costoEnvio);

            // Mostrar resultados
            System.out.println("El costo de envío es: " + costoEnvio);
            System.out.println("El total a pagar es: " + totalCompra);
        }
    }
}

