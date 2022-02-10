import java.util.ArrayList;

public class HighestPrime {
    public static void main(String[] args) {


        System.out.println(findHighestPrime(10000000));
    }

    public static int findHighestPrime(int limit) {
        ArrayList<Integer> primes = new ArrayList<Integer>();
        if (limit > 1) {
            primes.add(2);
            for (int x = 3; x < limit + 1; x++) {
                int y = 0;
                do {
                    if ((x % primes.get(y) != 0) && (y == primes.size() - 1)) {
                        primes.add(x);
                    }
                    y++;
                }while(x % primes.get(y) != 0);


            }
        } else if (limit == 1) {
            primes.add(1);
        } else if (limit <= 0) {
            primes.add(0);
        }
        return primes.get(primes.size() - 1);


    }

}
