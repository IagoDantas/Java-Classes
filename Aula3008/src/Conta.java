
public class Conta {
	double saldo;
	String nrAgencia;
	String titular;
	String nrConta;
	int codBanco;
	
	public void imprimirDados() {
		System.out.println("* --------------");
		System.out.println("* AGENCIA: " + nrAgencia + "  BANCO: " + codBanco);
		System.out.println("* CONTA CORRENTE: " + nrConta);
		System.out.println("* TITULAR: " + titular);
		System.out.println("* SALDO: R$" + saldo);
		System.out.println("* --------------");
	}
}
