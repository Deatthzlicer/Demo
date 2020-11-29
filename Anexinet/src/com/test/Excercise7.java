package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Excercise7 {

	public static void main(String[] args) {
		// just split by space count and decide
		
		//decide count to see if a string needs to be display or an array based on the longest word(s)

		String sentence = "I have 4 spaces";

		longestWord(sentence.split(" "));

	}

	private static void longestWord(String[] splitSentence) {

		String[] uniqueWords = Arrays.stream(splitSentence).distinct().toArray(String[]::new);
		String longestWord="";
		List<String> longestWords = new ArrayList<String>();
		//This logic is because array vs string validation according to the excersice request 
		int longestLenght = 0;
		int longestCount = 0;
		for (String word : uniqueWords) {
			if (word.length() > longestLenght) {
				longestLenght= word.length() ;
				longestCount=0;
				longestWord=word;
				longestWords.clear();
				longestWords.add(longestWord);
			} else if (word.length() == longestLenght) { 
				longestCount++;
				longestWords.add(word);
				
			}

		}
		
		//Proper return String vs Array (?)
		if (longestCount==0)
		{
			System.out.print(longestWord);
		}
		else {
			System.out.println((longestWords));
		}

	
	}


	

}
