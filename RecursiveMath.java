package Lab_01;

public class RecursiveMath {
   public int Factorial(int n) {
      if (n == 0) {
         return 1;
      } else {
         return n * Factorial(n - 1);
      }
   }

   public int Exponent(int b, int p) {
      if (p == 0) {
         return 1;
      } else {
         return b * Exponent(b, p - 1);
      }
   }

   public int Sum(int s, int e) {
      if (s == e) {
         return e;
      } else {
         return s += Sum(s + 1, e);
      }
   }

   public int gcd(int a, int b) {
      if (b == 0) {
         return a;
      } else {
         return gcd(b, a % b);
      }
   }
}
