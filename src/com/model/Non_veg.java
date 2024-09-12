package com.model;

import java.util.Scanner;

public class Non_veg {

		static Scanner sc = new Scanner(System.in);
		int total = 400;
		boolean tflag=false;
		boolean cflag=false;
		boolean taflag=false;

		public void topping() {
			System.out.println("You Want add extra toppings (y/n) : ");
			if ("y".equals(sc.next())) {
				tflag=true;
				total += 150;
			}
		}

		public void cheese() {
			System.out.println("You Want add extra cheese (y/n) : ");
			if ("y".equals(sc.next())) {
				total += 100;
				cflag=true;
			}
		}

		public void takeaway() {
			System.out.println("You Want take away (y/n) : ");
			if ("y".equals(sc.next())) {
				total += 20;
				taflag=true;
			}
		}
		
		public void bill() {
			System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_- Bill -_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
			System.out.println("Pizza : 400");
			if(tflag==true) {
				System.out.println("Extra Toppings : 150");
			}
			if(cflag==true) {
				System.out.println("Extra Cheese : 100");
			}
			if(taflag==true) {
				System.out.println("Take Away Charges : 20");
			}
			System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
			System.out.println("Total :           "+total);
			
		}
	}
