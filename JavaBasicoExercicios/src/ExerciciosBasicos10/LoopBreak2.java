package ExerciciosBasicos10;
//Use um loop para iterar sobre os números de 1 a 5. Pare o loop quando encontrar o número 3. Use switch para imprimir uma mensagem diferente para cada número. 

public class LoopBreak2 {

	public static void main(String[] args) {
		for (int c = 1; c <= 5; c++) {
			if (c == 3) {
				break;
			}
			switch (c) {
			case 1:
				System.out.println("Ranger Vermelho");
				break;
			case 2:
				System.out.println("Ranger Azul");
				break;
			case 3:
				System.out.println("Ranger Preto");
				break;
			case 4:
				System.out.println("Ranger Amarelo");
				break;
			case 5:
				System.out.println("Ranger Rosa");
				break;
			}
		}
	}
}
