package Lab_02;

import java.util.*;

/**
 * ADVANCED VERSION This class implements sequential and binary search
 * algorithms
 */
public class Search {
   private int[] arr;
   private final int NOT_FOUND = -1;

   /**
    * The constructor is passed the array to search
    *
    * @param nums
    *           the array to search
    */
   public Search(int[] nums) {
      arr = nums;
   }

   /**
    * Sequential search
    *
    * @param key
    *           find this value
    * @return the index of value or NOT_FOUND if key does not appear in the
    *         array
    */
   public int findSequential(int key) {
      for (int i = 0; i < arr.length; i++) {
         if (arr[i] == key) {
            return i;
         }
      }
      return NOT_FOUND;
   }

   /**
    * Binary search
    *
    * @param key
    *           find this value
    * @param imin
    *           the lowest index of the sublist to be checked
    * @param imax
    *           the highest index of the sublist to be checked
    * @return the index of key or -1 if key does not appear in the array
    */
   public int findBinary(int key, int imin, int imax) {
      // test if imin > imax -- return NOT_FOUND
      if (imin > imax) {
         return NOT_FOUND;
      }
      // calculate midpoint to cut set in half
      int imid = (imin + imax) / 2;
      // Is key in the lower half? Call findBinary with the appropriate
      // parameters
      if (key < arr[imid]) {
         return findBinary(key, imin, imid - 1);
      } else if (key > arr[imid]) {
         return findBinary(key, imid + 1, imax);
      }
      // No? Is key in the upper half? Call findBinary with the appropriate
      // parameters
      // No? Then we must have found it!
      return imid;
   }
}
