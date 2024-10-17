package javaCursoNoite;
import java.util.List;
import java.util.Arrays;
public class LimiSkipExample {
	public static void main(String[] args) {
List<String> lista = Arrays.asList("A","B","C","D","E" );
// Exibe os três primeiros elementos da lista
System.out.println("Primeiros três elementos");
lista.stream()
.limit(3) // Limita para os três primeiros
.forEach(System.out::println);
// pule os dois primeiros elementos exibe o restante
System.out.println("\nApós pular dois primeiros elementos");
	lista.stream()
.skip(2) // pula os dois primeiros
.forEach(System.out::println);
	}

}
