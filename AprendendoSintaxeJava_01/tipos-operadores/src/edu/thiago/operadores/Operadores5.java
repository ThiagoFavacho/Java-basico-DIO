package edu.thiago.operadores;

public class Operadores5 {
    public static void main(String[] args) {
        //OPERADORES RELACIONAIS COM STRINGS
        String nome1 = "Thiago";
        String nome2 = new String ("Thiago");

        System.out.println(nome1.equals(nome2)); //equals faz verficação entre String e Objetos (new String).

        //OPERADORES RELACIONAIS COM NÚMEROS
        int num1 = 1;
        int num2 = 2;

        boolean simNao = num1==num2;

        if (num1 < num2) {
            System.out.println("Está condição é Verdadeira");
        }

        System.out.println("num1 é igual a num2? " + simNao);

        simNao = num1!=num2;

        System.out.println("num1 é diferente de num2? " + simNao);

        simNao = num1>num2;

        System.out.println("num1 é maior que num2? " + simNao);
    }
}