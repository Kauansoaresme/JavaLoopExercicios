package ExerciciosBasicos10;
//Crie um loop aninhado que imprima os n�meros de 1 a 5 para cada itera��o do loop externo. Use break para interromper o loop interno quando o n�mero 3 for atingido.
public class LoopAninhadoBreak {
	public static void main(String[] args) {

		for (int c = 1; c <= 5; c++) {
			System.out.println("Itera��o externa: " + c);

			for (int i = 1; i <= 5; i++) {
				System.out.println("  Itera��o interna: " + i);

				if (i == 3) {

					break;
				}
			}
		}
	}
}
