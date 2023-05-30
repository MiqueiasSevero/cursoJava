package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		//informações funcionarios 
		
		
		//tipos numericos 
		byte anosDeEmpresa = 23; 
		short numeroDeVoos = 542;
		int id = 692710;
		long pontosAcumulados = 3_234_845_223L;
		
		//tipos numericos reais
		float salario = 5_184.24F;
		double vendasAcumuladas = 2_991_797_103.01; 
		
		// tipo booleano 
		boolean estaDeFerias = false; 
		
		//tipo caracter 
		char status = 'A'; //ativo 
		
		//Dias de empresa
		System.out.println(anosDeEmpresa * 365);
		
		//Número de viagens
		System.out.println(numeroDeVoos/ 2);
		
		
		//Pontos por Real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println("O funcionario com a matricula: "+ id +"\nGanha: "+ salario);
		System.out.println("Ferias? "+ estaDeFerias);
		System.out.println("Status "+ status);
	}
}
