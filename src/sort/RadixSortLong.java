package sort;

import java.util.Arrays;

public class RadixSortLong {
    public static void sort(long[] nums){
        long max = getMax(nums);
        for(int exp = 1; max/exp > 0; exp *= 10)
            radix(nums, exp);
    }
    public static long getMax(long[] nums){
        long max = nums[0];
        for (long num : nums) {
            if (max < num)
                max = num;
        }
        return max;
    }
    public static void radix(long[] nums, int exp){
        int[] count = new int[10];
        Arrays.fill(count, 0);
        long[] output = new long[nums.length];

        for (long num : nums) count[(int)(num / exp) % 10]++;

        for(int i = 1; i < 10; i++) count[i] += count[i - 1];

        for(int i = nums.length - 1; i >= 0; i--){
            output[count[(int) ((nums[i]/exp) % 10)] - 1] = (int) nums[i];
            count[(int)(nums[i]/exp) % 10]--;
        }

        System.arraycopy(output, 0, nums, 0, nums.length);
    }
}
