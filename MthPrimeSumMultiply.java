package com.example;

import java.util.Scanner;

//Problem Statement:
//You are given 2 integers m and n.
//find the m-th prime number, calculate the digit sum of that number 
//until it becomes a single digit an then multiply the prime with that digit.
//
//Input 1: 6 8
//Output 1: 52
//(6th prime = 13 -> 1 + 3 = 4 -> 13 * 4 = 52)
//
//Input 2: 10 50
//Output 2: 58
//(10th prime = 29 -> 2 + 9 = 11 -> 1 + 1 = 2 -> 29 * 2 = 58)

public class MthPrimeSumMultiply {
	public static void main(String[] args) {
		Scanner in  = new Scanner(System.in);
		int m = in.nextInt();
		int primeNum = 2;
		int count = 3;
		int i = 1;
		while(i < m) {
			if(isPrime(count)) {
				primeNum = count;
				i++;
			}
			count++;
		}
		int sum = primeNum;
		while(String.valueOf(sum).length() > 1) {
			sum = sumDigits(sum);
		}
		System.out.println(sum * primeNum);
	}
	
	static boolean isPrime(int num) {
		for(int i = 2; i <= num / 2; i++) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	static int sumDigits(int num) {
		int sum = 0;
		while(num > 0) {
			sum += num % 10; 
			num /= 10;
		}
		return sum;
	}
}
