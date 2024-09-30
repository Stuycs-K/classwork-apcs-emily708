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

    //test cases for concatArray
    int[] ary3 = new int[]{1,2,3};
    int[] ary4 = new int[]{4,5,6};
    System.out.println("Expected: [1,2,3,4,5,6] vs my function: " + arrayToString(concatArray(ary3, ary4)));
    ary3 = new int[]{3,7,1,5};
    ary4 = new int[]{0,4,9};
    System.out.println("Expected: [3,7,1,5,0,4,9] vs my function: " + arrayToString(concatArray(ary3, ary4)));
    ary3 = new int[]{8,2,5};
    ary4 = new int[]{5,7,1,1};
    System.out.println("Expected: [8,2,5,5,7,1,1] vs my function: " + arrayToString(concatArray(ary3, ary4)));
    ary3 = new int[]{1,9,3,2,3};
    ary4 = new int[]{5,0};
    System.out.println("Expected: [1,9,3,2,3,5,0] vs my function: " + arrayToString(concatArray(ary3, ary4)));
  }
}
