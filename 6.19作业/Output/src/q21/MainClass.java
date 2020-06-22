class X
{
  static void staticMethod()
  {
    System.out.println("Class X");
  }
}

class Y extends X
{
  static void staticMethod()
  {
    System.out.println("Class Y");
  }
}

public class MainClass
{
  public static void main(String[] args)
  {
    Y.staticMethod();
  }
}

//输出结果：Class Y