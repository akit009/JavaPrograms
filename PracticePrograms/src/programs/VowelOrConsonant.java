package programs;

import java.util.Scanner;

public class VowelOrConsonant {
	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		{
			char ch = 'o';
			if (ch == 'a' || ch == 'o' || ch == 'e' || ch == 'i' || ch == 'u') {
				System.out.println("The Alphabet is a Vowel");

			} else {
				System.out.println("The Alphabet is Consonant");
			}

		}
	}

}
