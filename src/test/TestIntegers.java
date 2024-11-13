package test;

import sort.RadixSort;

import java.util.Arrays;

public class TestIntegers {
    public static void main(String[] args) {
        int n = 100000000;
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = (int)(Math.random() * 100000) + 1;
        }

        long startTime = System.currentTimeMillis();
        RadixSort.sort(arr);
        long finishTime = System.currentTimeMillis();

        System.out.println(Arrays.toString(arr));
        System.out.println("time taken: " + (finishTime - startTime) + " ms");
    }
}
