package assignment01;
import java.util.Scanner;

public class SimpleAndCompoundInterest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double principle = sc.nextDouble();
		double rate = sc.nextDouble();
		double time = sc.nextDouble();

		simpleInterest(principle, rate, time);
		compoundInterest(principle, rate, time);
		
		sc.close();
	}

	private static void simpleInterest(double principle, double rate, double time) {
		double interest;
		interest = (principle * rate * time) / 100.0;
		System.out.println("Simple Interest is:" + interest);
	}

	private static void compoundInterest(double principle, double rate, double time) {
		double interest;
		interest = principle * Math.pow((1 + (rate / 100)), time);
		System.out.println("Compound Interest is:" + interest);		
	}

}
