package javaCursoNoite;
import java.util.List;
import java.util.Arrays;

public class MatchConditionsExample {
	public static void main(String[] args) {
List<Integer> numeros = Arrays.asList(10, 45,60, 20, -5);
// Verifica se algum número é maior que 50
boolean algumMaiorQue50 = numeros.stream()
.anyMatch(n -> n > 50);
System.out.println("Algum número é maior que 50?: " + algumMaiorQue50);
// Verifica se todos os números são positivos
boolean todosPositivos = numeros.stream() 
                     .allMatch(n -> n >0);
System.out.println("Todos os números são Positivo : " + todosPositivos);
// Verifica se nenhum número é negativo

boolean nenhumNegativo = numeros.stream()
                   .noneMatch(n -> n < 0);             
System.out.println("Nenhum número é negativo? :" + nenhumNegativo);



	}

}
