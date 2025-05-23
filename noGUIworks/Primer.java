// program for checking whether a number is prime or no
public class Primer {
  public static boolean isPrime(int num) {
    if (num < 2) return false;

    for (int i = 2; i <= num / i; i++) {
      if (num % i == 0) return false;
    }
    return true;
  }
  public static void main(String[] args) {
    System.out.println(isPrime(10));
  }
}
