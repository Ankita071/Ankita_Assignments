package assignment03;

import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.Set;

public class Answer5 {
	public static void main(String[] args) {
		Hashtable<Employee, Integer> hashtable =new Hashtable<>();
		hashtable.put(new Employee("Ankita", 165), 12);
		hashtable.put(new Employee("Vidya", 124), 24);
		hashtable.put(new Employee("Adya", 234), 36);
		hashtable.put(new Employee("A", 134), 15);
		
		Set<Entry<Employee, Integer>> entrySet = hashtable.entrySet();
		for (Entry<Employee, Integer> entry : entrySet) {
			System.out.println("Key: " + entry.getKey() +" Value: "+ entry.getValue());
		}
	}
}

class Employee{
	String name;
	int empID;
	
	public Employee(String name, int empID) {
		super();
		this.name = name;
		this.empID = empID;
	}

	@Override
	public int hashCode() {
		return 2;
	}

	@Override
	public boolean equals(Object obj) {
		return true;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", empID=" + empID + "]";
	}
}
