package fundamentos;

public class TipoString {
	public static void main(String[] args) {
		System.out.println("Olá pessoal".charAt(4));
		
		String s = "Boa tarde";
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.endsWith("tarde!"));
		System.out.println(s.length());
		System.out.println(s.equals("boa tarde"));
		System.out.println(s.equalsIgnoreCase("boa tarde"));
		
		var nome =  "Maria";
		var sobrenome = "Neide";
		var idade = 33;
		var salario = 1234.989;
		
		System.out.println("Nome: " 
		+ nome + "\nSobrenome: " + sobrenome );
		
		System.out.printf("A sra %s %s, tem %d anos e, ganha R$ %.2f", 
				nome,sobrenome,idade,salario);
		String frase  =  String.format("\nA sra %s %s, tem %d anos e, ganha R$ %.2f", 
				nome,sobrenome,idade,salario);
		System.out.println(frase);
	
	}
}
