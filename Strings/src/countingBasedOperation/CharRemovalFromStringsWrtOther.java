package countingBasedOperation;

import java.util.Scanner;

/**
 * @author abinash
 * Write an efficient java function, that takes two strings as arguments and removes the characters 
 * from first string which are present in second string (mask String)
 */
public class CharRemovalFromStringsWrtOther {
	
	public static void main(String[] args) {
		Scanner scanner = null;
		try {
			scanner = new Scanner(System.in);
			System.out.println("Enter the String : ");
			String input = scanner.nextLine();
			System.out.println("Enter the mask String : ");
			String mask = scanner.nextLine();
			CharRemovalFromStringsWrtOther stringsWrtOther = new CharRemovalFromStringsWrtOther();
			System.out.println("Result String after removal post-comparision to mask String : " + 
			                    stringsWrtOther.removeCharsFrom1stCompared2Second(input, mask));
		} catch(Exception e) {
			System.out.println("Exception ocuurred !");
		} finally {
			scanner.close();
		}
	}
	
	
	/**
	 * Removes the char from the first String wrt comparison to mask string
	 * mask String means the second String
	 * @param input, The input String
	 * @return
	 */
	public String removeCharsFrom1stCompared2Second(String input, String mask) {
		String result = "";
		
		if(input == null || input.length() == 0)
			return null;
		
		char[] array = input.toCharArray();
		for(char c : array) {
			if(mask.contains(String.valueOf(c))) {
				continue;
			}
			result = result.concat(String.valueOf(c));
		}
		return result;
	}

}
