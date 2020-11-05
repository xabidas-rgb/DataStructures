package caseSensitiveOperation;

import java.util.Scanner;

/**
 * @author abinash
 * Problem Statement - Given a String. Find it's first upper-case letter
 * 
 * I/P - geeksforgeeKs
 * O/P - K
 * 
 * I/P - geekS
 * O/P - S
 */
public class FirstUpperCaseLetterFinderInString {
	
	
	public static void main(String[] args) {
		Scanner scanner = null;
		try {
			scanner = new Scanner(System.in);
			System.out.println("Enter the input : ");
			String input = scanner.nextLine();
			FirstUpperCaseLetterFinderInString string = new FirstUpperCaseLetterFinderInString();
			System.out.println("First uppercase character in string : " + 
			                    string.findFirstUpperCaseChar(input));
		} catch(Exception e) {
			System.out.println("Exception occurred !!");
		} finally {
			scanner.close();
		}
	}
	
	/**
	 * Finds the first Upper-case character in a String
	 * @param  input,         The input String from which the first upper case
	 *                        character needs to be found out
	 * @return upperCaseChar, the first upper case character
	 */
	public char findFirstUpperCaseChar(String input) {
		if (input == null || input == "")
			return 1;
		
		char[] array = input.toCharArray();
		char upperCaseChar = 1;
		for(char c : array) {
			if(Character.isUpperCase(c)) {
				upperCaseChar = c;
				break;
			}
		}
		return upperCaseChar;
	}
}
