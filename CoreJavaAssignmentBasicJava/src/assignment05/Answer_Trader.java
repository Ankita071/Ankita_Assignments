package assignment05;

import java.util.ArrayList;
import java.util.List;

public class Answer_Trader {

	public static void main(String[] args) {
		List<Trader> tradersList=new ArrayList<Trader>(10);
		
		tradersList.add(new Trader("Ankita", "Bokaro"));
		tradersList.add(new Trader("B", "Ranchi"));
		tradersList.add(new Trader("E", "Delhi"));
		tradersList.add(new Trader("D", "Pune"));
		tradersList.add(new Trader("A", "Mumbai"));
		tradersList.add(new Trader("J", "Indore"));
		tradersList.add(new Trader("G", "Delhi"));
		tradersList.add(new Trader("F", "Pune"));
		tradersList.add(new Trader("C", "Bangalore"));;
		tradersList.add(new Trader("I", "Indore"));
		
//		System.out.println("Unique cities where the traders work:");
//		
//		List<Trader> s = tradersList.stream()
//				.distinct().collect(Collectors.toList());
//		
//		System.out.println(s);
//		
		System.out.println("Traders from Pune sorted by name alphabetically:");
		
		tradersList.stream()
		.filter(a->a.getCity().equalsIgnoreCase("pune"))
		.sorted((o1,o2)->o1.getName().compareTo(o2.getName()))
		.forEach(System.out::println);
		
		System.out.println("\nTraders from Indore:");
		
		tradersList.stream()
		.filter(a->a.getCity().equalsIgnoreCase("Indore"))
		.forEach(System.out::println);
	}

}
