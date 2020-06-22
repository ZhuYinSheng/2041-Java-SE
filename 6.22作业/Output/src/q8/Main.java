class Test
{
  void myMethod()
  {
    System.out.println("Test");
  }
}
class Derived extends Test
{
  void myMethod()
  {
    System.out.println("Derived");
  }

  public static void main(String[] args)
  {
    Derived object = new Test();      // Test object = new Derived(); 多态公式：父类 变量名 = new 子类();
    object.myMethod();
  }
}

// 修改后输出：Derived