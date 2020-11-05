package caseSensitiveOperation;

import java.util.Scanner;

/**
 * @author abinash
 * Problem Statement - Given a String, convert the characters of the string into opposite case, i.e, if a
 *                     character is lower-case then convert it into upper-case and vice-versa 
 *                     
 * I/P - geeksForgEeks
 * O/P - GEEKSfORGrEKS
 * 
 * I/P - hello every one
 * O/P - HELLO EVERY ONE
 */
public class CharsCaseConverterInString {
	
	public static void main(String[] args) {
		Scanner scanner = null;
		try {
			scanner = new Scanner(System.in);
			System.out.println("Enter the String : ");
			String input = scanner.nextLine();
			CharsCaseConverterInString converterInString = new CharsCaseConverterInString();
			System.out.println("Resultant String after shuffling upper-case and lower-case chars : " + 
			                   converterInString.shuffleUpperLowerCase(input));
		} catch(Exception e) {
			System.out.println("Exception Occurred !!");
		} finally {
			scanner.close();
		}
	}
	
	/**
	 * Convert lower-case to upper-case and vice-versa for a string
	 * @param input, the input string which characters needs to be 
	 *               converted
	 * @return 
	 */
	public String shuffleUpperLowerCase(String input) {
		if(input == null || input == "")
			return null;
		
		String shuffledString = "";
		char[] array = input.toCharArray();
		for(char c : array) {
			if(Character.isUpperCase(c)) {
				shuffledString = shuffledString.
						          concat(String.valueOf(Character.toLowerCase(c)));
			} else if (Character.isLowerCase(c)) {
				shuffledString = shuffledString.
						          concat(String.valueOf(Character.toUpperCase(c)));
			} else {
				shuffledString = shuffledString.
						          concat(String.valueOf(c));
			}
		}
		return shuffledString;
	}

}
