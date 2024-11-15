package sort;

import java.util.Arrays;

public class RadixSort {
    public static void sort(int[] nums){
        long max = getMax(nums);
        for(int exp = 1; max/exp > 0; exp *= 10)
            radix(nums, exp);
    }
    public static int getMax(int[] nums){
        int max = nums[0];
        for (int num : nums) {
            if (max < num)
                max = num;
        }
        return max;
    }
    public static void radix(int[] nums, int exp){
        int[] count = new int[10];
        Arrays.fill(count, 0);
        int[] output = new int[nums.length];

        for (int num : nums) count[(num / exp) % 10]++;

        for(int i = 1; i < 10; i++) count[i] += count[i - 1];

        for(int i = nums.length - 1; i >= 0; i--){
            output[count[(nums[i]/exp) % 10] - 1] = nums[i];
            count[(nums[i]/exp) % 10]--;
        }

        System.arraycopy(output, 0, nums, 0, nums.length);
    }
}
