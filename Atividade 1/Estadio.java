package ATIVIDADES;

import java.util.Scanner;  


public class Estadio {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Preços das categorias
        double precoA = 50.0;
        double precoB = 30.0;
        double precoC = 20.0;

        // Entrada de dados
        System.out.print("Quantos ingressos foram vendidos da Classe A ? ");
        int qtdA = input.nextInt();

        System.out.print("Quantos ingressos foram vendidos da Classe B ? ");
        int qtdB = input.nextInt();

        System.out.print("Quantos ingressos foram vendidos da Classe C ? ");
        int qtdC =input.nextInt();

        // Cálculo da renda dos ingressos
        double rendaA = qtdA * precoA;
        double rendaB = qtdB * precoB;
        double rendaC = qtdC * precoC;

        double rendaTotal = rendaA + rendaB + rendaC;

        System.out.println("\nRenda por categoria:");
        System.out.println("Classe A: R$ " + rendaA);
        System.out.println("Classe B: R$ " + rendaB);
        System.out.println("Classe C: R$ " + rendaC);

        System.out.println("\nRenda total: R$ " + rendaTotal);

        input.close();
    }
}
