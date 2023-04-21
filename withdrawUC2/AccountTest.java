package com.java;
import java.util.*;
public class AccountTest {

	public static void main(String[] args) {
    //Account account = new Account();
    int total=Account.accountBalance;
    Scanner sc = new Scanner(System.in);
	System.out.println("Please enter amount to withdraw :");
    int amount=sc.nextInt();
    sc.close();
    Account.debit(total,amount);
	}

}
