package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>();
		
		System.out.print("Quantos funcionarios ser�o registrados? ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.println();
			System.out.println("Funcionario #" + i + ":");
			System.out.print("ID: ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.print("Nome: ");
			String name = sc.nextLine();
			System.out.print("Salario: ");
			double salary = sc.nextDouble();
			list.add(new Employee(id, name, salary));			
		}
		
		System.out.println();
		System.out.print("Entre com ID do funcion�rio que receber� aumento de sal�rio: ");
		int id = sc.nextInt();
		
		Employee emp = list.stream().filter(x -> x.getID() == id).findFirst().orElse(null);
		if (emp == null) {
			System.out.println("O ID Digitado n�o exite.");
		} else {
			System.out.print("Entre com a porcentagem: ");
			double porcentagem = sc.nextDouble();
			emp.increaseSalary(porcentagem);
		}
		
		System.out.println();
		System.out.println("Lista de funcion�rios: ");
		for (Employee obj : list) {
			System.out.println(obj);
		}
		
		sc.close();
	}

}
