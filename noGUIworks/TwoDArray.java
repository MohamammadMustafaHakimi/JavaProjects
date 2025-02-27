public class TwoDArray {

  public static void printer(double [][] array) {
    double N = array.length;
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < array[i].length; j++) {
        System.out.print(array[i][j] + " ");
      }
    }
  }

  public static void adder(int [][] array1, int [][] array2) {
    int N = array1.length;
    double [][] array3 = new double[N][N];
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < N; j++) {
        array3[i][j] = array1[i][j] + array2[i][j];
      }
    }
    printer(array3);
  }
  public static void main(String[] args) {
    int [][] array = {
      {1, 2, 3},
      {4, 5, 6},
      {7, 8, 9}
    };

    int [][] array2 = {
      {1, 2, 3},
      {4, 5, 6},
      {7, 8, 9}
    };

    adder(array, array2);
  }
}
