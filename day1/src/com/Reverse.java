package com;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num,rem;
		System.out.println("enter a number : ");
		num = sc.nextInt();
		System.out.print("the reverse of "+num+" is : ");
		while(num != 0){
			rem = num%10;
			System.out.print(rem);
			num /= 10;
		}

	}

}
