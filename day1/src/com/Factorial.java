package com;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num,no,fact=1;
		System.out.println("enter a number : ");
		num = sc.nextInt();
		no=num;
		while(num!=0){
			fact=fact*num;
			num--;
		}
		System.out.println("the Factorial of "+no+" is : "+fact);

	}

}
