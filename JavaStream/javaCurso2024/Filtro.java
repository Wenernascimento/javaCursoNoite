package javaCurso2024;
import java.util.Arrays;
import java.util.List;

public class Filtro {

	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);
		
		// Filtrando numeros pares, impares e primos:
		//  numeros pares abaixo:
	     numeros.stream().filter(n -> n % 2 == 0 ). forEach(System.out::println);
		
		//numeros.stream().filter(n -> n % 3 == 0 ). forEach(System.out::println);
		
		//numeros.stream().filter(n -> n % 1 == 0 ). forEach(System.out::println);
		
		
		
	
		
		
		
		
	}
}
