class Clidder
{
  private final void flipper()
  {
    System.out.println("Clidder");
  }
}

public class Clidlet extends Clidder
{
  public final void flipper()   // 子类不能重写父类私有方法
  {
    System.out.println("Clidlet");    // 输出 Clidlet
  }
  public static void main(String[] args)
  {
    new Clidlet().flipper();
  }
}