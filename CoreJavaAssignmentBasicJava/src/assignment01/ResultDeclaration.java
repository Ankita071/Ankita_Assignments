package assignment01;
import java.util.Scanner;

public class ResultDeclaration {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int marks1 = sc.nextInt();
		int marks2 = sc.nextInt();
		int marks3 = sc.nextInt();
		
		if ((marks1 > 60) && (marks2 > 60) && (marks3 > 60)) {
			System.out.println("Passed");
		}
		else if ((marks1 > 60 && marks2 > 60) || (marks2 > 60 && marks3 > 60) || (marks3 > 60 && marks1 > 60)) {
			System.out.println("Promoted");
		}
		else if ((marks1 > 60 || marks2 > 60 || marks3 > 60) || (marks1 < 60 && marks2 < 60 && marks3 < 60)) {
			System.out.println("Failed");
		}
		
		sc.close();
	}

}
