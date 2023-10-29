package com;

import java.util.Scanner;

public class SumOfSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num,sum=0;
		System.out.println("enter a number : ");
		num = sc.nextInt();
		for(int i=1;i<=num;i++){
			sum += i;
		}
		System.out.println("sum of numbers till "+num+" is : "+sum);

	}

}
