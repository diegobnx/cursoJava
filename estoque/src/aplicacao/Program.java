package aplicacao;

import java.util.Scanner;
import entidades.Produto;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Entre com os dados do Produto");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Preço: ");
		double preco = sc.nextDouble();
		System.out.print("Quantidade em estoque: ");
		int quantidade = sc.nextInt();
		Produto produto = new Produto(nome, preco, quantidade);

		System.out.println();
		System.out.println("Dados do produto: " + produto);

		System.out.println();
		System.out.print("Entre com o número de produtos para ser adicionado em estoque: ");
		quantidade = sc.nextInt();
		produto.addProdutos(quantidade);

		System.out.println();
		System.out.println("Atualização de dados em estoque: " + produto);

		System.out.println();
		System.out.print("Entre com o número de produtos para ser removidos do estoque: ");
		quantidade = sc.nextInt();
		produto.removeProdutos(quantidade);

		System.out.println();
		System.out.println("Atualização de dados em estoque: " + produto);

		sc.close();
	}

}
