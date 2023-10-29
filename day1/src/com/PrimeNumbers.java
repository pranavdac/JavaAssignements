package com;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		boolean flag;
		System.out.println("enter a number : ");
		num = sc.nextInt();
		System.out.println("the prime numbers till "+num+" are : ");
		for(int i=1;i<num;i++){
			flag = true;
			for(int j=2;j<i;j++){
				if(i%j==0){
					flag = false;
					break;
				}
			}
			if(flag == true)
				System.out.print(i+" ");
		}

	}

}
