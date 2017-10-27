package Lab_01;

public class RescursiveMathTester {

   public static void main(String[] args) {
      RecursiveMath x = new RecursiveMath();
      System.out.println(x.Factorial(4));
      System.out.println(x.Exponent(3, 3));
      System.out.println(x.Sum(6, 10));
      System.out.println(x.gcd(15, 14));
   }

}
