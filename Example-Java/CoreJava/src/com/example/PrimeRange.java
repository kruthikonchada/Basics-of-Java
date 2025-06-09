package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeRange {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter starting number: ");
		int firstNum = in.nextInt();
		System.out.print("Enter ending number: ");
		int secondNum = in.nextInt();
		System.out.println(primes(firstNum, secondNum));
	}
	
	static List<Integer> primes(int startNum, int endNum) {
		List<Integer> primes = new ArrayList<Integer>();
		for(int i = startNum; i <= endNum; i++) {
			if(isPrime(i)) {
				primes.add(i);
			}
		}
		return primes;
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
