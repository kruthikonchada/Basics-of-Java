package com.example;

import java.util.Scanner;

public class LinearSearch {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a value: ");
		int len = in.nextInt();
		System.out.print("Enter all numbers: ");
		int[] nums = new int[len];
		for(int i = 0; i < nums.length; i++) {
			nums[i] = in.nextInt();
		}
		System.out.print("Enter target: ");
		int target = in.nextInt();
		System.out.println(linearSearch(nums, target));
	}
	
	static int linearSearch(int[] arr, int target) {
		if(arr.length <= 0) {
			return -1;
		}
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == target) {
				return i;
			}
		}
		return -1;
	}
}
