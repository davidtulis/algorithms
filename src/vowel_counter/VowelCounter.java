package vowel_counter;

/**
 * This program attempts to count the number of vowels in any given word
 * It isn't perfect, because the English language is weird with a lot of exceptions to rules, 
 * especially concerning the letter y. This program will not output the correct number of 
 * vowels for the words that start with AND end with the letter y
 * 
 * I'd say it works for 99.9% of all words in the English dictionary
 * 
 * @author David Tulis
 */

import java.util.Scanner;

public class VowelCounter {
	public static void main(String[] args) {
		
		//get the word
		System.out.print("Input word: ");
		Scanner input = new Scanner(System.in);
		String word=input.nextLine().toLowerCase();
		input.close();
		
		int vowelCount=0;
		
		//count the vowels in the word by checked if the letter is or isnt a vowel
		for (int i=0; i<word.length(); i++) {
			if (isVowel(word.charAt(i))==true)
			{
				vowelCount++;
			}
			//special handling for the "and sometimes y" rule
			if (word.charAt(i)=='y') {
				try {
					if (isVowel(word.charAt(i-1))==false && isVowel(word.charAt(i+1))==false)
					{
						vowelCount++;
					}
				}
				catch (IndexOutOfBoundsException e) //this means the 'y' is either at the beginning or end of the word
				{
					if (word.charAt(word.length()-1)=='y') //a 'y' at the end of a word is almost always a vowel
					{
						vowelCount++;
					}
				}
			}
		}
		System.out.printf("Number of vowels: %d", vowelCount);
		
	}
	
	/**
	 * This method is a helper method for telling if a letter is or isnt a vowel
	 * @param letter the letter we want to check
	 * @return true if the letter is a vowel, false if the letter is not a vowel
	 */
	public static boolean isVowel(char letter)
	{
		boolean isVowel=false;
		switch (letter) {
		case 'a': 	isVowel=true;
					break;
		case 'e': 	isVowel=true;
					break;
		case 'i': 	isVowel=true;
					break;
		case 'o': 	isVowel=true;
					break;
		case 'u': 	isVowel=true;
					break;			
		}
		return isVowel;
	}
}
