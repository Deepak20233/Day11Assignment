package com.java;
import java.util.*;
public class Account {
	 static int accountBalance=10000;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter amount to withdraw");
        int amount=sc.nextInt();
        sc.close();
        debit(accountBalance,amount);
        
	}
	public static void debit(int accountBalance, int amount) {
		if(amount<=accountBalance) {
        	System.out.println("Amount debited sucessfully!");
        	accountBalance=accountBalance-amount;
        }
        else
        	System.out.println("Declined! no sufficient balance");
        }		
	
	}

