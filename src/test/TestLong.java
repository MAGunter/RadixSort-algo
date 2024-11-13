package test;

import sort.RadixSortLong;

import java.util.Arrays;

public class TestLong {
    public static void main(String[] args) {
        int n = 100000000;
        long[] arr = new long[n];
        for(int i = 0; i < n; i++){
            arr[i] = (long)(Math.random() * 1000) + 1;
        }

        long startTime = System.currentTimeMillis();
        RadixSortLong.sort(arr);
        long finishTime = System.currentTimeMillis();

        System.out.println(Arrays.toString(arr));
        System.out.println("time taken: " + (finishTime - startTime) + " ms");
    }
}

