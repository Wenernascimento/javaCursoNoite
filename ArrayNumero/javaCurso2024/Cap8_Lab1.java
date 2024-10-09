package javaCurso2024;

import java.util.*;

public class Cap8_Lab1 {

	public static int maiorNumero(int[] numeros) {
		if (numeros == null || numeros.length == 0) {
			throw new IllegalArgumentException("O array não pode ser nulo ou vazio");
		}

		int maior = numeros[0];// Inicializa com o primeiro elemento do array
		for (int numero : numeros) {
			if (numero > maior) {
	   maior = numero; // atualiza o maior número encontrado
			
		   }
		}
		
		return maior; // Retorna o maior número 
	
	}
			
			public static void main (String[] args) {
	int[] numeros = {5, 3, 10, 1, 6};
	int resultado = maiorNumero(numeros);
	System.out.println("O maior número é: " + resultado);
	
		}

}
