class ClassOne
{
  static int i = 111;

  int j = 222;

  {
    // 111 - 223
    i = i++ - ++j; // -112
  }
}

class ClassTwo extends ClassOne
{
  {
    i = -113
    // -112 + 222 = 110
    j = i-- + --j;
  }
}

class Main {
  public static void main(String args[]){
    ClassTwo clsTwo = new ClassTwo();
    System.out.println(clsTwo.i);
    System.out.println(clsTwo.j);
  }
}

// 输出结果：
// -114
// 109