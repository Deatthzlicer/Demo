package com.test;

public class Exercise3 {

	public static void main(String[] args) {

		// Do a pow
		// Validate the String to be a Numeric value
		String number = "5.56";
		int base = 3;

		System.out.println(converToDecimal(number, base));

	}

	static double converToDecimal(String number, int base) {

		double result = 0;
		if (isNumeric(number)) {
			result = Double.parseDouble(number);
			result = (int) Math.pow(result, base);
		} else {
			System.out.println("The number is not possile to Pow");
		}

		return result;
	}

	static boolean isNumeric(String stringNumber) {
		if (stringNumber == null) {
			return false;
		}
		try {
			double d = Double.parseDouble(stringNumber);
		} catch (NumberFormatException ex) {
			return false;
		}
		return true;
	}

}
