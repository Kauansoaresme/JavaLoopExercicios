package ExerciciosBasicos10;
//Imprima os números de 1 a 10, pulando a impressão do número 5 e interrompendo o loop quando encontrar o número 8.

public class LoopContinueBreak {

	public static void main(String[] args) {
		for (int c = 1; c <= 10; c++) {
			System.out.println(c);
			if (c == 5) {
				continue;
			}
			if (c == 8) {
				break;
			}
		}

	}

}
