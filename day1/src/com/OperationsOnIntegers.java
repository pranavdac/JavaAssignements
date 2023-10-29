package com;

import java.util.Scanner;

public class OperationsOnIntegers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1,num2;
		char ch;
		System.out.println("enter two numbers : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		System.out.println("enter the operation to be performed : ");
		ch = sc.next().charAt(0);
		while(ch == '+' || ch == '-' || ch == '*' || ch == '/'){
			switch(ch){
				case '+' : 
					System.out.println(num1 + num2);
					break;

				case '-' :
					System.out.println(num1 - num2);
					break;

				case '*' :
					System.out.println(num1 * num2);
					break;

				case '/' :
					System.out.println(num1 / num2);
					break;

				default : 
					System.out.println("enter valid operation");
			}
		
			System.out.println("enter the operation to be performed : ");
			ch = sc.next().charAt(0);
		}

	}

}
