package utility;

import java.util.Arrays;

public class Printer {
    public static void print(long[] nums){
        Arrays.stream(nums).forEach(num -> System.out.print(num + " "));
        System.out.println();
    }
}
