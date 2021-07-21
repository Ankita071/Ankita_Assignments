package assignment04;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class Answer6 {
public static void main(String[] args) {
		
		List<String> list= new ArrayList<String>();
		UnaryOperator<String> unaryOperator=a->a.toUpperCase();
		
		list.add("BasketBall");
		list.add("Table Tennis");
		list.add("Cricket");
		list.add("BaseBall");
		list.add("Carrom");
		list.add("Chess");
		list.add("Football");
		list.add("Lawn Tennis");
		list.add("Badminton");
		list.add("Hockey");
		
		list.replaceAll(unaryOperator);
		
		list.forEach(System.out::println);
		
	}	
}
