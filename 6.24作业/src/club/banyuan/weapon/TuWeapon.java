package club.banyuan.weapon;

public class TuWeapon implements Weapon {


  @Override
  public String getName() {
    return "屠龙刀";
  }

  @Override
  public int attack() {
    return (int) (20 + Math.random() * (30 - 20 + 1));
  }
}
