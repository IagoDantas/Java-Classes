package aula1309;


public class Conta {
	private String nrAgencia;
	private String titular;
	private String nrConta;
	private int codBanco;
	
	
	
	public Conta(String nrAgencia,String titular, String nrConta, int codBanco)
	{
		this.nrAgencia = nrAgencia;
		this.titular = titular;
		this.nrConta = nrConta;
		this.codBanco = codBanco;
		
	}
	 
	public void setNrAgencia(String nrAgencia) {
		this.nrAgencia = nrAgencia;
	}
	
	public String getNrAgencia()
	{
		return nrAgencia;
	}
	
	public void setNrConta(String nrConta)
	{
		this.nrConta = nrConta;
	}
	
	public String getNrConta() {		
		return nrConta;
	}
	
	public String getTitular() {
		return titular;
	}
	
	public void SetTitular(String titular) {
		this.titular = titular;
	}
	
	public int getCodBanco() {
		return codBanco;
	}
	
	public void setCodBanco(int codBanco) {
		this.codBanco = codBanco;
		
	}
	
	public Conta() {
		
	}
	

	
	public void imprimirDados() {
		System.out.println("\n----------------------------");
		 System.out.println("AGENCIA:\t"+nrAgencia+"\t BANCO:\t"+codBanco);
		 System.out.println("Conta: \t"+nrConta);
		 System.out.println("TITULAR: \t"+titular);
		 System.out.println("-----------------------------\n");
	}
}
