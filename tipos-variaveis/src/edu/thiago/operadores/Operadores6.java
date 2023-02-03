package edu.thiago.operadores;

public class Operadores6 {
    public static void main(String[] args) {
        //OPERADORES LÓGICOS
        boolean condicao1 = true;
        boolean condicao2 = true;

        if(condicao1 && condicao2){ //Se as duas condições forem verdadeiras imprime a msg abaixo.
            System.out.println("As duas condições são verdadeiras");
        }

        if(condicao1 || condicao2){ //Se uma das duas condições forem verdadeiras imprime a msg abaixo.
            System.out.println("Uma das condições é verdadeira");
        }

        System.out.println("Fim");
    }
}