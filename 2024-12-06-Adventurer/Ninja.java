public class Ninja extends Adventurer {
  private int special;
  private int specialMax;
  private String name;
  private int HP,maxHP;

  public Ninja(String name){
    this(name, 10);
  }

  public Ninja(String name, int hp){
      this.name = name;
      this.HP = hp;
      this.maxHP = hp;
  }

  public String getSpecialName(){
    return "Stealth";
  }

  public int getSpecial(){
    return this.special;
  }

  public void setSpecial(int n){
    this.special = n;
  }

  public int getSpecialMax(){
    return this.specialMax;
  }

}
