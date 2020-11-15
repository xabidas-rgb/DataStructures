package occuranceBasedOperation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

/**
 * @author abinash
 * Given an input String, generate two output Strings. One of which consists of those characters which occurs only once
 * in input string and second which consists of multi-time occurring characters. Output Strings must be sorted.
 * 
 *       I/P - geeksforgeeks
 *       O/P - for 
 *             egks
 */
public class StringGeneratorBasedOnCharOccurrence {
	
	public static void main(String[] args) {
		Scanner scanner = null;
		try {
			scanner = new Scanner(System.in);
			System.out.println("Enter the input String : ");
			String input = scanner.nextLine();
			StringGeneratorBasedOnCharOccurrence charOccurrence = 
					  new StringGeneratorBasedOnCharOccurrence();
			charOccurrence.generateTwoStringsBasedOnOccur(input);
		} catch(Exception e) {
			System.out.println("Exception occurred. REASON : " + e.getMessage());
		} finally {
			scanner.close();
		}
	}
	
	/**
	 * Generate two output strings from an input strings where the 1st string consists of
	 * those characters which occurs only once in input string and second string consists of 
	 * multi-timing occurring characters.
	 * @param input, The input String
	 * @return generatedStrings, an List object containing the generated strings
	 */
	public List<String> generateTwoStringsBasedOnOccur(String input){
		List<String> generatedStrings = new ArrayList<String>();
		String singleOccurStr = "";
		String multiOccurStr  = "";
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		
		if (input == null || input.length() == 0)
			return Collections.emptyList();
		
		char[] array = input.toCharArray();
		for(char c : array) {
			if(!map.containsKey(c)) {
				map.put(c, 1);
			} else {
				map.put(c, map.get(c)+1);
			}
		}
		
		// Now iterate the map and generate the two strings
		for(Entry<Character, Integer> entry : map.entrySet()) {
			if(entry.getValue() == 1) {
				singleOccurStr += entry.getKey();
			} else {
				multiOccurStr += entry.getKey();
			}
		}
		
		generatedStrings.add(singleOccurStr);
		generatedStrings.add(multiOccurStr);
		
		return generatedStrings; 
	}

}
