import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day3{
  public static int countTrianglesA(String filename) {
    try {
      File file = new File(filename);
      Scanner input = new Scanner(file);
      int count = 0;
      while (input.hasNextInt()) {
        int sideA = input.nextInt();
        int sideB = input.nextInt();
        int sideC = input.nextInt();
        if (isTriangle(sideA, sideB, sideC)) {
         count++;
        }
      }
      input.close();
      return count;
    } catch (FileNotFoundException e) {
      System.out.println("File not found");
      return 0;
    }
  }

  public static boolean isTriangle(int sideA, int sideB, int sideC) {
    return (sideA + sideB) > sideC && (sideA + sideC) > sideB && (sideB + sideC) > sideA;
  }

  public static int countTrianglesB(String filename) {
    try {
      File file = new File(filename);
      Scanner input = new Scanner(file);
      int count = 0;
      while (input.hasNextInt()) {
        Integer[] line1 = new Integer[3];
        Integer[] line2 = new Integer[3];
        Integer[] line3 = new Integer[3];
      for (int i = 0; i < 3; i++) {
        line1[i] = input.nextInt();
        line2[i] = input.nextInt();
        line3[i] = input.nextInt();
      }
      if (isTriangle(line1[0], line1[1], line1[2])) {
        count++;
      }
      if (isTriangle(line2[0], line2[1], line2[2])) {
        count++;
      }
      if (isTriangle(line3[0], line3[1], line3[2])) {
        count++;
      }
      }
      input.close();
      return count;
    } catch (FileNotFoundException e) {
      System.out.println("File not found");
      return 0;
    }
  }

  public static void main(String[] args) {
    System.out.println("Part 1: " + countTrianglesA("Day3.txt"));
    System.out.println("Part 2: " + countTrianglesB("Day3.txt"));
  }
}
