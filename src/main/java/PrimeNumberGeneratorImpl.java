import java.util.ArrayList;
import java.util.List;

public class PrimeNumberGeneratorImpl implements PrimeNumberGenerator {
    @Override
    public List<Integer> generatePrimeNumbers(int startingValue, int endingValue) {
        if(startingValue > endingValue) {
            startingValue += endingValue;
            endingValue = startingValue - endingValue;
            startingValue = startingValue - endingValue;
        }

        List<Integer> primeNumbers = new ArrayList<>();
        for(int x = startingValue; x <= endingValue; x++) {
            if(isPrime(x)) {
                primeNumbers.add(x);
            }
        }
        return primeNumbers;
    }

    @Override
    public boolean isPrime(int number) {
        if(number > 1) {
            for(int x = 2; x <= Math.sqrt(number); x++) {
                if(number % x == 0) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }
}
