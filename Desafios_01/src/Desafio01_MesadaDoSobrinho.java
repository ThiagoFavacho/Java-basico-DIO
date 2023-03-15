import java.util.Scanner;

public class Desafio01_MesadaDoSobrinho {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int entrada = leitor.nextInt();
        int mesada = 50;
        
        /*
        TODO: Crie a condição necessária para que o sobrinho
        saiba quanto dinheiro irá juntar nos meses da entrada
        */
        int totalGuardado = entrada * mesada;
        
        System.out.println(totalGuardado);
    }
}