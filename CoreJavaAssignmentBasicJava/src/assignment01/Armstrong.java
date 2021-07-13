package assignment01;
import java.util.*;

public class Armstrong {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		String result = ArmstrongOrNot(num);
		
		System.out.println(result);
		sc.close();
	}

	public static String ArmstrongOrNot(int num) {
		int temp = num;
		int rem, sum=0;
		String res;
		
		while(temp != 0) {
			rem = temp % 10;
			sum += Math.pow(rem, 3);
			temp /= 10;
		}
		
		if (num == sum) {
			res = "Armstrong Number";
		}
		else {
			res = "Not an Armstrong Number";
		}
		
		return res;
	}

}
