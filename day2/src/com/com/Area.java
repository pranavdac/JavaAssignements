package com.com;

import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char choice;
		System.out.println("1.Area Of Circle");
		System.out.println("2.Area Of Reactangle");
		System.out.println("3.Area Of Triangle");
		System.out.println("4.Exit");
		System.out.println("enter your choice : ");
		choice = sc.next().charAt(0);
		while(choice != '4'){
			switch(choice){

				case '1' :
				int rad;
				System.out.println("enter the radius of the circle : ");
				rad = sc.nextInt();
				System.out.println("the area of circle is : "+(3.14*rad*rad));
				break;

				case '2' :
				int len,brd;
				System.out.println("enter the length of the rectangle :");
				len = sc.nextInt();
				System.out.println("enter the breadth of the rectangle : ");
				brd = sc.nextInt();
				System.out.println("the area of the rectangle is : "+(len*brd));
				break;

				case '3' :
				int bas,ht;
				System.out.println("enter the base of triangle : ");
				bas = sc.nextInt();
				System.out.println("enter the height of the triangle : ");
				ht = sc.nextInt();
				System.out.println("the area of the traingle is : "+(0.5*bas*ht));
				break;

				default :
				System.out.println("enter valid choice");
				break;
			}
			System.out.println("enter your choice : ");
			choice = sc.next().charAt(0);
		}

	}

}
