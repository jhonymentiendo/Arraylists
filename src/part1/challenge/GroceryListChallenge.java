package part1.challenge;

import java.util.ArrayList;
import java.util.Comparator;
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
	
	public static void agregaElemento() {
		String item;
		System.out.println("agrega un elemento :");
		item = sn.next();
		if(!groceries.contains(item)) {
			groceries.add(item);
		}else System.out.println(item + " ya existe");
	}
	
	public static void removerElemento() {
		String item;
		System.out.println("remover un elemento :");
		item = sn.next();
		if(groceries.contains(item)) {
			groceries.remove(item);
		}else System.out.println(item + " no existe");
	}
	
	public static void imprimirLista() {
		ArrayList<String> groceriesordenada = new ArrayList<String>(groceries);
		groceriesordenada.sort(Comparator.naturalOrder());
		System.out.println(groceriesordenada);
	}
	
	public static boolean arrancaApp() {
	boolean resp = true;
		pintamenu();
		
		switch (sn.next()) {
			case "1": {
				agregaElemento();
				break;
			}
			case "2": {
				removerElemento();
				break;
			}
			case "3": {
				imprimirLista();
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
