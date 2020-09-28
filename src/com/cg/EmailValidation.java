package com.cg;

import java.util.regex.*;
import java.util.Scanner;

public class EmailValidation {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Email validation program");
		System.out.println("------------------------");
		String email;
		String emailPattern = "^[a-zA-Z0-9+_-]+";
		boolean repeat = true;
		while(repeat) {
			System.out.println("Select option:\n1. Enter mail to check\n2. exit");
			int option = Integer.parseInt(sc.nextLine());
			switch(option) {
			case 1:
				System.out.println("Enter Email Id:");
				email = sc.nextLine();
				if (Pattern.matches(emailPattern,email)) 
					System.out.println("Valid Email");
				else
					System.out.println("Invalid Email");
				break;
			case 2:
				repeat = false;
				break;
			}
		}
	}
}
