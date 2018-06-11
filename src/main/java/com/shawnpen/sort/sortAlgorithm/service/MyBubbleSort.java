package com.shawnpen.sort.sortAlgorithm.service;

import com.shawnpen.sort.util.SortUtils;

public class MyBubbleSort {
	
	public static void main(String[] args) {
		int[] arr = SortUtils.generateRandomArray(1000000, 100001);
		SortUtils.sortPrint(arr);
		System.out.println(System.currentTimeMillis());
		myBubbleSort(arr);
		System.out.println(System.currentTimeMillis());
		SortUtils.sortPrint(arr);
	}
	
	
	/**
	 * 冒泡排序
	 * @param arr
	 */
	public static void myBubbleSort(int[] arr) {
		_bubbleSort(arr,arr.length);
	}

	public static void _bubbleSort(int[] arr, int len) {
		
		for(int i=len-1; i >= 0; i--) {
			boolean flag = false;
			for(int j=0; j < i; j++) {
				if(arr[j] > arr[j+1]) {
					SortUtils.ElementSwap(arr, j, j+1);
					flag= true;
				}
			}
			if(flag == false) {
				break;
			}
		}
		
	}
}
