package arthimeticOperation;

import java.util.Scanner;

/**
 * 
 * @author abinash
 * Problem Statement - Check whether a given number is ODD or EVEN
 *           I/P - 2
 *           O/P - EVEN
 *           
 *           I/P - 5
 *           O/P - ODD
 */
public class EvenOddNumberChecker {

	private static final String ODD  = "ODD";
	private static final String EVEN = "EVEN";
	
	public static void main(String[] args) {
		Scanner scanner = null;
		
		try {
			scanner = new Scanner(System.in);
			System.out.println("Enter the Number : ");
			long number = scanner.nextLong();
			EvenOddNumberChecker numberChecker = new EvenOddNumberChecker();
			System.out.println("Is Even or ODD ? " + 
			                       numberChecker.isEvenOrOdd(number));
		} catch(Exception ae) {
			System.out.println("Exception occurred!!");
		} finally {
			scanner.close();
		}
	}
	
	
	/**
	 * Checks whether a given number is ODD or EVEN
	 * @param  number,  the number which needs to be figured out 
	 *                  whether EVEN or ODD
	 * @return EVEN,    if even
	 *         ODD,     if odd
	 */
	public String isEvenOrOdd(long number) {
		if (number == 0)
			return "";
		
		int remainder = (int) (number % 2);
		if(remainder == 0)
			return EVEN;
		else
			return ODD;
		
	}
}
