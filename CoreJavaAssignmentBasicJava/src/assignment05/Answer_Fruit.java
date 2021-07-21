package assignment05;

import java.util.ArrayList;
import java.util.List;

public class Answer_Fruit {

	public static void main(String[] args) {
		List<Fruit> fruits=new ArrayList<>();
		
		fruits.add(new Fruit("Apple", "Red", 50, 100));
		fruits.add(new Fruit("Orange", "Orange", 80, 110));
		fruits.add(new Fruit("Strawberry", "Red", 70, 200));
		fruits.add(new Fruit("PineApple", "Yellow", 130, 90));
		fruits.add(new Fruit("Mango", "Yellow", 70, 80));
		fruits.add(new Fruit("Banana", "Yellow", 140, 85));
		fruits.add(new Fruit("Guava", "Green", 40, 80));
		
		System.out.println("Displaying low calory fruit names (calories < 100) in descending order of calories: ");
		
		fruits.stream()
		.filter(a->a.getCalories()<100)
		.sorted((o1,o2)->o2.getCalories()-o1.getCalories())
		.forEach(a->System.out.println(a.getName()));
		
		System.out.println("Displaying color wise list of fruit names: ");
		
		fruits.stream()
		.sorted((o1,o2)->o1.getColor().compareTo(o2.getColor()))
		.forEach(a->System.out.println("Name:" + a.getName()+", Color: "+a.getColor()));
		
		System.out.println("Displaying RED color fruits sorted by ascending order of price: ");
		
		fruits.stream()
		.filter(a->a.getColor().equalsIgnoreCase("red"))
		.sorted((o1,o2)->o1.getPrice()-o2.getPrice())
		.forEach(System.out::println);
	}

}
