package assignment01;

public class ArmstrongLimit {

	public static void main(String[] args) {		
		for (int i = 100; i <=999; i++) {
			if (ArmstrongOrNot(i)) {
				System.out.println(i + " ");
			}
		}
	}

	private static boolean ArmstrongOrNot(int i) {
		int temp = i;
		int rem, sum = 0;
		while (temp != 0) {
			rem = temp % 10;
			sum += Math.pow(rem, 3);
			temp /= 10;
		}
		
		if (i == sum) {
			return true;
		}
		
		return false;
	}

}
