package org.nikhil.tdd_demo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	
	Calculator calculator = null;
	
	@Before
	public void createObjectOfCalculator() {
		calculator = new Calculator();
	}
	
	@Test
	public void test_addition_method_for_empty_string() throws Exception {
		int returnvalue = calculator.add("");
		assertEquals(0, returnvalue);
	}
	
	@Test
	public void test_addition_for_single_value_one() throws Exception {
		int returnvalue = calculator.add("1");
		assertEquals(1, returnvalue);
	}
	
	@Test
	public void test_addition_for_single_value_two() throws Exception {
		int returnvalue = calculator.add("10,20");
		assertEquals(30, returnvalue);
	}
	
	@Test
	public void test_addtion_for_n_number_of_values() throws Exception {
		int returnvalue = calculator.add("10,20,30");
		assertEquals(60, returnvalue);
		
	}
	
}
