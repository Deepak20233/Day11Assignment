package com.java;

public class Stock {
	
	private String stockName;
    private int numberOfShare;
    private int stockPrice;
    private int totalValueOfStock;

    public Stock(String stockName, int numberOfShare, int stockPrice) {
		super();
		this.stockName = stockName;
		this.numberOfShare = numberOfShare;
		this.stockPrice = stockPrice;
		this.totalValueOfStock =numberOfShare*stockPrice;
		// TODO Auto-generated constructor stub
	}
    public Stock() {
		return;
	}
	public String getStockName() {
		return stockName;
	}
	public void setStockName(String stockName) {
		this.stockName = stockName;
	}
	public int getNumberOfShare() {
		return numberOfShare;
	}
	public void setNumberOfShare(int numberOfShare) {
		this.numberOfShare = numberOfShare;
	}
	public int getStockPrice() {
		return stockPrice;
	}
	public void setStockPrice(int stockPrice) {
		this.stockPrice = stockPrice;
	}
	public int getTotalValueOfStock() {
		return totalValueOfStock;
	}
	public int setTotalValueOfStock() {
		this.totalValueOfStock = numberOfShare*stockPrice;
		return totalValueOfStock;
	}
	@Override
	public String toString() {
		return "Stock [StockName=" + stockName + ", NumberOfShare=" + numberOfShare + ", StockPrice=" + stockPrice
				+ ", TotalValueOfStock=" + totalValueOfStock + "]";
	}
     
     
}
