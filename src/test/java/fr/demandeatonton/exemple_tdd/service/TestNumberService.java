package fr.demandeatonton.exemple_tdd.service;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import fr.demandeatonton.exemple_tdd.exception.InvalidListException;

public class TestNumberService {

	@Test
	public void testBiggestNumber() {
		int[] list = new int[] { 7, 8, 9 };

		NumberService numberService = new NumberService();

		int biggest = numberService.biggestNumber(list);
		assertEquals(9, biggest);

		int[] list2 = new int[] { 1, 2, 3 };
		int biggest2 = numberService.biggestNumber(list2);

		assertEquals(3, biggest2);

	}

	@Test
	public void testBiggestNumberWithNegativeValues() {
		int[] list = new int[] { -7, -8, -9 };
		NumberService numberService = new NumberService();
		int biggest = numberService.biggestNumber(list);
		assertEquals(-7, biggest);

		int[] list2 = new int[] { -8, -7, -9 };
		int biggest2 = numberService.biggestNumber(list2);
		assertEquals(-7, biggest2);

	}

	@Test(expected = InvalidListException.class)
	public void testBiggestNumberWithNull() {

		NumberService numberService = new NumberService();
		int biggest = numberService.biggestNumber(null);

	}

}
