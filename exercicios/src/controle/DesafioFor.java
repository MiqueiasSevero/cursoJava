package controle;

public class DesafioFor {
	public static void main(String[] args) {
		String inicio = "";
		String fim ="#####";
		
		for(inicio = "#"; inicio.length() <= fim.length(); inicio += "#") {
			System.out.println(inicio);
		}
	}
}
