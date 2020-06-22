class ClassOne
{
  protected void getData()
  {
    System.out.println("Inside ClassOne");
  }
}
class ClassTwo extends ClassOne
{
  protected void getData()
  {
    System.out.println("Inside ClassTwo");
  }
}

public class Test
{
  public static void main(String[] args)
  {
    ClassOne obj = new ClassTwo();
    obj.getData();
  }
}

// 输出结果：Inside ClassTwo