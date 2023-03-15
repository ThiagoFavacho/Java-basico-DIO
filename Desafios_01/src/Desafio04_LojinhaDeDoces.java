import java.util.Scanner;

public class Desafio04_LojinhaDeDoces {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int dinheiro = leitor.nextInt();
        
        int qtdDoces = dinheiro * 2;
        
        System.out.println("O cliente obteve " + qtdDoces + " doces");
    }
}