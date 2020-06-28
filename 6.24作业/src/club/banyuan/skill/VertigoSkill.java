package club.banyuan.skill;

import club.banyuan.fighter.Fighter;

public class VertigoSkill implements Skill {

  @Override
  public void apply(Fighter from, Fighter to) {
    to.hurt(from.getWeapon().attack() / 2);
    to.vertigo(1);
    System.out.println(from.getName() + "使用" + from.getWeapon().getName() + "向" + to.getName() + "发起了眩晕攻击！");
  }
}
