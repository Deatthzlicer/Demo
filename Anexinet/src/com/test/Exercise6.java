package com.test;

import java.util.HashMap;
import java.util.Map;

public class Exercise6 {
	static Map<String, String> possibleWords = new HashMap<String, String>();
	public static void main(String[] args) {
		
		// Use a Map for word combination uniqueness
		//loop word mutability 

		String words = "zed";
		constructPermutation(words);
		System.out.println("There are " + possibleWords.size() + " permutations : ");
		System.out.println(possibleWords);

	}

	private static void constructPermutation(String words) {
		if (words.length() > 50) { 
			System.out.println("You pass the maximum limit of words");
		} else {
			formulatePermutations(words);

		}

	}

	private static void formulatePermutations(String words) {
		permutation("", words);

	}

	private static void permutation(String currentWord, String mutableString) {
		int n = mutableString.length();
		if (n == 0)
			possibleWords.put(currentWord, "");
		else {
			//loop the mutable string posibilities within its substring
			//add them as a  recursive iteration  prefix  when each  is finished
			for (int i = 0; i < n; i++)
				permutation(currentWord + mutableString.charAt(i), mutableString.substring(0, i) + mutableString.substring(i + 1, n));
		}
	}

}
