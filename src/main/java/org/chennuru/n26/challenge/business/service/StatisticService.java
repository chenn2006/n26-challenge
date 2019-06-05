package org.chennuru.n26.challenge.business.service;

import java.util.List;

import org.chennuru.n26.challenge.exception.TransactionExpiredException;
import org.chennuru.n26.challenge.exception.TransactionOutOfFutureWindow;
import org.chennuru.n26.challenge.persistence.entity.Statistic;
import org.chennuru.n26.challenge.persistence.entity.Transaction;

public interface StatisticService {
	
	public List<Statistic> findAll();
	public Statistic findCurrent();
	
	public void add(Transaction transaction) throws TransactionExpiredException, TransactionOutOfFutureWindow;
	
}
