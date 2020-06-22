class Base {
  final public void show() {
    System.out.println("Base::show() called");
  }
}

class Derived extends Base {
  public void show() {                               // 编译报错，无法重写父类fianl修饰的方法。
    System.out.println("Derived::show() called");
  }
}

class Main {
  public static void main(String[] args) {
    Base b = new Derived();;
    b.show();
  }
}

// 若做修改后，使父类方法不为final，则输出：Derived::show() called