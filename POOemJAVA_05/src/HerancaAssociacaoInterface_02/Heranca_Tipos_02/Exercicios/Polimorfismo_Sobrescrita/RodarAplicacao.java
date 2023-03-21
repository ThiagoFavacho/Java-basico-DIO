package HerancaAssociacaoInterface_02.Heranca_Tipos_02.Exercicios.Polimorfismo_Sobrescrita;

public class RodarAplicacao {
    public static void main(String[] args) {

        /*Nesse exemplo haverá o POLIMORFISMO, pois será impresso no terminal
        os métodos que encontram-se nas 3 classes.*/
        ClasseMae[] classes = new ClasseMae[] {new ClasseFilha1(), new ClasseFilha2(), new ClasseMae()};

        for (ClasseMae classe: classes) {
            classe.metodo1();
        }

        System.out.println("");

        for (ClasseMae classe: classes) {
            classe.metodo2();
        }

        System.out.println("");

        /*Nesse exemplo haverá a SOBRESCRITA, pois será impresso no terminal
        apenas o método 2 que encontra-se na ClasseFilha2.*/
        ClasseFilha2 classeFilha2 = new ClasseFilha2();
        classeFilha2.metodo2();//chama apenas o metodo2
    }

}