package LAB02;

import java.util.*;
import java.io.*;


/**
 * This class takes the file given and reads it line by line,
 * counting the number of lines, words, and letter frequency in the file
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
		
		/**
		*try catch statement to make sure the file given is a valid file
		*/
		try 
		{
			fileIn = new Scanner (new File(fileName));
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File: " + fileName + " is not found");
		}
		
		/**
		*while statement that keeps looping as long as the file has a next line
		*each loop increases the lineCount by 1 and splits the current line
		*in to words and puts the words into an array. Once the words are in an array
		*wordCount is increased by the length of the array.
		*/
		while (fileIn.hasNextLine()) 
		{
			lineCount ++;
			wholeLine = fileIn.nextLine();
			
			wordArray = wholeLine.split(" ");
			wordCount = wordCount + wordArray.length;
			
			/**
			*for loop to grab each word in the array one by one and turn all
			*the letters in the word to uppercase.
			*/
			for (int i = 0; i < wordArray.length; i ++) 
			{
				String currentWord = wordArray[i];
				currentWord = currentWord.toUpperCase();
				
					/**
					*this for loop compares each letter in the current word to the alphabet
					*string, finds the index of the letter in alphabet and increments that 
					*same index in frequencies array by 1.
					*/
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
