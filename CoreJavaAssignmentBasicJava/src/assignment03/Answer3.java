package assignment03;

import java.util.ArrayList;
import java.util.ListIterator;

public class Answer3 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Black");
		list.add("Blue");
		list.add("Pink");
		list.add("Orange");
		list.add("Violet");
		list.add("Yellow");
		
		ListIterator<String> it = list.listIterator();
		
		while(it.hasNext()) {
			it.next();
		}
		
		while(it.hasPrevious()) {
			System.out.println(it.previous());
		}
		
	}

}
