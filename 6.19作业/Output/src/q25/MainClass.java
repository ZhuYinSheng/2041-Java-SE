class ClassOne
{
  static int i, j = 191919;

  {
    --i;
  }

  {
    j++;
  }
}

public class ClassTwo extends ClassOne  // 子类访问权限不能超过父类
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