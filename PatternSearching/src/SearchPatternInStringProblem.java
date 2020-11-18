import java.util.Scanner;

/**
 * @author abinash
 * Given a text[0..n-1] and a pattern pat[0..m-a], write a function search(char pat[], char txt[]) that prints
 * all occurrences of pat[] in txt[]. You may assume that n>m.
 * 
 *      I/P - txt[] = "THIS IS A TEST TEXT"
 *            pat[] = "TEST"
 *            
 *        O/P - Pattern found at index 10
 *        
 *            txt[] = "AABAACAADAABAABA"
 *            pat[] = "AABA"
 *            
 *        O/P - Pattern found at index 0
 *              Pattern found at index 9
 *              Pattern found at index 12
 */
public class SearchPatternInStringProblem {
	
	public static void main(String[] args) {
		Scanner scanner = null;
		try {
			scanner = new Scanner(System.in);
			System.out.println("Enter the text : ");
			String text = scanner.nextLine();
			System.out.println("Enter the pattern : ");
			String pattern = scanner.nextLine();
			SearchPatternInStringProblem problem = new SearchPatternInStringProblem();
			problem.findPatternInText(text, pattern);
		} catch(Exception e) {
			System.out.println("Exception occurred. REASON : " + e.getMessage());
		} finally {
			scanner.close();
		}
	}
	
	/**
	 * Finds the index where the pattern is found out in a text
	 * @param text, The input text
	 * @param pattern, The input pattern
	 */
	public void findPatternInText(String text, String pattern) {
		
		if(text == null || text.isEmpty())
			return;
		
		if(pattern == null || pattern.isEmpty())
			return;
		
		char[] textArr = text.toCharArray();
		int limit = textArr.length - pattern.length();
		for(int i=0;i<=limit;i++) {
			String possibleMatch = text.substring(i, i+4);
			if(possibleMatch.equals(pattern)) {
				System.out.println("Pattern found at index : " + i);
			}
		}
	}
}

/*
 * Here we are converting String to an char array and searching on basis of each character.
 * This is called as 'Naive Algorithm' which solves this kind of pattern searching problem.
 */
