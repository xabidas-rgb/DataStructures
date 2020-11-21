package searchingProblems;

import java.util.Scanner;

/**
 * @author abinash
 * Problem Statement - Given an array of integers. Find a peak element in it.
 *     What is a Peak element ?
 *     Ans - An element is a peak element if it is NOT smaller than its neighbors.
 *           For corner elements, we need to consider only one neighbor
 *           
 *     Example - I/P : arr[] = {5, 10, 20, 15}
 *               O/P : 20
 *               The element 20 has neighbors 10 and 15, both of them are less than 20 
 *               
 *               I/P : arr[] = {10, 20, 15, 2, 23, 90, 67}
 *               O/P : 20 or 90
 *               The element 20 has neighbors 10 and 15.
 *               The element 90 has neighbors 23 and 67.
 *           
 */
public class PeakElementFinderInArray {
	
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
			PeakElementFinderInArray array = new PeakElementFinderInArray();
			System.out.println("Peak element in the array : " + array.findPeakElement(arr));
		} catch(Exception e) {
			System.out.println("Exception occurred! REASON : " + e.getMessage());
		} finally {
			scanner.close();
		}
	}
	
	
	/**
	 * Finds a peak element in an array
	 * @param arr, an input array
	 * @return
	 */
	public int findPeakElement(int[] arr) {
		int peakElement = 0;
		
		if(arr == null)
			return peakElement;
		
		for(int i=0;i<arr.length;i++) {
			if(i==0) {
				if(arr[i] > arr[i+1]) {
					peakElement = arr[i];
					break;
				}
			}
			
			if(i==arr.length-1) {
				if(arr[i] > arr[i-1]) {
					peakElement = arr[i];
					break;
				}
			}
			
			if(arr[i]>arr[i+1] && arr[i]> arr[i-1]) {
				peakElement = arr[i];
				break;
			}
		}
		return peakElement;
	}

}
