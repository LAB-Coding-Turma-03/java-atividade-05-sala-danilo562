package br.com.impacta.lab;

import br.com.impacta.models.*;

public class JavaSpringTemplateApplication {

	public static void main(String[] args) {
		/*
		 * Transforme a tabela produto em uma classe separadas
		 * no pacote br.com.impacta.models
		 * 
		 *  
		 *  Tabela de produto
		 *  
		 *  CodigoProduto	descrição do Produto		Valor do Produto
		 * 	1				Camisa						70.00
		 * 	2				Shorts						57.50
		 * 	3				Meia						9.99
		 * 	4				Toca						35.00
		 * 	5				Luvas						19.50
		 * 
		 * -----------------------------------------------------------------
		 * 
		 * Em seguida crie um método na classe Produto onde o mesmo tenho o nome de montarResumo
		 * Exemplo de um método:
		 * public String falar(String palavra) {
		 * 	System.out.println(palavra);
		 * }
		 * 
		 * receba como parametro um Produto e devolva uma String
		 * 
		 * O retorno deve ser no seguinte formato
		 * 
		 * "codigo: <produto.codigo>, descricao: <produto.descricao>, valor: <produto.valor>"
		 * 
		 * 
		 */
		
		Produto produto = new Produto();
		produto.codigo = 1;
		produto.descricao = "Camisa";
		produto.valor = 70.00;

		Produto Shorts = new Produto();
		Shorts.codigo = 2;
		Shorts.descricao = "Shorts";
		Shorts.valor = 44.00;

		Produto Meia = new Produto();
		Meia.codigo = 3;
		Meia.descricao = "Meia";
		Meia.valor = 34.30;
		
		Produto Tocas = new Produto();
		Tocas.codigo = 4;
		Tocas.descricao = "Tocas";
		Tocas.valor = 7.00;

		Produto Luvas = new Produto();
		Luvas.codigo = 4;
		Luvas.descricao = "Luvas";
		Luvas.valor = 5.00;
		String resumo = produto.montarResumo(produto);
		String resumo1 = Shorts.montarResumo(Shorts);
		String resumo2 = Meia.montarResumo(Meia);
		String resumo3 = Tocas.montarResumo(Tocas);
		String resumo4 = Luvas.montarResumo(Luvas);
		

		System.out.println("Codigo        Descrição       Valor");
		System.out.println(resumo);
		System.out.println(resumo1);
		System.out.println(resumo2);
		System.out.println(resumo3);
		System.out.println(resumo4);

		String montProd = produto.montarProduto(produto);

		System.out.println("===========================================");

		System.out.println("Montando a palavra");

		System.out.println(montProd);
	}

}
