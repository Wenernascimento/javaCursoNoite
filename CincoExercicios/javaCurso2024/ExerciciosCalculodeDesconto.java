package javaCurso2024;
import java.util.Scanner;
public class ExerciciosCalculodeDesconto {

public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite o preço original do produto: R$ ");
        double precoOriginal = scanner.nextDouble();

        System.out.print("Digite o percentual de desconto: ");
        double percentualDesconto = scanner.nextDouble();

       
        double valorDesconto = precoOriginal * (percentualDesconto / 100);

        
        double precoFinal = precoOriginal - valorDesconto;

       
        System.out.println("O preço final com desconto é: R$ " + precoFinal);
    }
}
