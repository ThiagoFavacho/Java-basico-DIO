package edu.thiago.operadores;
public class Operadores1 {
    public static void main(String[] args) {
       //OPERADORES ARITIMÉTICOS

        double soma = 10.5 + 15.7;
        int subtracao = 113 - 25;
        int multiplicacao = 20 * 7;
        float divisao = 15 / 3;
        int modulo = 18 % 3;
        double resultado = (10 * 7) + (20/4);

        System.out.println(soma);
        System.out.println(subtracao);
        System.out.println(multiplicacao);
        System.out.println(divisao);
        System.out.println(modulo);
        System.out.println(resultado);
        
        
        //CONCATENAÇÃO (junção de palavras ou números)
        String concatenacao = "?";

        concatenacao = 1 + 1 + 1 + "1";
        System.out.println(concatenacao);

        concatenacao = 1 + "1" + 1 + 1;
        System.out.println(concatenacao);

        concatenacao = "1" + (1+1+1+1);
        System.out.println(concatenacao);
        
    }
}