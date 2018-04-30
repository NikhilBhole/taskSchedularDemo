package org.nikhil.tdd_demo;

public class Calculator {

	public int add(String input) {
		
		if(input.isEmpty()) {
			return 0;
		}
		else if(input.indexOf(",") != -1) {
			String[] numbers = input.split(",");
			int sum=0;
			for (String string : numbers) {
				sum+= Integer.parseInt(string);
			}
			return sum;
		}
		else {
			return Integer.parseInt(input);
		}
	}

}
