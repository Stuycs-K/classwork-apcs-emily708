public class MyArrays {
  public static String arrayToString(int[] nums) {
    String x = "[";
    for (int i = 0; i < nums.length; i++) {
      x += nums[i];
      if (i < nums.length - 1) {
        x += ", ";
      }
    }
    return x + "]";
  }

  public static int[] returnCopy(int[] ary) {
    int[] copy = new int[ary.length];
    for (int i = 0; i < ary.length; i++) {
      copy[i] = ary[i];
    }
    return copy;
  }
  public static void main(String args[]) {
    //test cases for returnCopy
    int[] ary1 = new int[]{1,5,8};
    int[] ary2 = returnCopy(ary1);
    System.out.println("Expected addresses to be different: true vs my function: " + (ary1 != ary2) + ". Expected elements to be the same: true vs my function: " + arrayToString(ary1).equals(arrayToString(ary2)));
    ary1 = new int[]{7,1,5,0};
    ary2 = returnCopy(ary1);
    System.out.println("Expected addresses to be different: true vs my function: " + (ary1 != ary2) + ". Expected elements to be the same: true vs my function: " + arrayToString(ary1).equals(arrayToString(ary2)));
    ary1 = new int[]{1,2,3,4,5};
    ary2 = returnCopy(ary1);
    System.out.println("Expected addresses to be different: true vs my function: " + (ary1 != ary2) + ". Expected elements to be the same: true vs my function: " + arrayToString(ary1).equals(arrayToString(ary2)));
    ary1 = new int[]{8,2,6};
    ary2 = returnCopy(ary1);
    System.out.println("Expected addresses to be different: true vs my function: " + (ary1 != ary2) + ". Expected elements to be the same: true vs my function: " + arrayToString(ary1).equals(arrayToString(ary2)));
  }
}
