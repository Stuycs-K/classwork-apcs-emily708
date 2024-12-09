import java.util.Scanner;
public class Game {
  public static void main(String[] args) {
    Adventurer p1 = new CodeWarrior("Billy", 20);
    Adventurer p2 = new Ninja("Bob", 20);

    Scanner userInput = new Scanner(System.in);
    String input = userInput.nextLine();
    while (!input.equals("quit")) {
      System.out.println(p1 + ", " + p1.getHP() + "/" + p1.getmaxHP() + " HP, " + p1.getSpecial() + "/" + p1.getSpecialMax() + " " + p1.getSpecialName());
      System.out.println(p2 + ", " + p2.getHP() + "/" + p2.getmaxHP() + " HP, " + p2.getSpecial() + "/" + p2.getSpecialMax() + " " + p2.getSpecialName());
  }

  }
}
