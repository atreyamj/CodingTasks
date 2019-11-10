package tasks.search;

import java.util.*;

/**
 * This class implements the basic linear search that iterates through array to find the element.
 *
 * Time Complexity  : O(n)
 * Space Complexity : O(1)
 */

public class LinearSearch {

    /**
     *  Performs linear search and returns the first found index of the key from the beginning of the list, if found.
     *  Otherwise, returns -1.
     */
    public int searchKeyInList(final String searchKey, final List<String> searchList) {
      if(searchList == null || searchKey == null || searchList.isEmpty()) {
        return -1;
      }
      for(int i=0;i<searchList.size();i++) {
        if(searchList.get(i).equals(searchKey)) {
          return i;
        }
      }
      return -1;
    }
}
