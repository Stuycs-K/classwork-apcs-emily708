// Emily Mai emilym384@nycstudents.net
// Joy Lu joyl28@nycstudents.net

public class ArrayMethods {

  //2. Copy your arrToString method from before.
  /**Return a String that represets the array in the format:
  * "[2, 3, 4, 9]"
  * Note the comma+space between values, and between values
  */
  public static String arrToString(int[]ary) {
    String x = "[";
    for (int i = 0; i < ary.length; i++) {
      x += ary[i];
      if (i < ary.length - 1) {
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
    String x = "[";
    for (int i = 0; i < ary.length; i++) {
      x += arrToString(ary[i]);
      if (i < ary.length - 1) {
        x += ", ";
      }
    }
    return x + "]";
  }

  /*Return the sum of all of the values in the 2D array */
  public static int arr2DSum(int[][]nums){
    int sum = 0;
    for (int i = 0; i < nums.length; i++) {
      for (int j = 0; j < nums[i].length; j++) {
        sum += nums[i][j];
      }
    }
    return sum;
  }

  /**Rotate an array by returning a new array with the rows and columns swapped.
    * You may assume the array is rectangular and neither rows nor cols is 0.
    * e.g. swapRC({{1,2,3},{4,5,6}}) returns {{1,4},{2,5},{3,6}}
    */
  public static int[][] swapRC(int[][]nums){
    int[][] swappedAry = new int[nums[0].length][nums.length];
    for (int i = 0; i < nums.length; i++) {
      for (int j = 0; j < nums[0].length; j++) {
        swappedAry[j][i] = nums[i][j];
      }
    }
    return swappedAry;
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
  public static int[][] copy(int[][] nums){
    return null;//placeholder so it compiles
  }

  public static void main (String args[]){
    //test cases for arrToString
    int[][] ary1 = new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    System.out.println("Expected: [[1, 2, 3], [4, 5, 6], [7, 8, 9]] vs my function: " + arrToString(ary1));
    ary1 = new int[][] {{6, 3, 8, 9}, {1, 5, 6}, {4, 7, 6, 0, 1}};
    System.out.println("Expected: [[6, 3, 8, 9], [1, 5, 6], [4, 7, 6, 0, 1]] vs my function: " + arrToString(ary1));
    ary1 = new int[][] {{12, 92, 3}, {0}, {2}};
    System.out.println("Expected: [[12, 92, 3], [0], [2]] vs my function: " + arrToString(ary1));
    ary1 = new int[][] {{8, 3}, {}, {1, 5, 6}};
    System.out.println("Expected: [[8, 3], [], [1, 5, 6]] vs my function: " + arrToString(ary1));

    //test cases for arr2DSum
    int[][] ary2 = new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    System.out.println("Expected: 45 vs my function: " + arr2DSum(ary2));
    ary2 = new int[][] {{5, 3}, {10, 4}, {9, 0, 1}};
    System.out.println("Expected: 32 vs my function: " + arr2DSum(ary2));
    ary2 = new int[][] {{23, 10, 7}, {1}, {7, 5}};
    System.out.println("Expected: 53 vs my function: " + arr2DSum(ary2));
    ary2 = new int[][] {{9, 1, 5}, {20, 80}, {}};
    System.out.println("Expected: 115 vs my function: " + arr2DSum(ary2));

    //test cases for swapRC
    int[][] ary3 = new int[][] {{1, 2, 3}, {4, 5, 6}};
    System.out.println("Expected: [[1, 4], [2, 5], [3, 6]] vs my function: " + arrToString(swapRC(ary3)));
    ary3 = new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    System.out.println("Expected: [[1, 4, 7], [2, 5, 8], [3, 6, 9]] vs my function: " + arrToString(swapRC(ary3)));
    ary3 = new int[][] {{5, 2}, {6, 0}, {1, 3}};
    System.out.println("Expected: [[5, 6, 1], [2, 0, 3]] vs my function: " + arrToString(swapRC(ary3)));
    ary3 = new int[][] {{42}, {7}, {91}};
    System.out.println("Expected: [[42, 7, 91]] vs my function: " + arrToString(swapRC(ary3)));

    //test cases for replaceNegative
    int[][] ary4 = new int[][] {{-1, 2, -3}, {4, -5, 6}, {7, -8, -9}};
    replaceNegative(ary4);
    System.out.println("Expected: [[1, 2, 0], [4, 1, 6], [7, 0, 1]] vs my function: " + arrToString(ary4));
    ary4 = new int[][] {{0, 5, -4}, {-2, -7}, {4, -3, -5, -4}};
    replaceNegative(ary4);
    System.out.println("Expected: [[0, 5, 0], [0, 1], [4, 0, 1, 0]] vs my function: " + arrToString(ary4));
    ary4 = new int[][] {{6, -5, 2}, {}, {-9}};
    replaceNegative(ary4);
    System.out.println("Expected: [[6, 0, 2], [], [0]] vs my function: " + arrToString(ary4));
    ary4 = new int[][] {{-6, -2}, {-5, -10, -15}, {4, 2}, {1, 0, -3, -8}};
    replaceNegative(ary4);
    System.out.println("Expected: [[1, 0], [0, 1, 0], [4, 2], [1, 0, 0, 1]] vs my function: " + arrToString(ary4));
    ary4 = new int[][] {{}, {-7, -3, 6}, {}, {-1, 3, -2, -5}};
    replaceNegative(ary4);
    System.out.println("Expected: [[], [0, 1, 6], [], [0, 3, 0, 1]] vs my function: " + arrToString(ary4));

    //test cases for copy
    int[][] ary5 = new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    int[][] ary5a = copy(ary5);
    System.out.println("Expected: [[1, 2, 3], [4, 5, 6], [7, 8, 9]] vs my function: " + arrToString(ary5a) + ". Expected addresses to be different: true vs my function: " + (ary5 != ary5a) + ". Expected elements to be the same: true vs my function: " + arrToString(ary5).equals(arrToString(ary5a)));
    ary5 = new int[][] {{5, 10}, {4, 7, 1}};
    ary5a = copy(ary5);
    System.out.println("Expected: [[5, 10], [4, 7, 1]] vs my function: " + arrToString(ary5a) + ". Expected addresses to be different: true vs my function: " + (ary5 != ary5a) + ". Expected elements to be the same: true vs my function: " + arrToString(ary5).equals(arrToString(ary5a)));
    ary5 = new int[][] {{2, 5}, {}, {1}, {6, 1, 7}, {}};
    ary5a = copy(ary5);
    System.out.println("Expected: [[2, 5], [], [1], [6, 1, 7], []] vs my function: " + arrToString(ary5a) + ". Expected addresses to be different: true vs my function: " + (ary5 != ary5a) + ". Expected elements to be the same: true vs my function: " + arrToString(ary5).equals(arrToString(ary5a)));
    ary5 = new int[][] {{6, 4, 0}};
    ary5a = copy(ary5);
    System.out.println("Expected: [[6, 4, 0]] vs my function: " + arrToString(ary5a) + ". Expected addresses to be different: true vs my function: " + (ary5 != ary5a) + ". Expected elements to be the same: true vs my function: " + arrToString(ary5).equals(arrToString(ary5a)));
    ary5 = new int[][] {{1, 8, 10}, {15}, {5, 20}, {}};
    ary5a = copy(ary5);
    System.out.println("Expected: [[1, 8, 10], [15], [5, 20], []] vs my function: " + arrToString(ary5a) + ". Expected addresses to be different: true vs my function: " + (ary5 != ary5a) + ". Expected elements to be the same: true vs my function: " + arrToString(ary5).equals(arrToString(ary5a)));
  }
}
