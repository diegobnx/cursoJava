package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entidades.Produto;
import entidades.ProdutoImportado;
import entidades.ProdutoUsado;

public class Program {

	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		List<Produto> list = new ArrayList<>();
		
		System.out.print("Entre com o número de produtos: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Dados do Produto #" + i);
			System.out.print("Digite c para Comun, u para Usado  ou i Importado (c/u/i): ");
			char ch = sc.next().charAt(0);
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Preço: ");
			double preco = sc.nextDouble();
			if (ch == 'c') {
				list.add(new Produto(nome, preco));
			}
			else if (ch == 'u') {
				System.out.print("Data de fabricação (DD/MM/YYYY): ");
				Date dataFabricacao = sdf.parse(sc.next());
				list.add(new ProdutoUsado(nome, preco, dataFabricacao));
			}
			else {
				System.out.print("Valor da Taxa Alfandega: ");
				double taxaAlfandega = sc.nextDouble();
				list.add(new ProdutoImportado(nome, preco, taxaAlfandega));
			}
		}
		
		System.out.println();
		System.out.println("ETIQUETAS: ");
		for (Produto prod : list) {
			System.out.println(prod.etiqueta());
		}
	}

}
