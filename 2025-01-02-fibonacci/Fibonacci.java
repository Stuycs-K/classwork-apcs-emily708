public class Fibonacci{
  public static int fib(int n){
    if (n < 2) {
      return n;
    }
    return fib(n - 2) + fib(n - 1);
  }

  public static void makeWords(int remainingLetters, String result, String alphabet){
    if (remainingLetters == 0) {
      System.out.println(result);
      return;
    }
    for (int i = 0; i < alphabet.length(); i++) {
      makeWords(remainingLetters - 1, result + alphabet.charAt(i), alphabet);
    }
  }

  public static void main(String[] args) {
    //System.out.println(fib(46));
    makeWords(3,"","abc");
  }
}
