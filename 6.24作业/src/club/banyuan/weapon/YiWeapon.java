package club.banyuan.weapon;

public class YiWeapon implements Weapon{

  @Override
  public String getName() {
    return "倚天剑";
  }

  @Override
  public int attack() {
    return 15;
  }
}
