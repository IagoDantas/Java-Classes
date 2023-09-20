public class Eleitoral {
    String nome;
    int idade;

    public void imprimirDados(){
        System.out.println("Nome: \t"+nome);
        System.out.println("Idade: \t"+idade);
        verificar();
    }

    public void verificar(){
        if(idade < 16 ){
            System.out.println("O Eleitor não pode votar");
        }
        else if(idade >= 16 && idade <= 65){
            System.out.println("O Eleitor deve Votar");
        }
        else {
            System.out.println("Voto facultativo");
        }
    }

}
