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
    }
    for (int i = 0; i < alphabet.length(); i++) {
      String letter = alphabet.substring(i, i + 1);
      remainingLetters -= 1;
      result += letter;
    }
  }

  public static void main(String[] args) {
    //System.out.println(fib(46));
    makeWords(2,"","abc");
  }
}
