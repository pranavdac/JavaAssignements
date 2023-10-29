package day3Pkg1;

import java.util.Scanner;

public class BankAccount {
	
	Scanner sc = new Scanner(System.in);
	
	private int accno;
	private String name;
	private double balance;
	
	public BankAccount() {
		
		System.out.println("enter the customer details : ");
		System.out.println("enter account number : ");
		accno = sc.nextInt();
		System.out.println("enter name : ");
		name = sc.next();
		System.out.println("enter balance : ");
		balance = sc.nextDouble();
		
	}
	
	public void withdraw() {
		double amount;
		System.out.println("enter the amount to be withdrawn : ");
		amount = sc.nextDouble();
		if(amount > balance)
			System.out.println("not enough balance....");
		else {
			System.out.println("amount withdrawn successfully...");
			balance = balance - amount;
			System.out.println("current balance is : "+balance);
			System.out.println("thank you...");
		}
		
	}
	
	public void deposit() {
		double amount;
		System.out.println("enter the amount to deposited : ");
		amount = sc.nextDouble();
		System.out.println("amount deposited successfully...");
		balance = balance + amount;
		System.out.println("current balance is : "+balance);
		System.out.println("thank you...");
	}

}
