package com.email;

import java.util.Scanner;

public class Email {

	public static void main(String[] args) {
		String s = new String("moon@gmail.com");
		String s1 = new String("J@gmail.com");
		String s2 = new String("dharsh@gmail.com");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Email");
		String pwd = sc.nextLine();
		
		if(s.equals(pwd)) {
			System.out.println("The user s is allowed for login");
			
		}
		else if(s1.equals(pwd)) {
		System.out.println("The user s1 is allowed for login");
		}
		if(s2.equals(pwd)) {
			System.out.println("The user s2 is allowed for login");
		
		}
		else
			System.out.println("Incorrect email");

	}

}