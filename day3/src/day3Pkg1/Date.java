package day3Pkg1;

import java.util.Scanner;

public class Date {
	
	Scanner sc = new Scanner(System.in);
	
	private int day,month,year;
	
	public void setDate() {
		System.out.println("enter the date...");
		System.out.println("enter day : ");
		day = sc.nextInt();
		System.out.println("enter month : ");
		month = sc.nextInt();
		System.out.println("enter year : ");
		year = sc.nextInt();
	}
	
	public void displayDate() {
		System.out.println("the date is .....");
		System.out.println(day+"-"+month+"-"+year);
	}

}
