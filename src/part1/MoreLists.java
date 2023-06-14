package part1;

import java.util.ArrayList;
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
		
	}
	
	
}
