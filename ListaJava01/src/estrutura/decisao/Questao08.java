package estrutura.decisao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Questao08 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		try {
			System.out.print("Digite a primeira nota: ");
			double nota1 = scanner.nextDouble();

			System.out.print("Digite a segunda nota: ");
			double nota2 = scanner.nextDouble();

			double mediaFinal = (nota1 + nota2) / 2;

			if (mediaFinal >= 7) {
				System.out.println("Aprovado!");
			} else if (mediaFinal >= 4) {
				System.out.print("O discente fará uma AF. Digite a nota da AF: ");
				double af = scanner.nextDouble();
				double mediaFinalComAF = (mediaFinal + af) / 2;
				if (mediaFinalComAF >= 5) {
					System.out.println("Aprovado com a AF. MF com AF: " + mediaFinalComAF);
				} else {
					System.out.println("Reprovado após a AF. MF com AF: " + mediaFinalComAF);
				}
			} else {
				System.out.println("Reprovado. MF: " + mediaFinal);
			}
		} catch (InputMismatchException error) {
			System.out.println("Não foi digitado um número");
		}

		scanner.close();
	}
}
