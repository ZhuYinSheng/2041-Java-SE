class A
{
  int i = 1212;
}

class B extends A
{
  A a;

  public B(A a)
  {
    this.a = a;
  }
}

public class MainClass
{
  public static void main(String[] args)
  {
    A a = new A();

    B b = new B(a);

    System.out.println(a.i);    // 1212

    System.out.println(b.i);    // 1212

    System.out.println(b.a.i);    // 1212

    b.a.i = 2121;

    System.out.println("--------");

    System.out.println(a.i);    // 2121

    System.out.println(b.i);    // 1212
  }
}