package searchingProblems;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author abinash
 * Problem Statement - You are given an array of (n+2) elements. All elements of the array are in range
 *                     1 to n. And all elements occur once except two numbers which occur twice. 
 *                     Find the 2 repeating numbers.
 *                     
 *           Example - I/P - arr[] = {4, 2, 4, 5, 2, 3, 1}
 *                     O/P - n = 5
 */
public class TwoRepeatingElementFinder {
	
	public static void main(String[] args) {
		Scanner scanner = null;
		try {
			scanner = new Scanner(System.in);
			System.out.println("Enter the size of an array : ");
			int n = scanner.nextInt();
			int[] arr = new int[n+2];
			System.out.println("Enter the array elements : ");
			for(int i=0;i<arr.length;i++) {
				arr[i]= scanner.nextInt();
			}
			TwoRepeatingElementFinder finder = new TwoRepeatingElementFinder();
			finder.findTwoRepeatingElement(arr);
		} catch(Exception e) {
			System.out.println("Exception occurred! REASON : " + e.getMessage());
		} finally {
			scanner.close();
		}
	}
	
	
	/**
	 * Finds the 2 repeating elements in an array
	 * @param arr
	 */
	public void findTwoRepeatingElement(int[] arr) {
		Map<Integer,Integer> map = new LinkedHashMap<Integer,Integer>();
		
		if(arr== null)
			return;
		
		for(int element : arr) {
			if(!map.containsKey(element)) {
				map.put(element, 1);
			} else {
				map.put(element, map.get(element)+1);
				if(map.get(element) == 2) {
					System.out.println("Element that has been repeated for 2 times : " + element);
				}
			}
		}
	}

}
