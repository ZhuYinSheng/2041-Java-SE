class M
{
  int i = 51;

  public M(int j)
  {
    System.out.println(i);  // 51

    this.i = j * 10;  // i = 26 * 10 = 260
  }
}

class N extends M
{
  public N(int j)
  {
    super(j);

    System.out.println(i);  // 510

    this.i = j * 20;  // i = 26 * 20 = 520    继承的父类中有i，所以子类中可以用this.i
  }
}

public class MainClass
{
  public static void main(String[] args)
  {
    N n = new N(26);

    System.out.println(n.i);  // 520
  }
}

//输出结果：51 260 520