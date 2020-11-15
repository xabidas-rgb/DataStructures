package occuranceBasedOperation;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

/**
 * @author abinash
 * Given a String, find the non-repeating character in it. 
 * For example - if the input String is "GeeksForGeeks", then the output should be 
 * 'f' and if the input is String is "GeeksQuiz", then the output should be 'G'
 */
public class FirstNonRepeatingCharInString {
	
	public static void main(String[] args) {
		Scanner scanner = null;
		try {
			scanner = new Scanner(System.in);
			System.out.println("Enter the input : ");
			String input = scanner.nextLine();
			FirstNonRepeatingCharInString inString = new FirstNonRepeatingCharInString();
			System.out.println("First non-repeating character in String : " 
			                    + inString.firstNonRepeatingChar(input));
		} catch(Exception e) {
			System.out.println("Exception occurred !");
		} finally {
			scanner.close();
		}
	}
	
	/**
	 * Finds the first non-repeating character in the String
	 * @param  input, The input String
	 * @return nonRepeatChar, The first non-repeating char
	 */
	public char firstNonRepeatingChar(String input) {
		char nonRepeatChar = 0;
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		
		if (input == null || input.length() == 0)
			return nonRepeatChar;
		
		char[] array = input.toCharArray();
		for(char c : array) {
			if(!map.containsKey(c)) {
				map.put(c, 1);
			} else {
				map.put(c, map.get(c)+ 1);
			}
		}
		
		// Iterate the map
		for(Entry<Character,Integer> entry : map.entrySet()) {
			if(entry.getValue() == 1) {
				nonRepeatChar = entry.getKey();
				break;
			}
		}
		return nonRepeatChar;
	}

}
