package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>();
		
		System.out.print("Quantos funcionarios serão registrados? ");
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
		System.out.print("Entre com ID do funcionário que receberá aumento de salário: ");
		int id = sc.nextInt();
		
		Employee emp = list.stream().filter(x -> x.getID() == id).findFirst().orElse(null);
		if (emp == null) {
			System.out.println("O ID Digitado não exite.");
		} else {
			System.out.print("Entre com a porcentagem: ");
			double porcentagem = sc.nextDouble();
			emp.increaseSalary(porcentagem);
		}
		
		System.out.println();
		System.out.println("Lista de funcionários: ");
		for (Employee obj : list) {
			System.out.println(obj);
		}
		
		sc.close();
	}

}
