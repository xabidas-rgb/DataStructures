package countingBasedOperation;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @author abinash
 * Given a String, remove the vowels from the String and print the String without vowels
 *       Example - I/P : What is your name ?
 *                 O/P : Wht s yr nm ?
 *                 
 *                 I/P : welcome to geeksforgeeks
 *                 O/P : wlcm t gksfrgks
 */
public class VowelsRemoverInString {
	
	private static List<Character> vowels = Arrays.asList('a','e','i','o','u');
	
	public static void main(String[] args) {
		Scanner scanner = null;
		try {
			scanner = new Scanner(System.in);
			System.out.println("Enter the input : ");
			String line = scanner.nextLine();
			VowelsRemoverInString removerInString = new VowelsRemoverInString();
			System.out.println("Output String after removal of vowels : " + 
			                    removerInString.removeVowelsFromString(line));
		} catch(Exception e) {
			System.out.println("Exception occurred !");
		} finally {
			scanner.close();
		}
	}
	
	
	/**
	 * Removes the vowels from the string
	 * @param  input, The input String
	 * @return result, The Output String after removal of all vowels from it
	 */
	public String removeVowelsFromString(String input) {
		String result = "";
		
		if (input == null || input.length() == 0)
			return null;
		
		char[] array = input.toCharArray();
		for(char c : array) {
			if(vowels.contains(c)) {
				continue;
			}
			result = result.concat(String.valueOf(c));
		}
		return result;
	}

}
