package javaCurso2024;

import java.util.Scanner;
public class CalcJurosSimples {

	public static void main(String[] args) {
//Instaciando a classe scanner para Usua -la 
		Scanner scanner = new Scanner(System.in);

		// Entrada dos valores
		
		System.out.println("Capital a investir(R$);");
		double capital = scanner.nextDouble();	
		System.out.println("Qual é a taxa de juros (%):");
	double taxa = scanner.nextDouble();
	
	System.out.println("Tempo em anos:");
	int tempo = scanner.nextInt();
	// Calculo dos juros simples:
	double juros = (capital * taxa* tempo)/100;
	System.out.println("O Valor dos juros é: "+ juros);
	
	// Resultado Final 
	
	double total = capital + juros;
	System.out.println("Capital inicial + Juros: "+ total);
	scanner.close();
	
	
}
	

}
