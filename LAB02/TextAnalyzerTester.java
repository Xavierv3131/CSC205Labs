package LAB02;
import java.util.*;

public class TextAnalyzerTester
{
    public static void main(String[] args)
    {
        TextAnalyzer ta = new TextAnalyzer();
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter the name of the file: ");
	  String filename = sc.next();

        ta.analyzeText(filename);
        
  System.out.println("Number of Lines: " + ta.getLineCount());
        System.out.println("Number of Words: " + ta.getWordCount());
        System.out.println("Letter Counts");
        int[] frequencies = ta.getFrequencies();
        for (int k = 0; k < frequencies.length; k++)
            System.out.println("Frequency of " + (char)('A'+ k) + 
            ": "+frequencies[k] + " ");
        System.out.println();
    }
}

