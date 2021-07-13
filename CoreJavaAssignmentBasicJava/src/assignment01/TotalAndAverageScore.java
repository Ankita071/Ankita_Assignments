package assignment01;

import java.util.Scanner;

public class TotalAndAverageScore {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] marksOfStudent1 = new int[3];
		int[] marksOfStudent2 = new int[3];
		int[] marksOfStudent3 = new int[3];
		
		System.out.println("Enter marks of student 1 in the 3 subjects");
		for(int i = 0; i < marksOfStudent1.length; i++)
		{
			marksOfStudent1[i]=sc.nextInt();
		}

		System.out.println("Enter marks of student 2 in the 3 subjects");
		for(int i = 0; i < marksOfStudent1.length; i++)
		{
			marksOfStudent2[i]=sc.nextInt();
		}

		System.out.println("Enter marks of student 3 in the 3 subjects");
		for(int i = 0; i < marksOfStudent3.length; i++)
		{
			marksOfStudent3[i]=sc.nextInt();
		}
				
		int total1 = 0, total2 = 0, total3 = 0, avg1, avg2, avg3;
		
		for(int i = 0; i < marksOfStudent1.length; i++)
		{
			total1 += marksOfStudent1[i];
		}
		
		for(int i = 0; i < marksOfStudent1.length; i++)
		{
			total2 += marksOfStudent2[i];
		}

		for(int i = 0; i < marksOfStudent1.length; i++)
		{
			total3 += marksOfStudent3[i];
		}

		avg1 = total1 / marksOfStudent1.length;
		avg2 = total2 / marksOfStudent1.length;
		avg3 = total3 / marksOfStudent1.length;
		
		System.out.println("Marks of Student1 is: Total = " + total1 + " Average = " + avg1);
		System.out.println("Marks of Student2 is: Total = " + total2 + " Average = " + avg2);
		System.out.println("Marks of Student3 is: Total = " + total3 + " Average = " + avg3);
		
		for(int i = 0; i < marksOfStudent1.length; i++)
		{
			int marksInSubjects = 0;
			marksInSubjects = (marksOfStudent1[i] + marksOfStudent2[i] + marksOfStudent3[i]);
			int averageInSubjects = marksInSubjects / marksOfStudent1.length;
			System.out.println("Total marks of students in subject"+ (i+1) + " is "+  marksInSubjects + " and average is " + averageInSubjects);
		}
		
		sc.close();
	}

}
