package tasks.search;

import java.util.*;


/**
 * Implementation for Binary Search Algorithm.
 *
 * Time Complexity  : O(logn)
 * Space Complexity : O(1)
 */
 public class BinarySearch {
   /**
    * Implements a trivial binary search on a list.
    * The list is already per-sorted in ascending order.
    * Returns the index of the given searchKey in the searchList, if found.
    * Else returns -1.
    */
   public int performBinarySearch(final int searchKey, final List<Integer>searchList) {
      if(searchList == null || searchList.isEmpty()) {
        return  -1;
      }
      return binarySearchHelper(0, searchList.size()-1, searchKey, searchList);

   }

   private int binarySearchHelper(final int startIndex, final int endIndex, final int searchKey, final List<Integer>searchList) {
      if(startIndex > endIndex) {
        return -1;
      }
      int middleIndex = (startIndex + endIndex)/2;
      if(searchList.get(middleIndex) == searchKey) {
        return middleIndex;
      }
      if(searchList.get(middleIndex) < searchKey) {
        return binarySearchHelper(middleIndex+1, endIndex, searchKey, searchList);
      }
      return binarySearchHelper(startIndex, middleIndex-1, searchKey, searchList);
   }

 }
