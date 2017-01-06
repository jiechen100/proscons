package com.jie.java8;

import java.util.ArrayList;
import java.util.List;

public class MethodRef {
	public static void main(String args[]) {
		//TreeSet::new
		List names = new ArrayList();

		names.add("a");
		names.add("b");
		names.add("c");
		names.add("d");
		names.add("e");

		names.forEach(System.out::println);
	}

}
