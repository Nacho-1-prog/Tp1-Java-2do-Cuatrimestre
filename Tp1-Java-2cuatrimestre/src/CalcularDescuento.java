import java.util.Scanner;

public class CalcularDescuento {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Ingrese el precio del producto: ");
            double precio = scanner.nextDouble();

            System.out.print("Ingrese la categoría del producto (A, B o C): ");
            char categoria = scanner.next().charAt(0);

            double descuento = 0;
            double precioFinal;

            switch (categoria) {
                case 'A':
                    descuento = 0.10;
                    break;
                case 'B':
                    descuento = 0.15;
                    break;
                case 'C':
                    descuento = 0.20;
                    break;
                default:
                    System.out.println("Categoría inválida.");
                    return;
            }

            double descuentoAplicado = precio * descuento;
            precioFinal = precio - descuentoAplicado;

            System.out.println("Precio original: " + precio);
            System.out.println("Descuento aplicado: " + (descuento * 100) + "%");
            System.out.println("Precio final: " + precioFinal);
        }
    }


