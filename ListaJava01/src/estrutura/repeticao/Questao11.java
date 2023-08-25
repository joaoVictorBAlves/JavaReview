package estrutura.repeticao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Questao11 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("Entre com um número para ver a tabuada(0 a 10): ");
			int number = sc.nextInt();

			if (number >= 0 && number <= 10)
				for (int i = 0; i <= 10; i++) {
					System.out.println(number + " x " + i + " = " + number * i);
				}
			else
				throw new InputMismatchException("Valor inválido");
		} catch (InputMismatchException e) {
			System.out.println(e.getMessage());
		}
		

		sc.close();

	}

}
