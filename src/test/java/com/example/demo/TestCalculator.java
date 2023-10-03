package com.example.demo;

import static org.junit.Assert.assertEquals;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestCalculator {
	Calculator c=new Calculator();
	@Before
	public void hi() {
		System.out.println("Hello");
	}
	@Test
	public void testAdd() {
		System.out.println(c.add(10,20));
	}
	@Test
	public void testSub() {
		System.out.println(c.sub());
	}
	@Test
	public void testMul() {
		
		c.mul();
	}
	@Test
	public void testDiv() {
		c.div(30,5);
	}
	
	@Test
	public void checkAddSub() {
		assertEquals(c.add(5,5),c.sub());
	}
	
    int[] a= {10,12,13,14,16};
	
	Minimum m=new Minimum();
	@Test
	public void checkMin() {
		assertEquals(m.findMin(a),10);
	}
	
	String[] b= {"priya","dharshini","jagan","priyadharshini"};
	MaxLengthWord l=new MaxLengthWord();

	@Test
	public void checkMaxLengthWord() {
		assertEquals(l.findMaxLength(b),"priyadharshini");
	}
	
	
	@After
	public void display() {
		System.out.println("Bye");
	}
	
}
