package algorithms;

public class NumbersUtils {

    public static boolean isPalindrome(int a) {

        int arrayIndex = 0;
        int[] number = new int[returnTheCountOfDigitsInGivenNumber(a)];

        while (a > 0) {
            number[arrayIndex] = a % 10;
            arrayIndex++;
            a = a / 10;
        }
        return ArrayUtils.isPalindrome(number);
    }

    public static int returnTheCountOfDigitsInGivenNumber(int number) {

        int digitsNumber = 0;
        while (number > 0) {
            number = number / 10;
            digitsNumber++;
        }
        return digitsNumber;
    }

    public static void swapWithoutAuxVar(int a, int b) {
        //using aux var
        // a=2, b=3
        int aux = a;
        a = b;
        b = aux;
        System.out.println("a=" + a);
        System.out.println("b=" + b);
        //without aux var
        // a=2, b=3
        a = a + b; // a = 2+3=5
        b = a - b; // b = 5-3=2
        a = a - b; // a = 5-2=3
        System.out.println("a=" + a);
        System.out.println("b=" + b);
    }
}
