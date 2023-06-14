package part1;

import java.util.ArrayList;

record GroceryItem(String name, String type,int count) {
	public GroceryItem(String name) {
		this(name, "Lacteos", 1);
	}
}

public class Main {

	public static void main(String[] args) {
		ArrayList<GroceryItem> groceryList= new ArrayList<GroceryItem>();
		groceryList.add(new GroceryItem("mantequilla"));
		groceryList.add(new GroceryItem("manzanas", "Frutas", 20));
		
		
		
		
		System.out.println(groceryList);
		
	}

}
