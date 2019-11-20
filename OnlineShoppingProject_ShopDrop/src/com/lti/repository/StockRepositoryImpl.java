package com.lti.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.model.Stock;

@Repository("stockrepository")
public class StockRepositoryImpl implements StockRepository{
    EntityManager em;
	@Override
	@Transactional
	public Stock addStock(Stock s) {
		em.persist(s);
		return s;
	}

	@Override
	public Stock updateStock(Stock s) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Stock findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Stock> findAllStocks() {
		// TODO Auto-generated method stub
		return null;
	}

}
