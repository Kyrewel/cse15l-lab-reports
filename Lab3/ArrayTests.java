import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
  @Test
  public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[] { 3 }, input1);
  }

  @Test
  public void testReversed() {
    int[] input1 = {};
    assertArrayEquals(new int[] {}, ArrayExamples.reversed(input1));
  }

  // Added Tests
  @Test
  public void testReverseInPlace_size5() {
    int[] input1 = { 1, 2, 3, 4, 5 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[] { 5, 4, 3, 2, 1 }, input1);
  }

  @Test
  public void testReverse_size5() {
    int[] input1 = { 1, 2, 3, 4, 5 };
    assertArrayEquals(new int[] { 5, 4, 3, 2, 1 }, ArrayExamples.reversed(input1));
  }

  @Test
  public void avgWLempty() {
    double[] input1 = {};
    assertEquals(null, ArrayExamples.averageWithoutLowest(input1));
  }

}
