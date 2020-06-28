package club.banyuan.weapon;

public class BarWeapon implements Weapon{

  private int hurt = 1;

  @Override
  public String getName() {
    return "打狗棒";
  }

  @Override
  public int attack() {
    return hurt++;
  }
}
