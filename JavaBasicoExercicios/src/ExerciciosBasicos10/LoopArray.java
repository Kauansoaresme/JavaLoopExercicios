package ExerciciosBasicos10;
//10)Dado um array de n�meros inteiros, imprima cada n�mero at� encontrar um n�mero negativo. Use break para interromper o loop nesse ponto. 

public class LoopArray {

	public static void main(String[] args) {
		int[] numeros = { 9, 10, 5, -10, 15, 4, 1 };

		for (int numero : numeros) {
			if (numero < 0) {
				System.out.println("N�mero negativo encontrado. O loop foi interrompido.");
				break;
			}
			System.out.println(numero);
		}

	}

}
