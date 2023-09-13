package aula1309;

public class TestaConta {

	public static void main(String[] args) {
		// Criação da conta
		
		Conta conta = new Conta();
		Poupanca contaPoupanca = new Poupanca();
		// Inicialização
		
		contaPoupanca.setSaldo(1000);
		contaPoupanca.titular = "Jose";
		contaPoupanca.codBanco = 51;
		contaPoupanca.nrAgencia = "168";
		contaPoupanca.nrConta = "455";
		
		contaPoupanca.imprimirDados();
	

	}

}
