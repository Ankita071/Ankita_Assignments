package assignment04;

import java.util.Scanner;

@FunctionalInterface
interface ArithmeticOperations{
	public void operation(int number1 ,int number2);
}

public class Answer1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		calculate(num1 ,num2, (number1, number2)->System.out.println("Sum: " + (number1 + number2)));
		calculate(num1 ,num2, (number1, number2)->System.out.println("Difference: " + (number1 - number2)));
		calculate(num1 ,num2, (number1, number2)->System.out.println("Product: " + (number1 * number2)));
		calculate(num1 ,num2, (number1, number2)->System.out.println("Division: " + (number1 / number2)));
		
		sc.close();
	}
	private static void calculate(int num1, int num2, ArithmeticOperations arithmetic) {
		arithmetic.operation(num1, num2);
	}
}
