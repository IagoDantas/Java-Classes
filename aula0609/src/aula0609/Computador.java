package aula0609;

public class Computador {
	String marca;
	String modelo;
	
	public Computador(String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
	}
	
	public Computador() {
		// TODO Auto-generated constructor stub
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public void imprimirValor() {
		System.out.println("| MARCA: " + marca);
		System.out.println("| MODELO: " + modelo);
	
	}
}
