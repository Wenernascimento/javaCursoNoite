package javaCurso2024;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeitorDeArquivo {
	public static void main(String[] args) {
		String caminhoDoArquivo = "C: \\ dados.txt";
		File arquivo = new File(caminhoDoArquivo);

		// Verifica se o arquivo existe
		if (!arquivo.exists()) {
			System.out.println("Erro: O arquivo não existe em " + caminhoDoArquivo);
			return;
		}
// Tenta ler o arquivo

		try (BufferedReader br = new BufferedReader(new FileReader(arquivo))) {
			String linha;
			while ((linha = br.readLine()) != null) {
				System.out.println(linha);
			}

		} catch (IOException e) {
			System.out.println("Erro ao ler o arquivo:" + e.getMessage());
		} finally {
			System.out.println("Leitura do arquivo concluida");
		}
	}

}
