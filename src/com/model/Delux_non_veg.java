package com.model;

import java.util.Scanner;

public class Delux_non_veg {
		static Scanner sc = new Scanner(System.in);
		int total = 650;
		boolean taflag=false;

		public void takeaway() {
			System.out.println("You Want take away (y/n) : ");
			if ("y".equals(sc.next())) {
				total += 20;
				taflag=true;
			}
		}
		
		public void bill() {
			System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_- Bill -_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
			System.out.println("Pizza : 650");
			if(taflag==true) {
				System.out.println("Take Away Charges : 20");
			}
			System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
			System.out.println("Total :           "+total);
			
		}
	}