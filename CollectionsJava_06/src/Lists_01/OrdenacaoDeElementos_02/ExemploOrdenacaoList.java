package Lists_01.OrdenacaoDeElementos_02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
Dadas as seguintes informações sobre seus gatos, crie uma lista
e ordene essa lista exibindo:
(nome - idade - cor);

Gato1 = nome: Harry, idade: 18, cor: preto
Gato2 = nome: George, idade: 6, cor: branco
Gato3 = nome: Harry, idade: 12, cor: amarelo
 */
public class ExemploOrdenacaoList {
    public static void main(String[] args) {
        
        List<Gato> meusGatos = new ArrayList<Gato>(){{
            add(new Gato("Harry", 18, "preto"));
            add(new Gato("George", 6, "branco"));
            add(new Gato("Harry", 12, "amarelo"));
        }};

        System.out.println("--\tOrdem de Inserção\t---");
        System.out.println(meusGatos);
//============================================================================================
        System.out.println("--\tOrdem Aleatória\t---");
        Collections.shuffle(meusGatos);
        System.out.println(meusGatos);
//============================================================================================
        System.out.println("--\tOrdem Natural (Nome)\t---");
        Collections.sort(meusGatos);
        System.out.println(meusGatos);
//============================================================================================
        System.out.println("--\tOrdem Idade\t---");
        Collections.sort(meusGatos, new ComparatorIdade());//pode ser usado dessa maneira ou da maneira abaixo
        //meusGatos.sort(new ComparatorIdade());
        System.out.println(meusGatos);
//============================================================================================
        System.out.println("--\tOrdem Cor\t---");
        //Collections.sort(meusGatos, new ComparatorIdade());
        meusGatos.sort(new ComparatorCor());
        System.out.println(meusGatos);
//============================================================================================
        System.out.println("--\tOrdem Nome/Cor/Idade\t---");
        //Collections.sort(meusGatos, new ComparatorIdade());
        meusGatos.sort(new ComparatorNomeCorIdade());
        System.out.println(meusGatos);
//============================================================================================
    }
}


class Gato implements Comparable<Gato>{//A interface Comparable utilizada para comparar
    //os nomes e colocar em ordem

    private String nome;
    private Integer idade;
    private String cor;

    public Gato(String nome, Integer idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }


    public String getCor() {
        return cor;
    }

//Sobrescreve o toString e exibe a List
    @Override
    public String toString() {
        return "{nome=" + nome + ", idade=" + idade + ", cor=" + cor + "}";
    }

//Sobrescreve o compareTo e exibe (nesse caso) os apenas os nomes em ordem
    @Override
    public int compareTo(Gato gato) {
        return this.getNome().compareToIgnoreCase(gato.getNome());
    }
}

class ComparatorIdade implements Comparator<Gato> {
    @Override
    public int compare(Gato g1, Gato g2) {//Interface Comparator usada para comparar idade(Integer)
        return Integer.compare(g1.getIdade(), g2.getIdade());
    }
}

class ComparatorCor implements Comparator<Gato> {
    @Override
    public int compare(Gato g1, Gato g2) {//Interface Comparator usada para comparar cor(String)
        return g1.getCor().compareToIgnoreCase(g2.getCor());
    }
}

class ComparatorNomeCorIdade implements Comparator<Gato> {
    @Override
    public int compare(Gato g1, Gato g2) {//Interface Comparator usada para comparar Nome, Cor e Idade
        int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
        if(nome != 0) return nome;

        int cor = g1.getCor().compareToIgnoreCase(g2.getCor());
        if(cor != 0) return cor;

        return Integer.compare(g1.getIdade(), g2.getIdade());
    }
}