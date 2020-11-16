package spacingBasedOperation;

import java.util.Scanner;

/**
 * @author abinash
 * Given a String containing many consecutive spaces, trim all spaces so that all words should contain 
 * ONLY A SINGLE SPACE between them. The conversion should be done in-place and solution should handle 
 * trailing and leading spaces and also remove preceeding spaces before common punctuation like full stop,
 * comma and a question mark.
 * 
 *     Example: I/P - "   Hello Geeks . Welcome   to  GeeksforGeeks   .    "
 *              O/P - "Hello Geeks. Welcome to GeeksforGeeks."
 *              
 *              I/P - "GeeksforGeeks"
 *              O/P - 
 *                 Explanation - Here no change is needed.
 */
public class ExtraSpaceRemoverFromString {
	
	private static final String FULL_STOP_CHAR = ".";
	private static final String SPACE_CHAR = " ";
	
	public static void main(String[] args) {
		Scanner scanner = null;
		try {
			scanner = new Scanner(System.in);
			System.out.println("Enter the String : ");
			String line = scanner.nextLine();
			ExtraSpaceRemoverFromString fromString = new ExtraSpaceRemoverFromString();
			System.out.println("After modification resultant String : " + 
			                   fromString.formStringBasedOnConstraints(line));
		} catch(Exception e) {
			System.out.println("Exception occurred. REASON : " + e.getMessage());
		} finally {
			scanner.close();
		}
	}
	
	
	/**
	 * Modifies the base string based on punctuation, spaces (both leading and trailing)
	 * @param input, The input String
	 * @return resultantStr, The resultant String after modification
	 */
	public String formStringBasedOnConstraints(String input) {
		
		String resultantStr = "";
		
		if (input == null || input.length() == 0)
			return resultantStr;
		
		String[] array = input.trim().split("\\s+");
		for(String s : array) {
			if (s.equals(FULL_STOP_CHAR)) {
				resultantStr += s;
			} else {
				resultantStr = resultantStr + s.concat(SPACE_CHAR);
			}
		}
		
		return resultantStr;
	}

}
