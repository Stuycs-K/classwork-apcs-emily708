import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TriangleTester {
  public static int countTrianglesA(String filename) {
    try {
      File file = new File(filename);
      Scanner input = new Scanner(file);
      int count = 0;
      while (input.hasNextLine()) {
        String[] line = input.nextLine().split("\\s+");
        int sideA = Integer.parseInt(line[0]);
        int sideB = Integer.parseInt(line[1]);
        int sideC = Integer.parseInt(line[2]);
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
      while (input.hasNextLine()) {
        String[] line1 = input.nextLine().split("\\s+");
        String[] line2 = input.nextLine().split("\\s+");
        String[] line3 = input.nextLine().split("\\s+");
        for (int i = 0; i < 3; i++) {
          int sideA = Integer.parseInt(line1[i]);
          int sideB = Integer.parseInt(line2[i]);
          int sideC = Integer.parseInt(line3[i]);
          if (isTriangle(sideA, sideB, sideC)) {
            count++;
          }
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
    System.out.println("Number of valid triangles in inputTri.txt is: " + countTrianglesA("inputTri.txt"));
    System.out.println("Number of valid triangles in inputTri.txt is: " + countTrianglesB("inputTri.txt"));
  }
}