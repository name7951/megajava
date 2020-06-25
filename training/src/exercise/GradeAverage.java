package exercise;

import java.util.Scanner;

public class GradeAverage {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int numStudent, numGrade;
		int grade;
		int sum = 0;
		double average;
		
		System.out.print("Number of students : ");
		numStudent = sc.nextInt();
		System.out.print("Number of Grades: ");
		numGrade = sc.nextInt();
		System.out.println("");
		
		for (int i = 1; i <= numStudent; i++) {
			System.out.println("Grades for student " + i);
			for (int j 	= 1; j <= numGrade; j++) {
				System.out.print(j + " : ");
				grade = sc.nextInt();
				sum = sum + grade;
			}
			average = (double)sum / numGrade;
			System.out.println("Average : " + average);
			System.out.println("");
		}
		
	}

}
