package Set_02.Exemplo_01;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/*dadas as seguintes informações sobre minhas séries favoritas,
crie um conjunto e ordene este conjunto exibindo:
(nome - genero - tempo de episodio);

Serie1 = Nome: got, genero: fantasia, tempoEpisodio: 60
Serie2 = nome: dark, genero: drama, tempoEpisodio: 60
Serie3 = nome: that '70s show, genero: comedia, tempoEpisodio: 25 
*/

public class ExemploOrdenacaoSet_02 {
    public static void main(String[] args) {
        System.out.println("--\tOrdem Aleatória\t--");
        Set<Serie> minhasSeries = new HashSet<Serie>(){{
            add(new Serie("got", "fantasia", 60));
            add(new Serie("dark", "drama", 60));
            add(new Serie("that '70s show", "comédia", 25));
        }};
        for (Serie serie : minhasSeries) {
            System.out.println(serie.getNome() + " - " 
                                + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }
//=======================================================================================================
        System.out.println("--\tOrdem de Inserção\t--");
                Set<Serie> minhasSeries1 = new LinkedHashSet<Serie>() {{
                    add(new Serie("got", "fantasia", 60));
                    add(new Serie("dark", "drama", 60));
                    add(new Serie("that '70s show", "comédia", 25));
                }};
                for (Serie serie : minhasSeries1) {
                    System.out.println(serie.getNome() + " - " 
                                        + serie.getGenero() + " - " + serie.getTempoEpisodio());
                }
//=======================================================================================================
        System.out.println("--\tOrdem Natural (TempoEpisodio)\t--");
        Set<Serie> minhasSeries2 = new TreeSet<>(minhasSeries1);

        System.out.println(minhasSeries2); //antes de imprimir é necessário implementar o Comparable  na classe Serie
        for (Serie serie : minhasSeries2) {
            System.out.println(serie.getNome() + " - " 
                                + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }
//=======================================================================================================
        System.out.println("--\tOrdem Nome/Gênero/TempoEpisodio\t--");
        Set<Serie> minhasSeries3 = new TreeSet<>(new ComparatoNomeGeneroTempoEpisodio());
        minhasSeries3.addAll(minhasSeries);
        for (Serie serie : minhasSeries3) {
            System.out.println(serie.getNome() + " - " 
                                + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }
//=======================================================================================================
        System.out.println("--\tOrdem (gênero)\t--");
        Set<Serie> minhasSeries4 = new TreeSet<>(new ComparatorGenero());
        minhasSeries4.addAll(minhasSeries);
        for (Serie serie : minhasSeries4) {
            System.out.println(serie.getNome() + " - " 
                                + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }
//=======================================================================================================
        System.out.println("--\tOrdem (TempoEpisodio)\t--");
        Set<Serie> minhasSeries5 = new TreeSet<>(new ComparatorTempoEpisodio());
        minhasSeries5.addAll(minhasSeries);
        for (Serie serie : minhasSeries5) {
            System.out.println(serie.getNome() + " - " 
                                + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }
    }
}

class Serie implements Comparable<Serie> {
    private String nome;
    private String genero;
    private Integer tempoEpisodio;

    public Serie(String nome, String genero, Integer tempoEpisodio) {
        this.nome = nome;
        this.genero = genero;
        this.tempoEpisodio = tempoEpisodio;
    }
    
    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public Integer getTempoEpisodio() {
        return tempoEpisodio;
    }

    @Override
    public String toString() {
        return "{nome=" + nome +
                ", genero=" + genero +
                 ", tempoEpisodio=" + tempoEpisodio + "}";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((genero == null) ? 0 : genero.hashCode());
        result = prime * result + ((tempoEpisodio == null) ? 0 : tempoEpisodio.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Serie other = (Serie) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (genero == null) {
            if (other.genero != null)
                return false;
        } else if (!genero.equals(other.genero))
            return false;
        if (tempoEpisodio == null) {
            if (other.tempoEpisodio != null)
                return false;
        } else if (!tempoEpisodio.equals(other.tempoEpisodio))
            return false;
        return true;
    }

    @Override
    public int compareTo(Serie serie) {
        int tempoEpisodio = Integer.compare(this.tempoEpisodio, serie.getTempoEpisodio());
        if(tempoEpisodio != 0) return tempoEpisodio;

        return this.getGenero().compareTo(serie.getGenero());
    }
 
}

class ComparatoNomeGeneroTempoEpisodio implements Comparator<Serie> {

        @Override
        public int compare(Serie s1, Serie s2) {
            int nome = s1.getNome().compareTo(s2.getNome());
            if(nome != 0) return nome;

            int genero = s1.getGenero().compareTo(s2.getGenero());
            if(genero != 0) return genero;
            
            return Integer.compare(s1.getTempoEpisodio(), s2.getTempoEpisodio());
        }   
}

class ComparatorGenero implements Comparator<Serie> {

    @Override
    public int compare(Serie s1, Serie s2) {
        return s1.getGenero().compareToIgnoreCase(s2.getGenero());
    }
}

class ComparatorTempoEpisodio implements Comparator<Serie> {

    @Override
    public int compare(Serie s1, Serie s2) {

            int tempoEpisodio = s1.getTempoEpisodio().compareTo(s2.getTempoEpisodio());
            if(tempoEpisodio != 0) return tempoEpisodio;

            int nome = s1.getNome().compareTo(s2.getNome());
            if(nome != 0) return nome;

            int genero = s1.getGenero().compareTo(s2.getGenero());
            if(genero != 0) return genero;
            
            return Integer.compare(s1.getTempoEpisodio(), s2.getTempoEpisodio());
    }
}