package LAB02;

import java.util.*;
import java.io.*;


/**
 * 
 * 
 *@author Ryan Valensa
 *@author Xavier Vogel
 *@version 2-7-2019
 */
public class TextAnalyzer
{

	private int lineCount;
	private int wordCount;
	private int[] frequencies = new int[26];
	private String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	
	public void analyzeText(String fileName) 
	{
		Scanner fileIn = null;
		String wholeLine;
		String[] wordArray;
		
		try 
		{
			fileIn = new Scanner (new File(fileName));
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File: " + fileName + " is not found");
		}
		
		
		while (fileIn.hasNextLine()) 
		{
			lineCount ++;
			wholeLine = fileIn.nextLine();
			
			wordArray = wholeLine.split(" ");
			wordCount = wordCount + wordArray.length;
			for (int i = 0; i < wordArray.length; i ++) 
			{
				String currentWord = wordArray[i];
				currentWord = currentWord.toUpperCase();
				
					for (int j = 0; j < currentWord.length(); j ++)
					{
						for (int k = 0; k < alphabet.length(); k ++)
						{
							if(currentWord.charAt(j) == alphabet.charAt(k))
								frequencies[k] ++;
						}
					}
				
			}
		}
	}		
	public int getLineCount() {return lineCount;}
	public int getWordCount() {return wordCount;}
	public int[] getFrequencies() {return frequencies;}
}
