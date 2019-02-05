
package LAB02;

import java.util.*;
import java.io.*;


/**
 * 
 * 
 * @author rvale2
 *
 */
public class TextAnalyzer {

	private int lineCount;
	private int wordCount;
	private int[] frequencies = new int[26];
	
	
	public void analyzeText(String fileName) {
		
		Scanner fileIn = null;
		try {
			fileIn = new Scanner (new File(fileName));
		}
		catch(FileNotFoundException e){
			System.out.println("File: " + fileName + " is not found");
		}
		
		int count = 0;
		while (fileIn.hasNextLine()) {
			count ++;
			fileIn.hasNextLine();
		}
		lineCount = count;
		
		
		
	}
	
	public int getLineCount() {return lineCount;}
	public int getWordCount() {return wordCount;}
	public int[] getFrequencies() {return frequencies;}
}
