public class Lampada {
    boolean status;

    public void ligar(){
        status = true;
    }
    public void desligar(){
        status = false;
    }

    public void observar(){
        if(status == true)
        {
            System.out.println("Esta lâmpada está ligada");
        }
        else{
            System.out.println("Esta lâmpada está desligada");
        }

    }

}
