package Lab_02;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * This is a tester for the Search class - see expected answers in the code.
 */
public class SearchTester {
   public static void main(String[] args) throws IOException {
      int[] nums = new int[10000];
      int[] findThese = { 82822549, 89472397, 2575670, 70439844, 18503011, 1227,
            99992861, 12345678 };
      long count1;
      long count2;
      // Set up data array
      readArray(nums);
      Search searcher = new Search(nums);
      // Sequential search
      // Expected answers: 590 2036 8149 9999 0 9105 987 -1
      count1 = System.nanoTime();
      for (int i = 0; i < findThese.length; i++) {
         System.out.println("The index of " + findThese[i] + " is "
               + searcher.findSequential(findThese[i]));
      }
      count2 = System.nanoTime();
      System.out.println("\nSequential search took " + (count2 - count1)
            + " nanoseconds\n\n");
      // Binary search
      // Note nums must be SORTED for binary search!
      // Expected answers: 8286 8956 272 7051 1866 0 9999 -1
      Arrays.sort(nums);
      count1 = System.nanoTime();
      for (int i = 0; i < findThese.length; i++) {
         System.out.println("The index of " + findThese[i] + " is "
               + searcher.findBinary(findThese[i], 0, nums.length - 1));
      }
      count2 = System.nanoTime();
      System.out.println(
            "\nBinary search took " + (count2 - count1) + " nanoseconds");
   }

   /**
    * Reads in random numbers from a file
    *
    * @param nums
    *           the array to be sorted
    *
    * @throws IOException
    */
   private static void readArray(int[] nums) throws IOException {
      Scanner scanFile = new Scanner(
            new File("Resources", "randomNumbers.txt"));
      for (int i = 0; i < nums.length; i++) {
         nums[i] = scanFile.nextInt();
      }
   }
}