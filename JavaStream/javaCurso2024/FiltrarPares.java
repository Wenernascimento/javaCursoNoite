package javaCurso2024;

import java.util.ArrayList;
import java.util.List;

public class FiltrarPares {
	public static void main(String[] args) {
		// Lista de números a serem filtrados
		int[] numeros = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };

	// Lista para armazenar número pares
		List<Integer> pares = new ArrayList<>();
		
		// Loop para verifcar cada número
		for (int numero : numeros) {
			if (numero % 2 == 0) { // Verifica se o número é par
				pares.add(numero); // Adicionar a lista se for par
				
				
			}
		}
	// Exibe os números pares 
		System.out.println("Numeros pares  "+ pares);
	
	}
}
