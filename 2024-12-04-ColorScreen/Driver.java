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

  public static void main(String[] args) {
    border();
    Text.go(31, 0);
  }
}