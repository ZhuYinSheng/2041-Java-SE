class One
{
  int x = 2121;
}

class Two
{
  int x = 1212;

  {
    System.out.println(x);    // x = 1212
  }
}

public class MainClass
{
  public static void main(String[] args)
  {
    Two two = new Two();
  }
}

// 输出结果：1212