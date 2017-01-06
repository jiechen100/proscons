package com.jie.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

@FunctionalInterface
public interface Vehicle {
	// can have many default methods
	// default method cannot be static
	default void print() {
		System.out.println("I am a vehicle!");
	}

	default void blowHorn() {
		System.out.println("Blowing horn!!!");
	}

	// only one functional interface
	void run(int spped);

	public static void main(String[] args) {
		Vehicle v = a -> System.out.println("I am running at " + a
				+ " miles/hr.");

		v.blowHorn();
		v.run(100);

		// stream
		Random random = new Random();
		random.ints(50, 100).limit(10).forEach(System.out::println);

		List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd",
				"", "jkl");
		List<String> filtered = strings.stream()
				.filter(string -> !string.isEmpty())
				.collect(Collectors.toList());

		List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
		// get list of unique squares
		List<Integer> squaresList = numbers.stream().map(i -> i * i).distinct()
				.collect(Collectors.toList());
	}
}
