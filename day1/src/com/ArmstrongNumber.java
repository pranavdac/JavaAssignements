package com;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num,no1,no2,rem,cnt = 0,sum = 0,res;
		System.out.println("enter a number : ");
		num = sc.nextInt();
		no1 = num;
		no2 = num;
		while(no1 != 0){
			rem = no1%10;
			cnt++;
			no1 /= 10;
		}
		while(no2 != 0){
			int x = cnt;
			res = 1;
			rem = no2%10;
			while(x != 0){
				res *= rem;
				x--;
			}
			sum += res;
			no2 /= 10;
		}
		if(num == sum)
			System.out.println("the "+num+" is Armstrong");
		else
			System.out.println("the "+num+" is not Armstrong");

	}

}
