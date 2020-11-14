package countingBasedOperation;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author abinash
 * Problem Statement - Given a string, find the minimum and the maximum length words in it
 * 
 *            Example - I/P : This is a test string
 *                      O/P : Minimum length word - is
 *                            Maximum length word - string
 *                            
 *                      I/P : GeeksforGeeks A computer Science portal for Geeks
 *                      O/P : Minimum length word - A
 *                            Maximum length word - GeeksforGeeks
 */
public class SmallestAndLargestWordFinder {
	
	public static void main(String[] args) {
		Scanner scanner = null;
		try {
			scanner = new Scanner(System.in);
			System.out.println("Enter the input : ");
			String line = scanner.nextLine();
			SmallestAndLargestWordFinder finder = new SmallestAndLargestWordFinder();
			Map<String, Integer> result = finder.findMinAndMaxWords(line);
			System.out.println("Both max and min len string in line  " + result);
		} catch(Exception e) {
			System.out.println("Exception occurred !");
		} finally {
			scanner.close();
		}
	}
	
	/**
	 * Finds both minimum and maximum length words in a String
	 * @param input, the input string
	 */
	public Map<String, Integer> findMinAndMaxWords(String input) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		int    minLen   = 0;
		int    maxLen   = 0;
		int    currLen  = 0;
		String minStr   = "";
		String maxStr   = "";
		
		if (input == null || input == "")
			return Collections.emptyMap();
		
		String[] array = input.split("\\s+");
		for(int i = 0; i<array.length;i++) {
			currLen = array[i].length();
			if (i==0) {
				minLen = currLen;
				maxLen = currLen;
			}
			
			if (currLen <= minLen) {
				minLen = currLen;
				minStr = array[i];
			} else if (currLen >= maxLen) {
				maxLen = currLen;
				maxStr = array[i];
			}
		}
		map.put(minStr, minLen);
		map.put(maxStr, maxLen);
		
		return map;
	}

}
