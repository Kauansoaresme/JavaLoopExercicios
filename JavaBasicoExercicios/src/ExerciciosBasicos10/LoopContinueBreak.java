package ExerciciosBasicos10;
//Imprima os n�meros de 1 a 10, pulando a impress�o do n�mero 5 e interrompendo o loop quando encontrar o n�mero 8.

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
