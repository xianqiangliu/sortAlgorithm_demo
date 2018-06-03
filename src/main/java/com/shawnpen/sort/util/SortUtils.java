package com.shawnpen.sort.util;

import java.util.Random;

public class SortUtils {
	
	/**
	 * 使用找数组前中后三个位置上的中位数方式来获取主元pivot
	 * @param arr
	 * @param left
	 * @param right
	 * @return
	 */
	public static int median3(int[] arr, int left, int right) {
		int center = (left+right)/2;//中间位置
		//找出前中后中位数
		if(arr[left] > arr[center]){
			//进行数据交换
			int tem = arr[left];
			arr[left] = arr[center];
			arr[center] = tem;
		}
		
		if(arr[left] > arr[right]) {
			int tem = arr[left];
			arr[left] = arr[right];
			arr[right] = tem;
		}
		
		if(arr[center] > arr[right]) {
			int tem = arr[center];
			arr[center] = arr[right];
			arr[right] = tem;
		}
		
		//将主元pivot藏在arr[right-1]
		int temp = arr[center];
		arr[center] = arr[right-1];
		arr[center-1] = temp;
		
		//返回主元
		return arr[center-1];
		
	}
	
	
	/**
	 * 生成随机数组
	 * @param m
	 * @param n
	 * @return
	 */
    public static int[] generateRandomArray(int m, int n){
        if(m<=0) return null;
        if(n<=0) return null;
        if(m< n) return null;

        int[] intRet = new int[n];
        int intRd = 0; // 存放随机数
        int count = 0; // 记录生成的随机数个数
        boolean flag = false;  // 是否已经生成过标志
        while(count< n){
            Random rdm = new Random(System.currentTimeMillis());
            intRd = Math.abs(rdm.nextInt())%m +1;
            for(int i=0;i<count;i++){
                if(intRet[i]==intRd){
                    flag = true;
                    break;
                }else{
                    flag = false;
                }
            }
            if(flag==false){
                intRet[count] = intRd;
                count++;
            }
        }
        return intRet;
    }
    
    
    //打印元素
    public static void sortPrint(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (i == 0){
                System.out.print("[" + arr[0] + ",");
            }else if(i == arr.length - 1){
                System.out.println(arr[i] + "]");
            }else{
                System.out.print(arr[i]+",");
            }
        }
    }

}
