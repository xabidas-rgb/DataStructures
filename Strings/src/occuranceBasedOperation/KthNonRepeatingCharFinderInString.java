package occuranceBasedOperation;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

/**
 * @author abinash
 * Given a String and a number K, find the K-th non-repeating character in String.
 * Consider a large input string with lacs of characters and a small character set.
 * How to find the character by only doing only one traversal of input String ?
 * 
 *     I/P - str : geeksforgeeks, K : 3
 *     O/P - r
 */
public class KthNonRepeatingCharFinderInString {
	
	public static void main(String[] args) {
		Scanner scanner = null;
		try {
			scanner = new Scanner(System.in);
			System.out.println("Enter the input : ");
			String input = scanner.nextLine();
			System.out.println("Enter the position : ");
			int pos = scanner.nextInt();
			KthNonRepeatingCharFinderInString finderInString = new KthNonRepeatingCharFinderInString();
			System.out.println("K-th non-repeating character in String : " + 
			                      finderInString.findKthNonRepeatingChar(input, pos));
		} catch(Exception e) {
			System.out.println("Exception occurred. REASON : " + e.getMessage());
		} finally {
			scanner.close();
		}
	}
	
	
	/**
	 * Finds the K-th non-repeating character in a string
	 * @param input, the input string
	 * @param k, the K-t position
	 * @return nonRepeatChar, the K-th non-repeating char
	 */
	public char findKthNonRepeatingChar(String input, int k) {
		char nonRepeatChar = 0;
		int cursor = 0;
		Map<Character, Integer> map = new LinkedHashMap<>(); // Diamond declaration
		
		if (input == null || input.length() == 0)
			return nonRepeatChar;
		
		char[] array = input.toCharArray();
		for(char c : array) {
			if(!map.containsKey(c)) {
				map.put(c, 1);
			} else {
				map.put(c, map.get(c)+1);
			}
		}
		
		// Iterate map
		for(Entry<Character, Integer> entry : map.entrySet()) {
			if(entry.getValue() == 1) {
				cursor ++;
				if (cursor == k) {
					nonRepeatChar = entry.getKey();
					break;
				}
			}
		}
		
		return nonRepeatChar;
	}

}
