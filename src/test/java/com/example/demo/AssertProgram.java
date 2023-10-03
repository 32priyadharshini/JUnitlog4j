package com.example.demo;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;

public class AssertProgram {
	@Test
	public void testAssertEqual() {
		assertEquals(10,10);
	}
	
	@Test
	public void testAssertTrue() {
		boolean a=10>7;
		assertTrue(a);
	}
	
	@Test
	public void testSame() {
		assertSame("Nisha","Nisha");
	}
	
	@Test
	public void testNUll() {
		assertNull(null,"Abc");
	}
	@Test
	public void testArrayEquals() {
		int[] a= {5,10,15};
		int[] b= {5,10,15};
		assertArrayEquals(a,b);
	}
	
	@Test
	public void testNotSame() {
		assertNotSame("priya","rajan");
	}
	
	@Test
	public void testNotEquals() {
		assertNotEquals(10,4);
	}
	
	@Test
	public void testNotNull() {
		assertNotNull("anc","did");
	}
	@Test
	public void testFalse() {
		boolean a=5>7;
		assertFalse(a);
	}

}
