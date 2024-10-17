package javaCurso2024;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FiltrarImpares {

	public static void main(String[] args) {
		int[] numeros = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
		List<Integer> impares = new ArrayList <>();

		for (int numero : numeros) {
			if (numero % 2 != 0) {
				impares.add(numero);

			}
			
			}
	System.out.println("numeros Impares" + impares);
	}

}
