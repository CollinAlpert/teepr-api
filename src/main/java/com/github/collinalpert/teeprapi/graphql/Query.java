package com.github.collinalpert.teeprapi.graphql;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.github.collinalpert.teeprapi.entities.Currency;
import com.github.collinalpert.teeprapi.services.CurrencyService;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Query implements GraphQLQueryResolver {

	private final CurrencyService currencyService;

	public Query(CurrencyService currencyService) {
		this.currencyService = currencyService;
	}

	public List<Currency> getCurrencies() {
		return this.currencyService.getAll();
	}
}
