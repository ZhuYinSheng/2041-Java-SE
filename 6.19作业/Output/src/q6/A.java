public class A
{
  public A()
  {
    super();

    // this跟super不能同时使用，都需要在第一句话。
    this(10);
  }

  public A(int i)
  {
    System.out.println(i);
  }
}