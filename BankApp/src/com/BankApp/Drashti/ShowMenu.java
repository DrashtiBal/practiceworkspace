package com.BankApp.Drashti;

import java.util.InputMismatchException;
import java.util.Objects;

public class ShowMenu extends BankOperation {
	
BankOperation bo =null;
int option;
	public void menu() {
		
		do {
		//while(option!="E" || option!="e") { 
			 try {
			    System.out.println("1. for Create Account");
				System.out.println("2. for Print Account Detail");
				System.out.println("3. for Deposit");
				System.out.println("4. for Withdraw");
				System.out.println("5. for Current Balance");
				System.out.println("6. for Exit");
		        System.out.println("Enter an option"); 
		       option=s.nextInt();	
		       
		  switch(option) { 
		  case 1:
		  System.out.println("Create Your Account:");
		  bo=createAccount();
		  break;
		  case 2:
			  if(!Objects.isNull(bo)) {
	      System.out.println("=======================");
	      printAccountDetail();
	      System.out.println("=======================");
			  }
			  else
			  {
				  System.out.println("===================================");
				  System.out.println("your Account Has Not Been Created!!!");
				  System.out.println("===================================");
			  }
		  break;
		  case 3:
		  if(!Objects.isNull(bo) ) {
			System.out.println("how much do you want to Deposit:");
			int amountDeposit=s.nextInt(); 
			deposit(amountDeposit);
			s.nextLine();
		}
		else
		{
		System.out.println("===================================");
		System.out.println("Your Account has not been created");
		System.out.println("===================================");
		}
		 break;
		 case 4:
			 if(balance!=0) {
		 System.out.println("how much do you want to Withdraw:"); 
		 int amountWithdraw=s.nextInt(); 
		 withdraw(amountWithdraw);
		 s.nextLine();
			 }
		 else {
			 System.out.println("===================================");
			 System.out.println("your Account has not been created!!!");
			 System.out.println("===================================");
		 }
		 break; 
		 case 5:
		 if(!Objects.isNull(bo)) {
		 System.out.println("===================================");
		 System.out.println("Your Balance is:"+balance);
		 System.out.println("===================================");
			 }
		 else
		 {
			 System.out.println("===================================");
			 System.out.println("Your Account has not been created");
			 System.out.println("===================================");
		 }
		 break; 
		 case 6:
		 System.out.println("Exit Menu");
		// System.exit(0);
		 break;
		 default:System.out.println("Invalid Option!! Please Enter Again"); 
		 }}catch(InputMismatchException i)
		        {
			 		System.out.println("Your input is invalid");
			 		s.nextLine();
		        }
		 }while(option!=6);
		 System.out.println("Thank You For Using Our Services");
	}
}



