package fr.demandeatonton.exemple_tdd.service;

import fr.demandeatonton.exemple_tdd.exception.InvalidListException;

public class NumberService {

	public int biggestNumber(int[] list) {
		int index = 0, max = Integer.MIN_VALUE;

		if (list == null)
			throw new InvalidListException("la liste ne peut pas etre null");

		for (index = 0; index < list.length; index++) {
			if (list[index] > max) {
				max = list[index];
			}
		}
		return max;
	}

}
