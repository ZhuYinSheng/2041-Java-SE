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

//  public static void main(String[] args) {
//    Dog dog1 = new Dog();
//    dog1.setName("哈士奇", -100);
////    dog1.name = "哈士奇";
////    dog1.IQ = -100;
//
//    Dog dog2 = new Dog();
//    dog2.setName("柯基", 40);
////    dog2.name = "柯基";
////    dog2.IQ = 40;
//
//    Dog dog3 = new Dog();
//    dog3.setName("金毛", 100);
////    dog3.name = "金毛";
////    dog3.IQ = 100;
//
//    dog1.print();
//    dog2.print();
//    dog3.print();
//  }
}