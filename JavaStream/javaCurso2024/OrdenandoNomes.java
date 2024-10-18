package javaCurso2024;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenandoNomes {

	public static void main(String[] args) {
		// Criando uma lista de nomes
		
		List<String> nomes = new ArrayList<>();
		nomes.add("Carlos");
		nomes.add("Ana");
		nomes.add("Pedro");
		nomes.add("Wener");
		
	// rdenando a lista em ordem alfabética
		Collections.sort(nomes);
		// Imprimindo a Lista ordenada
		System.out.println("Nome em ordem alfabética");
	for (String nome: nomes) {
		System.out.println(nome);
		
	}
	}

}
