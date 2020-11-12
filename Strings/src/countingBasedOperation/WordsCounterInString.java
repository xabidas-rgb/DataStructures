package countingBasedOperation;

import java.util.Scanner;

/**
 * @author abinash
 * Problem Statement - Given a string, count number of words in it. The words are separated by following characters.
 *                     -| space ('')
 *                     -| new line ('\n')
 *                     -| tab ('\t'
 *                     or combination of these
 *                     
 *            Example - I/P - One two       three\n four\tfive  
 *                      o/P - 5
 */
public class WordsCounterInString {
	
	public static void main(String[] args) {
		Scanner scanner = null;
		try {
			scanner = new Scanner(System.in);
			WordsCounterInString counterInString = new WordsCounterInString();
			System.out.println("Enter the input : ");
			String input = scanner.nextLine();
			System.out.println("Total no of words present in String : " + 
			                            counterInString.countWordsInString(input));
		} catch(Exception e) {
			System.out.println("Exception occurred !");
		} finally {
			scanner.close();
		}
	}
	
	/**
	 * Counts the total number of words present in a String
	 * @param input, The input string
	 * @return
	 */
	public int countWordsInString(String input) {
		if (input == null || input == "")
			return 0;
		
		String[] array = input.split("\\s+");
		return array.length;
	}

}
