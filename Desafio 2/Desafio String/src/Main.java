import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static int contadorA(String texto) {
        int i = 0;
        String lowerCaseInput = texto.toLowerCase();

        for (char c : lowerCaseInput.toCharArray()) {
            if (c == 'a') {
                i++;
            }
        }

        return i;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe uma string: ");
        String texto = scanner.nextLine();

        int contador = contadorA(texto);

        if (contador > 0) {
            System.out.println("A string "+texto+" tem cerca de "+contador+" letra(s) A");
        } else {
            System.out.println("A string não tem a letra A.");
        }

        scanner.close();


    }
}