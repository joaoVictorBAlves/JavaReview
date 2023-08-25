import java.util.Scanner;

public class Questao03 {

	public static void main(String[] args) {
//		3. Faça um programa na linguagem Java que receba 3 notas pelo teclado, calcule e mostre a média
//		aritmética no console.
		
        System.out.println("Calcule a média aritmética!");
		Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        System.out.println("A média aritmética é: " + media);

        scanner.close();


	}

}
