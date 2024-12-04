public class ColorDemo {

  public static void rainbowCloud() {
    int[] colors = new int[] {30, 31, 32, 33, 34, 35, 36, 37, 38};
    for (int i = 0; i < 5; i++) {
      System.out.println("\u001b[37m|||||||||||||||||||||||||||||||||");
    }
    for (int i = 0; i < 50; i++) {
      for (int j = 0; j < colors.length - 1; j++) {
        System.out.print("\u001b[" + colors[j % colors.length] + "m |||");
      }
      System.out.println();
    }
    System.out.print("\u001b[0m");
  }
  
  public static void main(String[] args){
    /*
    System.out.print("\u001b[91m");
    System.out.println("Hello World");
    System.out.print("\u001b[0m");
    for(int r = 0; r < 256; r+=32){
      for(int g = 0; g <= 256; g+=32){
        for(int b = 0; b <= 256; b+=32){
          System.out.print("\u001b[38;2;"+r+";"+g+";"+b+";7m.");
        }
      }
      System.out.println();
    }
    */

    rainbowCloud();
  }
}
