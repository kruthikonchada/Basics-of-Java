package com.example;

import java.util.Scanner;

//Problem statement:
//Given m and n, followed by m * n integers as a matrix, 
//check if each row has at lease 1 prime.
//Conditions:
//-> If m <= 0 or n <= 0, print "Wrong Input"
//-> If any matrix element is negative, print "Wrong Input"
//-> If total elements < m * n, print "Wrong Input"
//-> If all rows contain at least 1 prime, print "Valid"
//-> If any row doesn't have a prime, print "Not Valid"
//
//Input 1: 2 3 4 5 6 7 8 10
//Output 1: Valid
//Input 2: 2 2 4 6 8 10
//Output 2: Not Valid

public class MatrixPrime {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		String[] parts = input.split(" ");
		int m = Integer.parseInt(parts[0]);
		int n = Integer.parseInt(parts[1]);
		int[] elements = new int[parts.length - 2];
		for(int i = 2; i < parts.length; i++) {
			elements[i - 2] = Integer.parseInt(parts[i]);
		}
		int[][] arr = new int[m][n];
		if(m < 1 || n < 1 || elements.length < m * n) {
			System.out.println("Wrong Input");
		} else {
			for(int i = 0; i < m; i++) {
				for(int j = 0; j < n; j++) {
					if(elements[i * n + j] >= 0) {
						arr[i][j] = elements[i * n + j];
					} else {
						System.out.println("Wrong Input");
					}
				}
			}
			int validCount = 0;
			for(int i = 0; i < m; i++) {
				int count = 0;
				for(int j = 0; j < n; j++) {
					if(isPrime(arr[i][j])) {
						validCount++;
						break;
					} else {
						count++;
					}
					if(count == n) {
						System.out.println("Not Valid");
						return;
					}
				}
			}
			if(validCount == m) {
				System.out.println("Valid");
			}
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
