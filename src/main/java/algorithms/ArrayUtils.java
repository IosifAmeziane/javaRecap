package algorithms;

public class ArrayUtils {

    public static boolean isPalindrome(int[] a) {
        for (int i = 0, j = a.length - 1; i <= j; i++, j--) {
            if (a[i] != a[j]) {
                return false;
            }
        }
        return true;
    }

    public static int findMissingNumber(int[] a, int finalNumber) {
        //int v = 0;
        int[] b = new int[finalNumber + 1];
        for (int i = 1; i <= finalNumber; i++) {
            b[i] = 0;
        }

        for (int i = 0; i < a.length; i++) {
            b[a[i]]++;
        }

        for (int i = 1; i < finalNumber; i++) {
            if (b[i] == 0) {
                return i;
            }
        }
        return 0;
    }

    public static int findMissingNumber1(int[] a, int finalNumber) {
        int arraySum = 0;

        for (int i = 0; i < a.length; i++) {
            arraySum += a[i];
        }

        int sum = finalNumber * (finalNumber + 1) / 2;
        return sum - arraySum;

    }

    /*public static void main(String[] args) {

    }*/

}