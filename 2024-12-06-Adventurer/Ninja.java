public class Ninja extends Adventurer {
  private int stealth;
  private int maxStealth;

  //constructors
  public Ninja(String name){
    super(name, 10);
    this.stealth = 10;
    this.maxStealth = 10;
  }

  public Ninja(String name, int hp){
    super(name, hp);
    this.stealth = 10;
    this.maxStealth = 10;
  }

  //accessor methods
  public String getSpecialName(){
    return "Stealth";
  }

  public int getSpecial(){
    return this.stealth;
  }

  public void setSpecial(int n){
    this.stealth = n;
  }

  public int getSpecialMax(){
    return this.maxStealth;
  }

  //hurt or hinder the target adventurer
  public String attack(Adventurer other){
    other.applyDamage(5);
    return this.getName() + " has attacked " + other.getName() + ". " + other.getName() + "'s HP has decreased by 5.";
  }

  //heal or buff the target adventurer
  public String support(Adventurer other){
    other.setHP(other.getHP() + 5);
    return this.getName() + " has supported " + other.getName() + ". " + other.getName() + "'s HP has increased by 5.";
  }

  //heal or buff self
  public String support(){
    this.setHP(this.getHP() + 5);
    return this.getName() + " has supported themselves. " + this.getName() + "'s HP has increased by 5.";
  }

  //hurt or hinder the target adventurer, consume some special resource
  public String specialAttack(Adventurer other){
    other.applyDamage(10);
    other.setSpecial(other.getSpecial() - 5);
    return this.getName() + " has chosen special attack. " + other.getName() + "'s HP has decreased by 10 and stealth has decreased by 5.";
  }
}
