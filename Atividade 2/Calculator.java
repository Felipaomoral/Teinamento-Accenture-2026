package ATIVIDADES;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int opcao;

		do {
			System.out.println("\n--- MENU CALCULADORA ---");
			System.out.println("1 - Somar");
			System.out.println("2 - Subtrair");
			System.out.println("3 - Multiplicar (vetor)");
			System.out.println("4 - Dividir");
			System.out.println("0 - Sair");
			System.out.print("Escolha uma opção: ");

			opcao = input.nextInt();

			switch (opcao) {

				case 1:
					System.out.print("Digite o valor de x: ");
					int x1 = input.nextInt();
					System.out.print("Digite o valor de y: ");
					int y1 = input.nextInt();
					System.out.println("Resultado: " + add(x1, y1));
					break;

				case 2:
					System.out.print("Digite o valor de x: ");
					int x2 = input.nextInt();
					System.out.print("Digite o valor de y: ");
					int y2 = input.nextInt();
					System.out.println("Resultado: " + subtract(x2, y2));
					break;

				case 3:
					System.out.print("Quantos números deseja multiplicar? ");
					int n = input.nextInt();

					int[] nums = new int[n];

					for (int i = 0; i < n; i++) {
						System.out.print("Digite o número " + (i + 1) + ": ");
						nums[i] = input.nextInt();
					}

					System.out.println("Resultado: " + multiply(nums));
					break;

				case 4:
					System.out.print("Digite o valor de x: ");
					int x4 = input.nextInt();
					System.out.print("Digite o valor de y: ");
					int y4 = input.nextInt();
					System.out.println("Resultado: " + divide(x4, y4));
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

	private static int add(int x, int y) {
		return x + y;
	}

	private static int subtract(int x, int y) {
		int diff;
		if (x > y) {
			diff = x - y;
		} else {
			diff = y - x;
		}
		return diff;
	}

	private static int multiply(int[] numbers) {
		int temp = 1;

		for (int i = 0; i < numbers.length; i++) {
			temp = temp * numbers[i];
		}
		return temp;
	}

	private static int divide(int x, int y) {
		if (y == 0) {
			System.out.println("Erro: divisão por zero!");
			return 0;
		}
		return x / y;
	}
}

