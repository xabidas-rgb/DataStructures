package caseSensitiveOperation;

import java.util.Scanner;

/**
 * 
 * @author abinash
 * Given a String containing only lowercase characters, generate a string with the same letters, 
 * but in Uppercase.
 * 
 * I/P - GeeksForGeeks
 * O/P - GEEKSFORGEEKS
 */
public class LowerCase2UpperCaseConverter {
	
	public static void main(String[] args) {
		Scanner scanner = null;
		
		try {
			scanner = new Scanner(System.in);
			System.out.println("Enter the input : ");
			String input = scanner.nextLine();
			LowerCase2UpperCaseConverter converter = new LowerCase2UpperCaseConverter();
			System.out.println("After converting String from lowercase to Upper case : "
					           + converter.convertLowerToUpperCase(input));
		} catch(Exception ae) {
			System.out.println("Exception occurred !!");
		} finally {
			scanner.close();
		}
	}
	
	
	/**
	 * Converts the String from lowercase to uppercase
	 * @param  input, the String input which needs to be converted
	 * @return converted Uppercase String 
	 */
	public String convertLowerToUpperCase(String input) {
		if (input == null)
			return null;
		
		if (input == "")
			return "";
		
		String upperCaseString= "";
		char[] array = input.toCharArray();
		for(char c : array) {
			if (Character.isUpperCase(c)) {
				upperCaseString = upperCaseString.concat(String.valueOf(c));
			} else if (Character.isLowerCase(c)) {
				upperCaseString = upperCaseString.
						                     concat(String.valueOf(Character.toUpperCase(c)));
			} else {
				continue;
			}
		}
		
		return upperCaseString;
	}

}
