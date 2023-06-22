package com.BankApp.Drashti;

import java.util.Scanner;

public class BankDetail {

	Scanner s=new Scanner(System.in);
	Scanner s1=new Scanner(System.in);
	String name;
	int accountNo;
	int balance;
	long mobileNo;
     void createAccount()
	{
		System.out.println("enter name:");
	    name=s1.nextLine();
		System.out.println("Enter Account No:");
		accountNo=s.nextInt();
		System.out.println("Enter Balance");
		balance=s.nextInt();
		System.out.println("Enter Your Mobile No:");
		mobileNo=s.nextInt();
		}
	void printAccountDetail() {
		System.out.println(name);
		System.out.println(accountNo);
		System.out.println(balance);
		System.out.println(mobileNo);
	}
	void withdraw(int amount)
	{
		if(balance>=amount) {
		balance=balance-amount;
		System.out.println("Your Withdraw Amount is:"+amount);
		System.out.println("Your Current Balance is:"+balance);
		}
		else {
			System.out.println("Your Balance Is Insufficient");
		}
		
	}
	void deposit(int amount)
	{
		balance=balance+amount;
		System.out.println("Your Deposited Amount is:\n"+amount);
		System.out.println("Your Current Balance is:"+balance);
	}

	void showMenu() {
	
		char option;
		 do { 
			    System.out.println("C for Create");
				System.out.println("P for Print Account Detail");
				System.out.println("D for Deposit");
				System.out.println("W for Withdraw");
				System.out.println("B for Current Balance");
				System.out.println("E for Exit");
		        System.out.println("Enter an option"); 
		        
		        option=s.next().charAt(0);
		 switch(option) { 
		 case 'C','c':
		 System.out.println("Create Your Account:");
		 createAccount();
		 break;
		 case 'P','p':
	     System.out.println("=======================");
	     printAccountDetail();
	     System.out.println("=======================");
		 break;
		 case 'D','d':
		if(balance!=0) {
		 System.out.println("how much do you want to Deposit:");
		 int amountDeposit=s.nextInt(); 
		 deposit(amountDeposit); 
		}
		else
		{
			System.out.println("Your Account has not been created");
		}
		 break;
		 case 'W','w':
		 System.out.println("how much do you want to Withdraw:"); 
		 int amountWithdraw=s.nextInt(); 
		 withdraw(amountWithdraw);
		 break; 
		 case 'B','b':
		 System.out.println("==============================");
		 System.out.println("Your Balance is:"+balance);
		 System.out.println("==============================");
		 break; 
		 case 'E','e':
		 System.out.println("Exit Menu");
		 break;
		 default: System.out.println("Invalid Option!! Please Enter Again"); 
		 }
		 }while(option!='E');
		 System.out.println("Thank You For Using Our Services");

}

}