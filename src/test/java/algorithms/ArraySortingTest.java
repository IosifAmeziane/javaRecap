package algorithms;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ArraySortingTest {

    @Test
    public void givenAnArrayShouldReturnSameArrayButSorted() {
        int[] unsortedArray = new int[]{9, 7, 5, 3, 3, 1};
        ArraySorting.sortingArray(unsortedArray);
        for (int i = 0; i < unsortedArray.length; i++) {
            for (int j = i + 1; j < unsortedArray.length; j++)
                Assertions.assertTrue(unsortedArray[i] <= unsortedArray[j]);

        }
    }
}