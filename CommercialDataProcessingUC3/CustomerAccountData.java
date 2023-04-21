package com.java;

public interface CustomerAccountData {
	public void stockAccount (String stockName,int stockNos, double stockVal);  
    public double valueOf(); 
    public void buy(int amount, double value, String symbol);
    public void sell(int amount, double value, String symbol); 
    public void save(String filename);
    public void printreport();
}
