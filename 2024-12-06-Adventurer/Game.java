import java.util.Scanner;
public class Game {
  public static void main(String[] args) {
    Adventurer p1 = new CodeWarrior("Billy", 20);
    Adventurer p2 = new Ninja("Bob", 20);

    Scanner userInput = new Scanner(System.in);
    boolean continueGame = true;

    while (continueGame) {
      System.out.println(p1 + ", " + p1.getHP() + "/" + p1.getmaxHP() + " HP, " + p1.getSpecial() + "/" + p1.getSpecialMax() + " " + p1.getSpecialName());
      System.out.println(p2 + ", " + p2.getHP() + "/" + p2.getmaxHP() + " HP, " + p2.getSpecial() + "/" + p2.getSpecialMax() + " " + p2.getSpecialName());
      System.out.println("Type: (a)ttack / (sp)ecial / (su)pport / quit");
      String input = userInput.nextLine();
      if (input.equals("a") || input.equals("attack")) {
        System.out.println(p1.attack(p2));
      }
      else if (input.equals("sp") || input.equals("special")) {
        System.out.println(p1.specialAttack(p2));
      }
      else if (input.equals("su") || input.equals("support")) {
        System.out.println(p1.support());
      }
      else if (input.equals("quit")) {
        continueGame = false;
        System.out.println("Ending game.");
        break;
      }
      else {
        System.out.println("Input was invalid. Please try again.");
        continue;
      }

      if (p2.getHP() > 0) {
        int randomMove = (int) (Math.random() * 3);
        if (randomMove == 0) {
          System.out.println(p2.attack(p1));
        }
        if (randomMove == 1) {
          System.out.println(p2.specialAttack(p1));
        }
        if (randomMove == 2) {
          System.out.println(p2.support());
        }
      }
      if (p1.getHP() <= 0) {
        System.out.println(p2 + " has won the game!");
        continueGame = false;
      }
      if (p2.getHP() <= 0) {
        System.out.println(p1 + " has won the game!");
        continueGame = false;
      }
    }
  }
}
