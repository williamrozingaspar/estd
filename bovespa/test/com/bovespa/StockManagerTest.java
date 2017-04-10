package com.bovespa;

import java.io.IOException;

import org.junit.Test;

public class StockManagerTest {

	@Test
	public void loadStocksTest() throws IOException{
		StockManager stockManager = new StockManager();
		Stock[] stocks = stockManager.loadStocks("C:/eclipseneon2/COTAHIST_A2016.txt");
		
		for (Stock stock : stocks) {
			if(stock.getCode().equals("PETR4") && stock.getDate().getDayOfMonth() == 21 & stock.getDate().getMonthValue() == 3 & stock.getDate().getYear() == 2016) {
				System.out.println(stock.getOpenPrice());
			}
		}
	}
	
}
