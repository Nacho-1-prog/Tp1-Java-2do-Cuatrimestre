public class CalculoDescuento {
    static final double DESCUENTO_ESPECIAL = 0.10;

    public static void calcularDescuentoEspecial(double precio) {
        double descuentoAplicado = precio * DESCUENTO_ESPECIAL;

        double precioFinal = precio - descuentoAplicado;

        System.out.println("El descuento especial aplicado es: " + descuentoAplicado);
        System.out.println("El precio final con descuento es: " + precioFinal);
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Ingrese el precio del producto: ");
        double precio = scanner.nextDouble();

        calcularDescuentoEspecial(precio);
    }
}
