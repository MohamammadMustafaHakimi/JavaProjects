//Question 4 of the Assignment
import java.util.Scanner;

public class powerCalcAndCompAssi {
  public static void main(String[] args) {

    System.out.println("Enter your power for base 2>");
    Scanner keyboard = new Scanner(System.in);
    double power = keyboard.nextDouble();

    double num = Math.pow(2, power);
    num*=2;
    System.out.printf("2 to the power of the base you gave times two is: %.0f\n", num);
  }
}
