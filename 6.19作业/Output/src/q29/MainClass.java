class X
{
  static
  {
    Y.methodOfY();    // 先执行
  }
}

class Y extends X
{
  static void methodOfY()
  {
    System.out.println("Hi....");   // 后执行
  }
}

public class MainClass
{
  public static void main(String[] args)
  {
    Y.methodOfY();    // 先加载X Y  加载子类的时候会优先加载父类
  }
}

// 输出结果：
// Hi....
// Hi....