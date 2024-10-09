import java.util.Arrays;
public class ArrayDemo{
  public static void main(String[]args){
    //write your tests here!
    //You can now use Arrays.toString(yourArray) instead of writing arrayToString again.
    //Compare Arrays.toString(yourArray) to YOUR arrayToString() method to make sure yours is correct
    //do not use any other Arrays.method()

    //test cases for arrToString(int[]ary)
    int[] ary1 = new int[]{1, 2, 3};
    System.out.println("Expected: " + Arrays.toString(ary1) + " vs my function: " + arrToString(ary1));
    ary1 = new int[]{0, 8, 15, 2};
    System.out.println("Expected: " + Arrays.toString(ary1) + " vs my function: " + arrToString(ary1));
    ary1 = new int[]{};
    System.out.println("Expected: " + Arrays.toString(ary1) + " vs my function: " + arrToString(ary1));
    
    //test cases for arrToString
    int[][] ary2 = new int[][]{{1, 2}, {3, 4}, {5, 6}};
    System.out.println("Expected: " + Arrays.deepToString(ary2) + " vs my function: " + arrToString(ary2));
    ary2 = new int[][]{{9, 0 , 3}, {}, {7, 5}};
    System.out.println("Expected: " + Arrays.deepToString(ary2) + " vs my function: " + arrToString(ary2));
    ary2 = new int[][]{{5, 17, 2}};
    System.out.println("Expected: " + Arrays.deepToString(ary2) + " vs my function: " + arrToString(ary2));

    //test cases for countZeros2D
    int[][] ary3 = new int[][]{{1, 2, 0}, {10, 5}, {}};
    System.out.println("Expected: 1 vs my function: " + countZeros2D(ary3));
    ary3 = new int[][]{{5, 1}, {3, 4, 9}, {1, 7}};
    System.out.println("Expected: 0 vs my function: " + countZeros2D(ary3));
    ary3 = new int[][]{{9, 0, 5}, {3, 0, 0, 20}, {}};
    System.out.println("Expected: 3 vs my function: " + countZeros2D(ary3));
    ary3 = new int[][]{{0, 4}, {0}, {8, 6, 5}};
    System.out.println("Expected: 2 vs my function: " + countZeros2D(ary3));
    ary3 = new int[][]{{23, 1, 0, 0}, {10, 0, 5, 4}, {1, 5, 3, 9}, {0, 1}};
    System.out.println("Expected: 4 vs my function: " + countZeros2D(ary3));

    //test cases for arr2DSum
    int[][] ary4 = new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    System.out.println("Expected: 45 vs my function: " + arr2DSum(ary4));
    ary4 = new int[][] {{4, 3}, {8, 4}, {9, 0, 2}};
    System.out.println("Expected: 30 vs my function: " + arr2DSum(ary4));

    //test cases for replaceNegative
    int[][] ary5 = new int[][] {{-1, 2, -3}, {4, -5, 6}, {7, -8, -9}};
    replaceNegative(ary5);
    System.out.println("Expected: [[1, 2, 0], [4, 1, 6], [7, 0, 1]] vs my function: " + Arrays.deepToString(ary5));
    ary5 = new int[][] {{0, 6, -3}, {-5, -7}, {-3, 4, -5, -4}};
    replaceNegative(ary5);
    System.out.println("Expected: [[0, 6, 0], [0, 1], [0, 4, 1, 0]] vs my function: " + Arrays.deepToString(ary5));

    //test cases for copy
    int[][] ary6 = new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    int[][] ary6a = copy(ary6);
    System.out.println("Expected: [[1, 2, 3], [4, 5, 6], [7, 8, 9]] vs my function: " + Arrays.deepToString(ary6a) + ". Expected addresses to be different: true vs my function: " + (ary6 != ary6a) + ". Expected elements to be the same: true vs my function: " + Arrays.deepToString(ary6).equals(Arrays.deepToString(ary6a)));
    ary6 = new int[][] {{8, 10}, {2, 7, 1, 0}};
    ary6a = copy(ary6);
    System.out.println("Expected: [[8, 10], [2, 7, 1, 0]] vs my function: " + Arrays.deepToString(ary6a) + ". Expected addresses to be different: true vs my function: " + (ary6 != ary6a) + ". Expected elements to be the same: true vs my function: " + Arrays.deepToString(ary6).equals(Arrays.deepToString(ary6a)));
    
    //test cases for swapRC
    int[][] ary7 = new int[][] {{1, 2, 3}, {4, 5, 6}};
    System.out.println("Expected: [[1, 4], [2, 5], [3, 6]] vs my function: " + Arrays.deepToString(swapRC(ary7)));
    ary7 = new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    System.out.println("Expected: [[1, 4, 7], [2, 5, 8], [3, 6, 9]] vs my function: " + Arrays.deepToString(swapRC(ary7)));
  }

