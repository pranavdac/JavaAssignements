package com;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		int angle1,angle2,angle3,sum;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter angles of the triangle : ");
		angle1=sc.nextInt();
		angle2=sc.nextInt();
		angle3=sc.nextInt();
		sum=angle1+angle2+angle3;
		if(sum==180)
			System.out.println("the triangle is valid");
		else
			System.out.println("the triangle is invalid");

	}

}
