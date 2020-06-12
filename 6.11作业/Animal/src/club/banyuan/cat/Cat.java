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

//  public static void main(String[] args) {
//    Cat cat1 = new Cat();
//    cat1.setName("波斯", "白色");
////    cat1.name = "波斯";
////    cat1.color = "白色";
//
//    Cat cat2 = new Cat();
//    cat2.setName("英短", "黑色");
////    cat2.name = "英短";
////    cat2.color = "黑色";
//
//    cat1.print();
//    cat2.print();
//  }
}
