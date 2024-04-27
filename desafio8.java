import java.util.Scanner;

public class VerificadorIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        int idade = scanner.nextInt();

        if (idade >= 18) {
            System.out.println("Voce esta elegivel para criar uma conta bancaria.");
        } else {
            System.out.println("Voce nao esta elegivel para criar uma conta bancaria.");
        }
    }
}
