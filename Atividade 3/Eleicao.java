package ATIVIDADES;

import java.util.Scanner;

public class Eleicao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int candidatoA = 0, candidatoB = 0, brancos = 0, nulos = 0, totalVotos = 0, contadorB = 0;
        double percentualCandidatoA, percentualCandidatoB, percentualBrancos, percentualNulos;
        int voto;

        do {
            System.out.println("Escolha seu candidato ou tecle zero para encerrar\n");
            System.out.println("  1 -> Candidato A");
            System.out.println("  2 -> Candidato B");
            System.out.println("  3 -> Branco");
            System.out.println("\nQualquer número diferente de 0, 1, 2 e 3 anulará o seu voto");
            System.out.print("Digite seu voto: ");

            voto = scanner.nextInt();

            if (voto == 0) {
                System.out.println("Votação encerrada!\n");

            } else if (voto == 1) {
                candidatoA++;

            } else if (voto == 2) {
                contadorB++;
                if (contadorB % 3 != 0) {
                    candidatoB++;
                } else {
                    nulos++;
                    System.out.println("Terceiro voto no candidato B anulado!\n");
                }

            } else if (voto == 3) {
                brancos++;

            } else {
                nulos++;
            }

        } while (voto != 0);

        totalVotos = candidatoA + candidatoB + brancos + nulos;

        if (totalVotos > 0) {
            percentualCandidatoA = (candidatoA * 100.0) / totalVotos;
            percentualCandidatoB = (candidatoB * 100.0) / totalVotos;
            percentualBrancos = (brancos * 100.0) / totalVotos;
            percentualNulos = (nulos * 100.0) / totalVotos;

            System.out.println("\nTotal de votos: " + totalVotos + "\n");
            System.out.println("Candidato A: " + candidatoA + " voto(s). " + percentualCandidatoA + " % do total");
            System.out.println("Candidato B: " + candidatoB + " voto(s). " + percentualCandidatoB + " % do total");
            System.out.println("Brancos: " + brancos + " voto(s). " + percentualBrancos + " % do total");
            System.out.println("Nulos: " + nulos + " voto(s). " + percentualNulos + " % do total");
        }

        scanner.close();
    }
}
