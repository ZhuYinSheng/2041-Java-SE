class X
{
  private int m = 48;
}

class Y extends X
{
  void methodOfY()
  {
    // 编译报错，变量m的访问修饰符是私有的，子类没有访问权限。
    // 可修改父类变量的访问权限。
    System.out.println(m);
  }
}