package javaCurso2024;

import java.util.Scanner;

public class ExerciciosInversaodeString {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite uma palavra:");
		String palavra = scanner.nextLine();
		
		StringBuilder 
		sb = new StringBuilder(palavra);
		sb.reverse();
		System.out.println(sb.toString());
		
		
	}

}
