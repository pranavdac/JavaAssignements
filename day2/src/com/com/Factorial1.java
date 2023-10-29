package com.com;

import java.util.Scanner;

public class Factorial1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num,no,fact = 1;
		System.out.println("enter the number : ");
		num = sc.nextInt();
		no = num;
		while(no != 0){
			fact *= no;
			no--;
		}
		System.out.println("the factorial of "+num+" is : "+fact);

	}

}
