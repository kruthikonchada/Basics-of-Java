package com.example;

import java.util.Scanner;

public class Palindrome {
	// palindrome => If reverse of a string is same as the original one.
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a string value: ");
		String value = in.next();
		String lowerCase = value.toLowerCase();
		String reverseValue = "";
		for(int i = lowerCase.length() - 1; i >= 0; i--) {
			reverseValue += lowerCase.charAt(i);
		}
		System.out.println(reverseValue.equals(lowerCase) ? "Palindrome" : "Not a Palindrome");
	}
}
