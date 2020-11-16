package spacingBasedOperation;

import java.util.Scanner;

/**
 * @author abinash
 * Write a method to replace all the spaces in a string with "%20". You may assume that the string has 
 * sufficient space at the end to hold the additional characters and that you are given the "true" length
 * of the string.
 * 
 *     Example - I/P : "Mr John Smith", 13
 *               O/P : Mr%20John%20Smith
 *               
 *               I/P : Mr John Smith   
 *               O/P : M%20John%20Smith
 */
public class StringURLifier {
	
	private static final String URL_CHAR = "%20";
	
	public static void main(String[] args) {
		Scanner scanner = null;
		try {
			scanner = new Scanner(System.in);
			System.out.println("Enter the input : ");
			String input = scanner.nextLine();
			StringURLifier urLifier = new StringURLifier();
			System.out.println("Resultant String after urlifying : " + 
			                   urLifier.urlifyString(input));
		} catch(Exception e) {
			System.out.println("Exception occurred. REASON : " + e.getMessage());
		} finally {
			scanner.close();
		}
	}
	
	
	/**
	 * URLifies the String with "%20"
	 * @param input, The input String
	 * @return resultantStr, The resultant string after URLification
	 */
	public String urlifyString(String input) {
		String resultantStr = "";
		
		if(input == null || input.length()==0)
			return resultantStr;
		
		String[] array = input.trim().split("\\s+");
		for(int i=0;i<array.length;i++) {
			if(i==array.length-1) {
				resultantStr += array[i];
			} else {
				resultantStr += array[i].concat(URL_CHAR);
			}
		}
		return resultantStr;
	}

}
