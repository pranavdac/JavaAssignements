package com;

import java.util.Scanner;

public class Vowel {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch;
		System.out.println("enter a character : ");
		ch = sc.next().charAt(0);
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
			System.out.println("the character "+ch+" is a vowel");
		else
			System.out.println("the character "+ch+" is a consonant");

	}

}
