package countingBasedOperation;

import java.util.Scanner;

/**
 * @author abinash
 * Problem Statement - Given a string, write a program to count the occurrence lowercase characters, uppercase characters, 
 *                     special characters and Numeric values.
 *                     
 *         Example - I/P - #GeeKs01fOr@gEEks07
 *                   O/P - Upper case letters : 5
 *                         Lower case letters : 8
 *                         Numbers : 4
 *                         Special Characters : 2
 *                         
 *                   I/P - *GeEkS4GeEkS*
 *                   O/P - Upper case letters : 6
 *                         Lower case letters : 4
 *                         Numbers : 1
 *                         Special Characters : 2
 */
public class UpperLowerSpecialNumericCounter {
	
	private static int upperCase    = 0;
	private static int lowerCase    = 0;
	private static int numbers      = 0;
	private static int specialChars = 0;
	
	public static void main(String[] args) {
		Scanner scanner = null;
		try {
			scanner = new Scanner(System.in);
			UpperLowerSpecialNumericCounter counter = new UpperLowerSpecialNumericCounter();
			System.out.println("Enter the input : ");
			String input = scanner.nextLine();
			counter.countAllTypes(input);
		} catch(Exception ae) {
			System.out.println("Exception Occurred !");
		} finally {
			scanner.close();
		}
	}
	
	/**
	 * Counts all the Upper-Case, Lower-Case, Numbers and Special Chars
	 * present in a string
	 * @param input, The input string that needs to be counted on
	 */
	public void countAllTypes(String input) {
		if(input == null || input == "") {
			return;
		}
		
		char[] array = input.toCharArray();
		for(char c : array) {
			if (Character.isSpaceChar(c)) {
				continue;
			} else if(Character.isUpperCase(c)) {
				upperCase ++;
			} else if (Character.isLowerCase(c)) {
				lowerCase ++;
			} else if (Character.isDigit(c)) {
				numbers ++;
			} else {
				specialChars ++;
			}
		}
		
		System.out.println("Upper case letters : " + upperCase + "\n" +
		                   "Lower case letters : " + lowerCase + "\n" + 
				           "Numbers : " + numbers + "\n" +
				           "Special Characters : " + specialChars);
	}

}
