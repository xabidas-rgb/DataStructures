package searchingProblems;

import java.util.Scanner;

/**
 * @author abinash
 * Problem Statement - Given an array of n distinct integers sorted in ascending order, write a function that returns a Fixed
 *                     Point in the Array, else returns -1. 
 *       What is Fixed Point ?
 *       Fixed Point in an array is an index i such that arr[i] is equal to i. 
 *  Note - The integers in array can be negative.
 *  
 *   Example -    I/P : arr[] = {-10, -5, 0, 3, 7}
 *                O/P : 3     arr[3] = 3
 *                
 *                
 */
public class FixedPointFinderInArray {
	
	public static void main(String[] args) {
		Scanner scanner = null;
		try {
			scanner = new Scanner(System.in);
			System.out.println("Enter the size of an array : ");
			int size = scanner.nextInt();
			int[] arr = new int[size];
			System.out.println("Enter the array elements : ");
			for(int i=0;i<size;i++) {
				arr[i]= scanner.nextInt();
			}
			FixedPointFinderInArray array = new FixedPointFinderInArray();
			System.out.println("Fixed point in an array : " + array.findFixedPoint(arr));
		} catch(Exception e) {
			System.out.println("Exception occurred! REASON : " + e.getMessage());
		} finally {
			scanner.close();
		}
	}
	
	
	/**
	 * Find the fixed point in an array
	 * @param arr, Input integer array
	 * @return 
	 */
	public int findFixedPoint(int[] arr) {
		int fixedPoint = 0;
		
		if(arr == null)
			return fixedPoint;
		
		for(int i=0; i<arr.length;i++) {
			if (arr[i]==i) {
				fixedPoint = i;
				break;
			}
		}
		return fixedPoint;
	}
}
