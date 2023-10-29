package com;

import java.util.Scanner;

public class GreatestOfThree {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		System.out.println("enter the three numbers : ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		if(a > b){
			if(a > c)
				System.out.println(a+" is the greatest");
			else
				System.out.println(c+" is the greatest");
		}
		else{
			if(b > c)
				System.out.println(b+" is the greatest");
			else
				System.out.println(c+" is the greatest");
		}

	}

}
