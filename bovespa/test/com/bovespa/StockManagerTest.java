package com.bovespa;

import java.io.IOException;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

import org.junit.Test;

public class StockManagerTest {
	private LocalDate dateToCompare = LocalDate.of(2016, Month.MARCH, 21);
	private DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	@Test
	public void loadStocksTest() throws IOException {
		StockManager stockManager = new StockManager();
		Stock[] stocks = stockManager.loadStocks("Z:/ESTD - Arquivos/COTAHIST_A2016.txt");

		for (Stock stock : stocks) {
			if (stock.getCode().equals("PETR4") && stock.getDate().isEqual(dateToCompare)) {
				System.out.println("Preço de Abertura da ação PETR4 na dia " + dateToCompare.format(dtf) + ": R$ " + stock.getOpenPrice());
			}
		}
	}

}
