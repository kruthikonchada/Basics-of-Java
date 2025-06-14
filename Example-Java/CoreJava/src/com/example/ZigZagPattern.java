package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Given a matrix of size m * n, print its elements in zigzag row-wise 
//pattern.
//Even rows: Left -> Right
//Odd rows: Right -> Left
//
//Input: 3 3
//1 2 3
//4 5 6
//7 8 9
//Output:
//1 2 3
//6 5 4
//7 8 9
public class ZigZagPattern {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int m = in.nextInt();
		int n = in.nextInt();
		List<int[]> matrix = new ArrayList<int[]>();
		for(int i = 0; i < m; i++) {
			int[] row = new int[n];
			for(int j = 0; j < n; j++) {
				row[j] = in.nextInt();
			}
			matrix.add(row);
		}
		for(int i = 0; i < m; i++) {
			if(i % 2 == 0) { //Even Row
				for(int j = 0; j < n; j++) {
					System.out.print(matrix.get(i)[j] + " ");
				}
			} else { //Odd Row
				for(int j = n - 1; j >= 0; j--) {
					System.out.print(matrix.get(i)[j] + " ");
				}
			}
			System.out.println();
		}
	}
}
