package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PalindromeRange {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter starting number: ");
		int firstNum = in.nextInt();
		System.out.print("Enter ending number: ");
		int secondNum = in.nextInt();
		System.out.println("Palidromes:" + palindromes(firstNum, secondNum));
	}
	
	static List<Integer> palindromes(int startNum, int endNum) {
		List<Integer> palindromes = new ArrayList<Integer>();
		for(int i = startNum; i <= endNum; i++) {
			if(isPalindrome(i)) {
				palindromes.add(i);
			}
		}
		return palindromes;
	}
	
	static boolean isPalindrome(int num) {
		String actualNum = String.valueOf(num);
		String value = "";
		while(num > 0) {
			value += (num % 10); 
			num /= 10;
		}
		return value.equals(actualNum);
	}
}
