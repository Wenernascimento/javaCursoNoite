package javaCurso2024;

public class PagamentoPrincipal {

	public static void main(String[] args) {
		double valorPagamento = 100.00; // valor ser pago
		
		String formaPagamento = "Boleto"; // escolha da forma de pagamento

		Pagamento pagamento;
// Determinando a forma de pagamento
		if (formaPagamento.equalsIgnoreCase("CartaoCredito")) {
			pagamento = new CartaoCredito();
		
		} else if (formaPagamento.equalsIgnoreCase("Boleto")) {
			pagamento = new Boleto();

		} else {
			System.out.println("Forma de pagamento inválida");
			return;
		}
	// Realizando o pagamento
		pagamento.realizarPagamento( valorPagamento );
	 
	}

}
