package QA_Practise;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class StringProblems {
	
	//reverse a string
	public static void reverseString(String str) {
		for(int i = str.length()-1; i>=0;i--) {
			System.out.print(str.charAt(i));
		}
		System.out.println();
	}
	
	//Check Palindrome
	public static void checkPalindrome(String str) {
		String rev = new StringBuilder(str).reverse().toString();
		System.out.println("Is the given String is palindorme: "+ str.toLowerCase().equals(rev.toLowerCase()));
	}
	
	//Count of Vowels and Consonants
	public static void countVowelsConsonants(String str) {
		int v =0, c = 0;
		for (char ch : str.toLowerCase().toCharArray()) {
			if("aeiou".indexOf(ch)!=-1) v++;
			else if (ch>='a' && ch<='z') c++;
			}
		System.out.println("Count of Vowels in given String: " + v + " Count of consonants in given String: "+ c);
	}
	
	//Remove Duplicates
	public static void removeDuplicates(String str) {
		StringBuilder unique = new StringBuilder();
		for (char c : str.toLowerCase().toCharArray()) {
			if(unique.indexOf(String.valueOf(c))== -1) {
				unique.append(c);
			}
		}
		System.out.println("After removing the duplicates from " + str + ": "+ unique);
	}
	
	//Find first non-repating character
	public static void firstNonRepeatingChr(String str) {
		for(char c : str.toCharArray()) {
			if(str.indexOf(c) == str.lastIndexOf(c)) {
				System.out.println("First NON Repeating Character in a String is: " + c);
				break;
			}
		}
	}
	
	//Check Anagram
	public static void anagram(String a, String b) {
		char[] a1 = a.toCharArray();
		char[] b1 = b.toCharArray();
		Arrays.sort(a1);
		Arrays.sort(b1);
		System.out.println("is " + a + " and " + b + " are Anagram: " + Arrays.equals(a1, b1));
	}
	
	//Count of Occurances of each character
	public static void countOfCharOccurance(String str) {
		Map<Character, Integer> map = new HashMap<>();
		for(char c : str.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		System.out.println("Count of Character Occurance: " + map);
		
	}
	
	//Largest Word in the sentence
	public static void longestWord(String str) {
		String[] words = str.split(" ");
		String longest = "";
		for(String w : words) {
			if(w.length() > longest.length()) {
				longest = w;
			}
		}
		System.out.println("Longest Word in the given sentence is: " + longest);
		
	}
	
	//Swap Two Strings without third variable
	public static void swapTwoStrings(String a, String b) {
		a = a + b;
		b = a.substring(0, a.length()-b.length());
		a = a.substring(b.length());
		System.out.println("a: " + a + " b: " + b);
	}
	
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String input = sc.nextLine();
		reverseString(input);
		checkPalindrome(input);
		countVowelsConsonants(input);
		removeDuplicates(input);
		firstNonRepeatingChr(input.toLowerCase());
		anagram("listen", "silent");
		countOfCharOccurance(input);
		longestWord("Java Selenium Automation Testing");
		swapTwoStrings("Hi", input);
		
		System.out.println("is the string contains digits?: " + input.matches("\\d+"));
		sc.close();
		

	}

}
