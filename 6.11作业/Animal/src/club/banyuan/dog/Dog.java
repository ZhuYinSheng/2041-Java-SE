package club.banyuan.dog;

import club.banyuan.cat.Cat;

public class Dog {

  String name;
  int IQ;

  public void setName(String name, int IQ) {
    this.name = name;
    this.IQ = IQ;
  }

  public void print() {
    if (IQ < 20) {
      System.out.println(name + " 傻");
    } else if (IQ > 20 && IQ < 80) {
      System.out.println(name + " 还可以");
    } else if (IQ > 80) {
      System.out.println(name + " 聪明");
    }
  }

  public void playWith(Cat cat) {
    System.out.println(name + " " + "和猫一起玩");
  }
}