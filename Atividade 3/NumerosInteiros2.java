package ATIVIDADES;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class NumerosInteiros2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int saoPares = 0;
        ArrayList<Integer> numerosPares = new ArrayList<>();

        System.out.print("Quantos números você deseja digitar: ");
        int quantidadeDeNumeros = input.nextInt();

        int[] numeros = new int[quantidadeDeNumeros];

        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("Entre com a posição %d: ", i + 1);
            numeros[i] = input.nextInt();

            // usando o operador ternário para contagem dos númeroas pares
            saoPares += (numeros[i] % 2 == 0) ? 1 : 0;

            // usando ternário para adicionar na lista
            numerosPares.add((numeros[i] % 2 == 0) ? numeros[i] : null);
        }

        // removendo os nulls da lista (gerados pelo ternário)
        numerosPares.removeIf(n -> n == null);

        System.out.println();

        // mensagem para quantidade de números
        String msgNumeros = (numeros.length == 1)
                ? "O número digitado é: "
                : "Os números digitados são: ";

        System.out.println(msgNumeros + Arrays.toString(numeros));

        // mensagem para quantidade de pares
        String msgPares = (saoPares == 1)
                ? "A quantidade de números pares é " + saoPares + ".\n" + numerosPares + " é um número par"
                : (saoPares == 0)
                    ? "Nenhum número par foi digitado."
                    : "Desses números apenas " + saoPares + " são pares.\nOs números pares são: " + numerosPares;

        System.out.println(msgPares);

        input.close();
    }
}