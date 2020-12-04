package fundamentals;

import java.util.Scanner;

public class ArraySorting {

    Scanner scanner = new Scanner(System.in);

    public int[] KeyInArray() {
        System.out.println("Key in the array length: ");
        int arrayLength = scanner.nextInt();
        int arrayForSorting[] = new int[arrayLength];
        System.out.println("Key in the array elements: ");
        for (int i = 0; i < arrayLength; i++) {
            arrayForSorting[i] = scanner.nextInt();
        }
        return arrayForSorting;
    }

    public static void main(String[] args) {
        ArraySorting arraySorting = new ArraySorting();
        arraySorting.sortArray();
    }

    public void sortArray() {
        ArraySorting arraySorting = new ArraySorting();
        int[] myArray = arraySorting.KeyInArray();
        System.out.println("Array Unsorted: ");
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }

        /*for (int i = 0; i < myArray.length; i++) {
            for (int j = i + 1; j < myArray.length; j++) {
                if (myArray[i] > myArray[j]) {
                    int temp = myArray[i];
                    myArray[i] = myArray[j];
                    myArray[j] = temp;
                }
            }
        }*/

        System.out.println("Array Sorted: ");
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }
    }
}
