package v1ch4;

/**
 * Created by Eric on 12/7/2015.
 */
public class PrimeNumber_P109 {
    public static void main(String[] args) {
        final int NUMBER_OF_PRIMES = 50;
        final int NUMBER_OF_PRIMES_PER_LINE = 10;
        System.out.println("The first 50 Prime numbers are \n");

        for (int count = 0, number = 2; count < NUMBER_OF_PRIMES; number++) {
            boolean isPrime = true;

            for (int divisor = 2; divisor <= number / 2 && isPrime; divisor++) {
                if (number % divisor == 0) isPrime = false;
            }

            if (isPrime) {
                count++;
                if (count % NUMBER_OF_PRIMES_PER_LINE == 0) System.out.println(number);
                else System.out.print(number + " ");
            }
        }
    }
}
