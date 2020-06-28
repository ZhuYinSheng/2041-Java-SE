package club.banyuan.fighter;

import club.banyuan.skill.Skill;
import club.banyuan.weapon.Weapon;
import java.util.Random;

public class Fighter {

  private String name;
  private int hp = 1000;
  private Weapon weapon;
  private Skill[] skills;
  private int vertigo = 0;

  public Fighter(String name, Weapon weapon, Skill[] skills) {
    this.name = name;
    this.weapon = weapon;
    this.skills = skills;
  }

  public Weapon getWeapon() {
    return weapon;
  }

  public int getHp() {
    return hp;
  }

  public void setHp(int hp) {
    this.hp = hp;
  }

  public int getVertigo() {
    return vertigo;
  }

  public String getName() {
    return name;
  }

  /**
   * 方法参数为一个人物对象，表示向该人物发起攻击。 攻击时从技能数组中随机选择一项技能进行方法调用，调用需要满足技能接口的方法声明。
   *
   * @param fighter
   */
  public void attack(Fighter fighter) {
    Random random = new Random();
    int index = random.nextInt(skills.length);
    Skill skill = skills[index];
    skill.apply(this, fighter);
  }

  /**
   * 方法接收一个数值作为受到伤害的数值，将会扣除血量值
   *
   * @param hurt
   */
  public void hurt(int hurt) {
    hp -= hurt;
    System.out.println(getName() + "受到了" + hurt + "点伤害，剩余生命值为" + hp);
  }

  /**
   * 受到眩晕伤害，增加眩晕值，眩晕值如果不为零则会跳过一个回合攻击
   *
   * @param rounds
   */
  public void vertigo(int rounds) {
    vertigo += rounds;
  }

  /**
   * 从眩晕中恢复，眩晕值如果不为零则减一
   */
  public void recover() {
    if (vertigo != 0) {
      vertigo--;
    }
  }
}
