import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;

public class Day2 {
  public static String[] parse(String file) {
    try {
      Scanner input = new Scanner(new File(file));
      while (input.hasNextLine()) {
        String line = input.nextLine();

      }

      input.close();
      return ;
    } catch (FileNotFoundException e) {
      System.out.println("File not found");
      return null;
    }
  }
