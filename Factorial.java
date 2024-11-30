// Student Name: Mohammad Mustafa Hakimi
// Auaf ID: 48704
// Factorial
// For a non-negative integer, the factorial of n, denoted by n!, is the product of all
// positive integers less than or equal to n
// n! = n * (n-1) * (n-2) * (n-3 = n-2-1) ... * 1
// 1! = 1
// 2! = 2 * 1 = 2
// 3! = 3 * 2 * 1 = 1 * 2 * 3 = 6
// 3! = 3
// 3! = 2
// 3! = 1
// 3! = 3 * 2 * 1 = 6
// 70! = 1.2 * 10^100


// 4! = 1
// fa = factorial*i
// 4! = 1 * 1 = 1
// 4! = 1 * 2 = 2
// 4! = 2 * 3 = 6
// 4! = 6 * 4 = 24






public class Factorial {
  public static void main(String[] args) {
    int num = Integer.parseInt(args[0]);
    int factorial = 1;
    for (int i = 1; i <= num; i++) {
      factorial = factorial * i;
    }
    System.out.printf("The factorial of %d is %d", num, factorial);
  }
}
