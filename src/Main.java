import sort.RadixSort;
import print.Printer;

public class Main {
    public static void main(String[] args) {
        long[] arr2 = new long[100000000];

        // Fill the array with random numbers between 1 and 100
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = (int)(Math.random() * 100) + 1;
        }

        long startTime = System.currentTimeMillis();

        RadixSort.sort(arr2);

        long endTime = System.currentTimeMillis();

        Printer.print(arr2); // This will print a lot of data; consider printing only a portion

        System.out.println("Execution time is: " + (endTime - startTime) + " ms");
    }
}
