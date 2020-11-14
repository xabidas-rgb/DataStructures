package countingBasedOperation;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @author abinash
 * Given a String, count the total number of vowels(a,e,i,o,u) in it. There are two methods to count
 * total number of vowels in String.
 *    1. Iterative
 *    2. Recursive
 *    
 *     Example - I/P - abc de
 *               O/P - 2
 *               
 *               I/P - geeksforgeeks portal
 *               O/P - 7
 */
public class StringVowelCounterProblem {
	
	private static List<Character> vowels = Arrays.asList('a','e','i','o','u');
	
	public static void main(String[] args) {
		Scanner scanner = null;
		try {
			scanner = new Scanner(System.in);
			System.out.println("Enter the input : ");
			String line = scanner.nextLine();
			StringVowelCounterProblem problem = new StringVowelCounterProblem();
			System.out.println("Total number of vowels present in String : " + 
			                             problem.countVowelsInString(line));
		} catch(Exception e) {
			System.out.println("Exception occurred !");
		} finally {
			scanner.close();
		}
	}
	
	/**
	 * Counts the total number of vowels present in String
	 * @param  input, The input String
	 * @return 
	 */
	public int countVowelsInString(String input) {
		int vowelsCount = 0;
		
		if(input == null || input.length() == 0)
			return 0;
		
		char[] letters = input.toCharArray();
		for (char c : letters) {
			if(vowels.contains(c)) {
				vowelsCount ++;
			}
		}
		return vowelsCount;
	}

}