  //0. Include your prior methods to help you print a 1D/2D array of ints.
  public static String arrToString(int[]ary){
    String x = "[";
    for (int i = 0; i < ary.length; i++) {
      x += ary[i];
      if (i < ary.length - 1) {
        x += ", ";
      }
    }
    return x + "]";
  }

  //The name of different methods can be the same,
  //as long as the parameters are different! (type and/or quantity must be different)
  //Pro tip: you should be using your 1D arrToString in this method!
  public static String arrToString(int[][]ary){
    String x = "[";
    for (int i = 0; i < ary.length; i++) {
      x += arrToString(ary[i]);
      if (i < ary.length - 1) {
        x += ", ";
      }
    }
    return x + "]";
  }

  //1. Calculate and return how many elements equal zero in the 2D array.
  public static int countZeros2D(int[][] nums){
    int count = 0;
    for (int i = 0; i < nums.length; i++) {
      for (int j = 0; j < nums[i].length; j++) {
        if (nums[i][j] == 0) {
          count++;
        }
      }
    }
    return count;
  }

  //2. Calculate the sum of a 2d array
  /*Return the sum of all of the values in the 2D array
   *Use a nested loop instead of a helper method*/
  public static int arr2DSum(int[][]nums){
    int sum = 0;
    for (int i = 0; i < nums.length; i++) {
      for (int j = 0; j < nums[i].length; j++) {
        sum += nums[i][j];
      }
    }
    return sum;
  }

  //3. Modify a given 2D array of integer as follows:
  //Replace all the negative values:
  //-When the row number is the same as the column number replace
  //that negative with the value 1
  //-All other negatives replace with 0
  public static void replaceNegative(int[][] vals){
    for (int i = 0; i < vals.length; i++) {
      for (int j = 0; j < vals[i].length; j++) {
        if (vals[i][j] < 0) {
          if (i == j) {
            vals[i][j] = 1;
          }
          else {
            vals[i][j] = 0;
          }
        }
      }
    }
  }

  //4. Make a copy of the given 2d array.
  //When testing : make sure that changing the original does NOT change the copy.
  //DO NOT use any built in methods that "copy" an array.
  //You SHOULD write a helper method for this.
  //If you don't see a good way to do that, you should stop and look at prior methods.
  public static int[] returnCopy(int[] ary) {
    int[] copy = new int[ary.length];
    for (int i = 0; i < ary.length; i++) {
      copy[i] = ary[i];
    }
    return copy;
  }

  public static int[][] copy(int[][] nums){
    int[][] copy = new int[nums.length][];
    for (int i = 0; i < nums.length; i++){
      copy[i] = returnCopy(nums[i]);
    }
    return copy;
  }

  //5. Rotate an array by returning a new array with the rows and columns swapped.
  //   You may assume the array is rectangular and neither rows nor cols is 0.
  //   e.g. swapRC({{1,2,3},{4,5,6}}) returns {{1,4},{2,5},{3,6}}
  public static int[][] swapRC(int[][]nums){
    int[][] swappedAry = new int[nums[0].length][nums.length];
    for (int i = 0; i < nums.length; i++) {
      for (int j = 0; j < nums[0].length; j++) {
        swappedAry[j][i] = nums[i][j];
      }
    }
    return swappedAry;
  }

  //6. Make an HTML table by putting a table tag around the entire 2d array,
  //   tr tags around each row, and td tags around each value.
  //   You may use a helper method
  //   Note there is no whitespace in the string, it all one line with no spaces/tabs.
  //   e.g. htmlTable(new int[][]{{1,2},{3}})  returns:
  // "<table><tr><td>1</td><td>2</td></tr><tr><td>3</td></tr></table>"
  public static String htmlTable(int[][]nums){
    return "";
  }
}
