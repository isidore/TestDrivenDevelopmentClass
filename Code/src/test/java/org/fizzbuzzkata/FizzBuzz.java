package org.fizzbuzzkata;

public class FizzBuzz {

	public static String countUntil(int i) {
		String seperator = ",";
		String part1 = "";
		for (int j = 1; j <= i; j++) {
			if ((j % 3 == 0) && (j % 5 == 0)) {
				part1 += "FizzBuzz" + seperator;
			} else if (j % 3 == 0) {
				part1 += "Fizz" + seperator;
			} else if (j % 5 == 0) {
				part1 += "Buzz" + seperator;
			} else {
				part1 += String.valueOf(j) + seperator;
			}
		}
		return part1.substring(0, part1.length() - 1);
	}

}
