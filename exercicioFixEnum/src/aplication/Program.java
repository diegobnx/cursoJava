package aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Cliente;
import entities.ItensPedido;
import entities.Pedido;
import entities.Produto;
import entities.Enum.StatusPedido;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Entre com os dados do Cliente: ");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.next();
		System.out.print("Data de Nasc.: (DD/MM/YYYY): ");
		Date nascimento = sdf.parse(sc.next());
		
		Cliente cliente = new Cliente(nome, email, nascimento);
		
		System.out.println("Entre com os dados do Pedido: ");
		System.out.print("Status: ");
		StatusPedido status = StatusPedido.valueOf(sc.next());
		
		Pedido pedido = new Pedido(new Date(), status, cliente);
		
		System.out.print("Quantos itens para este Pedido? ");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.println("Entre com os dados do pedido #" + i);
			System.out.print("Nome Produto: ");
			sc.nextLine();
			String nomeProduto = sc.nextLine();
			System.out.println("Preço Produto: ");
			Double precoProduto = sc.nextDouble();
			
			Produto produto = new Produto(nomeProduto, precoProduto);
			
			System.out.print("Quantidade: ");
			int quantidade = sc.nextInt();
			
			ItensPedido itenspedido = new ItensPedido(quantidade, precoProduto, produto);
			
			pedido.addItem(itenspedido);
		}
		
		System.out.println();
		System.out.println("SUMARIO DO PEDIDO: ");
		System.out.println(pedido);
		
		sc.close();

	}

}
