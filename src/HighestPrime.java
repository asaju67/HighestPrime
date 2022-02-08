import java.util.ArrayList;

public class HighestPrime {
    public static void main(String[] args) {


        System.out.println(findHighestPrime(10));
    }

    public static int findHighestPrime(int limit) {
        ArrayList<Integer> primes = new ArrayList<Integer>();
        if (limit > 1) {
            primes.add(2);

            for (int x = 3; x <= limit; x++) {
                for (int y = 0; y < primes.size(); y++) {
                    int remainder = x % primes.get(y);
                    if (remainder != 0) {
                        primes.add(x);

                    }
                }

            }
        } else {
            primes.add(1);
        }
        return primes.get(primes.size() - 1);


    }

}
