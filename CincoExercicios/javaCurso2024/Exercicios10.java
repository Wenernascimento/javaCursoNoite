package javaCurso2024;
import java.util.Scanner;
public class Exercicios10 {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);


	       
	        System.out.println("Digite a primeira nota e seu peso (separados por espaço): ");
	        double nota1 = scanner.nextDouble();
	        double peso1 = scanner.nextDouble();

	        System.out.println("Digite a segunda nota e seu peso (separados por espaço): ");
	        double nota2 = scanner.nextDouble();
	        double peso2 = scanner.nextDouble();

	        System.out.println("Digite a terceira nota e seu peso (separados por espaço): ");
	        double nota3 = scanner.nextDouble();
	        double peso3 = scanner.nextDouble();

	       
	        double mediaPonderada = (nota1 * peso1 + nota2 * peso2 + nota3 * peso3) / (peso1 + peso2 + peso3);

	       
	        System.out.println("A média ponderada é: " + mediaPonderada);
	    }
	}

