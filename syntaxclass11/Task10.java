package com.syntaxclass11;

import java.util.Arrays;

public class Task10 {

	public static void main(String[] args) {
		// Write a java program to find the second largest number in the array

		
		
		int[] arr= {10,20,5,6,8,200};
		System.out.println(Arrays.toString(arr));
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(arr[0]);
		System.out.println(arr[arr.length-1]); // last index is always size -1
		System.out.println(arr[arr.length-2]);
		System.out.println("Another ways;");
		int[] array = { 11, 4, 52, 89, 3, 511, 63, 900, 2 };
		int max1 = array[0];
		int max2 = array[1];
		for (int y = 1; y < array.length; y++) {
			if (array[y] > max2) {
				max2 = array[y];
			}
			if (max2 > max1) {
				int temp = max1;
				max1 = max2;
				max2 = temp;
			}
		
			
			
		}}}
			
		



