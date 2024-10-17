package javaCurso2024;

public class Cap8_Lab2 {

	public static int maiorNumero(int[] numeros) {
		if (numeros == null || numeros.length == 0) {
			throw new IllegalArgumentException("O array não pode ser nulo ou vazio");
			}
		int maior = numeros[0];// Inicializa com o primeiro elemento do array
		for (int numero : numeros) {
			if (numero > maior) {
				maior = numero; // Atualiza o maior numero encontrado
			}
		}

	return maior; // Retorna o maior número
		}

	public static void main(String[] args) {
// Declaração e inicialização do array
		
		int[] numeros = {10, 20,30, 40, 50}; // você pode adicionar quantos numeros quiser
		
		// Chamada ao método maiorNumero e armazenamento do resultado
		int maior = maiorNumero(numeros);
		// exibir o maior número
		System.out.println("O maior número é: " + maior);
	
	
	}}

	