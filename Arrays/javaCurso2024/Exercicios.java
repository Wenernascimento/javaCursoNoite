package javaCurso2024;

public class Exercicios {

	// multiplicaçao
    public int multiplicaçao(int a, int b){
			return a*b;
			}

// divisao
    public int divisao(int a, int b){
		return a/b;
		}

    //soma
    public int Soma (int a, int b){
		return a+b;
		}

    // subtracao
    public int subtracao(int a, int b){
		return a-b;
		}

//    // metodo para dividir dois numeros
//    
//    public double dividir(int a, int b) {
//    	if (b == 0) {
//    		System.out.println("Divisão por zero não é permitida.");
//    		return Double.NaN;// Retorna not a Number
//    	}else {
//    		return (double) a/b;
//    		
//    	}
//    	}
//// Método para calcular a potência de um número
//    public double potencia(double base, int expoente) {
//    	return Math.pow(base, expoente);
//    }

    public static void main(String[] args) {
    	
    	Exercicios util = new Exercicios();
		
    	System.out.println("A multiplicação entre 2 e 5 é: "+ util.multiplicaçao(2, 5)) ;
		System.out.println(" A Divisão entre 4 e 4 é " + util.divisao(4, 4));
		System.out.println(" Subtração  entre 3 e 8 é " + util.subtracao(3, 8));
		System.out.println(" Soma entre 9 e 8 é " + util.Soma(9, 8));
		
	}
    
    
}



   
    





