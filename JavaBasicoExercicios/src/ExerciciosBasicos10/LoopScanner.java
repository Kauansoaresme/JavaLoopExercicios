package ExerciciosBasicos10;
import java.util.Scanner;

// Crie um loop infinito que solicita ao usuário um número. Pare o loop quando o número 0 for inserido.
public class LoopScanner {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num;

        while (true) {
            System.out.println("Digite um número: ");
            num = entrada.nextInt();

            if (num == 0) {
                System.out.println("Loop encerrado.");
                break;
            }
        }

        entrada.close();
    }
}
