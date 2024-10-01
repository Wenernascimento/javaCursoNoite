package java2024;



public class ExerciciosClasse {

	// Método para somar dois números
    public int somar(int a, int b) {
        return a + b;
    }

    // Método para subtrair dois números
    public int subtrair(int a, int b) {
        return a - b;
    }

    // Método para multiplicar dois números   

    public int multiplicar(int a, int b) {
        return a * b;
    }

    // Método para dividir dois números
    public double dividir(int a, int b) {
        if (b == 0) {
            System.out.println("Divisão por zero não é permitida.");
            return Double.NaN; // Retorna Not a Number
        } else {
            return (double) a / b;
        }
    }

    // Método para calcular a potência de um número
    public double potencia(double base, int expoente) {
        return Math.pow(base, expoente);
    }
}

		
		
	

