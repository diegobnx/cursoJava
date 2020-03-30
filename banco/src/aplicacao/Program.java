package aplicacao;

import java.util.Scanner;

import entidades.Conta;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Conta conta;

		System.out.print("Entre com o numero da conta: ");
		int numero = sc.nextInt();
		System.out.print("Entre com o titular da conta:");
		sc.nextLine();
		String titular = sc.nextLine();
		System.out.print("Fazer deposito inicial (s/n)? ");
		char response = sc.next().charAt(0);

		if (response == 's') {
			System.out.print("Entre com o valor para deposito inicial: ");
			double depositoInicial = sc.nextDouble();
			conta = new Conta(numero, titular, depositoInicial);

		} else {
			conta = new Conta(numero, titular);
		}

		System.out.println();
		System.out.println("Dados da Conta: ");
		System.out.println(conta);
		System.out.println();

		System.out.print("Entre com o valor para deposito: ");
		double valorDeposito = sc.nextDouble();
		conta.deposito(valorDeposito);
		System.out.println("Dados da conta atualizado: ");
		System.out.println(conta);
		System.out.println();

		System.out.print("Entre com o valor para saque: ");
		double valorSaque = sc.nextDouble();
		conta.saque(valorSaque);
		System.out.println("Dados da conta atualizado: ");
		System.out.println(conta);

		sc.close();

	}

}
