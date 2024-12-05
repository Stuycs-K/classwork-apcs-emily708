public class Driver {
  public static void border() {
    for (int row = 1; row < 31; row++) {
      for (int column = 1; column < 81; column++) {
        if ((row == 1 || row == 30) || (column == 1 || column == 80)) {
          Text.go(row, column);
          int color1 = (int) (Math.random() * 8) + 30;
          int color2 = (int) (Math.random() * 8) + 30;
          Text.color(color1, Text.background(color2));
          System.out.print("x");
        }
      }
    }
  }

  public static void integer() {
    int[] integers = new int[3];
    for (int i = 0; i < integers.length; i++) {
      integers[i] = (int) (Math.random() * 100);
    }
    for (int i = 0; i < integers.length; i++) {
      Text.go(2, (i * 20) + 20);
      Text.color(Text.WHITE);
      if (integers[i] < 25) {
        Text.color(Text.RED + 60);
      }
      else if (integers[i] > 75) {
        Text.color(Text.GREEN + 60);
      }
      System.out.print(integers[i]);
    }
  }

  public static void separator() {
    for (int i = 2; i < 80; i++) {
      Text.go(3, i);
      int color = (int) (Math.random() * 8) + 30;
      Text.color(color);
      System.out.print("-");
    }
  }
  public static void main(String[] args) {
    border();
    integer();
    separator();
    Text.go(31, 0);
    System.out.print(Text.RESET);
  }
}