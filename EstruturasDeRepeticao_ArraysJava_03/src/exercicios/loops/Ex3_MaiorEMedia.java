package exercicios.loops;
/*
Faça um programa que leia 5 números
e informe o maior número e a
média desses números.
*/

import java.util.Scanner;

public class Ex3_MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int soma = 0;
        int maior = 0;

        int count = 0;

        do {
            System.out.println("Número: ");
            numero = scan.nextInt();

            soma = soma + numero;

            if (numero > maior){
            maior = numero;
            }

            count = count + 1;
            //System.out.println("Maior número digitado: " + maior);//Informa o maior número a cada número digitado
        } while (count < 5);

        System.out.println("Maior número digitado: " + maior);//Informa o maior número somente uma vez no término da execução do programa
        System.out.println("Média: " + (soma/5));
    }
}