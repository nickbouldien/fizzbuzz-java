package fizzbuzz;

import java.util.HashMap;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {
  
    public FizzBuzz fizzbuzz = new FizzBuzz();

    @Test
    public void testReturnsCorrectResults1() {
        HashMap<String, Integer> expectedResult = new HashMap<String, Integer>();
        expectedResult.put("lucky", 0);
        expectedResult.put("fizzbuzz", 0);
        expectedResult.put("fizz", 0);
        expectedResult.put("buzz", 0);
        expectedResult.put("integer", 2);

        HashMap<String, Integer> res = fizzbuzz.run(2);

        assertEquals(res.get("lucky"), expectedResult.get("lucky"));
        assertEquals(res.get("fizzbuzz"), expectedResult.get("fizzbuzz"));
        assertEquals(res.get("fizz"), expectedResult.get("fizz"));
        assertEquals(res.get("buzz"), expectedResult.get("buzz"));
        assertEquals(res.get("integer"), expectedResult.get("integer"));
    }

    @Test
    public void testReturnsCorrectResults2() {
        HashMap<String, Integer> expectedResult = new HashMap<String, Integer>();
        expectedResult.put("lucky", 2);
        expectedResult.put("fizzbuzz", 1);
        expectedResult.put("fizz", 4);
        expectedResult.put("buzz", 3);
        expectedResult.put("integer", 10);

        HashMap<String, Integer> res = fizzbuzz.run(20);

        assertEquals(res.get("lucky"), expectedResult.get("lucky"));
        assertEquals(res.get("fizzbuzz"), expectedResult.get("fizzbuzz"));
        assertEquals(res.get("fizz"), expectedResult.get("fizz"));
        assertEquals(res.get("buzz"), expectedResult.get("buzz"));
        assertEquals(res.get("integer"), expectedResult.get("integer"));
    }

    @Test
    public void testHasDigit() {
        assertTrue(fizzbuzz.hasDigit(3, 13));
        assertTrue(fizzbuzz.hasDigit(3, 23));
        assertFalse(fizzbuzz.hasDigit(3, 15));
        assertFalse(fizzbuzz.hasDigit(7, 192));
    }
}
