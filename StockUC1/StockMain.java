package com.java;
import java.util.*;
public class StockMain{

	public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int value=0;int sum =0;
    List<Stock> listStocks = new ArrayList<Stock>();
	Stock stock = new Stock();
	boolean exit = false;
	System.out.println("Enter Your Choice");	

	while (!exit) {
		System.out.println("1.Enter Stocks Details\t 2.Total Stock Price\t  3.Quit");
		int choice = sc.nextInt();

		switch (choice) {
		case 1:
	
			System.out.println("Enter the Stock name");
			String stockName = sc.next();

			System.out.println("Enter number of shares");
			int numberShare = sc.nextInt();

			System.out.println("Enter Stock price");
			int stockPrice = sc.nextInt();

			listStocks.add(new Stock(stockName, numberShare, stockPrice));
			break;
		case 2:
			
			for (Stock stocks : listStocks) {
				System.out.println(stocks);
				 value = stocks.setTotalValueOfStock();
				 sum = value + sum ;
			}

			System.out.println("Value Of Total Stock for all :" + sum);
			break;
			
          case 3:
        	  	exit=true;
			break;
		}

	         }
	}	
}
