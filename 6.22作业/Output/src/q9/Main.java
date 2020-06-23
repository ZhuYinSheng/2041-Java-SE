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

  protected void getValue()
  {
    System.out.println("ClassTwo");
  }
}

public class Test
{
  public static void main(String[] args)
  {
    ClassOne obj = new ClassTwo();
    obj.getValue();                       // 变量名.方法 会调用子类中重写父类的方法，父类中没有getValue()方法，不构成重写。
  }                                       // 强制类型转换ClassOne obj = (ClassOne) new ClassTwo();
}

// 若改为obj.getValue();则输出结果为：Inside ClassTwo