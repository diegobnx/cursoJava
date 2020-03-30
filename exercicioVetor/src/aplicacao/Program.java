package aplicacao;

import java.util.Scanner;
import entidades.Aluguel;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos quartos ser�o alugados? ");
		int n = sc.nextInt();
		
		Aluguel[] vect = new Aluguel[10];
		
		for (int i = 0; i < n; i++) {
			System.out.println();
			System.out.println("Aluguel #" + i + ":");
			sc.nextLine();
			System.out.print("Digite o nome para cadastro: ");
			String name = sc.nextLine();
			System.out.print("Email para cadastro: ");
			String email = sc.nextLine();
			System.out.print("Numero do quarto a ser reservado: ");
			int quarto = sc.nextInt();
			vect[quarto] = new Aluguel(name, email);
		}
		
		System.out.println();
		System.out.println("Quartos ocupados: ");
		
		for (int i = 0; i < 10; i++) {
			if (vect[i] != null) {
				System.out.println(i + ": " + vect[i]);
			}
		}
				
		sc.close();
	}

}
