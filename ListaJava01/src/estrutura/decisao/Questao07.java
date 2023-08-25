package estrutura.decisao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Questao07 {
	public static void main(String[] args) {
		// Faça um programa na linguagem Java que receba N notas de um discente pelo
		// teclado, calcule e mostre no console a média aritmética. 
		// Informe também no console se o discente foi aprovado (média superior
		// ou igual a 7) ou reprovado.
		Scanner scanner = new Scanner(System.in);

		try {
			System.out.print("Quantas notas deseja inserir? ");
			int quantidadeNotas = scanner.nextInt();

			double somaNotas = 0;

			for (int i = 1; i <= quantidadeNotas; i++) {
				System.out.print("Digite a nota " + i + ": ");
				double nota = scanner.nextDouble();
				somaNotas += nota;
			}

			double media = somaNotas / quantidadeNotas;

			System.out.println("A média aritmética das notas é: " + media);

			if (media >= 7.0) {
				System.out.println("O discente foi aprovado!");
			} else {
				System.out.println("O discente foi reprovado.");
			}
		} catch (InputMismatchException error) {
			System.out.println("Não foi digitado um número");
		}

		scanner.close();
	}
}
