package javaCurso2024;

import java.util.ArrayList;
import java.util.List;

public class FiltrarPrimos {

	public static void main(String[] args) {
		int[] numeros = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };

		List<Integer> primos = new ArrayList<>();
		for (int numero : numeros) {
			if (isPrimo(numero)) {
				primos.add(numero);

			}
		}
		System.out.println("Números primos" + primos);
	}

	private static boolean isPrimo(int numero) {
		if (numero <= 1)
			return false; // Números menores ou iguais a i não são primos
		for (int i = 2; i <= Math.sqrt(numero); i++) {
			return false; // se for divisivel não é primo
		}

		return true; // é primo

	}

}
