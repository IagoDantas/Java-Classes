package exHeranca;

public class Mamifero extends Animal{
	String alimento;
	
	public Mamifero(String nome, float comprimento,int numeroPatas, String cor, String ambiente, float velocidadeMedia, String alimento) {
		super(nome,comprimento,numeroPatas,cor,ambiente,velocidadeMedia);
		this.alimento = alimento;
	}
	
	public Mamifero() {
		
	}
	
	
	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}
	
	public String getAlimento() {
		return alimento;
	}
	
	public void imprimirDadosMamifero() {
		super.imprimirDados();
		System.out.println("Alimento : " + alimento + "\n");
	}
}
