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


// |=================Pattern 1================|
// 1
// 1 2
// 1 2 3
// 1 2 3 4
// 1 2 3 4 5
// |=================Pattern 2================|
// 1 2 3 4 5
// 1 2 3 4
// 1 2 3
// 1 2
// 1
// |=================Pattern 3================|
//   1 2 3 4 5
//     1 2 3 4
//       1 2 3
//         1 2
//           1
