package com.example;

import java.util.Scanner;

public class ArmStrong {
	// armStrong = 153 => 1 cube + 5 cube + 3 cube = 153
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = in.nextInt();
		boolean isArmStrong = armStrong(number);
		if(isArmStrong) {
			System.out.println("Is an Armstrong number.");
		} else {
			System.out.println("Is not an Armstrong number.");
		}
	}
	
	static boolean armStrong(int number) {
		if(number > 1) {
			int num = number;
			int value = 0;
			while(num > 0) {
				int i = (num % 10);
				value += i * i * i;
				num /= 10;
			}
			return value == number;
		}
		return false;
	}
}