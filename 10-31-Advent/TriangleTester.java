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
}