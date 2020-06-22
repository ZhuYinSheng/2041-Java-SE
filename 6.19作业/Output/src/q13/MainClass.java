class A
{
  int methodOfA(int i)
  {
    i /= 10;

    return i;   // i = 100 / 10 = 10
  }
}

class B extends A
{
  int methodOfB(int i)
  {
    i *= 20;

    return methodOfA(i);    // i = 10 * 20 = 200
  }
}

public class MainClass
{
  public static void main(String[] args)
  {
    B b = new B();

    System.out.println(b.methodOfB(100));
  }
}

//输出结果：200