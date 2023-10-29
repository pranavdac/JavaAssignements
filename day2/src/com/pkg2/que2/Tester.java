package com.pkg2.que2;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Array arr = new Array();
		
		int choice;
		int [] arr1 = new int[6];
	    do {
		System.out.println("1.Show Array\n2.Add Element");
		System.out.println("3.Search Element\n4.Double Array Element");
		System.out.println("5.Sort array\n6.Exit");
		System.out.println("enter your choice...");
		choice = sc.nextInt();
		switch(choice) {
		
		case 1 :
			arr.ShowArray(arr1);
			break;
		
		case 2 :
			arr.AddElement(arr1);
			break;
			
		case 3 :
			arr.SearchElement(arr1);
			break;
			
		case 4 :
			arr.DoubleArrayElement(arr1);
			break;
		
		case 5 :
			arr.SortArray(arr1);
			break;
		}
		
		
	    }while(choice != 6);
	    
	    System.out.println("program finished...!");
	}

}
