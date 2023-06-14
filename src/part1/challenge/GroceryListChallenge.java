package part1.challenge;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GroceryListChallenge {

	static Scanner sn = new Scanner(System.in);
	static ArrayList<String> groceries = new ArrayList<String>();
	
	public static void main(String[] args) {
		
		
		while(arrancaApp()) {}
		
		
	}

	public static void pintamenu() {
		System.out.println("************************");
		System.out.println("1) enter");
		System.out.println("2) remove");
		System.out.println("3) print list");
		System.out.println("q) exit");
		System.out.println("************************");
	}
	
	public static boolean arrancaApp() {
	boolean resp = true;
		pintamenu();
		
		switch (sn.next()) {
			case "1": {
				System.out.println("agrega un elemento :");
				groceries.add(sn.next());
				break;
			}
			case "2": {
				System.out.println("agrega un elemento :");
				groceries.removeAll(List.of(sn.next()));
				break;
			}
			case "3": {
				System.out.println(groceries);
				break;
			}
			case "q": {
				System.out.println("bye!");
				resp  = false;
				break;
			}
			default:
				break;
		}
		
		return resp;
	}
	
	
}
