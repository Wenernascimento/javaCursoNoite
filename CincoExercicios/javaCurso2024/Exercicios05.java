package javaCurso2024;

import java.util.Scanner;

public class Exercicios05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número");
		int num1 = scanner.nextInt();
		
		System.out.print("Digite o segundo número:");
		int num2 = scanner.nextInt();
		
		System.out.print("Digite o terceiro número");
		int num3 = scanner.nextInt();
		
		int maior = num1;
		int menor = num2;
		
		if (num2 > maior) {
			maior = num2;
			}
		if (num3 > maior) {
			maior = num3;
			}
	    if (num2 < menor) {
		menor = num2;
		}
    	if (num3 <menor) {
		menor = num3;
   
		System.out.println("O maior número é:" + maior);
	    System.out.println("O menor número é:" + menor);
	}
	
	
	}
	

}
