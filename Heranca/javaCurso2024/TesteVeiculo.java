package javaCurso2024;

public class TesteVeiculo {
public static void main(String[] args) {
	Carro carro = new Carro("Toyota", "Corrola",2004, 4);
	Moto moto = new Moto("Honda", "CB500", 2019, true);
	Carro carro1 = new Carro("Vectra","Chevrole", 2010,4);
	Moto moto1 = new  Moto("Bike", "moto 2", 2020, true);
	
	System.out.println("Detalhes do Carro");
	carro.exibirDetalhes();
	System.out.println("\nDetalhes da Moto:");
    moto.exibirDetalhes();	
    
    System.out.println("Detalhes do Carro");
	carro.exibirDetalhes();
	System.out.println("\nDetalhes da Moto:");
    moto1.exibirDetalhes();	

}
}
