public class MyArrays {
  public static String arrayToString(int[] nums) {
    String x = "[";
    for (int i = 0; i < nums.length; i++) {
      x += nums[i];
      if (i < nums.length - 1) {
        ans += " ,";
      }
    }
    return x + "]";
  }

  public static void main(String args[]) {

  }
}
