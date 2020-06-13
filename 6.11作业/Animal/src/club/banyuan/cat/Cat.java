package club.banyuan.cat;

import club.banyuan.dog.Dog;

public class Cat {

  String name;
  String color;

  public void setName(String name, String color) {
    this.name = name;
    this.color = color;
  }

  public void print() {
    System.out.println(name + " " + color);
  }

  public void playWith(Dog dog) {
    System.out.println(name + " " + "和狗一起玩");
  }

}
