package estrutura.decisao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Questao06 {
	public static void main(String[] args) {
		// Faça um programa na linguagem Java que pergunte, pelo teclado, o preço de
		// três produtos e informe, no
		// console, qual produto você deve comprar, sabendo que a decisão de comprar um
		// produto é sempre pelo
		// mais barato.

		Scanner scanner = new Scanner(System.in);

		try {
			System.out.print("Digite o preço do primeiro produto: ");
			double precoProduto1 = scanner.nextDouble();

			System.out.print("Digite o preço do segundo produto: ");
			double precoProduto2 = scanner.nextDouble();

			System.out.print("Digite o preço do terceiro produto: ");
			double precoProduto3 = scanner.nextDouble();

			String produtoMaisBarato;
			double menorPreco;

			if (precoProduto1 < precoProduto2 && precoProduto1 < precoProduto3) {
				produtoMaisBarato = "Produto 1";
				menorPreco = precoProduto1;
			} else if (precoProduto2 < precoProduto3) {
				produtoMaisBarato = "Produto 2";
				menorPreco = precoProduto2;
			} else {
				produtoMaisBarato = "Produto 3";
				menorPreco = precoProduto3;
			}

			System.out.println("O produto mais barato é " + produtoMaisBarato + " com preço de " + menorPreco);

		} catch (InputMismatchException error) {
			System.out.println("Não foi digitado um número");
		}
		scanner.close();
	}
}
