package exHeranca;

public class TestarAnimais {

	public static void main(String[] args) {
		Mamifero camelo = new Mamifero();
		camelo.setNome("Camelo");
		camelo.setComprimento(150f);
		camelo.setNumeroPatas(4);
		camelo.setCor("Amarelo");
		camelo.setAmbiente("Terrestre");
		camelo.setVelocidadeMedia(20f);
		camelo.setAlimento(null);
		
		Peixe tubarao = new Peixe();
		tubarao.setNome("Tubarao");
		tubarao.setComprimento(300f);
		tubarao.setNumeroPatas(0);
		tubarao.setCor("Cinzento");
		tubarao.setAmbiente("Marinho");
		tubarao.setVelocidadeMedia(1.5f);
		tubarao.setCaracteristica("Barbatanas e cauda");
		
		Mamifero ursocanada = new Mamifero();
		ursocanada.setNome("Urso-do-canada");
		ursocanada.setComprimento(180f);
		ursocanada.setNumeroPatas(4);
		ursocanada.setCor("Vermelho");
		ursocanada.setAmbiente("Terrestre");
		ursocanada.setVelocidadeMedia(0.5f);
		ursocanada.setAlimento("Mel");

		camelo.imprimirDadosMamifero();
		tubarao.imprimirDadosPeixe();
		ursocanada.imprimirDadosMamifero();

	}

}
