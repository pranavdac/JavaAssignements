package com.pkg1.que1;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		Point2D pt = new Point2D(12,20);
		System.out.println(pt);
		
		int x,y,choice,index = 0;
		Scanner sc = new Scanner(System.in);
		
		Point2D [] parr = new Point2D[5];
		
		System.out.println("1.show all\n2.add new\n3.Exit");
		
		do {
			System.out.println("enter you choice : ");
			choice = sc.nextInt();
			switch(choice) {
			case 1 :
				for(Point2D i : parr) {
					System.out.println(i);
				}
				break;
				
			case 2 :
				System.out.print("enter the value of X : ");
				x = sc.nextInt();
				System.out.print("enter the value of Y : ");
				y = sc.nextInt();
				parr[index] = new Point2D(x,y);
				index++;
				break;
				
			default :
				System.out.println("enter the valid choice");
			
			}
		}while(choice != 3);
		
		System.out.println("program finished");
		
	}
	
}
