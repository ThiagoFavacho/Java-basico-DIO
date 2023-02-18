package exercicios.arrays;

/*
Crie um vetor de seis números inteiros
e mostre-os na ordem inversa.
*/

public class Ex1_OrdemInversa {
    public static void main(String[] args) {

        int[] vetor = {-1, -5, 15, 50, 8, 4};

        System.out.println("Vetor: ");
        int count = 0;
        while (count < (vetor.length)) {
            System.out.print(vetor[count] + " ");
            count++;
        }

        System.out.println("\nVetor inverso: ");

        for (int i = (vetor.length-1); i >= 0; i--) {
            System.out.print(vetor[i] + " ");
        }
    }
}