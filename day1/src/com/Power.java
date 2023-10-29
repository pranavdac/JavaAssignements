package com;

import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		int bas,pow,no,result=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the base : ");
		bas = sc.nextInt();
		System.out.println("enter the power : ");
		pow = sc.nextInt();
		no = pow;
		while(pow!=0){
			result = result*bas;
			pow--;
		}
		System.out.println(bas+" to the power "+no+" is : "+result);

	}

}
