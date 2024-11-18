import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day1 {
  public static int countBlocks(String filename) {
    try {
      File file = new File(filename);
      Scanner input = new Scanner(file);
      int blocks = 0;
      int degrees = 90;
      while (input.hasNext()) {
          String nextMove = input.next();
          if (nextMove.substring(0,1).equals("L")) {
            degrees += 90;
          }
          if (nextMove.substring(0,1).equals("R")) {
            degrees -= 90;
          }
        }
      }
      input.close();
      return;
    } catch (FileNotFoundException e) {
      System.out.println("File not found");
      return 0;
    }
    public static void main(String[] args) {
      System.out.println();
    }
  }
