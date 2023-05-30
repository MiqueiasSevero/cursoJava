package fundamentos.operadores;

public class DesafiosLogicos {
	public static void main(String[] args) {
		//Trabalho da terça V ou F
		//Trabalho da quita V ou F
		boolean trabalho1 = true;
		boolean trabalho2 = true; 
		
		boolean comprouTV32 = trabalho1 ^ trabalho2; 
		boolean comprouTV50 = trabalho1 && trabalho2; 
		boolean	tomouSorverte = comprouTV50 || comprouTV32; 
		boolean ficarEmCasa = !tomouSorverte;
		
		System.out.println("Comprou TV50 ? " + comprouTV50);
		System.out.println("Comprou TV32 ? " + comprouTV32);
		System.out.println("Tomou Sorvete? " + tomouSorverte);
		System.out.println("Ficou em casa mais saudavel \npor nao tomar sorvete! " + ficarEmCasa);
		
		
	}
}
