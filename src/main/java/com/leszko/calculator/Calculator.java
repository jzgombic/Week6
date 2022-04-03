package com.leszko.calculator;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;


/**
* Checkstyle I
*/
@Service
/**
* Checkstyle I
*/
public class Calculator {
	
/**
* Checkstyle I
*/
        final static int umlNUMBER1 = 3;
	@Cacheable("sum")
	public int sum(int a, int b) {
		return a + b;
	}
}
