package estrutura.decisao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Questao09 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		try {
			System.out.print("Digite o primeiro número: ");
			double numero1 = scanner.nextDouble();

			System.out.print("Digite o segundo número: ");
			double numero2 = scanner.nextDouble();

			System.out.print("Digite o terceiro número: ");
			double numero3 = scanner.nextDouble();

			double maiorNumero = numero1;

			if (numero2 > maiorNumero) {
				maiorNumero = numero2;
			}

			if (numero3 > maiorNumero) {
				maiorNumero = numero3;
			}

			System.out.println("O maior número é: " + maiorNumero);
		} catch (InputMismatchException error) {
			System.out.println("Não foi digitado um número");
		}

		scanner.close();
	}
}
