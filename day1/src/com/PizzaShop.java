package com;

import java.util.Scanner;

public class PizzaShop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int qty,total = 0;
		char ch;
		System.out.println("1.cheeze pizza Rs.250");
		System.out.println("2.onion pizza Rs.200");
		System.out.println("3.mexican pizza Rs.350");
		System.out.println("4.perry perry pizza Rs.300");
		System.out.println("5.Exit");
		System.out.println("Please select your Pizza : ");
		ch = sc.next().charAt(0);

		while(ch!='5'){
		switch(ch){
			case '1' :
			System.out.println("enter the quantity for cheeze pizza : ");
			qty = sc.nextInt();
			total += 250*qty;
			break;

			case '2' :
			System.out.println("enter the quantity for onion pizza : ");
			qty = sc.nextInt();
			total += qty*200;
			break;

			case '3' :
			System.out.println("enter the quatity for the mexican pizza : ");
			qty = sc.nextInt();
			total += qty*350;
			break;

			case '4' :
			System.out.println("enter the quantity for the perry perry pizza : ");
			qty = sc.nextInt();
			total += qty*300;
			break;
			
		}
		System.out.println("enter your choice : ");
		ch = sc.next().charAt(0);
	  }

		System.out.println("---thank you--- your bill is : "+total);

	}

}
