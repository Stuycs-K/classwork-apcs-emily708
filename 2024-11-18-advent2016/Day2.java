import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class Day2 {
  public static String[][] parse(String file) {
    try {
      Scanner input = new Scanner(new File(file));
      ArrayList<String> text = new ArrayList<String>();
      while (input.hasNextLine()) {
        text.add(input.nextLine());
      }
      String[][] data = new String[text.size()][];
      for (int i = 0; i < text.size(); i++) {
        data[i] = text.get(i).split("");
      }
      input.close();
      //System.out.print(Arrays.deepToString(data));
      return data;
    } catch (FileNotFoundException e) {
      System.out.println("File not found");
      return null;
    }
  }

  public static int solve(String[][] data) {
    int[][] keypad = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    String code = "";
    int previousRow = 1;
    int previousColumn = 1;
    for (int i = 0; i < data.length; i++) {
      int row = previousRow;
      int column = previousColumn;
      for(int j = 0; j < data[i].length; j++) {
        String move = data[i][j];
        if (move.equals("L") && column > 0) {
          column -= 1;
        }
        if (move.equals("R") && column < 2) {
          column += 1;
        }
        if (move.equals("D") && row < 2) {
          row += 1;
        }
        if (move.equals("U") && row > 0) {
          row -= 1;
        }
      }
      int current = keypad[row][column];
        code += current;
        previousRow = row;
        previousColumn = column;
    }
    return Integer.parseInt(code);
  }

  public static String solve2(String[][] data) {
    String[][] keypad = {{"0", "0", "1", "0", "0"}, {"0", "2", "3", "4", "0"}, {"5", "6", "7", "8", "9"}, {"0", "A", "B", "C", "0"}, {"0", "0", "D", "0", "0"}};
    String code = "";
    int previousRow = 2;
    int previousColumn = 0;
    for (int i = 0; i < data.length; i++) {
      int row = previousRow;
      int column = previousColumn;
      for(int j = 0; j < data[i].length; j++) {
        String move = data[i][j];
        if (move.equals("L") && column > 0 && keypad[row][column - 1] != "0") {
          column -= 1;
        }
        if (move.equals("R") && column < 4 && keypad[row][column + 1] != "0") {
          column += 1;
        }
        if (move.equals("D") && row < 4 && keypad[row + 1][column] != "0") {
          row += 1;
        }
        if (move.equals("U") && row > 0 && keypad[row - 1][column] != "0") {
          row -= 1;
        }
      }
      String current = keypad[row][column];
      code += current;
      previousRow = row;
      previousColumn = column;
    }
    return code;
  }

  public static void main(String[] args) {
    String[][] data = parse("Day2.txt");
    System.out.println(solve(data));
    System.out.println(solve2(data));
  }
}