public class ListaRecursiva {
    public static void main(String[] args) {
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};

        System.out.println("Precios originales:");
        mostrarPreciosRecursivamente(precios, 0);

        int indiceModificacion = 2;
        precios[indiceModificacion] = 129.99;

        System.out.println("\nPrecios modificados:");
        mostrarPreciosRecursivamente(precios, 0);
    }

    public static void mostrarPreciosRecursivamente(double[] precios, int indice) {
        if (indice < precios.length) {
            System.out.println("Precio: $" + precios[indice]);
            mostrarPreciosRecursivamente(precios, indice + 1);
        }
    }
}

