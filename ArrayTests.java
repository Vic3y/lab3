import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReverseInPlaceTwo(){
    int[] input1 = { 44,33,12 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 12 , 33, 44}, input1);
  }

  @Test 
  public void testReversedTwo(){
    int[] input1 = {1, 2, 3};
    assertArrayEquals(new int[]{3, 2, 1}, ArrayExamples.reversed(input1));
  }
  @Test 
  public void testAverageWithoutLowest(){
    double[] input1 = {9.0, 9.0, 1.0, 9.0, 9.0};

    assertEquals(9.0, ArrayExamples.averageWithoutLowest(input1), 0.1);
  }
}
