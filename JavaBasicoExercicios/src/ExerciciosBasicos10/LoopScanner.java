package ExerciciosBasicos10;
import java.util.Scanner;

// Crie um loop infinito que solicita ao usu�rio um n�mero. Pare o loop quando o n�mero 0 for inserido.
public class LoopScanner {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num;

        while (true) {
            System.out.println("Digite um n�mero: ");
            num = entrada.nextInt();

            if (num == 0) {
                System.out.println("Loop encerrado.");
                break;
            }
        }

        entrada.close();
    }
}
