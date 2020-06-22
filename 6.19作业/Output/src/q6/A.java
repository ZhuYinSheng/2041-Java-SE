public class A
{
  public A()
  {
    super();

    // this
    this(10);
  }

  public A(int i)
  {
    System.out.println(i);
  }
}