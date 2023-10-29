package com;

import java.util.Scanner;

public class SumOfEvenOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num,sumEven=0,sumOdd=0;
		System.out.println("enter a number : ");
		num = sc.nextInt();
		for(int i=1;i<=num;i++){
			if(i%2==0)
				sumEven += i;
			else
				sumOdd += i;
		}
		System.out.println("sum of even numbers : "+sumEven);
		System.out.println("sum of odd numbers : "+sumOdd);

	}

}
