package part1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MoreLists {

	
	public static void main(String[] args) {
		
		String[] items = {"1","2","3","4","5","6","7","8","9","10"};
		
		List<String> list = List.of(items);
		System.out.println(list);
		System.out.println(list.getClass().getName());
		
		try {
			list.add("prueba");
		} catch (Exception e) {
			System.out.println("no se puede agragar como lista");
		}
		
		ArrayList<String> lista2 = new ArrayList<String>(list);
		lista2.add("prueba");
		
		
		System.out.println(lista2);
		System.out.println(lista2.getClass().getName());
		
		ArrayList<String> groceries = new ArrayList<String>();
		
		groceries.add("Articulo1");
		groceries.add("Articulo2");
		groceries.add("Articulo3");
		groceries.add("Articulo4");
		groceries.add("Articulo5");
		groceries.add("Articulo6");
		groceries.add("Articulo7");
		groceries.add("Articulo8");
		groceries.add("Articulo9");
		if(groceries.contains("Articulo5")) {
			System.out.println("si contiene Articulos 5");
		}
		groceries.retainAll(List.of("Articulo3"));
		System.out.println(groceries);
		groceries.remove("Articulo3");
		System.out.println(groceries);
		groceries.removeAll(List.of("Articulo5","Articulo1","Articulo7"));
		System.out.println(groceries);
		
		
		groceries.addAll(List.of("Articulo5","Articulo1","Articulo7"));
		groceries.addAll(Arrays.asList("Articulo23","Articulo24","Articulo25"));
		
		System.out.println(groceries);
		groceries.sort(Comparator.reverseOrder());
		System.out.println("ordenado en reversa" + groceries);
		groceries.sort(Comparator.naturalOrder());
		System.out.println("ordenado en reversa" + groceries);
		
		
		
		
		
	}
	
	
}
