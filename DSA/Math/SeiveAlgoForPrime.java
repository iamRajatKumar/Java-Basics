package Math;
import java.util.Arrays;

public class SeiveAlgoForPrime {

     public static boolean[] sieve(int n) {
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        if (n >= 0) isPrime[0] = false;
        if (n >= 1) isPrime[1] = false;
        for (int p = 2; p <= n; p++) {
            if (isPrime[p]) {
               for (int i = p * p; i <= n; i += p) {
                    isPrime[i] = false;
                }
            }
        }
        return isPrime;
    }

    public static void main(String[] args) {
        int limit = 15;
        boolean[] primes = sieve(limit);

        System.out.println("Prime numbers up to " + limit + ":");
        for (int i = 2; i <= limit; i++) {
            if (primes[i]) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}

// time complexity O(log log n)