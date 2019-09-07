package UniCodeCalculator;

import java.util.Scanner;

public class UniCodeCalculator {
	
	public static void main(String [] args) {
		
		Scanner input = new Scanner(System.in);
	
		String s1, s2;
		char word1[], word2[];
		int word1Value = 0;
		int word2Value = 0;
		int result = 0;
		
		System.out.println("Please enter word 1");
		s1 = input.nextLine();
		
		System.out.println("Please enter word 2");
		s2 = input.nextLine();
		
		word1 = s1.toCharArray();
		for(char letter:word1) {
			word1Value += (int)letter;
			System.out.printf("%s:%d\n", letter, (int)letter);
		}
		
		word2 = s2.toCharArray();
		for(char letter:word2) {
			word2Value += (int)letter;
			System.out.printf("%s:%d\n", letter, (int)letter);
			
		}
		
		result = Math.abs(word1Value - word2Value);
		
		System.out.println("Absolute difference between strings: " + result);
		
	}
	
}
