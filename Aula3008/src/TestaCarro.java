import java.util.Scanner;

public class TestaCarro {

	public static void main(String[] args) {
		Carro carro1 = new Carro();
		Scanner scan = new Scanner(System.in);
		
		
		carro1.marca = scan.next();
		carro1.modelo = scan.next();
		carro1.placa = scan.next();
		
		carro1.imprimirDados();
		
	}

}
