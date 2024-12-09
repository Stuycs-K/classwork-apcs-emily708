public class Driver {
  public static void main(String[] args) {
    Adventurer p1 = new Ninja("Billy");
    Adventurer p2 = new Ninja("Bobby", 20);
    System.out.println(p1 + ": HP: " + p1.getHP() + ", Stealth: " + p1.getSpecial());
    System.out.println(p2 + ": HP: " + p2.getHP() + ", Stealth: " + p2.getSpecial());
    System.out.println(p1.attack(p2));
    System.out.println(p2.attack(p1));
    System.out.println(p1.getName() + "'s HP: " + p1.getHP());
    System.out.println(p2.getName() + "'s HP: " + p2.getHP());
    System.out.println(p1.support(p2));
    System.out.println(p2.support(p1));
    System.out.println(p1.getName() + "'s HP: " + p1.getHP());
    System.out.println(p2.getName() + "'s HP: " + p2.getHP());
    System.out.println(p1.support());
    System.out.println(p2.support());
    System.out.println(p1.getName() + "'s HP: " + p1.getHP());
    System.out.println(p2.getName() + "'s HP: " + p2.getHP());
    System.out.println(p1.specialAttack(p2));
    System.out.println(p2.specialAttack(p1));
    System.out.println(p1.getName() + "'s HP: " + p1.getHP() + ", Stealth: " + p1.getSpecial());
    System.out.println(p2.getName() + "'s HP: " + p2.getHP() + ", Stealth: " + p2.getSpecial());
    System.out.println(p1 + "'s max stealth: " + p1.getSpecialMax());
    System.out.println(p2 + "'s max stealth: " + p2.getSpecialMax());
    p1.restoreSpecial(30);
    p2.setSpecial(0);
    System.out.println(p1 + "'s " + p1.getSpecialName() + ": " + p1.getSpecial());
    System.out.println(p2 + "'s " + p2.getSpecialName() + ": " + p2.getSpecial());
  }
}