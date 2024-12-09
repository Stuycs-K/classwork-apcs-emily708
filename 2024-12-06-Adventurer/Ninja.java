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
}
