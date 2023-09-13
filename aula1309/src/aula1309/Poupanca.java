package aula1309;

public class Poupanca extends Conta {
	private double saldo;
		
	public Poupanca(double saldo, String titular, String nrAgencia, String nrConta, int codBanco)
	{
		super(titular,nrAgencia,nrConta,codBanco);
		this.saldo = saldo;
	}
	
	
	public Poupanca() {
		
	}
	
	public void setSaldo(double saldo){
		this.saldo = saldo;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void imprimirDados() {
		super.imprimirDados();
		System.out.println("Saldo " + saldo);
	}
}
