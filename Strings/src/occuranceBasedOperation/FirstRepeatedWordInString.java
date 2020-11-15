package occuranceBasedOperation;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

/**
 * @author abinash
 * Given a String, Find the 1st repeated word in a String
 * 
 *     I/P - Ravi had been saying that he had been there
 *     O/P - had
 *     
 *     I/P - Ravi had been saying that
 *     O/P - No Repetition
 *     
 *     I/P - he had had he
 *     O/P - he
 */
public class FirstRepeatedWordInString {
	
	public static void main(String[] args) {
		Scanner scanner = null;
		try {
			scanner = new Scanner(System.in);
			System.out.println("Enter the line : ");
			String line = scanner.nextLine();
			FirstRepeatedWordInString inString = new FirstRepeatedWordInString();
			System.out.println("First Repeating word in line : " 
			                    + inString.firstRepeatedWordInLine(line));
		} catch(Exception e) {
			System.out.println("Exception occurred. REASON : " + e.getMessage());
		} finally {
			scanner.close();
		}
	}
	
	/**
	 * Finds the first repeated word in a Line
	 * @param line, the Input Line
	 * @return
	 */
	public String firstRepeatedWordInLine(String line) {
		String firstRepeatString = "";
		Map<String, Integer> map = new LinkedHashMap<String, Integer>();
		
		if (line == null || line.length() == 0)
			return firstRepeatString;
		
		String[] array = line.split("\\s+");
		for (String s : array) {
			if(!map.containsKey(s)) {
				map.put(s, 1);
			} else {
				map.put(s, map.get(s)+1);
			}
		}
		
		// Iterate the map
		for(Entry<String, Integer> entry : map.entrySet()) {
			if(entry.getValue() > 1) {
				firstRepeatString = entry.getKey();
				break;
			}
		}
		
		return firstRepeatString;
	}

}
