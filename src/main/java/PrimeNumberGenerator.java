import java.util.List;

public interface PrimeNumberGenerator {
    List<Integer> generatePrimeNumbers(int startingValue, int endingValue);
    boolean isPrime(int value);
}
