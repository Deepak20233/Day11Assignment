package com.java;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class CompanyShares {
	private String stockSymbol;
    private Integer stockNos;
    private Double stockVal;
    private LocalDateTime dateTime;
    
    CompanyShares(String stockSymbol,Integer stockNos,Double stockVal){
    	this.stockSymbol=stockSymbol;
    	this.stockNos = stockNos;
    	this.stockVal = stockVal;
    }
    CompanyShares(){
    	
    }
    public String getStockSymbol(){
        return stockSymbol;
    }     
    public void setStockSymbol(String stockSymbol){
        this.stockSymbol = stockSymbol;
    }
    public Integer getStockNos(){
        return stockNos;
    }     
    public void setstockNos(Integer stock_nos){
        this.stockNos = stock_nos;
    }
    public double getStockVal(){
        return stockVal;
    }     
    public void setStockVal(Double stock_val){
        this.stockVal = stock_val;
    }
    public LocalDateTime getdateTime(){
        return dateTime;
    }     
    public void setdateTime(LocalDateTime dateTime){
        this.dateTime = dateTime;
    }
    
    @Override
	public String toString() {
		return "Stocks [stockSymbol=" + stockSymbol + ", stockNos=" + stockNos + ", stockVal=" + stockVal + "]";
	}
}
