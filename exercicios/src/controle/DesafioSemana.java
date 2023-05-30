package controle;

import java.util.Scanner;

public class DesafioSemana {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite nome do dia: ");
		
		String diaSemana = entrada.nextLine();
		
		if(diaSemana.equalsIgnoreCase("domingo")) {
			System.out.println("1 dia da semana");
		}else if(diaSemana.equalsIgnoreCase("segunda-feira")) {
			System.out.println("2 dia da semana");
		}else if(diaSemana.equalsIgnoreCase("terça-feira")) {
			System.out.println("3 dia da semana");
		}
		else if(diaSemana.equalsIgnoreCase("quarta-feira")) {
			System.out.println("4 dia da semana");
		}else if(diaSemana.equalsIgnoreCase("quita-feira")) {
			System.out.println("5 dia da semana");
		}else if(diaSemana.equalsIgnoreCase("sexta-feira")) {
			System.out.println("6 dia da semana");
		}else {
				System.out.println("7 dia da semana");
		}
		entrada.close();
	}
}		
