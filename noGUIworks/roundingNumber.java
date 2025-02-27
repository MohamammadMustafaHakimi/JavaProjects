//Simple Programs for rounding a number and decrementing it by one unit
import java.util.Scanner;

public class roundingNumber {
  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);

    System.out.println("enter your number to be rounded");
    float num = keyboard.nextFloat();

    num = Math.round(num);
    num--;
    System.out.printf("Your number rounded and decremented by 1 is: %.0f\n", num);
  }
}
