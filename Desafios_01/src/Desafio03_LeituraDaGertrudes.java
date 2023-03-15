import java.util.Scanner;

public class Desafio03_LeituraDaGertrudes {
    public static void main(String[] args) {

        System.out.println("Qtd de páginas: ");
        Scanner leitor = new Scanner(System.in);
        int paginas = leitor.nextInt();
        int paginasLidas = 3;
        
        // TODO: Crie a condição necessária para que Getrudes saiba em quanto tempo terminará seus livros
        int dias = paginas / paginasLidas;

        System.out.println(dias + " dia(s)");
    }
}