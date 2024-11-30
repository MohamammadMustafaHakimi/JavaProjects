public class TrianglePattern {
  public static void main(String[] args) {
    System.out.println("|=================Pattern 1================|");
    int counter = 5;
    for (int i = 1; i <= counter; i++) {
      int num = 1;
      for (int j = 1; j<=i; j++) {
        System.out.print(num++ + " ");
      }
      System.out.println();
    }
    System.out.println("|=================Pattern 2================|");
    for (int i = 1; i <= counter; i++) {
      int num = 1;
      for (int j = i; j<=counter; j++) {
        System.out.print(num++ + " ");
      }
      System.out.println();
    }
    System.out.println("|=================Pattern 3================|");
    for (int i = 1; i <= counter; i++) {
      int num = 1;
      for (int j = 1; j<=i; j++) {
        System.out.print("  ");
      }
      for (int j = i; j<=counter; j++) {
        System.out.print(num++ + " ");
      }
      System.out.println();
    }
  }
}


/*
 * *
 * **
 * ***
 * *****
 *
 * ******
 * ****
 * ***
 * **
 * *
 *
 *
 *
 */
