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
    //test cases for returnCopy
    int[] ary1 = new int[]{1,5,8};
    int[] ary2 = returnCopy(int[] ary1);
    System.out.println("Addresses are not the same:" ary1 == ary2 "and " );

  }
}
