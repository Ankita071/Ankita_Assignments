package assignment02;

import java.util.Scanner;

public class HierarchyOfOrganisation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter salary of empoyees:");
		double employeeSalary = sc.nextDouble();
		
		System.out.println("Enter salary of manager:");
		double managerSalary = sc.nextDouble();
		
		System.out.println("Enter incentives of manager:");
		double managerIncentives = sc.nextDouble();
		
		System.out.println("Enter salary of labour:");
		double labourSalary = sc.nextDouble();
		
		System.out.println("Enter overtime amount of labour:");
		double labourOvertimeAmount = sc.nextDouble();
		
		Employee emp = new Employee(employeeSalary);
		Manager mgr = new Manager(managerSalary, managerIncentives);
		Labour lbr = new Labour(labourSalary, labourOvertimeAmount);

		System.out.println("The salary of employees are:" + emp.totalSalary());
		System.out.println("The salary of managers are:" + mgr.totalSalary());
		System.out.println("The salary of labours are:" + lbr.totalSalary());
		
		sc.close();
	}

}

class Employee {
	private double salary;
	
	public Employee(double salary) {
		this.salary = salary;
	}
	
	public double totalSalary() {
		return salary;
	}
}

class Manager extends Employee {
	private double incentives;
	
	public Manager(double salary, double incentives) {
		super(salary);
		this.incentives = incentives;
	}
	
	@Override
	public double totalSalary() {
		double totalSalary = super.totalSalary() + incentives;
		return totalSalary;
	}
}

class Labour extends Employee {
	private double overtime;
	
	public Labour(double salary, double overtime) {
		super(salary);
		this.overtime = overtime;
	}
	
	@Override
	public double totalSalary() {
		double totalSalary = super.totalSalary() + overtime;
		return totalSalary;
	}
}