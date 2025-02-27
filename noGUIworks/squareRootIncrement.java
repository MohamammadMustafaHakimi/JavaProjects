//Simple Program for calculating the square root of a given number and adding one to it
import java.util.Scanner;

public class squareRootIncrement {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Howdy. Give me your number for the square root magic");
    double num = keyboard.nextDouble();

    num = Math.sqrt(num);
    num++;

    System.out.printf("The square root of your number plus one is: %.0f\n", num);
    //%.0f insures that the number will not have any decimal points
  }

}
