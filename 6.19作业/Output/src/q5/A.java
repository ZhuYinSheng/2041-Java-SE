package q5;

public class A    // 同包路径下可以省略public
{
  public A(int i)
  {

  }
}

class B extends A
{


  // 父类A中没有默认的无参的构造方法
  //
//  public B(int i) {
//    super(i);
//  }
}