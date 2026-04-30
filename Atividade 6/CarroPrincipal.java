package ATIVIDADES;

public class CarroPrincipal {

    public static void main(String[] args) {

        Carro carro = new Carro();

        // Tentando buzinar parado
        carro.buzinar();

        // Tentando movimentar desligado
        carro.movimentar();

        // Ligando o carro
        carro.ligar();

        // Agora pode se mover
        carro.movimentar();

        // Agora pode buzinar
        carro.buzinar();

        // Desligando
        carro.desligar();
    }
}
