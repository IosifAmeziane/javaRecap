package algorithms;

public class PrimeNumber {

    public static boolean checkIfANumberIsPrime(int a) {
        for (int i = 2; i < a/2; i += 1) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }
}
