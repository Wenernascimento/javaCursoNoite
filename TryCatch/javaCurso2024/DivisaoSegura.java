package javaCurso2024;

import java.util.Scanner;

public class DivisaoSegura {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o primeiro número:");
		int numerador = scanner.nextInt();
		System.out.println("Digite o segundo número:");
		int denominador = scanner.nextInt();

		try {
			// Verificar se o denominador é zero
			if (denominador == 0) {
				throw new ArithmeticException("Erro: não é possivel dividir pr zero ");
			}

// Realiza a divisão 
			int resultado = numerador / denominador;
			System.out.println("Resultado:" + resultado);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Fim da operação.");
			scanner.close(); // fecha o scanner
		}
	}
}
