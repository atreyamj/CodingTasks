package tasks.search;

import java.util.*;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Tests for {@code LinearSearch}.
 */
 public class LinearSearchTest {

   private final List<String> searchList = new ArrayList<>(List.of("a", "b", "c", "d"));
   private final LinearSearch linearSearchStubUnderTest = new LinearSearch();

   @Test
   public void givenNullListWhenLinearSearchPerformedThenReturnNotFound() {
     assertEquals(-1, linearSearchStubUnderTest.searchKeyInList("", null));
   }

   @Test
   public void givenEmptyListWhenLinearSearchPerformedThenReturnNotFound() {
     assertEquals(-1, linearSearchStubUnderTest.searchKeyInList("", searchList));
   }

   @Test
   public void givenNullSearchKeyWhenLinearSearchPerformedThenReturnNotFound() {
     assertEquals(-1, linearSearchStubUnderTest.searchKeyInList("", searchList));
   }

   @Test
   public void givenExistingSearchKeyWhenLinearSearchPerformedThenReturnKeysIndex() {
     assertEquals(1, linearSearchStubUnderTest.searchKeyInList("b", searchList));
   }

   @Test
   public void givenNonExistentSearchKeyWhenLinearSearchPerformedThenReturnNotFound() {
     assertEquals(-1, linearSearchStubUnderTest.searchKeyInList("f", searchList));
   }
 }
