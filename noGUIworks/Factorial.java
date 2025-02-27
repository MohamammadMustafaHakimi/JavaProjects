// Program For Calculating Factorial of a given number

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
