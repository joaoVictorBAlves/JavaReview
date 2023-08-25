package estrutura.decisao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Questao10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		try {
			System.out.print("Digite um número inteiro: ");
			int numero = scanner.nextInt();

			if (numero % 2 == 0) {
				System.out.println("O número " + numero + " é par.");
			} else {
				System.out.println("O número " + numero + " é ímpar.");
			}
		} catch (InputMismatchException error) {

			System.out.println("Não foi digitado um número");
		}

		scanner.close();
	}
}
