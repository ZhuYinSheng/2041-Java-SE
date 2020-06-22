class ClassOne
{
  static int i, j = 191919;   // i = 0, j = 191919

  {
    --i;            // 没有new对象 不会调用构造代码块
  }

  {
    j++;
  }
}

public class ClassTwo extends ClassOne
{
  static
  {
    i++;
  }

  static
  {
    --j;
  }

  public static void main(String[] args)
  {
    System.out.println(i);

    System.out.println(j);
  }
}

// 输出结果：
// 1
// 191918