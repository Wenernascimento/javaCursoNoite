package javaCurso2024;

public class ManipulandoStrings {

	public static void main(String[] args) {
// Criando Strings:
		String texto = "Bem vindo ao Curso intermediário de Java!";
		String texto2 = "Vamos aprender sobre Strings!";
				
				// 1. Comprimento da string:
				System.out.println("Comprimento da string: " + texto.length());
				
				//2. Concatenar Strings: 
				String textoCompleto = texto + "\n" + texto + "\n"+ texto2;
				
				System.out.println("Texto Completo:" + textoCompleto);
				
				//3. Converter para MAIÚSCULAS E minúsculas:
				//System.out.println("MAIÚSCULAS:"+ texto.toUpperCase());
				//System.out.println("minúsculas : "+ texto2.toUpperCase());
				
				// 4. Substituir uma parte da string:
				String novoTexto = texto.replace("JAVA","PHP");
			    System.out.println("texto após a substituição:" + novoTexto);
			    
			    // 5. Buscar por uma substring:
			    int posicao = texto.indexOf("curso");
			    System.out.println("Posição da palavra curso: "+ posicao);
			   
			    // 6. Verificar se uma string começa ou termina com uma substring:
			    System.out.println("Começa com  'Bem': " + texto.startsWith("bem"));

//			    //7. Dividir uma String:
//			    String nomeCompleto = "Wener Felice do Nascimento";
//			    String[] parteDoNomeCompleto = nomeCompleto.split(" ");	
//			    System.out.println("Palavras no texto completo:");
//			    for (String parteDoNome : parteDoNomeCompleto ) {
//			    	System.out.println(parteDoNome);
			    	
	           // 8. Remover espaços:
			    String textoComEspacos = " Texto          com espaços.                   ";
			    System.out.println("Texto sem espaço:" + textoComEspacos.trim().replaceAll("\\s+"," ") + "");
			    /*O comando: "\\ s+" => captura todos os espaço da string
			    * O comando "" => substitui todos os espaços por apenas 1.
			    */ 
			    
	
	}
			    
			    
	}


