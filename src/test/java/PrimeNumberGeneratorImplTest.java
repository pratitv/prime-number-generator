import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertFalse;

public class PrimeNumberGeneratorImplTest {
    private PrimeNumberGenerator primeNumberGenerator;

    @Before
    public void setup() {
        primeNumberGenerator = new PrimeNumberGeneratorImpl();
    }

    @Test
    public void testIsPrime_ZeroCase() {
        boolean isPrime = primeNumberGenerator.isPrime(0);
        assertFalse(isPrime);
    }

    @Test
    public void testIsPrime_OneCase() {
        boolean isPrime = primeNumberGenerator.isPrime(1);
        assertFalse(isPrime);
    }

    @Test
    public void testIsPrime_TrueCase() {
        boolean isPrime = primeNumberGenerator.isPrime(3);
        assert(isPrime);
    }

    @Test
    public void testIsPrime_FalseCase() {
        boolean isPrime = primeNumberGenerator.isPrime(4);
        assertFalse(isPrime);
    }

    @Test
    public void testIsPrime_NegativeCase() {
        boolean isPrime = primeNumberGenerator.isPrime(-7);
        assertFalse(isPrime);
    }

    @Test
    public void testGeneratePrimeNumbers_AscendingCase() {
        List<Integer> result = primeNumberGenerator.generatePrimeNumbers(0, 10);
        assert(result.size() == 4);
        assert(result.equals(Arrays.asList(2, 3, 5, 7)));
    }

    @Test
    public void testGeneratePrimeNumbers_DescendingCase() {
        List<Integer> result = primeNumberGenerator.generatePrimeNumbers(10, 0);
        assert(result.size() == 4);
        assert(result.equals(Arrays.asList(2, 3, 5, 7)));
    }

    @Test
    public void testGeneratePrimeNumbers_SameNumberCase() {
        List<Integer> result = primeNumberGenerator.generatePrimeNumbers(7, 7);
        assert(result.size() == 1);
        assert(result.equals(Arrays.asList(7)));
    }

    @Test
    public void testGeneratePrimeNumbers_BigNumberCase() {
        List<Integer> result = primeNumberGenerator.generatePrimeNumbers(7900, 7920);
        assert(result.size() == 3);
        assert(result.equals(Arrays.asList(7901, 7907, 7919)));
    }

    @Test
    public void testGeneratePrimeNumbers_NegativeNumberCase() {
        List<Integer> result = primeNumberGenerator.generatePrimeNumbers(-10, -21);
        assert(result.size() == 0);
        assert(result.equals(Arrays.asList()));
    }
}
