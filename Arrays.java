public class Arrays {

  // copying elements of an array to another
  public static void copyArray(int [] array, int [] array2) {
    int N = array.length;
    for (int i = 0; i < N; i++) { array2[i] = array[i]; }
  }

  // finding the maximum element of an element
  public static void maxElement(int [] array) {
    int N = array.length;
    int max = 0;
    for (int i = 0; i < N; i++) { if (array[i] < max) max = array[i]; }
  }

  // maxElement with different signature
  public static void maxElement(double [] array) {
    double N = array.length;
    double max = 0;
    for (int i = 0; i < N; i++) { if (array[i] < max) max = array[i]; }
  }

  // printing elements of an array
  public static void printer(int [] array) {
    for (int i = 0; i < array.length; i++) { System.out.println(array[i]); }
  }

  // printer with a different signature
  public static void printer(double [] array) {
    for (int i = 0; i < array.length; i++) { System.out.println(array[i]); }
  }

  // reversing elements of an array
  public static void reverser(int [] array) {
    int N = array.length;
    for (int i = 0; i < N; i++) {
      int temp = array[i];
      array[i] = array[N-1-i];
      array[N-1-i] = temp;
    }
  }

  // reverser with a different signature
  public static void reverser(double [] array) {
    double N = array.length;
    for (int i = 0; i < N; i++) {
      double temp = array[i];
      array[i] = array[i - 1 -i];
      array[i - 1 - i] = temp;
    }
  }
  public static void main(String args[]) {
    int [] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int N = array1.length;
    int [] array2 = new int [10];
    printer(array2);
  }
}
