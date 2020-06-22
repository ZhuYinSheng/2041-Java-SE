class Grandparent
{
  public void Print()
  {
    System.out.println("Grandparent's Print()");
  }
}

class Parent extends Grandparent
{
  public void Print()
  {
    System.out.println("Parent's Print()");
  }
}

class Child extends Parent
{
  public void Print()
  {
    super.super.Print();    // 错误 不能使用super.super.
    System.out.println("Child's Print()");
  }
}

public class Main   // 访问修饰符应不为public
{
  public static void main(String[] args)
  {
    Child c = new Child();
    c.Print();
  }
}