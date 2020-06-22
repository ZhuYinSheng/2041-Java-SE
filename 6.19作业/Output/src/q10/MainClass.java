class X
{
  int m = 1111;

  {
    m = m++;

    System.out.println(m);  // m = 1111
  }
}

class Y extends X
{
  {
    System.out.println(methodOfY());  // 2220
  }

  int methodOfY()
  {
    return m-- + --m;   // 1111 + 1109
  }
}

public class MainClass
{
  public static void main(String[] args)
  {
    Y y = new Y();
  }
}

// 输出结果：1111 2220