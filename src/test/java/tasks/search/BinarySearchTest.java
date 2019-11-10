package tasks.search;

import java.util.*;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Tests for {@code BinarySearch}.
 */
 public class BinarySearchTest {

   private final List<Integer> searchList = new ArrayList<>(List.of(2, 3, 4, 10, 40));
   private final BinarySearch binarySearchStubUnderTest = new BinarySearch();

   @Test
   public void givenNullListWhenBinarySearchPerformedThenReturnNotFound() {
     assertEquals(-1, binarySearchStubUnderTest.performBinarySearch(1, null));
   }

   @Test
   public void givenEmptyListWhenBinarySearchPerformedThenReturnNotFound() {
     assertEquals(-1, binarySearchStubUnderTest.performBinarySearch(1, new ArrayList<Integer>()));
   }

   @Test
   public void givenExistingSearchKeyWhenBinarySearchPerformedThenReturnKeysIndex() {
     assertEquals(0, binarySearchStubUnderTest.performBinarySearch(2, searchList));
     assertEquals(2, binarySearchStubUnderTest.performBinarySearch(4, searchList));
     assertEquals(4, binarySearchStubUnderTest.performBinarySearch(40, searchList));
   }

   @Test
   public void givenNonExistentSearchKeyWhenBinarySearchPerformedThenReturnNotFound() {
     assertEquals(-1, binarySearchStubUnderTest.performBinarySearch(80, searchList));
   }
 }
