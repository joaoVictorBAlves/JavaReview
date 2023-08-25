package estrutura.sequencial;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Questao04 {
	public static void main(String[] args) {
		// 4. Faça um programa na linguagem Java que receba um número em metros pelo teclado, converta em
		// centímetros e mostre o resultado no console.
		Scanner scanner = new Scanner(System.in);

		try {
			System.out.print("Digite um número em metros: ");
			double metros = scanner.nextDouble();

			double centimetros = metros * 100;

			System.out.println(metros + " metros equivalem a " + centimetros + " centímetros.");
		} catch (InputMismatchException error) {
			System.out.println("Não foi digitado um número");
		}
		scanner.close();

	}
}
