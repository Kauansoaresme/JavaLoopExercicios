package ExerciciosBasicos10;
//Imprima os números ímpares de 1 a 10, usando continue para pular os números pares.
public class ContinueNumerosPares {

	public static void main(String[] args) {
		for (int c = 1; c <=10; c++) {
			if (c%2==0) {
				continue;
			}
			System.out.println(c);
		}

	}

}
