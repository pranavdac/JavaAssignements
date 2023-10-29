package com;

import java.util.Scanner;

public class IncomeTax {

	public static void main(String[] args) {
		double bas_sal,Tax=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the basic salary : ");
		bas_sal = sc.nextFloat();
		if(bas_sal<=150000){
			Tax = 0;
		}

		else if(bas_sal>150000 && bas_sal<=300000){
			Tax = bas_sal*0.20;
		}

		else if(bas_sal>300000){
			Tax = bas_sal*0.30;
		}

		System.out.println("the tax for salary is : "+Tax);


	}

}
