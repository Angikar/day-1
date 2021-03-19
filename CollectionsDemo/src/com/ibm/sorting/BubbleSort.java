package com.ibm.sorting;

public class BubbleSort {
	public static void main(String[] args) {
		int[] arr = { 7, 4, 9, 2, 3 };

		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					// swap temp and arr[i]
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		for(int iter : arr) {
			System.out.println(iter);
		}
	}
	

}
