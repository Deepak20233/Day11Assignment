package com.java;
import java.util.*;

public class StockAccount extends CompanyShares implements CustomerAccountData {
	ArrayList <CompanyShares> accounts = new ArrayList<CompanyShares>();
    /*
    Function1:Create a new account from file
    */
    @Override
    public void stockAccount(String stockName,int stockNos, double stockVal )  
    {   
    	
    	accounts.add(new CompanyShares(stockName,stockNos,stockVal));
    }
    /*
    Function2:    Compute total value of all the stocks
    */
    @Override
    public double valueOf()  // total value of account dollars
    {   
    	double value = 0.0;
    	double sum = 0.0;
    	for (CompanyShares companyShares : accounts) {
			//System.out.println(companyShares);
			 value = companyShares.getStockVal();
			 sum = value + sum ;
		}
        System.out.println("The total value of all the stocks in account = "+ sum);
        return sum;
    }
    
    // add shares of stock to account
    @Override
    public void buy(int stockNos, double StockValue, String symbol) 
    {   
    	System.out.println("\n"+ "*******************BUY*******************"); 
    	int indx = -1;
    	boolean exists= false;
    	
    		for (CompanyShares companyShares : accounts) {
    			indx++;
    		String stockNameToCompare = companyShares.getStockSymbol();
    	    if(symbol.equals(stockNameToCompare))
    		 {
    	    	exists= true;
    	    	int updatedStockNos= stockNos + companyShares.getStockNos();
    	    	double updatedStockValue = StockValue + companyShares.getStockVal();
    	    	companyShares.setstockNos(updatedStockNos);
    	    	companyShares.setStockVal(updatedStockValue);
    	    	accounts.set(indx, companyShares);
    	    	System.out.println("The shares have been added successfully");
                break;
    		 }
    	    	 
    		}
    		if (!exists){
	             System.out.println("You don't have any shares of this company at present.So adding a new account:");
	             accounts.add(new CompanyShares(symbol,stockNos,StockValue));
	         }
	    
    	 
	}
    
 // Sell shares of stock from account
    @Override
    public void sell(int stockNos, double StockValue, String symbol) 
    {  
    	System.out.println("\n"+ "*******************SELL*******************"); 
    	int indx = -1;
    		for (CompanyShares companyShares : accounts) {
    			indx++;
    		String stockNameToCompare = companyShares.getStockSymbol();
    	    if(symbol.equals(stockNameToCompare))
    		 {
    	    	int balanceStockNos= companyShares.getStockNos();
    	    	double balanceStockValue =  companyShares.getStockVal();
    	    	  if (indx==-1){
    	              System.out.println("Sorry , You dont own any shares of this company");
    	          }
    	          else if (balanceStockNos<stockNos){
    	              System.out.println("Sorry, You dont have enough shares of this company");
    	          }
    	          else if (balanceStockNos>stockNos){
    	        	    int updatedStockNos= companyShares.getStockNos() - stockNos;
    	    	    	double updatedStockValue =  companyShares.getStockVal()- StockValue;
    	    	    		
    	        	  	companyShares.setstockNos(updatedStockNos);
    	        	  	companyShares.setStockVal(updatedStockValue);
    	        	  	accounts.set(indx, companyShares);
    	        	  	System.out.println("The shares have been subtracted successfully");
    	        	  	break;
    	          }
    		 }
    		}
	} 
    
    @Override
    public void save(String filename)  
    {
        //System.out.println("To be understood");
    }
    
    @Override
    public void printreport() 
    {
    	System.out.println("\n" + "*************Report Genarated*************");
        System.out.println("Stockname-------StockNumbers--------StockValue");
        for (CompanyShares companyShares : accounts) {
        	System.out.println( companyShares.getStockSymbol()+"------------" 
        			+ companyShares.getStockNos()+"------------" 
        			+ companyShares.getStockVal());
			
		}        
    }					
    public static void main(String []args){
        StockAccount sa = new StockAccount();
        sa.stockAccount("Infosys",200,5000);
        sa.stockAccount("HP",5,2000);
        sa.valueOf();
        sa.buy(100, 4000, "Infosys");
        sa.valueOf();
        sa.sell(100, 2000, "Infosys");
        sa.valueOf();
        sa.printreport();
    }
}