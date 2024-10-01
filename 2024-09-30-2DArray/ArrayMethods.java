public class ArrayMethods {

  // Emily Mai emilym384@nycstudents.net
  // Joy Lu joyl28@nycstudents.net

  //2. Copy your arrToString method from before.
  /**Return a String that represets the array in the format:
  * "[2, 3, 4, 9]"
  * Note the comma+space between values, and between values
  */
  public static String arrToString(int[] nums) {
    String x = "[";
    for (int i = 0; i < nums.length; i++) {
      x += nums[i];
      if (i < nums.length - 1) {
        x += ", ";
      }
    }
    return x + "]";
  }

  //3. Write arrToString, with a 2D array parameter.
  //Note: Different parameters are allowed with the same function name.
  /**Return a String that represets the 2D array in the format:
    * "[[2, 3, 4], [5, 6, 7], [2, 4, 9]]"
    * Note the comma+space between values, and between arrays
    * You are encouraged to notice that you may want to re-use
    * previous code, but you should NOT duplicate that code. (Don't copy/paste or retype it)
    */
  public static String arrToString(int[][]ary){
    //this should use arrToString(int[])
    return "";
  }

  /*Return the sum of all of the values in the 2D array */
  public static int arr2DSum(int[][]nums){
    //use a nested loop to solve this
  }

  /**Rotate an array by returning a new array with the rows and columns swapped.
    * You may assume the array is rectangular and neither rows nor cols is 0.
    * e.g. swapRC({{1,2,3},{4,5,6}}) returns {{1,4},{2,5},{3,6}}
    */
  public static int[][] swapRC(int[][]nums){
    return new int[1][1];
  }
  public static void main (String args[]){
    //test cases for arrToString
    int[][] ary1 = new int[]{{1,2,3},{4,5,6},{7,8,9}};
    System.out.println("Expected: [[1, 2, 3], [4, 5, 6], [7, 8, 9]] vs my function: " + arrToString(ary1));
    int[][] ary1 = new int[]{{6,3,8,9},{1,5,6},{4,7,6,0,1}};
    System.out.println("Expected: [[6, 3, 8, 9], [1, 5, 6], [4, 7, 6, 0, 1]] vs my function: " + arrToString(ary1));
    int[][] ary1 = new int[]{{12,92,3},{0},{2}};
    System.out.println("Expected: [[12, 92, 3], [0], [2]] vs my function: " + arrToString(ary1));
    int[][] ary1 = new int[]{{8,3},{},{1,5,6}};
    System.out.println("Expected: [[8, 3], [], [1, 5, 6]] vs my function: " + arrToString(ary1));
  }
}
