package com.rodrigopeleias.currencyobserver.model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.rodrigopeleias.currencyobserver.model.builder.PercentageBuilder;

public class PercentageTest {
	
	private Percentage percentage;
	
	@Before
	public void setUp() {
		percentage = new PercentageBuilder()
							.with(10f)
							.build();	
	}

	@Test
	public void testOverPercentage() {
		assertTrue(percentage.isOver(17));
	}
	
	@Test
	public void testUnderPercentage() {
		assertFalse(percentage.isOver(7));
	}

}
