public class Usuario {
    public static void main(String[] args) {

        //Instanciando/Criando uma nova SmartTv
        SmartTv smartTv = new SmartTv();

        //Chamando os métodos diminuir e aumentarVolume
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        System.out.println("Canal atual: " + smartTv.canal);
        smartTv.mudararCanal(13);
        System.out.println("Canal atual: " + smartTv.canal);

        System.out.println("Volume atual: " + smartTv.volume);

        System.out.println("Tv está ligada?: " + smartTv.ligada);
        System.out.println("Qual o canal atual?: " + smartTv.canal);
        System.out.println("Em qual volume a Tv está?: " + smartTv.volume);

        //Chamando método "ligar"
        smartTv.ligar();
        System.out.println("Novo Status - Tv está ligada?: " + smartTv.ligada);

        //Chamando método "desligar"
        smartTv.desligar();
        System.out.println("Novo Status - Tv está ligada?: " + smartTv.ligada);
        
    }    
}