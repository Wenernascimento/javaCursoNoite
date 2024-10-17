package javaCurso2024;

public class OperaConta {

	public static void main(String[] args) {
// Criação de conta com saldo inicial de R$ 1000,00:
		ContaBancaria conta = new ContaBancaria(1000.00);

		// Operando a conta do Cliente:
		// Exibir o saldo inicial da conta:
		System.out.println("Saldo Inicial " + conta.getSaldo());
		// Realiazando um depósito:
		conta.depositar(3);
		System.out.println("Saldo após o deposito de R$" + conta.getSaldo());

		// fazer um saque
		conta.sacar(250);
		System.out.println("Saldo após o deposito de R$" + conta.getSaldo());

	}

}
