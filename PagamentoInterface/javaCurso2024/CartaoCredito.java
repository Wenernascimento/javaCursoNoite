package javaCurso2024;

public class CartaoCredito implements Pagamento {
@Override
public void realizarPagamento(double valor) {
	System.out.println("Pagamento deR$" + valor + "realizado com cartão de crédito");
}

	
}

