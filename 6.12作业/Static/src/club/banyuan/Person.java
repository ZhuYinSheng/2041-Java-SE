package club.banyuan;

public class Person {

  private String name;
  private int age;
  public static int countPerson = 0;
  public static int countMethod = 0;

  {
    countPerson++;
  }

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
    countMethod++;
  }

  public Person(String name) {
    this.name = name;
  }

  public Person() {
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

}
