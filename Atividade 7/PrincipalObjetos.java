package ATIVIDADES;

import java.util.Scanner;

public class PrincipalObjetos {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite o nome da pessoa: ");
        String nome = input.nextLine();

        System.out.print("Digite o endereço da casa: ");
        String endereco = input.nextLine();

        System.out.print("Digite o modelo do carro: ");
        String modelo = input.nextLine();

        System.out.print("Digite o tipo da árvore: ");
        String tipo = input.nextLine();

        // Criando objetos
        Casa casa = new Casa(endereco);
        Carro carro = new Carro(modelo);
        Arvore arvore = new Arvore(tipo);

        Joao joao = new Joao(nome, casa, carro);

        int opcao;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Mostrar onde João mora");
            System.out.println("2 - Mostrar carro que João dirige");
            System.out.println("3 - Mostrar tipo da árvore");
            System.out.println("0 - Sair");
            System.out.print("Einputolha: ");

            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    joao.morar();
                    break;
                case 2:
                    joao.dirigir();
                    break;
                case 3:
                    arvore.exibirTipo();
                    break;
                case 0:
                    System.out.println("Encerrando...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        input.close();
    }
}

// Classe base (Herança)
class Pessoa {
    protected String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }
}

// João herda de Pessoa
class Joao extends Pessoa {

    private Casa casa;
    private Carro carro;

    public Joao(String nome, Casa casa, Carro carro) {
        super(nome);
        this.casa = casa;
        this.carro = carro;
    }

    public void morar() {
        System.out.println(nome + " mora em: " + casa.getEndereco());
    }

    public void dirigir() {
        System.out.println(nome + " dirige o carro: " + carro.getModelo());
    }
}

// Classe Casa
class Casa {
    private String endereco;

    public Casa(String endereco) {
        this.endereco = endereco;
    }

    public String getEndereco() {
        return endereco;
    }
}

// Classe Carro
class Carro {
    private String modelo;

    public Carro(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }
}

// Classe Árvore
class Arvore {
    private String tipo;

    public Arvore(String tipo) {
        this.tipo = tipo;
    }

    public void exibirTipo() {
        System.out.println("Árvore do tipo: " + tipo);
    }
}