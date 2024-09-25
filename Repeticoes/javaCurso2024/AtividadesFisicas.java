package javaCurso2024;
import java.util.Scanner;

public class AtividadesFisicas {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

	//Exibe o menu de opçoes
		System.out.println("Escolha uma atividade Física");
System.out.println("1. Corrida");
System.out.println("2. Caminhada");
System.out.println("3. Ciclismo");

// Recebe a escolha do usuário:
int opcao = scanner.nextInt();
int calorias = 0;
String atividade = "";

// Estrutura Switch para selecionar atividade e calcular as calorias:

switch(opcao) {
case 1:
	atividade = "Corrida";
	calorias = 300;
	break;
case 2:
	atividade = "Caminhada";
	calorias = 150;
break;
case 3:
	atividade = "Ciclismo";
	calorias = 250;
	break;
default:
	System.out.println("Opção invalida! tenta novamente.");
	System.exit(0);
}
// Exibe o resultado da escolha:
System.out.println("Você escolheu a atividade: "+atividade);
System.out.println("Caloria queimada em 30 min: "+ calorias+" kal");

	//fecha o scanner:
scanner.close();


}






	}


