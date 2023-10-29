package com.pkg1.que1;

public class MathOperation {
	
	public void add(int a,int b) {
		System.out.println(a+" + "+b+" = "+(a+b));
	}
	
	public void add(double x,double y) {
		System.out.println(x+" + "+y+" = "+(x+y));
	}
	
	public void sumNumbers(int ... args) {
		System.out.println("number of arguments : "+args.length);
		int sum = 0;
		for(int x : args) {
			sum += x;
		}
		System.out.println("sum of numbers is : "+sum);
	}
	
}
