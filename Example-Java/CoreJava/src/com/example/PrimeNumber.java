package com.example;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = in.nextInt();
		if(num > 1) {
			if(isPrime(num)) {
				System.out.println(num + " is a prime number.");
			} else {
				System.out.println(num + " is not a prime number.");
			}
		} else {
			System.out.println("Please enter a number which is greater than 2.");
		}
	}
	
	static boolean isPrime(int num) {
		for(int i = 2; i <= num / 2; i++) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}
}
