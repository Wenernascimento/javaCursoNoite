package javaCursoNoite;

import java.util.List;
import java.util.Arrays;

public class RemoveDuplicatesExample {

	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(10, 20, 30, 20, 40, 100, 75, 75, 50);
		System.out.println("Elementos únicos");
		numeros.stream().distinct()// Remove duplicatas
				.forEach(System.out::println);
	}

}
                              