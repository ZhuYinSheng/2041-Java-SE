class Base {
  public static void show() {
    System.out.println("Base::show() called");
  }
}

class Derived extends Base {
  public static void show() {
    System.out.println("Derived::show() called");
  }
}

class Main {
  public static void main(String[] args) {
    Base b = new Derived();;
    b.show();
  }
}

// 输出结果：Base::show() called
// 父类的静态方法不能被子类继承，不存在重写，所以变量名.静态方法属于类不属于对象了