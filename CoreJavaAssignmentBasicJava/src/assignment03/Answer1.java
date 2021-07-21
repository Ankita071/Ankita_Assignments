package assignment03;

import java.util.*;

public class Answer1 {

	public static void main(String[] args) {		
		TreeSet<Person> ts = new TreeSet<Person>(new PersonSortingComparator());

		Person p1 = new Person(50, 160, "Person1");
		Person p2 = new Person(40, 152, "Person2");
		Person p3 = new Person(50, 150, "Person3");
		Person p4 = new Person(49, 155, "Person4");
		
		ts.add(p1);
		ts.add(p2);
		ts.add(p3);
		ts.add(p4);
		
		System.out.println("Sorting:");
		
		for(Person p: ts) {
			System.out.println("Weight: " + p.weight + ", Height: " + p.height + ", Name: " + p.name);
		}
		
	}

}

class Person {
	int weight, height;
	String name;
	
	Person(int weight, int height, String name) {
		this.weight = weight;
		this.height = height;
		this.name = name;
	}
	
	public int getWeight() {
	    return weight;
	}

	public void setWeight(int weight) {
	    this.weight = weight;
	}

	public int getHeight() {
	    return height;
	}

	public void setHeight(int height) {
	    this.height = height;
	}

	public String getName() {
	    return name;
	}

	public void setName(String name) {
	    this.name = name;
	}
}

class PersonSortingComparator implements Comparator<Person> {

    @Override
    public int compare(Person person1, Person person2) {
    	
    	int weightCompare = person1.getWeight() - person2.getWeight();

        int heightCompare = person1.getHeight() - person2.getHeight();

        int nameCompare = person1.getName().compareTo(person2.getName());

        // Now comparing
        if (weightCompare == 0) {
            if (heightCompare == 0) {
                return nameCompare;
            }
            return heightCompare;
        }
        return weightCompare;
    }
}