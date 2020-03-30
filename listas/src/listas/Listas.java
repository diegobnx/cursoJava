package listas;

import java.util.ArrayList;
import java.util.List;

public class Listas {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Diego");
		list.add("Thaline");
		list.add("Carla");
		list.add("Carol");
		list.add("Maria");
		list.add(4, "Nilson");
		
		list.removeIf(x -> x.charAt(0) == 'C');
		
		for (String x : list) {
			System.out.println(x);
		}

	}

}