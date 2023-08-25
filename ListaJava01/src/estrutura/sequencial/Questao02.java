package estrutura.sequencial;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Questao02 {

	public static void main(String[] args) {
		// 2. Faça um programa na linguagem Java que peça um número pelo teclado e então mostre a mensagem no 
		// console “O número informado foi [número].”
		Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        try {
            int userInput = scanner.nextInt();

            System.out.println("O número informado foi: " + userInput);
        } catch(InputMismatchException error) {
            System.out.println("Não foi digitado um número.");
        }
        scanner.close();
	}

}
