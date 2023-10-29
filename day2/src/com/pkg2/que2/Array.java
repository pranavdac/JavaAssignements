package com.pkg2.que2;

import java.util.Scanner;

public class Array {
	
	Scanner sc = new Scanner(System.in);
	int index = 0;
	
	public void ShowArray(int [] arr) {
		System.out.println("the array is ...");
		for(int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println();
	}

	public void AddElement(int [] arr) {
		System.out.println("enter the element to be added : ");
		int num = sc.nextInt();
		arr[index] = num;
		index++;
		System.out.println("the element is added succesfully...");
	}
	
	public void SearchElement(int [] arr) {
		System.out.println("enter the element to be searched : ");
		int num = sc.nextInt();
		boolean flag = false;
		for(int i : arr) {
			if(num == i) {
				flag = true;
				break;
			}
		}
		if(flag == true)
			System.out.println(num+" is present in the array..");
		else
			System.out.println(num+" is not present in the array..");		
	}
	
	public void DoubleArrayElement(int [] arr) {
		for(int i = 0; i < 6;i++)
			arr[i] *= 2;
		System.out.println("array elements are doubled...");
	}
	
	public void SortArray(int [] arr) {
        int min = 0;
		for(int i = 0; i < arr.length-1;i++) {
			min = arr[i];
			for(int j = i + 1;j < arr.length;j++) {
				if(arr[j] < min) {
					int temp;
					temp = min;
					min = arr[j];
					arr[j] = temp;
				}
			}
		}
			
		
			
		
	}
}
