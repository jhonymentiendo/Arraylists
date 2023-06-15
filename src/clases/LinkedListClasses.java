package clases;

import java.util.LinkedList;

public class LinkedListClasses {

	public static void main(String[] args) {
		var placesToVisit = new LinkedList<String>();
		placesToVisit.add("BajaCalifornia Norte");
		placesToVisit.add(0, "BajaCalifornia sur");
		
		System.out.println(placesToVisit);
		
		addMoreElements(placesToVisit);
		
		System.out.println(placesToVisit);
		
		removeElements(placesToVisit);
		
		System.out.println(placesToVisit);
		
	}
	
	private static void addMoreElements(LinkedList<String> list) {
		list.addFirst("Chihuahua");
		list.addLast("Yucatan");
		//queue methods
		list.offer("tabasco");
		list.offerFirst("Nuevo Leon");
		list.offerLast("chiapas");
		//stack methods
		list.push("durango");
		
		
	}
	
	private static void removeElements(LinkedList<String> list) {
		
		list.remove(0);
		
		list.pop();
		
		list.remove("tabasco");
		
		String s1 = list.remove();
		System.out.println(s1 + "se removió ");
		
		
	}
	
	

}
