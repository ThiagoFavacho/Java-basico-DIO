import java.util.Scanner;

public class Desafio05_IndustriaDaMulta {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int velocidadeAtual = leitor.nextInt();
        
        if (velocidadeAtual <= 68 ) {
          
          System.out.print("Nao foi multado");
          
        } else { 
          System.out.print("Foi multado");            
        }
    }
}