package ExerciciosBasicos10;
//Imprima os n�meros de 1 a 10, mas pare o loop quando encontrar um n�mero maior que 7.

public class LoopBreak {

	public static void main(String[] args) {
		for (int c = 1; c <= 10; c++ ) {
			if (c > 7) {
				break;
			}
			System.out.println(c);
		}

	}

}
