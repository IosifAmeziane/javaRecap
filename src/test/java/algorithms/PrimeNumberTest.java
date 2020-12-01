package algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimeNumberTest {

    @Test
    void givenAPrimeNumberShouldReturnTrue() {
        int a = 97;
        int b = 409;
        assertTrue(PrimeNumber.checkIfANumberIsPrime(a));
        assertTrue(PrimeNumber.checkIfANumberIsPrime(b));

    }
}