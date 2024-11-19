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
      
    }
  }
  public static int countBlocks(String filename) {
    try {
      File file = new File(filename);
      Scanner input = new Scanner(file);
      int horizontalBlocks = 0;
      int verticalBlocks = 0;
      int degrees = 0;
      while (input.hasNext()) {
        String nextMove = input.next();
        String direction = nextMove.substring(0,1);
        int blocks = Integer.parseInt(nextMove.substring(1));
        if (direction.equals("L")) {
          degrees += 90;
        }
        if (direction.equals("R")) {
          degrees -= 90;
        }
        if (Math.abs(degrees) > 360) {
          degrees /= 360;
        }
        if ((degrees / 90) == 1) {
          verticalBlocks += blocks;
        }
        if ((degrees / 90) == 3) {
          verticalBlocks -= blocks;
        }
        if ((degrees / 90) == 2) {
          horizontalBlocks -= blocks;
        }
        if ((degrees / 90) == 0) {
          horizontalBlocks += blocks;
        }
        System.out.println(Math.abs(horizontalBlocks) + Math.abs(verticalBlocks));
      }
      input.close();
      return Math.abs(horizontalBlocks) + Math.abs(verticalBlocks);
    } catch (FileNotFoundException e) {
      System.out.println("File not found");
      return 0;
    }
  }

    public static void main(String[] args) {
      System.out.println(parse("Day1.txt"));
  }
}
