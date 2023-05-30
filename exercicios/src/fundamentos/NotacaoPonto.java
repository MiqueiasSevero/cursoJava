package fundamentos;

public class NotacaoPonto {
	public static void main(String[] args) {
		//double a = 2.3; 
		String s = "Bom dia X";
		
		s = s.replace("X", "Sr").toUpperCase().concat("!!!");
//		s = s.toUpperCase();
//		s = s.concat("!!!");
		System.out.println(s);
		System.out.println("Miqueias".toUpperCase());
		
		
		String y = "Bom dia X"
				.replace("X","Gui")
				.toUpperCase()
				.concat("!!!");
		System.out.println(y);
		
		//Tipos primitivos não tem o operador "."
		
		String ax = "oi"; 
		System.out.println(ax.replace("oi", "ola"));
	}
}
