package LAB01;
/**
 * converts an array of words to an encoded version 
 * and vice versa
 * 
 * @author Ryan Valensa 
 * @author Xavier Vogel
 * 
 * @version 1/31/2018
 */
public class EncodeDecode {
	
	private final String upperCaseAlphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private final String lowerCaseAlphabet = "abcdefghijklmnopqrstuvwxyz";
	private final String numberLine = "0123456789";
	
	

	private String[] originalList;
	private String[] encodedList;
	private String[] decodedList;
	
	public EncodeDecode(String[] oL) {
		originalList = oL;
		
		//call encode method here to populate encodedList
		encodedList = new String[originalList.length];
		for (int i = 0; i < originalList.length; i++) {
			encodedList[i] = encode(originalList[i]);
		}
		
		//call decode method here to populate decodedList
		decodedList = new String[originalList.length];
		for (int i = 0; i < originalList.length; i ++) {
			decodedList[i] = decode(encodedList[i]);
		}
	}
	
	/**
	 * this maps every character in original word
	 * 2 positions forward
	 * 
	 * @param originalWord
	 * @return newWord
	 */
	public String encode(String originalWord) {
		String newWord = "";
		
		for (int i = 0; i < originalWord.length(); i++) {
			newWord = newWord + forwardMap(originalWord.charAt(i));
		}
		return newWord;
	}
	
	/**
	 * this maps every character in coded word 2 positions back
	 * @param codedWord
	 * @return newWord
	 */
	public String decode(String codedWord) {
		String newWord = "";
		
		for (int i = 0; i < codedWord.length(); i++) {
			newWord = newWord + backMap(codedWord.charAt(i));
		}
		return newWord;
		
	}
	
	/**
	 * this maps the given char 2 positions forward 
	 * if the char is not a letter or number it maps
	 * to its self
	 * @param ch
	 * @return
	 */
	public char forwardMap(char ch) {
		char newCh = '\0';
		int newIndex;
		
		//checks if ch is an upper case letter if so 
		//returns the newCh 
		for (int i = 0; i < 26; i++) {
			if (ch == upperCaseAlphabet.charAt(i)) {
				newIndex = i + 2;
				if (newIndex >= 26) {
					newIndex = newIndex - 26;
					newCh = upperCaseAlphabet.charAt(newIndex);
					
				}
				else {
					newCh = upperCaseAlphabet.charAt(newIndex);
					
				}
			}
			
			else if (ch == lowerCaseAlphabet.charAt(i)) {
				newIndex = i + 2;
				if (newIndex >= 26) {
					newIndex = newIndex - 26;
					newCh = lowerCaseAlphabet.charAt(newIndex);
					
				}
				else {
					newCh = lowerCaseAlphabet.charAt(newIndex);
					
				}
			}
		}	
		
		for (int i = 0; i < 10; i++) {
			if(ch == numberLine.charAt(i)) {
				newIndex = i + 2;
				if (newIndex >= 10) {
					newIndex = newIndex - 10;
					newCh = numberLine.charAt(newIndex);
					
				}
				else {
					newCh = numberLine.charAt(newIndex);
					
				}
			}
		}
		
		if (newCh == '\0') 
			newCh = ch;
		
		return newCh;
	}
	
	/**
	 * this maps the given char 2 positions back 
	 * if the char is not a letter or number then it 
	 * maps to its self
	 * @param ch
	 * @return
	 */
	public char backMap(char ch) {
		char newCh = '\0';
		int newIndex;
		
		//checks if ch is an upper case letter if so 
		//returns the newCh 
		for (int i = 0; i < 26; i++) {
			if (ch == upperCaseAlphabet.charAt(i)) {
				newIndex = i - 2;
				if (newIndex < 0) {
					newIndex = newIndex + 26;
					newCh = upperCaseAlphabet.charAt(newIndex);
					
				}
				else {
					newCh = upperCaseAlphabet.charAt(newIndex);
					
				}
			}
			
			else if (ch == lowerCaseAlphabet.charAt(i)) {
				newIndex = i - 2;
				if (newIndex < 0) {
					newIndex = newIndex + 26;
					newCh = lowerCaseAlphabet.charAt(newIndex);
					
				}
				else {
					newCh = lowerCaseAlphabet.charAt(newIndex);
					
				}
			}
		}
		for (int i = 0; i < 10; i++) {
			if(ch == numberLine.charAt(i)) {
				newIndex = i - 2;
				if (newIndex < 0) {
					newIndex = newIndex + 10;
					newCh = numberLine.charAt(newIndex);
					
				}
				else {
					newCh = numberLine.charAt(newIndex);
					
				}
			}
		}
		
		if (newCh == '\0') 
			newCh = ch;
		
		return newCh;
		
		
		
	}
	public String[] getEncodedList() { return encodedList;}
	public String[] getDecodedList() { return decodedList;}
}
