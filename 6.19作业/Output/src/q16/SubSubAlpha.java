class Alpha
{
  static String s = " ";    // 静态变量首先加载
  protected Alpha()
  {
    s += "alpha ";    // " alpha "
  }
}
class SubAlpha extends Alpha
{
  private SubAlpha()
  {
    s += "sub ";    // 私有访问权限，子类无法访问
  }
}

public class SubSubAlpha extends Alpha
{
  private SubSubAlpha()
  {
    s += "subsub ";
  }
  public static void main(String[] args)
  {
    new SubSubAlpha();
    System.out.println(s);
  }
}

// 输出结果： alpha subsub