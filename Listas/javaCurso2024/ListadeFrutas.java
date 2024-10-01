package javaCurso2024;

//importando classes prontas do Java:
import java.util.Scanner; //Perguntar coisas pro usuario
import java.util.ArrayList; //Criar lista de array dinamico

public class ListadeFrutas {

	public static void main(String[] args) {
		// Creating an Array list to store the fruits
		ArrayList<String> frutas = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		String fruta;

		System.out.println("Digite os nomes das frutas(ou digite 'sair' para encerrar):");

		// Loop para add frutas ao ArrayList até o usuário digitar "sair":
		while (true) {
			System.out.println("Digite o nome da fruta: ");
			fruta = sc.nextLine();

			if (fruta.equalsIgnoreCase("sair")) {
				break;
			}
			frutas.add(fruta);// Adiciona a fruta ao ArrayList;
		}

		// Exibir todas as frutas inseridas:
		System.out.println("\nFrutas inseridas: ");
		for (String f : frutas) {
			System.out.println(f);
		}
		sc.close();

	}

}