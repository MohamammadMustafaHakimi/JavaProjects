// program for finding the absolute value of a number
public class AbsoluteValue {
  public static int abs(int num) {
    if (num < 0) return -num;
    else return num;
  }

  public static double abs(double num) {
    if (num < 0.0) return -num;
    else return num;
  }
  public static void main(String[] args) {
    double input = Double.parseDouble(args[0]);
    System.out.println(abs(input));
  }
}
