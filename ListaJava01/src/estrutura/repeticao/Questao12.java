package estrutura.repeticao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Questao12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float nota;
		
		try {
			do {
				System.out.print("Entre com uma nota de 0 a 10: ");
				nota = sc.nextFloat();
			} while (nota < 0 || nota > 10);
		} catch (InputMismatchException e) {
			System.out.println("Valor inválido!");
		}
	
		sc.close();
	}

}
