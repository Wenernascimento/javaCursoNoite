package javaCurso2024;
import java.util.Scanner;

public class ConversorSemIf {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

try { 
	// Solicita ao usuário que insira um número:
	System.out.println("Por favor, insira um número:");
	String entrada = sc.nextLine();

	// Tenta converter a entrada para inteiro:
	int numero = Integer.parseInt(entrada);
	
	// exibe o numero se a conversão for bem sucedida:
	System.out.println("Você inseriu o numero:" + numero);

      } catch(NumberFormatException e) {
    	  // Captura o erro se a conversão falhar(exemplo: o usúario inseriou texto em vez de numero)
    	  System.out.println("Erro: Entrada inválida, por favor, insira um numero válido");
      } finally {
    	  // Sempre executa essa parte, independente de erro:
    	  System.out.println("Fim do Programa!");
      }
           sc.close();
}
}



