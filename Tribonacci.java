// finding the nth. Tribonnaci number
public class Tribonacci {
  public static int tribo(int n) {
    if (n < 0) throw new IllegalArgumentException("Eingabe muss ein positive ganze Zahl sein");
    if (n == 0) return 0;
    if (n == 1) return 1;
    if (n == 2) return 1;

    return tribo(n-1) + tribo(n-2) + tribo(n-3);
  }

  public static int triboIterative(int n) {
      if (n < 0) { throw new IllegalArgumentException("Bitte eine positive ganze Zahl eingeben!");}
      int [] triboArr = new int [n+1];
      triboArr[0] = 0;
      triboArr[1] = 1;
      triboArr[2] = 1;

      if (n >= 0) {
      for (int i = 3; i <= n; i++) {
        triboArr[i] = triboArr[i-1] + triboArr[i-2] + triboArr[i-3];
      }
     }
     return triboArr[n];
  }

  public static void main(String[] args) {
    int N = 5;
    System.out.println(tribo(N));
    System.out.println(triboIterative(N));
  }
}
