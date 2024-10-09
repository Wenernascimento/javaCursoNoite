package javaCurso2024;

import java2024.Main;

public class Cap8_Lab3 {

	public static int maiorNumero(int[] numeros) {
		if (numeros == null || numeros.length == 0) {
			throw new IllegalArgumentException("O array não pode ser nulo ou vazio");
			}
   int maior = numeros[0]; 

  for (int numero : numeros) {
	if (numero > maior) {
		maior = numero;
	}
}
	return maior;
	}	
	public static void main(String[] args) {
		int[] numeros = {10, 20,30,40,50};
		
		int maior = maiorNumero(numeros);
		
		System.out.println("O maior número é:" + maior);
	}
	
	}


