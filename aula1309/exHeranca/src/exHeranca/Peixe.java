package exHeranca;

public class Peixe extends Animal {
	String caracteristica;
	
	public Peixe(String nome, float comprimento,int numeroPatas, String cor, String ambiente, float velocidadeMedia, String caracteristica) {
		super(nome,comprimento,numeroPatas,cor,ambiente,velocidadeMedia);
		this.caracteristica = caracteristica;
	}
	public Peixe() {
		
	}
	public void setCaracteristica(String caracteristica) {
		this.caracteristica = caracteristica;
	}
	
	public String setCaracteristica() {
		return caracteristica;
	}
	
	public void imprimirDadosPeixe() {
		super.imprimirDados();
		System.out.println("Caracteristica : " + caracteristica + "\n");
	}
}
