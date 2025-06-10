package com.example;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayReverse {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int elements = in.nextInt();
		int[] arr = new int[elements];
		for(int row = 0; row < arr.length; row++) {
				arr[row] = in.nextInt();
		}
		reverse(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	static void reverse(int[] arr) {
		int start = 0;
		int end = arr.length - 1;
		while(start < end) {
			swap(arr, start, end);
			start++;
			end--;
		}
	}
	
	static void swap(int[] arr, int start, int end) {
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
	}
}
