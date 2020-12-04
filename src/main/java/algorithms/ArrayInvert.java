package algorithms;
import java.util.Arrays;

public class ArrayInvert {

    // Write a program to invert the items in a given array using a just one loop without using an additional array


    public static int[] invertTheItemsInArray(int[] myArray) {

        int decreasingArrayLength = 1;
        for (int i = 0; i < myArray.length/2; i++) {
            int aux = myArray[i];
            myArray[i] = myArray[myArray.length - decreasingArrayLength];
            myArray[myArray.length - decreasingArrayLength] = aux;
            decreasingArrayLength++;
        }
        return myArray;
    }
}
