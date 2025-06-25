package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//You have an array of floating point numbers averages which is initially 
//empty. You are given an array nums of n integers where n is even.
//You repeat the following procedure n / 2 times:
//-> Remove the smallest element, minElement and the largest element 
//   maxElement, from nums.
//-> Add (minElement + mxElement) / 2 to averages.
//Return the minimum element in averages.
//
//Constraints:
//-> 2 <= n == nums.length <= 50.
//-> n is even.
//-> 1 <= nums[i] <= 50
//
//Input: nums = [7, 8, 3, 4, 15, 13, 4, 1]
//Output: 5.5
//Input: nums = [1, 2, 3, 7, 8, 9]
//Output: 5.0
//
//Step nums 						 averages
//0    [7, 8, 3, 4, 15, 13, 4, 1]    []
//1    [7, 8, 3, 4, 13, 4]		     [8]
//2	   [7, 8, 4, 4]				     [8, 8]
//3    [7, 4]						 [8, 8, 6]
//4    []							 [8, 8, 5.5]

public class MinimumAverage {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String line = in.nextLine();
		List<Integer> nums = new ArrayList<Integer>();
		List<Float> averages = new ArrayList<Float>();
		for(String num : line.trim().split(" ")) {
			nums.add(Integer.parseInt(num));
		}
		nums.sort(null);
		while(nums.size() >= 2 && nums.size() <= 50 && nums.size() % 2 == 0) {
			averages(nums, averages);
		}
		averages.sort(null);
		System.out.println(averages.get(0));
	}
	
	static void averages(List<Integer> nums, List<Float> averages) {
		int min = nums.get(0);
		int max = nums.get(nums.size() - 1);
		averages.add(((float)(min + max)) / 2);
		nums.remove(0);
		nums.remove(nums.get(nums.size() - 1));
	}
}
