package assignment04;

import java.util.ArrayList;
import java.util.List;

public class Answer5 {
	public static void main(String[] args) {
		
		StringBuilder result=new StringBuilder();
		List<String> list= new ArrayList<String>();
		
		list.add("Basket");
		list.add("Ball");
		list.add("Cricket");
		list.add("BaseBall");
		list.add("Carrom");
		list.add("Chess");
		list.add("Football");
		list.add(" Lawn Tennis");
		list.add("Badminton");
		list.add("Hockey");
		
		list.forEach(a->result.append(a.charAt(0)));
		
		System.out.println(result);
		
	}	
}
