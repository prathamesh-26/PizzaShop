package com.user;

import java.util.Scanner;

import com.model.Delux_Veg;
import com.model.Delux_non_veg;
import com.model.Non_veg;
import com.model.Veg;

public class Test {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int choice=0;
		do {
			System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_- Welcome To Pizza Shop -_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
			System.out.println("\n1. Veg Pizza\n2. Non-Veg Pizza\n3. Delux Veg Pizza\n4. Delux Non-Veg Pizza\n5. Exit\n\nEnter Your Choice : ");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				Veg v = new Veg();
				v.topping();
				v.cheese();
				v.takeaway();
				v.bill();
				break;
				
			case 2:
				Non_veg n = new Non_veg();
				n.topping();
				n.cheese();
				n.takeaway();
				n.bill();
				break;
				
			case 3:
				Delux_Veg dv = new Delux_Veg();
				dv.takeaway();
				dv.bill();
				break;
				
			case 4: 
				Delux_non_veg dn = new Delux_non_veg();
				dn.takeaway();
				dn.bill();
				break;
				
			case 5:
				System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_- Thank you -_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
				System.exit(0);
			default : 
				System.out.println("Incorrect Choice......");
			}
		}while(choice!=5);
		
		sc.close();
	}

}
