package javaCurso2024;
import java.util.Random;
public class Exercicios04numerosaleatorios {

	public static void main(String[] args) {
    Random random = new Random();
    System.out.println("5 números aleatórios entre 1 e 100:");
   for (int i = 0; i < 3; i++) {
	int numeroAleatorio = random.nextInt(100) + 1;
	System.out.println(numeroAleatorio);
	
}
	}

}
