package ExerciciosBasicos10;
//Crie um loop aninhado que imprima os n�meros de 1 a 5 para cada itera��o do loop externo, pulando a impress�o do n�mero 3 em cada itera��o interna usando continue.

public class LoopContinue {
	public static void main(String[] args) {
		for (int c = 1; c<=5; c++) {
			System.out.println("Intera��o externa: "+c);
			for (int i = 1; i<=5; i++) {
				if (i == 3) {
					continue;
				}
				System.out.println("  Intera��o interna: "+i);
			}
			
		}

	}

}
