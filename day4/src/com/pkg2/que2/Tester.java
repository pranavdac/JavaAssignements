package com.pkg2.que2;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		
		int choice,index = 0,id;
		String name,color;
		double price;
		Scanner sc = new Scanner(System.in);
		Vehicle [] varr = new Vehicle[10];
		System.out.println("1.Show all\n2.Add vehicle\n3.Edit color\n4.Edit price\n5.Remove\n6.Exit");
		do {
			System.out.print("enter your choice : ");
			choice = sc.nextInt();
			switch(choice) {
				
			case 1 :
				for(Vehicle i : varr) {
					System.out.println(i);
				}
				break;
				
			case 2 :
				System.out.println("enter the car details :");
				System.out.print("enter car id : ");
				id = sc.nextInt();
				System.out.print("enter car name : ");
				name = sc.next();
				System.out.print("enter car color : ");
				color = sc.next();
				System.out.print("enter car price : ");
				price = sc.nextDouble();
				varr[index] = new Vehicle(id,name,color,price);
				index++;
				break;
				
			case 3 :
				System.out.print("enter the car id : ");
				id = sc.nextInt();
				for(Vehicle i : varr) {
					if(i != null) {
					if (i.getId() == id) {
						System.out.print("enter the color : ");
						color = sc.next();
						i.setColor(color);
					} else {
						System.out.println("car not exists..!");
					}
				}
				}
				break;
				
			case 4 :
				System.out.print("enter the car id : ");
				id = sc.nextInt();
				for(Vehicle i : varr) {
					if(i != null) {
					if(i.getId() == id) {
						System.out.print("enter the car price : ");
						price = sc.nextDouble();
						i.setPrice(price);
					}else {
						System.out.println("car does not exists..!");
					}
					}
				}
				break;
				
			case 5 :
				System.out.print("enter the car id : ");
				id = sc.nextInt();
				for(Vehicle i : varr) {
					if(i != null) {
					if(i.getId() == id) {
						i = null;
					} else {
						System.out.println("car does not exists..!");
					}
					}
				}
				System.out.println("car removed succesfully...!");
				index--;
				break;
				
			case 6 :
				System.out.println("Exit");
				System.exit(0);
				
			default :
				System.out.println("enter the valid choice...!");
			}
			
		}while(choice != 6);
		System.out.println("thank you ...!");
	}
	}
	