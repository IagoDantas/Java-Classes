package aula0609;

public class TestaConta {

	public static void main(String[] args) {
		// Criação da conta
		
		Conta contaCorrente = new Conta();
		
		// Inicialização
		
		contaCorrente.saldo = 1000;
		contaCorrente.nrAgencia = "15";
		contaCorrente.titular = "Iago";
		contaCorrente.nrConta = "450";
		contaCorrente.codBanco = 65;

		// Impressão dos dados da conta
		
		contaCorrente.imprimeDados();
		
		// Saque da conta
		
		contaCorrente.saque(100);
		
		// Impressão dos dados da conta
		
		contaCorrente.imprimeDados();
		
		// Deposito em conta
		
		contaCorrente.deposito(2000);
		
		// Impressão dos dados da conta
		
		contaCorrente.imprimeDados();
		
		// Impressão do saldo da conta, utilizando o método getSaldo()
		
		double saldo = contaCorrente.getSaldo();
		System.out.println(saldo);
		
	}

}
