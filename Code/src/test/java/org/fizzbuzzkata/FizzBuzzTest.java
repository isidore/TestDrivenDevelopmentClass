package org.fizzbuzzkata;

import static org.junit.Assert.assertEquals;

import org.approvaltests.Approvals;
import org.junit.Test;

public class FizzBuzzTest {

	@Test
	public void test() {
		String output = FizzBuzz.countUntil(20);
		assertEquals("1,2,Fizz,4,Buzz,Fizz,7,8,Fizz,Buzz,11,Fizz,13,14,FizzBuzz,16,17,Fizz,19,Buzz", output);
	}

	@Test
	public void test100() {
		Approvals.verify(FizzBuzz.countUntil(100).replaceAll(",", "\n"));
	}

}
