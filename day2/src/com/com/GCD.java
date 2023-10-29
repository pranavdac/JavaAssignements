package com.com;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1,num2,GCD=1;
		System.out.println("enter the two numbers : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		for(int i = 1; i <= num1 && i <= num2;i++){
			if((num1 % i == 0) && (num2 % i == 0))
				GCD = i;
		}
		System.out.println("GCD of "+num1+" and "+num2+" is : "+GCD);

	}

}
