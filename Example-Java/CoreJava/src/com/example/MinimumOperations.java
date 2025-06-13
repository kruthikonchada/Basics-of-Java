package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//You are given 3 integers P, Q and R. You can perform the following 
//operation any no. of times:
// -> Select any 2 numbers & increase both by 1.
// -> Decrease the 3rd number by 1.
//Your task is to determine the minimum number of operations required to make 
//all 3 numbers equal.
//
//Input:
//4 <- no. of test cases
//1 2 3
//4 4 4
//3 2 6
//1 1 7
//Output:
//-1
//0
//-1
//3

public class MinimumOperations {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int cases = in.nextInt();
		List<int[]> arrs = new ArrayList<int[]>();
		for(int i = 0; i < cases; i++) {
			int[] arr = new int[3];
			for(int j = 0; j < arr.length; j++) {
				arr[j] = in.nextInt();
			}
			arrs.add(arr);
		}
		for(int[] r : arrs) {
			int count = 0;
			Arrays.sort(r);
			int min = r[0];
			int middle = r[1];
			int max = r[2];
			while(true) {
				if(min == max && max == middle) {
					break;
				} else if(middle < max) {
					min++;
					middle++;
					max--;
					count++;
				} else {
					count = -1;
					break;
				}
			}
			System.out.println(count);
		}
	}
}
