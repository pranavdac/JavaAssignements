package com.com;

import java.util.Scanner;

public class DisplayNCharacters {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch;
		int num;
		System.out.println("enter the character : ");
		ch = sc.next().charAt(0);
		System.out.println("enter the number : ");
		num = sc.nextInt();
		System.out.println("the next "+num+" characters are : ");
		while(num != 0){
			System.out.print((++ch)+" ");
			num--;
		}

	}

}
