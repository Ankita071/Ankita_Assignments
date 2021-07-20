package assignment02;

import java.util.Scanner;

public class Persist {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Persistence per;
		System.out.println("Press 1 for saving data in file or press 2 for saving it in database.");
		int choice = sc.nextInt();
		
		if(choice == 1) {
			per = new FilePersistence();
			per.persist();
		}
		
		else if(choice == 2) {
			per = new DatabasePersistence();
			per.persist();
		}
		
		else {
			System.out.println("Invalid choice.");
		}
		sc.close();
	}
}

abstract class Persistence {
	abstract void persist();
}

class FilePersistence extends Persistence{
	@Override
	void persist() {
		System.out.println("Data is saved in file");
	}	
}

class DatabasePersistence extends Persistence{
	@Override
	void persist() {
		System.out.println("Data is saved in database");
	}
}