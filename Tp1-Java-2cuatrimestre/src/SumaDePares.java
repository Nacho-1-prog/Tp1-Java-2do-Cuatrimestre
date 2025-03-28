import java.util.Scanner;

public class SumaDePares {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero = -1;
        int sumaPares = 0;

        while (numero != 0) {
            System.out.print("Ingrese un número (0 para terminar): ");
            numero = scanner.nextInt();

            if (numero % 2 == 0 && numero != 0) {
                sumaPares += numero;
            }
        }

        System.out.println("La suma de los números pares es: " + sumaPares);
    }
}
