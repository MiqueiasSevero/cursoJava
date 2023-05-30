package controle;

import java.util.Scanner;

public class WhileIndeterminado {
	
	public static void main(String[] args) throws InterruptedException  {
		Scanner entrada =  new Scanner(System.in);
		
		String valor = "";
		
		Boolean condicao = false;
		
		
		while(!condicao) {
			
			System.out.print("Você me diz:");
			valor = entrada.nextLine();
			condicao = valor.equalsIgnoreCase("sair");
			
			if(condicao) {
				System.out.print("finalizando probrama!");
				pontoPonto();
				System.out.println("tchau - Volte logo");
			}
			
			
			
		}
		entrada.close();
	}
	public static void  pontoPonto() throws InterruptedException {
		for(int i = 1;i <= 5 ;i++) {			
			System.out.print(".");
			Thread.sleep(1000);
			
		}
		System.out.println("");
		
	}
}
