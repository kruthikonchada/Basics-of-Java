package com.example;

import java.util.Scanner;

public class OptimizedPalindrome {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		System.out.println(isPalindrome(x));
	}
	
	public static boolean isPalindrome(int x) {
        if(x > 0) {
            String num = String.valueOf(x);
            int len = num.length();
            int half = len / 2;
            half += (len % 2 == 0) ? 0 : 1;
            for(int i = len - 1; i >= half; i--) {
                if(num.charAt(i) != num.charAt(len - i - 1)) {
                    return false;
                }
            }
            return true;
        } else if(x == 0) {
            return true;
        } else {
            return false;
        }
    }
}
