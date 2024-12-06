public class Ninja extends Adventurer {
  private int special;
  private int specialMax;

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
