import algorithms.ArrayUtils;
import algorithms.NumbersUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class NumbersUtilsTest {

    @Test
    public void givenNumberWhenIsPalindromThenTrue() {
        int c = 11;
        int d = 12321;

        assertTrue(NumbersUtils.isPalindrome(c));
        assertTrue(NumbersUtils.isPalindrome(d));

    }

    @Test
    public void givenArrayFindMissingNumberShouldReturnTheMissingNumber() {
        int[] a = {1, 2, 4, 5};

        assertEquals(ArrayUtils.findMissingNumber(a, 5), 3);
    }

    @Test
    public void givenArrayFindMissingNumberShouldReturnTheMissingNumber1() {
        int[] a = {1, 2, 4, 5};

        assertEquals(ArrayUtils.findMissingNumber(a, 5), 3);
    }

}
