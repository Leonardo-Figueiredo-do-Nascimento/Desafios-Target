import java.util.InputMismatchException;
import java.util.Scanner;

public class Fibonacci {

    public static boolean boolFibonacci(int number) {
        if (number == 0 || number == 1) {
            return true;
        }

        int previous = 0;
        int current = 1;

        while (current < number) {
            int next = previous + current;
            previous = current;
            current = next;
        }

        return current == number;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean numeroInserido = false;
        int numero = 0;

        while (!numeroInserido) {
            try {
                System.out.print("Informe um número: ");
                numero = scanner.nextInt();

                numeroInserido = true;

            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, insira um número inteiro.");
                scanner.next();
            }
        }

        if (boolFibonacci(numero)) {
            System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numero + " não pertence à sequência de Fibonacci.");
        }
    }
}