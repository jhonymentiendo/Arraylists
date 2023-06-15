package clases;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ArraysAndArrayLists {

	public static void main(String[] args) {
		String[] originalArray = new String[]{"fst","Scnd","thrd","frth","fft"};
		var originalList = Arrays.asList(originalArray);
		
		originalList.set(0, "one");
		System.out.println("list : " + originalList);
		System.out.println("array: " + Arrays.toString(originalArray));
		
		originalList.sort(Comparator.naturalOrder());
		System.out.println("array: " + Arrays.toString(originalArray));
		
		
		originalList = new ArrayList<String>(originalList);
		originalList.add("nuevaEntrada");
		System.out.println("list : " + originalList);
	}
}
