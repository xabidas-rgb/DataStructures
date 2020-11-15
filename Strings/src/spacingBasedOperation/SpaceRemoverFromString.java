package spacingBasedOperation;

import java.util.Scanner;

/**
 * @author abinash
 * Given a String, remove all spaces from the string and return it.
 * 
 *     Example - I/P : g  eeks   for ge  eeks    
 *               O/P : geeksforgeeks   
 */
public class SpaceRemoverFromString {
	
	public static void main(String[] args) {
		Scanner scanner = null;
		try {
			scanner = new Scanner(System.in);
			System.out.println("Enter the String : ");
			String input = scanner.nextLine();
			SpaceRemoverFromString fromString = new SpaceRemoverFromString();
			System.out.println("Resultant String after removal of spaces : " + 
			                    fromString.removeSpacesFromString(input));
		} catch(Exception e) {
			System.out.println("Exception occurred. REASON : " + e.getMessage());
		} finally {
			scanner.close();
		}
	}
	
	
	/**
	 * Removes spaces from String
	 * @param input, The input String
	 * @return resultantStr, The resultant String after removing spaces
	 */
	public String removeSpacesFromString(String input) {
		String resultantStr = "";
		
		if (input == null || input.length() == 0)
			return "";
		
		char[] array = input.toCharArray();
		for(char c : array) {
			if(Character.isSpaceChar(c)) {
				continue;
			}
			resultantStr += Character.toString(c);
		}
		return resultantStr;
	}

}
