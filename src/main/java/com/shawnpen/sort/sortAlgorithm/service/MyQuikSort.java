package com.shawnpen.sort.sortAlgorithm.service;

import java.util.Arrays;

import com.shawnpen.sort.util.SortUtils;

public class MyQuikSort {
	//如果数组的长度小于这个常量，则优先选择插入排序，直接使用Arrays.sort();
	private static final int INSERTION_SORT_THRESHOLD = 47;
	
	public void quickSort(int[] arr, int len) {
		quickSortImpl(arr,0,len-1);
	}
	
	/**
	 * 快速排序实现类
	 * @param arr
	 * @param left
	 * @param right
	 */
	private void quickSortImpl(int[] arr, int left, int right) {
		if(INSERTION_SORT_THRESHOLD < (right - left)) {
			//获取主元
			int pivot = SortUtils.median3(arr, left, right);
			int i = left, j = right - 1;
			for(;;) {
				while(arr[++i] < pivot) {}//如果该位置上的值小于主元，则下标往右移
				while(arr[--j] > pivot) {}//如果该位置上的值大于主元，则下标往左移
				if(i < j) {
					//交换元素
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				} else {
					break;
				}
			}
			//交换元素
			int tem = arr[i]; 
			arr[i] = arr[right-1];
			arr[right-1] = tem;
			//划分出的左子集再排序
			quickSortImpl(arr,left,i-1);
			//划分出的右子集再排序
			quickSortImpl(arr,i+1,right);
		} else {
			//使用插入排序
			Arrays.sort(arr);
		}
	}
	
	
}
