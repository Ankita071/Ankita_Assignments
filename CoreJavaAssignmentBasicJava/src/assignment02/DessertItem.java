package assignment02;

import java.util.Scanner;

public abstract class DessertItem {
	static int quantity = 0;

	@SuppressWarnings("static-access")
	public DessertItem(int quantity) {
		this.quantity = quantity;
	}

	public int quantity() {
		return quantity;
	}
	
	public abstract int getCost();
	  
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Press 1 if you are an owner or press 2 if you are a customer");
		int key = sc.nextInt();
		
		switch (key) {
			case 1: System.out.println("Enter the quantity of desserts to be added.");
					quantity = sc.nextInt();
					System.out.println("Owner has added " + quantity + " dessert items");
//					break;
			
			case 2: System.out.println("Enter the quantity of desserts to be ordered.");
				    int orderQuantity = sc.nextInt();
					if (orderQuantity > quantity) {
						System.out.println("Insufficient resources");
					}
					else {
						DessertItem candy = new Candy(orderQuantity, 2);
						DessertItem cookie = new Cookie(orderQuantity, 5);
						DessertItem icecream = new Cookie(orderQuantity, 7);	
						System.out.println("The cost of candy is: " + candy.getCost());
						System.out.println("The cost of cookie is: " + cookie.getCost());
						System.out.println("The cost of icecream is: " + icecream.getCost());
						
						int total = candy.getCost() + cookie.getCost() + icecream.getCost();
						System.out.println("Total amount of order is: " + total);
					}
					break;
			default:
				System.out.println("Invalid Choice");
		}
		sc.close();		
	}
}

class Candy extends DessertItem {
	private int candyTax;
	
	Candy (int quantity, int candyTax) {
		super(quantity);
		this.candyTax = candyTax;
	}
	
	@Override
	public int getCost() {
		return super.quantity() * 60 + candyTax;
	}
}

class Cookie extends DessertItem {
	private int cookieTax;
	
	Cookie (int quantity, int cookieTax) {
		super(quantity);
		this.cookieTax = cookieTax;
	}
	
	@Override
	public int getCost() {
		return super.quantity() * 70 + cookieTax;
	}
}


class IceCream extends DessertItem{
	private int iceCreamTax;
	
	IceCream (int quantity, int iceCreamTax) {
		super(quantity);
		this.iceCreamTax = iceCreamTax;
	}
	
	@Override
	public int getCost() {
		return super.quantity() * 1 + iceCreamTax;
	}
}