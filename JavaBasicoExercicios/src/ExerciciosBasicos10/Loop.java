package ExerciciosBasicos10;
//Imprima os n�meros de 1 a 10, mas pare a execu��o do loop quando chegar a 5.

public class Loop {

	public static void main(String[] args) {
		for(int c=0; c<=10; c++) {
			if(c == 5) {
				break;
			}
			System.out.println(c);
		}

	}

}
