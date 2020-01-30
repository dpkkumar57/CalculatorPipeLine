package com.deepak.practice.Jenkins;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;
import com.deepak.practice.Jenkins.*;

public class CalcJenkinTest {

	@Test
	public void addTest() {
		Calculator calc = new Calculator();
		assertEquals(10,calc.add(5, 5));
		System.out.println("Testing Branch");
	}
	
	@Test
	public void subTest() {
		Calculator calc = new Calculator();
		assertEquals(2, calc.sub(6, 4));
	}
}
