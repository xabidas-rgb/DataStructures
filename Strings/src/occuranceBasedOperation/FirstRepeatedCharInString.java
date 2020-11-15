package occuranceBasedOperation;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

/**
 * @author abinash
 * Given a string, find the repeated character present first in the String
 *     I/P - geeksforgeeks
 *     O/P - g [ First repeating character ]
 */
public class FirstRepeatedCharInString {
	
	public static void main(String[] args) {
		Scanner scanner = null;
		try {
			scanner = new Scanner(System.in);
			System.out.println("Enter the String : ");
			String input = scanner.nextLine();
			FirstRepeatedCharInString charInString = new FirstRepeatedCharInString();
			System.out.println("First repeated character in String : " 
			                    + charInString.findFirstRepeatCharInString(input));
		} catch(Exception e) {
			System.out.println("Exception occurred. REASON : " + e.getMessage());
		} finally {
			scanner.close();
		}
	}
	
	
	/**
	 * Find the first repeating character in String
	 * @param  input, The input String
	 * @return firstRepeatChar, The first repeat char in String
	 */
	public char findFirstRepeatCharInString(String input) {
		char firstRepeatChar = 0;
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>(); // We need to use LinkedHashMap 
		                                                                       // not HashMap
		
		if (input == null || input.length() == 0)
			return firstRepeatChar;
		
		char[] array = input.toCharArray();
		for(char c : array) {
			if(!map.containsKey(c)) {
				map.put(c, 1);
			} else {
				map.put(c, map.get(c)+ 1);
			}
		}
		
		// Iterate the map
		for(Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() > 1) {
				firstRepeatChar = entry.getKey();
				break;
			}
		}
		
		return firstRepeatChar; 
	}

}
