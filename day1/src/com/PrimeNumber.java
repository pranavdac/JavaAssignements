package com;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		boolean flag = true;
		System.out.println("enter a number : ");
		num = sc.nextInt();
		for(int i=2;i<num;i++){
			if(num%i==0){
				flag = false;
				break;
			}
		}
		if(flag==true){
			System.out.println(num+" is prime number");
		}
		else
			System.out.println(num+" is not prime number");

	}

}
