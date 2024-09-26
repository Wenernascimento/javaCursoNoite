package javaCurso2024;

public class ClassesMetodos {

	// Método 1: calcula a soma de 2 valores:
	public int soma(int a, int b ) {
		return a + b;
		
	}
	// Método 2: Verifica se um numero é Par:
	public boolean ehPar(int numero) {
		return numero % 2 == 0;
		}
	
	// Método 3: Inverter uma String
	public String invertString(String texto) {
	return new StringBuilder(texto).reverse().toString();
	}
	// Método 4: Calcular o fatorial de um número:
	public int fatorial (int numero) {
		if (numero == 0 || numero == 1 ) {
	return 1;
		}
		return numero;
	}
	
	
	    // Este método executa outros métodos!
	    public static void main(String[] args) {
        //Instaciando a classes que criamos:
		 ClassesMetodos util = new ClassesMetodos();
		
		
		// Camando os métodos
		System.out.println("Soma de 4 e 3: " + util.soma (5,3));
		System.out.println("O número 4 é par? " + util.ehPar (5));
		System.out.println("String invertida de 'Java':" + util.invertString("Java"));
		System.out.println("O fatorial de 5 é: " + util.fatorial(5));
		
		
	    
	}

}
 