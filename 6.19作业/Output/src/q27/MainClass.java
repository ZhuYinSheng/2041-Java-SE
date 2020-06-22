class A
{
  static int i;

  static
  {
    i++;    // 1
  }

  {
    ++i;    // 3
  }
}

class B extends A
{
  static
  {
    --i;    // 2
  }

  {
    i--;    // 4
  }
}

public class MainClass
{
  public static void main(String[] args)
  {
    System.out.println(new B().i);
  }
}

// 输出结果：0