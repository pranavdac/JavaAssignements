package com.com;

import java.util.Scanner;

public class SumOfNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num,sum = 0;
		System.out.println("enter the number : ");
		num = sc.nextInt();
		while(num > 0){
			sum += num;
			System.out.println("enter the number : ");
			num = sc.nextInt();
		}
		System.out.println("the sum of given numbers is : "+sum);

	}

}
