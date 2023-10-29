package com.com;

import java.util.Scanner;

public class Power1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num,pow,rem,res = 1;
		System.out.println("enter the base : ");
		num = sc.nextInt();
		System.out.println("enter the power : ");
		pow = sc.nextInt();
		int no = num;
		int xpow = pow;
		while(pow != 0){
			res *= num;
			pow--;
		}
		System.out.println(no+" to the power "+xpow+" is : "+res);

	}

}
