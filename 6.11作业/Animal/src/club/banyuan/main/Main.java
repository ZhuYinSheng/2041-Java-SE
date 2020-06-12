package club.banyuan.main;

import club.banyuan.cat.Cat;
import club.banyuan.dog.Dog;

public class Main {

  public static void main(String[] args) {
    Dog dog1 = new Dog();
    Dog dog2 = new Dog();
    Dog dog3 = new Dog();
    dog1.setName("哈士奇", -100);
    dog2.setName("柯基", 40);
    dog3.setName("金毛", 100);
    dog1.print();
    dog2.print();
    dog3.print();

    System.out.println("==============");

    Cat cat1 = new Cat();
    Cat cat2 = new Cat();
    cat1.setName("波斯", "白色");
    cat2.setName("英短", "黑色");
    cat1.print();
    cat2.print();

    System.out.println("==============");

    dog1.playWith(cat1);
    cat1.playWith(dog1);
  }
}
