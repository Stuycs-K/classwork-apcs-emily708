import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;

public class Day1 {
  public static String[] parse(String file) {
    try {
      Scanner input = new Scanner(new File(file));
      String line = input.nextLine();
      String[] data = line.split(", ");
      //System.out.println(Arrays.toString(data));
      input.close();
      return data;
    } catch (FileNotFoundException e) {
      System.out.println("File not found");
      return null;
    }
  }

  public static int solve(String[] data) {
    int horizontalBlocks = 0;
    int verticalBlocks = 0;
    int degrees = 0;
    for (int i = 0; i < data.length; i++) {
      int blocks = Integer.parseInt(data[i].substring(1));
      if (data[i].charAt(0) == 'L') {
        degrees -= 1;
      }
      if (data[i].charAt(0) == 'R') {
        degrees += 1;
      }
      if (degrees % 4 == 0) {
        verticalBlocks += blocks;
      }
      if (degrees % 4 == 1) {
        horizontalBlocks += blocks;
      }
      if (degrees % 4 == 2) {
        verticalBlocks -= blocks;
      }
      if (degrees % 4 == 3) {
        horizontalBlocks -= blocks;
      }
    }
    return Math.abs(horizontalBlocks) + Math.abs(verticalBlocks);
  }
   
  public static void main(String[] args) {
    String[] data = parse("Day1.txt");
    System.out.println(solve(data));
  }
}
