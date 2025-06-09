package com.example;

import java.util.Scanner;

public class PerfectSquare {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = in.nextInt();
		if(num > 0) {
			for(int i = 2; i <= num / 2; i++) {
				if(i * i == num) {
					System.out.println(num + " is a perfect square.");
					return;
				}
			} 
			System.out.println(num + " is not a perfect square.");
		} else {
			System.out.println("Please enter a positive number.");
		}
	}
}
