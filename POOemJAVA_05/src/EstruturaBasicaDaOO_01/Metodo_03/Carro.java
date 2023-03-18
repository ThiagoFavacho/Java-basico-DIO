package EstruturaBasicaDaOO_01.Metodo_03;

//É responsável por definir e realizar um determindado comportamento.

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