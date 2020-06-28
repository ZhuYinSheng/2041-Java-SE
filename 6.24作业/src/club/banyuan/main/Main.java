package club.banyuan.main;

import club.banyuan.fighter.Fighter;
import club.banyuan.skill.*;
import club.banyuan.weapon.*;

public class Main {

  public static void main(String[] args) {
    Skill[] skills = new Skill[3];
    skills[0] = new DoubleSkill();
    skills[1] = new VertigoSkill();
    skills[2] = new RecoverHp();

    Fighter fighter1 = new Fighter("张无忌", new TuWeapon(), skills);
//    Fighter fighter2 = new Fighter("灭绝师太", new YiWeapon(), skills);
    Fighter fighter2 = new Fighter("灭绝师太", new BarWeapon(), skills);


    while (fighter1.getHp() > 0 && fighter2.getHp() > 0) {
      if (fighter1.getVertigo() == 0) {
        fighter1.attack(fighter2);
        if (fighter2.getHp() <= 0) {
          break;
        }
      } else {
        fighter1.recover();
      }

      if (fighter2.getVertigo() == 0) {
        fighter2.attack(fighter1);
      } else {
        fighter2.recover();
      }
    }

    if (fighter1.getHp() <= 0) {
      System.out.println(fighter1.getName() + "被打败了。");
    } else {
      System.out.println(fighter2.getName() + "被打败了。");
    }
  }
}
