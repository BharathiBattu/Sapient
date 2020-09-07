package com.sapient.training.ui;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		Calculator calculator=new Calculator();
	assertEquals("BeforeClass passed",5.0,calculator.addition(4.0, 1.0),0.01);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		Calculator calculator=new Calculator();
		assertEquals("AfterClass passed",5.0,calculator.addition(4.0, 1.0),0.01);
	}

	@Before
	public void setUp() throws Exception {
		Calculator calculator=new Calculator();
		assertEquals("Before passed",5.0,calculator.addition(4.0, 1.0),0.01);
	}

	@After
	public void tearDown() throws Exception {
		Calculator calculator=new Calculator();
		assertEquals("After passed",5.0,calculator.addition(4.0, 1.0),0.01);
	}

	@Test
	public void ValidTestAddition() {
		Calculator calculator=new Calculator();
		assertEquals("Addition",5.0,calculator.addition(4.0, 1.0),0.01);
	}

	@Test
	public void ValidTestSubstraction() {
		Calculator calculator=new Calculator();
		assertEquals("Substraction",5.0,calculator.substraction(10.0, 5.0),0.01);
	}

}
