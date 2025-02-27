// Simple Program For Calculating Radius and finding an area 10 percent larger than the radius
import java.util.Scanner;

public class circleArea {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    double radius, area;

    System.out.println("enter the radius for your circle");
    radius = keyboard.nextDouble();

    area = (Math.PI)*(Math.pow(radius, 2));
    area *= 110.0/100;

    System.out.printf("The area 10 percent bigger than the area for your given radius is %.0f\n", area);
  }
}
