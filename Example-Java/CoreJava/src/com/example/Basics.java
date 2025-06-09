package com.example;

import java.util.Scanner;

public class Basics {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter name: ");
		String name = in.next();
		System.out.println("Hey " + name + "...");
	}
}
