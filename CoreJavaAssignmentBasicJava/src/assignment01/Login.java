package assignment01;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the user name:");
		String name = sc.nextLine();
		
		System.out.println("Enter the password:");
		String password = sc.nextLine();
		
		String uName = "Ankita";
		String pass = "ank";
		int count = 3;
		
		if ((name.equals(uName)) && (password.equals(pass))) {
			System.out.println("Welcome " + uName);
		}
		
		for (int i = count; i > 0; i--) {
			if (!(name.equals(uName)) || !(password.equals(pass))) {

				System.out.println("You have " + i + " attempts left.");
				
				System.out.println("Enter the user name:");
				name = sc.nextLine();
				
				System.out.println("Enter the password:");
				password = sc.nextLine();	
				count = i;
				
				if ((name.equals(uName)) && (password.equals(pass))) {
					System.out.println("Welcome " + uName);
					break;
				}
			}
			if (count == 1) {
				System.out.println("Contact admin");
			}
		}

		sc.close();
	}

}
