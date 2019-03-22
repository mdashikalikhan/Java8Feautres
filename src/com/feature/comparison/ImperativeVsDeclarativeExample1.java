package com.feature.comparison;

import java.util.Date;
import java.util.stream.IntStream;

public class ImperativeVsDeclarativeExample1 {
	public static void main(String[] args) {
		/**
		 * Imperative -- how style of programming
		 */

		int sum = 0;

		long startTime = new Date().getTime();

		for (int i = 1; i <= 100; i++) {
			sum += i;
		}

		long endTime = new Date().getTime();

		System.out
				.println("Sum using imperative approach: " + sum + " \n Time elapsed: " + (endTime - startTime) / 1000);

		/**
		 * Declarative -- what style of programming
		 */
		startTime = new Date().getTime();
		int sum1 = IntStream.rangeClosed(1, 100).parallel().sum();
		endTime = new Date().getTime();

		System.out
				.println("Sum using declarive approach: " + sum + " \n Time elapsed: " + (endTime - startTime) / 1000);
	}
}
