package com.lti.service;

import java.util.List;

import com.lti.model.Stock;

public interface StockService {
	public Stock addStock(Stock s);
	public Stock updateStock(Stock s);
	public Stock findById(int id);
	public List<Stock> findAllStocks();
}
