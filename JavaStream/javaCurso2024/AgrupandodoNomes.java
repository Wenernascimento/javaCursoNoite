package javaCurso2024;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AgrupandodoNomes {

	public static void main(String[] args) {
		// criando uma lista de nomes
	
		List<String> nomes = List.of("Ana", "Carlos","Beatriz","Pedro", "Luiza"); 
		// Agrupando os nomes pelo tamanho
		
		Map<Integer, List<String>> nomesAgrupados = nomes.stream()
         .collect(Collectors.groupingBy(String::length));
		// Imprimindo o resultado
		for (Map.Entry<Integer, List<String>> entry : nomesAgrupados.entrySet()) {
			System.out.println("Tamanho" + entry.getKey() + ":" + entry.getValue());
		}
	}

}
