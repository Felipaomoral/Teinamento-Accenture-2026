package ATIVIDADES;

import java.util.Scanner;


//Bugs encontrados no código:
//está usando i < 10 fixo (sugestão: usar um vetor.length);
//tenta usar a variável i fora do for;
//não há tratamento para quando não encontra o número desejado;


//Codicom os ajustes
public class LocalizaNumero {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int vetor[] = {1,2,3,4,5,6,7,8,9,10};

        System.out.print("Digite o número que deseja buscar: ");
        int num = input.nextInt();

        boolean achou = false;
        int posicao = -1;

        // Busca no vetor
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == num) {
                achou = true;
                posicao = i;
                break;
            }
        }

        // Resultado
        if (achou) {
            System.out.println("Achei!");
            System.out.printf("O número %d está na posição %d%n", num, posicao);
        } else {
            System.out.println("Número não encontrado.");
        }

        input.close();
    }
}
