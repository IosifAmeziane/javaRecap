package algorithms;

import algorithms.ArrayUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class ArrayUtilsTest {

    @Test
    public void givenArrayIsPalindromShouldBeTrue() {
        int a[] = {1, 2, 2, 1};
        int b[] = {1, 2, 3, 2, 1};

        Assertions.assertTrue(ArrayUtils.isPalindrome(a));
        Assertions.assertTrue(ArrayUtils.isPalindrome(b));

    }
}
