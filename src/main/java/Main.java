import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PrimeNumberGenerator primeNumberGenerator = new PrimeNumberGeneratorImpl();
        Scanner scan = new Scanner(System.in);
        start(primeNumberGenerator, scan);
    }

    public static void start(PrimeNumberGenerator primeNumberGenerator, Scanner scan) {
        System.out.println(Constants.WELCOME);
        int firstNumber = getNextUserNumber(scan, String.format(Constants.PROMPT, Constants.FIRST));
        int secondNumber = getNextUserNumber(scan, String.format(Constants.PROMPT, Constants.SECOND));
        System.out.println(String.format(Constants.OUTPUT, firstNumber, secondNumber));
        List<Integer> primeNumbers = primeNumberGenerator.generatePrimeNumbers(firstNumber, secondNumber);
        if(primeNumbers.isEmpty()) {
            System.out.println(Constants.EMPTY_PRIME_NUMBER_LIST);
        } else {
            System.out.println(primeNumbers);
        }
        scan.close();
    }

    private static int getNextUserNumber(Scanner scan, String prompt) {
        boolean isUserInputInteger = false;
        int userNumber = 0;
        while(!isUserInputInteger) {
            System.out.println(prompt);
            try {
                userNumber = Integer.parseInt(scan.nextLine());
                isUserInputInteger = true;
            } catch(NumberFormatException e) {
                System.out.println(Constants.ERROR_INPUT_NOT_NUMBER);
            }
        }
        return userNumber;
    }
}
