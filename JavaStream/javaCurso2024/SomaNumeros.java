package javaCurso2024;
import java.util.List;
public class SomaNumeros {
public static void main(String[] args) {
// Criando uma Lista de números
	List<Integer> numeros = List.of(1, 2, 3, 4, 5);
	// Calculando a soma usado reduce
	int soma = numeros.stream()
	.reduce(0,Integer::sum );
// Imprimindo o resultado
	System.out.println(" Soma dos números" + soma);
	
	}

}
