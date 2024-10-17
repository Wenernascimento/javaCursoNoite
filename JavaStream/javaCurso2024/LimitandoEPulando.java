package javaCurso2024;
import java.util.List;

public class LimitandoEPulando {

	public static void main(String[] args) {
		// Criando uma lista de nomes
		List<String> nomes = List.of("Ana", "Carlos", "Beatriz", "Pedro", "Wener");
		// Exibindo os três primeiros elementos:
		System.out.println("Três primeiros elementos:");
		nomes.stream()
		.limit(3)
	.forEach(System.out::println);
		
		// Pulando os dois primeiros elementos e exibindo o restante
		System.out.println("\nPulando os dois primeiros elementos");
	nomes.stream()
	.limit(2)
	.forEach(System.out::println);
	
	}

}
