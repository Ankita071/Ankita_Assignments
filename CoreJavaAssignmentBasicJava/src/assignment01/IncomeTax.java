package assignment01;

import java.util.Scanner;

public class IncomeTax {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
        int income = sc.nextInt();
        int tax = 0;
        
        if(income > 0 && income <= 180000)
        {
      	   tax = 0;
        }
        else if(income > 180000 && income <= 300000)
        {
      	  tax = income * 10 / 100;
        }
        else if(income > 300000 && income <= 500000)
        {
      	  tax = income * 20 / 100;
        }
        else if(income > 500000 && income <= 1000000)
        {
      	  tax =income * 30 / 100;      	  
        }
        
        System.out.println("Income tax paid is:" + tax);
        sc.close();
	}

}
