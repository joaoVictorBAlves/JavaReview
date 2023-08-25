package estrutura.sequencial;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Questao05 {
	public static void main(String[] args) {
		// 5. Faça um programa na linguagem Java que calcule e mostre, no console, a área de um círculo. Sabe-se 
		// que a fórmula da área de um círculo é A = πr2.
		
		Scanner scanner = new Scanner(System.in);

		try {
			System.out.print("Digite o raio do círculo: ");
			double raio = scanner.nextDouble();

			// Valor de π (pi)
			final double PI = 3.14159;

			double area = PI * raio * raio;

			System.out.println("A área do círculo é: " + area);
		} catch (InputMismatchException error) {
			System.out.println("Não foi digitado um número");
		}

		scanner.close();
	}
}
