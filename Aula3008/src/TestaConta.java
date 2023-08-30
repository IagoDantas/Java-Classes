
public class TestaConta {

	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.nrAgencia = "1";
		conta.titular = "FULANO";
		conta.codBanco = 234;
		conta.nrConta = "01945";
		conta.saldo = 10000.0;
		conta.imprimirDados();

	}

}
