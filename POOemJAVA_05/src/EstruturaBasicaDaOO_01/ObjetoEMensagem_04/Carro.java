package EstruturaBasicaDaOO_01.ObjetoEMensagem_04;

/*
 "Um objeto é a representação de um conceito/entidade do mundo real,
 que pode ser FÍSICA(bola, carro, árvore...), ou CONCEITUAL(viagem,
 estoque, compra, etc...), e possui um significado bem definido para
 um determinado software"
 */
/*
 "Mensagem é o processo de ativação de um método de um objeto. Isto
 ocorre quando uma requisição(CHAMADA) a esse método é realizada,
 assim disparando a execução de comportamento descrito por sua classe.
 Podem também ser direcionada diretamente à classe, caso a requisição
 seja a um método estático."
 */

public class Carro {
    //Atributos
    String cor;
    String modelo;
    int capacidadeTanque;

    //Construtor padrão
    Carro() {
        
    }
    
    //Construtor com parâmetros
    Carro(String cor, String modelo, int capacidadeTanque) {
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
    }

    //Getters e Setters (Adicionam dados nas variáveis)
    void setCor(String cor) {
        this.cor = cor;
    }
    String getCor() {
        return cor;
    }
    void setModelo(String modelo) {
        this.modelo = modelo;
    }
    String getModelo() {
        return modelo;
    }
    void setCapacidadeTanque(int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }
    int getCapacidadeTanque() {
        return capacidadeTanque;
    }

    //Método de Negócio- método que a Classe irá realizar
    double totalValorTanque(double valorCombustivel) {
        return capacidadeTanque * valorCombustivel;//Calcula o valor para encher o tanque
    }
    
}