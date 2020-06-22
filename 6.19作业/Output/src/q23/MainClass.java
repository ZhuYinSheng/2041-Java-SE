class A
{
  static String s = "AAA";    // 1

  static
  {
    s = s + "BBB";    // 2
  }

  {
    s = "AAABBB";   // 4 覆盖静态
  }
}

class B extends A
{
  static
  {
    s = s + "BBBAAA";   // 3 AAABBBBBBAAA
  }

  {
    System.out.println(s);
  }
}

public class MainClass
{
  public static void main(String[] args)
  {
    B b = new B();
  }
}

// 输出结果：AAABBB