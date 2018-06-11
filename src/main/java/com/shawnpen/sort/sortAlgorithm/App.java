package com.shawnpen.sort.sortAlgorithm;

import java.util.Random;

import com.shawnpen.sort.sortAlgorithm.service.MyBubbleSort;
import com.shawnpen.sort.sortAlgorithm.service.MyQuikSort;
import com.shawnpen.sort.util.SortUtils;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        MyQuikSort sort = new MyQuikSort();
        long zero = System.currentTimeMillis();
        System.out.println("开始时间：" + System.currentTimeMillis());
        int[] arr = SortUtils.generateRandomArray(50000, 10000);
        System.out.println("结束时间：" + System.currentTimeMillis());
        long start = System.currentTimeMillis();
        System.out.println("start: " + start);
        System.out.println("=====: " + (start-zero));
//        sort.quickSort(arr, arr.length);// 34 ms
//        long end = System.currentTimeMillis();
//       System.out.println("end: " + end);
//       System.out.println("end - start: " + (end - start));
//       SortUtils.sortPrint(arr);
       
       System.out.println("BubbleSort: ");
       System.out.println(System.currentTimeMillis());
	   MyBubbleSort.myBubbleSort(arr);// 157 ms
	   System.out.println(System.currentTimeMillis());
    }
}
