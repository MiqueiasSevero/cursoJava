package fundamentos;

import javax.swing.JOptionPane;

public class desafioMediaSalario {
	public static void main(String[] args) {
		double salario1 =  Double.parseDouble(JOptionPane.showInputDialog("digite primeiro salario:").replace(",", "."));
		double salario2 =  Double.parseDouble(JOptionPane.showInputDialog("digite segundo salario:").replace(",", "."));
		double salario3 =  Double.parseDouble(JOptionPane.showInputDialog("digite terceiro salario:").replace(",", "."));
		
		double soma =  salario1 + salario2 + salario3; 
		
		System.out.println("Media Salarial: " + soma / 3);
	}
}
