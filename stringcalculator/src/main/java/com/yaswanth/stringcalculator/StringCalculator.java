package com.yaswanth.stringcalculator;

public class StringCalculator {
	
	public int add(String numbers) {
		if(numbers == null||numbers.trim().isEmpty()) return 0;
		int sum = 0;
		for(int i=0;i<numbers.length();i++) {
			if(numbers.charAt(i) != ',') {
				sum += numbers.charAt(i) -'0'; 
			}
		}
		return sum;
	}
}
