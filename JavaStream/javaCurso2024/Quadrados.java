package javaCurso2024;
import java.util.ArrayList;
import java.util.List;

public class Quadrados {
  public static void main(String[] args) {
// Criando uma Lista de números
	  List<Integer> numeros = List.of(1,2, 3, 4, 5);
	  List<Integer> quadrados = new ArrayList<>();
	  
	  // Calculando o quadrado de cada número
	  for (Integer numero : numeros) {
		  quadrados.add(numero * numero);
	  }
	  // imprimindo a lista de quadrados:
	  System.out.println("Quadrados:" + quadrados);
	  

	}

}
