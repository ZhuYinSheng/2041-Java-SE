package club.banyuan;

public class Multiply {

  /**
   * 编写一个方法不使用 * 完成两个数相乘
   *
   * @param n1
   * @param n2
   * @return
   */
  static int multiply(int n1, int n2) {
    int number = 0;
    if (n1 == 0 || n2 == 0) {
      return number;
    }

    boolean positiveNumber = n1 > 0 && n2 > 0;
    if (positiveNumber) {
      for (int i = 0; i < n1; i++) {
        number = number + n2;
      }
    }

    if (!positiveNumber) {
      if(n1 < 0 ) {
        n1  = -n1;
      }

      if (n2 < 0) {
        n2 = -n2;
      }

      for (int i = 0; i < n1; i++) {
        number = -(number + n2);
      }
    }
    return number;
  }

  public static void main(String[] args) {
    System.out.printf("%d * %d = %d\n", -1, 2, multiply(-1, 2));
    System.out.printf("%d * %d = %d\n", 1, 2, multiply(1, 2));
    System.out.printf("%d * %d = %d\n", 0, 2, multiply(0, 2));

  }
}
