package com.dwivedy.currencyExchange;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.dwivedy.currencyExchange.service.impl.Person;

@SpringBootApplication
public class CurrencyExchangeApplication {

	public static void main(String[] args) {
		Map <Person, String> abcbgb=  new HashMap<>();
		abcbgb.put(new Person(1,"a"), "1");
		abcbgb.put(new Person(1,"a"), "4");
		System.out.println(abcbgb);
		SpringApplication.run(CurrencyExchangeApplication.class, args);
	}
	
	
	
}
