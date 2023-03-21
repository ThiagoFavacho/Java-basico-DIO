package PacotesEVisibilidades_03.outroPacote_04;

import PacotesEVisibilidades_03.VisibilidadeOuModificadoresDeAcesso_03.Classe1;

public class Classe4 {
    
    Classe1 classe1;

    void metodo() {

        //atributo3
        //classe1.atributo3 - só acessa o atributo que é public da Classe1

        //metodo3
        //classe1.metodo3(); - só acessa o método que é public da Classe1
    }
}