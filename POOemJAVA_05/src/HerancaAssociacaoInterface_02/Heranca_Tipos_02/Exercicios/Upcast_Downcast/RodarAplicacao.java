package HerancaAssociacaoInterface_02.Heranca_Tipos_02.Exercicios.Upcast_Downcast;

public class RodarAplicacao {
    public static void main(String[] args) {
        
        Funcionario funcionario = new Funcionario();

        //Upcast - cria um objeto a partir da classe Funcionario
        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();

        //Downcast - faz o inverso de Upcast
        //Gerente gerente_ = new Funcionario();
        Vendedor vendedor_ = (Vendedor) new Funcionario();//Evitar usar Downcast na OO, pois vai dar erro
        //na hora de rodar o programa.

    }
}