package assignment03;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Answer2 {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		
		hs.add("Apple");
		hs.add("Banana");
		hs.add("Mango");
		hs.add("Grapes");
		hs.add("Oranges");
		
		Iterator<String> fruits = hs.iterator();
		System.out.println("Displaying the values using HashSet");
		while (fruits.hasNext()) {
			System.out.println(fruits.next());
		}
		System.out.println("Since order of input and output is different, HashSet is unordered.");
		
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		
		lhs.add("Black");
		lhs.add("Pink");
		lhs.add("Purple");
		lhs.add("Orange");
		lhs.add("Blue");
		
		Iterator<String> colours = lhs.iterator();
		System.out.println("Displaying the values using LinkedHashSet");
		while (colours.hasNext()) {
			System.out.println(colours.next());
		}
		System.out.println("Since order of input and output is same, LinkedHashSet is ordered.");
		
	}

}
