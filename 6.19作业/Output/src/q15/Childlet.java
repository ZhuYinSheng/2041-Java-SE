class Clidder
{
  private final void flipper()
  {
    System.out.println("Clidder");
  }
}

public class Clidlet extends Clidder    // 子类的访问修饰符不能超过父类的访问修饰符，应该去掉public
{
  public final void flipper()
  {
    System.out.println("Clidlet");
  }
  public static void main(String[] args)
  {
    new Clidlet().flipper();
  }
}