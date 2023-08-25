package estrutura.repeticao;

import java.util.Scanner;

public class Questao13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Entre com a quantidade de eleitores: ");
		int qtdEleitores = sc.nextInt();
		int[] votes = new int[3];
		votes[0] = 0;
		votes[1] = 0;
		votes[2] = 0;

		for (int i = 1; i <= qtdEleitores; i++) {
			System.out.println("Cadidato A [0], Candidato B[1] e Candidato C[2]");
			System.out.print("Eleitor " + i + "# entre com o número do candidato que deseja votar: ");
			int vote = sc.nextInt();
			if (vote >= 0 && vote <= 2)
				votes[vote] += 1;
		}
		
		System.out.println("--------------------------------------");
		
		for (int i = 0; i < 3; i++) {
			String candidato = null;
			if(i == 0)
				candidato = "A";
			else if(i == 1)
				candidato = "B";
			else
				candidato = "C";
			
			System.out.println("Candidato " + candidato + ": " + votes[i]);
		}

		sc.close();
	}
}
