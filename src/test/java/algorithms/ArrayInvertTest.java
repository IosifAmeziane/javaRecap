package algorithms;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

class ArrayInvertTest {

    @Test
    public void givenArrayShouldReturnTheSameArrayWithInvertedItems() {
        int[] evenArray = {2, 4, 6, 8};
        int[] revertedEvenArray = new int[evenArray.length];
        for (int i = 0; i < revertedEvenArray.length; i++) {
            revertedEvenArray[i]=evenArray[i];
        }
        ArrayInvert.invertTheItemsInArray(revertedEvenArray);
        for (int i=0, j=revertedEvenArray.length-1; j>=0; i++,j--){
            assertEquals(revertedEvenArray[j],evenArray[i]);
        }

        int[] oddArray = new int[]{1, 3, 5, 7, 9};
        int[] revertedOddArray = new int[oddArray.length];
        for (int i = 0; i < revertedOddArray.length; i++) {
            revertedOddArray[i] = oddArray[i];
        }
        ArrayInvert.invertTheItemsInArray(revertedOddArray);

        for (int i = 0, j = revertedOddArray.length - 1; j >= 0; i++, j--) {
            assertEquals(revertedOddArray[j], oddArray[i]);
        }
    }
}