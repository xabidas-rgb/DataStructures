package arthimeticOperation;

import java.util.Scanner;

/**
 * 
 * @author abinash
 * Problem statement - Given a string containing alphanumeric characters, calculate sum of all numbers
 *                     present in the String
 *      I/P - 1abc23
 *      O/P - 24
 *      
 *      I/P - geeks4geeks
 *      O/P - 4
 *      
 *      I/P - 1abc2x30yz67
 *      O/P - 100
 *      
 *      I/P - 123abc
 *      O/P - 123
 *      
 *      I/P - abcd
 *      O/P - 0
 */
public class SumCalculatorsOfNumsInString {
	
	public static void main(String[] args) {
		Scanner scanner = null;
		
		try {
			scanner = new Scanner(System.in);
			System.out.println("Enter the input : ");
			String input = scanner.nextLine();
			SumCalculatorsOfNumsInString numsInString = new SumCalculatorsOfNumsInString();
			System.out.println("Sum of all numbers in String : " + 
			                               numsInString.calculateNumsInString(input));
		} catch(Exception ae) {
			System.out.println("");
		} finally {
			scanner.close();
		}
	}
	
	public int calculateNumsInString(String input) {
		if (input == null || input == "")
			return 0;
		
		char[] array = input.toCharArray();
		int sum = 0;
		for(int i=0; i<array.length; i++) {
			if(Character.isDigit(array[i])) {
				sum = sum + Integer.parseInt(String.valueOf(array[i]));
			}
		}
		
		return sum;
	}

}
