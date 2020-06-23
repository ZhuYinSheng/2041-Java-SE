class Base {
  public void foo() { System.out.println("Base"); }
}

class Derived extends Base {
  private void foo() { System.out.println("Derived"); }   //  子类重写父类方法的访问修饰符要比父类的访问修饰符高
}

public class Main {
  public static void main(String args[]) {
    Base b = new Derived();
    b.foo();
  }
}

// 经过修改将private改为public，则输出结果：Derived