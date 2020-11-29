package com.test;

import java.util.HashMap;
import java.util.Map;

public class Exercise2 {

	public static void main(String[] args) {
		// Summarize a Map with words
		// Compare the second string with the generetad Map
		// Manage Map for Logarithmic for O(n+l) a result

		String word1 = "Hello";
		String word2 = "Hola";

		System.out.println(showDuplicateLetters(word1, word2));
	}

	private static Map<Character, Character> showDuplicateLetters(String word1, String word2) {
		Map<Character, Character> letters = new HashMap<Character, Character>();
		Map<Character, Character> repeated = new HashMap<Character, Character>();

		for (int x = 0; x < word1.length(); x++) {
			System.out.println("Char x " + x + "  contains : " + word1.charAt(x));

			letters.put(word1.charAt(x), word1.charAt(x));

		}

		for (int x = 0; x < word2.length(); x++) {

			if (letters.containsKey(word2.charAt(x)))

				repeated.put(word2.charAt(x), word2.charAt(x));

		}

		return repeated;
	}

}
