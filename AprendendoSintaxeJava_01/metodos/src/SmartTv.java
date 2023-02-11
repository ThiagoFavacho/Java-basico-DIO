public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    //Criando método para mudar de canal adicionando um número específico
    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }
    
    //Criando método para aumentar canal
    public void aumentarCanal(){
        //canal = canal + 1;
        canal++;
    }

    //Criando método para diminuir canal
    public void diminuirCanal(){
        //canal = canal - 1;
        canal--;
    }
    
    //Criando método para aumentar volume
    public void aumentarVolume(){
        //volume = volume + 1;
        volume++;
    }

    //Criando método para diminuir volume
    public void diminuirVolume(){
        //volume = volume - 1;
        volume--;
    }

    //Criando método para mudar estado da Tv para "ligada/true"
    public void ligar(){
        ligada = true;
    }

    //Criando método para mudar estado da Tv para "desligada/false"
    public void desligar(){
        ligada = false;
    }
}
