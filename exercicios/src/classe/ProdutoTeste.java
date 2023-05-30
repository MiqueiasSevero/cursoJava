package classe;

public class ProdutoTeste {
	
	public static void main(String[] args) {
		Produto p1 = new Produto();
		
		p1.nome = "Notebook";
		p1.preco = 4356.89;
		p1.desconto = 0.1;
		
		var p2 = new Produto();
		p2.nome = "Caneta";
		p2.preco = 2.99;
		p2.desconto = 0.3;
				
		double precoFinal1 = p1.preco - (p1.preco * p1.desconto);
		double precoFinal2 = p2.preco - (p2.preco * p2.desconto);
		
		
		System.out.printf("- Produto: %s \n- Preco Atual: R$ %s  \n- Preco com desconto: R$%.2f"
				,p1.nome, p1.preco, precoFinal1);
	}
}
