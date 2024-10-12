package javaCurso2024;

public class Boleto implements Pagamento {
	@ Override
	public void realizarPagamento(double valor) {
		System.out.println(" Pagamento de R$ " + valor + " realizado com boleto");
	}
	}


