package com.example;

import java.util.Scanner;

public class MinimumValueInRange {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a value: ");
		int len = in.nextInt();
		System.out.print("Enter all numbers: ");
		int[] nums = new int[len];
		for(int i = 0; i < nums.length; i++) {
			nums[i] = in.nextInt();
		}
		System.out.print("Enter starting from: ");
		int start = in.nextInt();
		System.out.print("Enter ending from: ");
		int end = in.nextInt();
		System.out.println("Minimum value in given range is: " + min(nums, start, end));
	}
	
	//Assume array's length is greater than zero.
	static int min(int[] nums, int start, int end) {
		int min = nums[start];
		for(int i = start; i <= end; i++) {
			if(nums[i] < min) {
				min = nums[i];
			}
		}
		return min;
	}
}
