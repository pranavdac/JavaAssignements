package com;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num,tnum,no = 0,rem;
		System.out.println("enter a number : ");
		num = sc.nextInt();
		tnum = num;
		while(tnum!=0){
			rem = tnum%10;
			no = no*10+rem;
			tnum /= 10;
		}
		if(num == no){
			System.out.println(num+" is palindrome");
		}
		else
			System.out.println(num+" is not palindrome");

	}

}
