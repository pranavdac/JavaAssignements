package day3Pkg2;

import java.util.Scanner;

public class BankAccount {
	
	Scanner sc = new Scanner(System.in);
	
	private int accno;
	private double balance;
	
	public void acceptInfo() {
		System.out.println("enter the customer details...");
		System.out.println("enter the accno : ");
		accno = sc.nextInt();
		System.out.println("enter the balance : ");
		balance = sc.nextDouble();
	}
	
	public void withdraw() {
		double amount;
		System.out.println("enter the amount to be withdrawn : ");
		amount = sc.nextDouble();
		if (amount > balance)
			System.out.println("not enough balance....");
		else {
			System.out.println("amount withdrawn succesfully...");
			balance = balance - amount;
			System.out.println("current balance is : "+balance);
		}
	}
	
	public void deposit() {
		double amount;
		System.out.println("enter the amount to be deposited : ");
		amount = sc.nextDouble();
		balance = balance + amount;
		System.out.println("amount deposited succesfully...");
		System.out.println("current balance is : "+balance);
	}
	
	public void moneyTransfer() {
		int acc;
		double amount;
		System.out.println("enter the beneficiery account number : ");
		acc = sc.nextInt();
		System.out.println("enter the amount to transfered : ");
		amount = sc.nextDouble();
		System.out.println("money transfered succesfully...");
		balance = balance - amount;
		System.out.println("current balance is : "+balance);
		
	}

}
