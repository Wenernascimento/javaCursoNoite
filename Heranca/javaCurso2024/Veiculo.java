package javaCurso2024;

public class Veiculo {
	protected String marca;
	protected String modelo;
	protected int ano;

	public Veiculo(String marca, String modelo, int ano) {
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;

	}

	public void exibirDetalhes() {
		System.out.println("marca: " + marca);
		
		System.out.println("modelo: " + modelo);
	
		
		System.out.println("ano  " + ano);

	}
}
