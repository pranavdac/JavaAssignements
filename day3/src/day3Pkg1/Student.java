package day3Pkg1;

import java.util.Scanner;

public class Student {
	
	Scanner sc = new Scanner(System.in);
	
	private int rollno;
	private String name;
	private int totalMarks;
	private char grade;
	
	public void assignStudent() {
		System.out.println("enter roll no : ");
		rollno = sc.nextInt();
		System.out.println("enter name : ");
		name = sc.next();
		System.out.println("enter total marks : ");
		totalMarks = sc.nextInt();
	}
	
	public void printStudent() {
		System.out.println("roll no : " + rollno);
		System.out.println("name : " + name);
		System.out.println("total marks : " + totalMarks);
		if(totalMarks > 90)
			grade = 'A';
		else if(totalMarks > 80 && totalMarks <= 90)
			grade = 'B';
		else if(totalMarks > 70 && totalMarks <= 80)
			grade = 'C';
		else if(totalMarks > 60 && totalMarks <= 70)
			grade = 'D';
		else 
			grade = 'F';
		System.out.println("grade : "+grade);
	}

}
