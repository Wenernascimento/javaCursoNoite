package javaCurso2024;

public class Carro1 implements Veiculo1 {
// Construtor sem paramentros( necessário para a linha' new carro()')

	public Carro1() {
		// se hover lógica de inicialização, insira-a aqui!

	}
	@Override
	public void acelerar() {
		System.out.println("O carro esta acelerando...");
	}
	@Override // sobrescrever
	public void frear() {
		System.out.println("O carro está freando...");
	}


	
}

