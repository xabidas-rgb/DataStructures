package countingBasedOperation;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * @author abinash
 * Problem Statement - Given a String str with upper-case, lower-case and special characters. The input String
 *                     is to end with their a space or a dot. The problem is to calculate the number of words, vowels
 *                     and frequency of each character of the String in a separate line.
 *                     
 *              Example - How Good GOD is
 */
public class VowelsWordsFrequencyInWordPrinter {
	
	private static List<Character> vowels = Arrays.asList('a','e','i','o','u');
	
	public static void main(String[] args) {
		Scanner scanner = null;
		try {
			scanner = new Scanner(System.in);
			System.out.println("Enter the input : ");
			String line = scanner.nextLine();
			VowelsWordsFrequencyInWordPrinter printer = new VowelsWordsFrequencyInWordPrinter();
			printer.countAllTypes(line);
		} catch(Exception e) {
			System.out.println("Exception occurred !");
		} finally {
			scanner.close();
		}
	}
	
	/**
	 * It counts the followings in a String input
	 *   1. Vowels
	 *   2. Consonants
	 *   3. Total number of words
	 *   4. Frequency of each character
	 *   5. Lower Case characters
	 *   6. Upper Case characters
	 * @param input, The input String
	 * @return
	 */
	public void countAllTypes(String input) throws Exception {
		int lowerCase = 0;
		int upperCase = 0;
		int vowelsCt = 0;
		int consonants = 0;
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		if (input == null)
			throw new Exception("String is null. Please check !!");
		
		if (input.length() == 0) {
			System.out.println("It is an empty String..");
			return;
		} else {
			String[] words = input.split("\\s+");
			System.out.println("Total number of words in String : " + words.length);
		}
		
		char[] chars = input.toCharArray();
		for (char c : chars) {
			if (!map.containsKey(c)) {
				map.put(c, 1);
			} else {
				map.put(c, map.get(c)+1);
			}
			if (Character.isUpperCase(c)) {
				upperCase ++;
			}
			if (Character.isLowerCase(c)) {
				lowerCase ++;
			}
			if (vowels.contains(c)) {
				vowelsCt ++;
			} else {
				consonants ++;
			}
		}
		
		System.out.println("Number of Upper-Case letters : " + upperCase + "\n" + 
		                   "Number of lower-case letters : " + lowerCase + "\n" +
				           "Number of vowels : " + vowelsCt + "\n" +
				           "Number of consonans : " + consonants);
		// Print the frequency of each character in the String
		System.out.println(map.toString());
		
	}

}
