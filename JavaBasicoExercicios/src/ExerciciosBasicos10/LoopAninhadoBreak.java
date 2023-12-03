package ExerciciosBasicos10;
//Crie um loop aninhado que imprima os números de 1 a 5 para cada iteração do loop externo. Use break para interromper o loop interno quando o número 3 for atingido.
public class LoopAninhadoBreak {
	public static void main(String[] args) {

		for (int c = 1; c <= 5; c++) {
			System.out.println("Iteração externa: " + c);

			for (int i = 1; i <= 5; i++) {
				System.out.println("  Iteração interna: " + i);

				if (i == 3) {

					break;
				}
			}
		}
	}
}
