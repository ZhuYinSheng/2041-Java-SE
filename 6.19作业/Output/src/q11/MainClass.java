class A
{
  void A()
  {
    System.out.println(1);  // 1
  }
}

class B extends A
{
  void B()
  {
    A();
  }
}

public class MainClass
{
  public static void main(String[] args)
  {
    new B().B();
  }
}

// 输出结果：1