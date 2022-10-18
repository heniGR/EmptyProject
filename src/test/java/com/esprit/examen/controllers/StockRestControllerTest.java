package com.esprit.examen.controllers;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.esprit.examen.repositories.StockRepository;
import com.esprit.examen.services.StockServiceImpl;
import com.esprit.examen.entities.Stock;

@SpringBootTest
class StockRestControllerTest {
	
	@Autowired
	StockServiceImpl stockImpl;

	@Test
	public void testAddStock() {
	//	List<Stock> stocks = stockService.retrieveAllStocks();
	//	int expected=stocks.size();
		Stock s = new Stock(10L,"stock test",100,20,null);
		Stock savedStock= stockImpl.addStock(s);
		
	//	assertEquals(expected+1, stockService.retrieveAllStocks().size());
		assertNotNull(savedStock.getLibelleStock());
		//stockImpl.deleteStock(savedStock.getIdStock());
	}

	

}
