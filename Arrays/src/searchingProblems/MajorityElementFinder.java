package searchingProblems;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

/**
 * @author abinash
 * Problem Statement - Given an array, the task is to find if the input array contains 
 *                     a majority element or not.
 *                     
 *        What is a Majority Element in an array ?
 *        Ans - A majority element in an array A[] of size n is an element that appears more than 
 *              n/2 times (and hence there is at most one such element)
 */
public class MajorityElementFinder {
	
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
			MajorityElementFinder finder = new MajorityElementFinder();
			System.out.println("Majority element in the array : " + finder.findMajorityElement(arr));
		} catch(Exception e) {
			System.out.println("Exception occurred! REASON : " + e.getMessage());
		} finally {
			scanner.close();
		}
	}
	
	
	/**
	 * Finds the majority element in the array
	 * @param arr, The input integer array
	 * @return
	 */
	public int findMajorityElement(int[] arr) {
		int majorityElement = 0;
		Map<Integer,Integer> map = new LinkedHashMap<Integer,Integer>();
		
		if(arr==null)
			return majorityElement;
		
		int checker = arr.length/2;
		for(int element : arr) {
			if(!map.containsKey(element)) {
				map.put(element, 1);
			} else {
				map.put(element, map.get(element)+1);
			}
		}
		
		// Iterate the map
		for(Entry<Integer,Integer> entry : map.entrySet()) {
			if(entry.getValue()>checker) {
				majorityElement = entry.getKey();
				break;
			}
		}
		
		return majorityElement;
	}

}
