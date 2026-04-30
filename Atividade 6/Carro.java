package ATIVIDADES;


public class Carro {

    private boolean ligado;
    private boolean emMovimento;

    // Construtor
    public Carro() {
        this.ligado = false;
        this.emMovimento = false;
    }

    public void ligar() {
        ligado = true;
        System.out.println("Carro ligado!");
    }

    public void desligar() {
        ligado = false;
        emMovimento = false;
        System.out.println("Carro desligado!");
    }

    public void movimentar() {
        if (ligado) {
            emMovimento = true;
            System.out.println("O carro está em movimento!");
        } else {
            System.out.println("O carro não pode andar. Está desligado!");
        }
    }

    public void buzinar() {
        if (emMovimento) {
            System.out.println("Biiiii!");
        } else {
            System.out.println("O carro só buzina se estiver em movimento.");
        }
    }
}