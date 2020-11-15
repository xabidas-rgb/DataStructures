package spacingBasedOperation;

import java.util.Scanner;

/**
 * @author abinash
 * Given a string that has two set of words and spaces. Write a program
 * to move all spaces to front of string, by traversing the string only once.
 *    
 *      Example - I/P : geeks for geeks
 *                O/P :    geeksforgeeks
 *                
 *                I/P : move these spaces to beginning
 *                O/P :     movethesespacestobeginning
 */
public class SpaceRemoverFromStringToFront {
	
	public static void main(String[] args) {
		Scanner scanner = null;
		try {
			scanner = new Scanner(System.in);
			System.out.println("Enter the String : ");
			String input = scanner.nextLine();
			SpaceRemoverFromStringToFront stringToFront = new SpaceRemoverFromStringToFront();
			System.out.println("Resultant String after removal of all spaces to front : " + 
			                    stringToFront.moveSpacesToFront(input));
		} catch(Exception e) {
			System.out.println("Exception occurred. REASON :" + e.getMessage());
		} finally {
			scanner.close();
		}
	}
	
	
	/**
	 * Moves spaces to front in a String
	 * @param input, the input String
	 * @return
	 */
	public String moveSpacesToFront(String input) {
		String resultantStr = "";
		
		if (input == null || input.length() == 0)
			return resultantStr;
		
		char[] array = input.toCharArray();
		for(char c : array) {
			if (Character.isSpaceChar(c)) {
				resultantStr = Character.toString(c).concat(resultantStr);
			} else {
				resultantStr += Character.toString(c);
			}
		}
		
		return resultantStr;
	}

}
