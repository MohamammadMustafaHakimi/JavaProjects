public class SieveOfEratosthenes {

  public static void algo(int n) {

    boolean [] isPrime = new boolean [n + 1];

    // initially setting all of the values of the array as false
    for (int i = 0; i < isPrime.length; i++) { isPrime[i] = true; }

    // 0 and 1 are not prime numbers
    isPrime[0] = false;
    isPrime[1] = false;

    // marking multiples of each prime number, starting from 2
    for (int i = 2; i * i <= n; i++) {
      if(isPrime[i]) {
        for (int j = i*i; j <= n; j += i) { // j+=i insures all of the multiples of the current number are checked
          isPrime[j] = false;
        }
      }
    }
    // printing all of the values
    for (int i = 2; i <= n; i++) {
      if (isPrime[i]) System.out.print(i + " ");
    }
  }
  public static void main(String[] args) {
    int limit = Integer.parseInt(args[0]);
    System.out.print("Following are the prime numbers ");
    System.out.println("smaller than or equal to " + limit);
    algo(limit);
  }

}
