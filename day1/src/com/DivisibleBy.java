package com;

import java.util.Scanner;

public class DivisibleBy {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("enter a number : ");
		num=sc.nextInt();
		if(num%5==0 && num%7==0)
			System.out.println(num+" is divisible by 5 and 7");
		else
			System.out.println(num+" is not divisible by 5 and 7");

	}

}
