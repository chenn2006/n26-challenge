package org.chennuru.n26.challenge.business.service;

import org.chennuru.n26.challenge.exception.TransactionExpiredException;
import org.chennuru.n26.challenge.exception.TransactionOutOfFutureWindow;
import org.chennuru.n26.challenge.presentation.json.TransactionPostJson;
import org.chennuru.n26.challenge.persistence.entity.Transaction;

public interface TransactionService {
	
	public Transaction process(TransactionPostJson json) throws TransactionExpiredException, TransactionOutOfFutureWindow;

}
