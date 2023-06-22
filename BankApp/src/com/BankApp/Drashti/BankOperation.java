package com.BankApp.Drashti;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BankOperation {
	Scanner s = new Scanner(System.in);
	Scanner s1 = new Scanner(System.in);
	String name;
	int accountNo;
	int balance;
	long mobileNo;

	BankOperation createAccount() {
			
			System.out.print("enter name:");
			name = s1.next();
			System.out.print("Enter Account No:");
			accountNo = s.nextInt();
			System.out.print("Enter Balance:");
			balance = s.nextInt();
			System.out.print("Enter Your Mobile No:");
			mobileNo = s.nextInt();
			s.nextLine();
			System.out.println("================================");
			System.out.println("Your Account has been created");
			printAccountDetail();
			System.out.println("================================");
			return this;
}

	void printAccountDetail() {
		System.out.println("Name: "+name);
		System.out.println("Account No: "+accountNo);
		System.out.println("Your Balance:"+ balance);
		System.out.println("Your mobile No :"+mobileNo);
	}

	void withdraw(int amount) {
		if (balance >= amount) {
			balance = balance - amount;
			System.out.println("=================================");
			System.out.println("Your Withdraw Amount is:" + amount);
			System.out.println("Your Current Balance is:" + balance);
			System.out.println("=================================");
		} else {
			System.out.println("Your Balance Is Insufficient");
		}

	}

	void deposit(int amount) {
	
		balance = balance + amount;
		System.out.println("=================================");
		System.out.println("Your Deposited Amount is:" + amount);
		System.out.println("Your Current Balance is:" + balance);
		System.out.println("=================================");
	}
		
}
