package ExerciciosBasicos10;
//10)Dado um array de números inteiros, imprima cada número até encontrar um número negativo. Use break para interromper o loop nesse ponto. 

public class LoopArray {

	public static void main(String[] args) {
		int[] numeros = { 9, 10, 5, -10, 15, 4, 1 };

		for (int numero : numeros) {
			if (numero < 0) {
				System.out.println("Número negativo encontrado. O loop foi interrompido.");
				break;
			}
			System.out.println(numero);
		}

	}

}
