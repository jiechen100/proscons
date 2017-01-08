package com.jie;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertThat;

import org.junit.AssumptionViolatedException;
import org.junit.Test;

public class Tst {

	@Test
	public void test() {

		try {
			// satify test will not throw exception
			assertThat("Hello", equalTo("Hello"));
			assertEquals("!=", 5, 6);
			assertNotEquals("==", 2, 1);
		} catch (AssumptionViolatedException e) {
			System.out.print(e.getClass());
			System.out.print(e.getMessage());
		}

	}
}
