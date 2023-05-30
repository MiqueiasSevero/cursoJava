package controle;

import java.util.Scanner;

import javax.print.attribute.standard.Media;

public class DesafioWhile {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		double nota = 0;
		double totalTurma = 0;
		double qtdeNotas = 0;

		while (nota != -1) {

			System.out.print("Digite valor de nota do Aluno:");
			nota = entrada.nextInt();
			if (nota <= 10 && nota >= 0) {
				totalTurma += nota;
				qtdeNotas++;

			} else if (nota != -1) {

				System.out.println("Nota Invalida!");
			}

		}

		double media = totalTurma / qtdeNotas;
		System.out.println("Media da turma é: " + media);
		entrada.close();
	}
}
