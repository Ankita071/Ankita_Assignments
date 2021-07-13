package assignment01;

import java.util.Scanner;

public class NumberSearch {

	public static void main(String[] args) {
		int[] arr = {5, 12, 14, 6, 78, 19, 1, 23, 26, 35, 37, 7, 52, 86, 47};
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int value = checkNumber(arr, num);
		if (value == -1) {
			System.out.print("The provided number " + num + " is not found in the array.");
		}
		else {
			System.out.println("The number " + num + " is found at " + value + "th index.");
		}
		sc.close();
	}

	private static int checkNumber(int[] arr, int num) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == num) {
				return i;
			}
		}
		return -1;
	}

}
