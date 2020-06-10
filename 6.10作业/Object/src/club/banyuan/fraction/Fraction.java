package club.banyuan.fraction;

public class Fraction {

  int molecular;     //分子
  int denominator;   //分母

  /**
   * 将分数转换为double
   *
   * @return
   */
  double toDouble() {
    double result = (double) molecular / denominator;
    System.out.println(result);
    return result;
  }

  /**
   * 将自己的分数和r的分数相加，产生一个新的Fraction的对象
   *
   * @param r
   * @return
   */
  Fraction plus(Fraction r) {
    Fraction fraction = new Fraction();
    fraction.molecular = r.molecular * denominator + r.denominator * molecular;
    fraction.denominator = r.denominator * denominator;
    return fraction;
  }

  /**
   * 将自己的分数和r的分数相乘，产生一个新的Fraction的对象
   *
   * @param r
   * @return
   */
  Fraction multiply(Fraction r) {
    Fraction fraction = new Fraction();
    fraction.molecular = r.molecular * molecular;
    fraction.denominator = r.denominator * denominator;
    return fraction;
  }

  /**
   * 用最简方式打印分数
   */
  void print() {
    int gcd = greatestCommonDivisor(molecular, denominator);
    System.out.println(molecular / gcd + "/" + denominator / gcd);
  }

  /**
   * 最大公约数化简
   *
   * @param molecular
   * @param denominator
   * @return
   */
  static int greatestCommonDivisor(int molecular, int denominator) {
    if (denominator == 0) {
      return molecular;
    } else {
      return greatestCommonDivisor(denominator, molecular % denominator);
    }
  }

  public static void main(String[] args) {
    Fraction fraction1 = new Fraction();
    fraction1.molecular = 2;
    fraction1.denominator = 3;

    Fraction fraction2 = new Fraction();
    fraction2.molecular = 3;
    fraction2.denominator = 0;
    System.out.println("分数相加：");
    fraction1.plus(fraction2).print();
    System.out.println("分数相乘：");
    fraction1.multiply(fraction2).print();
    System.out.println("原分数：");
    fraction1.print();
    fraction2.print();
    System.out.println("转换为double：");
    fraction1.toDouble();
    fraction2.toDouble();

  }
}