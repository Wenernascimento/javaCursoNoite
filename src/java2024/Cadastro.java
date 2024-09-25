package java2024;

import java.util.Scanner;

public class Cadastro {

	public static void main(String[] args) {
		// TODO Stub de método gerado automaticamente

		    	Scanner scan = new Scanner(System.in);
		    	
		    	System.out.println("Digite o nome do produto: ");
		    	
		    	String nome = scan.nextLine();
		    	
		    	System.out.println("Digite a quantidade: ");
		    	
		    	String quantidade = scan.nextLine();
		    	
		    	
		    	System.out.println("Digite o codigo de identificação: ");
		    	
		    	String iden = scan.nextLine();
		    	


		    	
		    	System.out.println("Digite o preço: ");
		    	
		    	double preco = scan.nextDouble();
		    	
		    	
		    	
		    	System.out.println("Digite o peso do produto: ");
		    	
		    	double peso = scan.nextDouble();
		    	
		    	scan.close();
		    	
		    	System.out.println("Seu produto ficou assim:");
		    			System.out.println("nome: " + nome);
		    			System.out.println("quantidade: " + quantidade);
		    			System.out.println("preço: " + preco);
		    			System.out.println("identificação: " + iden);
		    			System.out.println("peso: " + peso);
		    			
		    	
		    	
		    	
		    	
		    
		   
		   
		    }
		
	}


