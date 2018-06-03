package com.shawnpen.sort.sortAlgorithm;

import java.util.Random;

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
        int[] arr = SortUtils.generateRandomArray(100, 49);
        long start = System.currentTimeMillis();
        System.out.println("start: " + start);
        sort.quickSort(arr, arr.length);
        long end = System.currentTimeMillis();
       System.out.println("end: " + end);
       System.out.println("end - start: " + (end - start));
       SortUtils.sortPrint(arr);
    }
}
