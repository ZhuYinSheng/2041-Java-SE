package club.banyuan;

public class StringButter {

  public String butter = "I'm ";

  /**
   * 接受字符串
   *
   * @param str
   */
  public void append(String str) {
    butter = butter + str;
  }

  /**
   * 接收字符
   *
   * @param str
   */
  public void append(char str) {
    butter = butter + str;
  }

  /**
   * 将之前接收到的字符拼接到一起返回
   *
   * @return
   */
  public String toString() {
    return butter;
  }

  /**
   * 清除之前的而输入内容
   */
  public void clear() {
    butter = "";
  }

  /**
   * 将之前的输入内容反转
   *
   * @return
   */
  public String reverse() {
    return reverse(butter);
  }

  /**
   * 反转字符串
   *
   * @param str
   * @return
   */
  public String reverse(String str) {

    char[] charsHead = str.toCharArray();
    char[] charsTail = new char[charsHead.length];
    for (int i = 0; i < charsHead.length; i++) {
      charsTail[charsHead.length - i - 1] = charsHead[i];
    }
    return String.valueOf(charsTail);
  }

  /**
   * 将指定位置的字符串反转
   *
   * @param from
   * @param to
   * @return
   */
  public String reverse(int from, int to) {
    String headFrom = butter.substring(0, from);
    String fromTo = butter.substring(from, to);
    String tailTo = butter.substring(to);

    return headFrom + reverse(fromTo) + tailTo;
  }

  public static void main(String[] args) {
    StringButter stringButter = new StringButter();
    System.out.println("=====字符串和字符拼接=====");
    stringButter.append("happy");
    stringButter.append('s');
    System.out.println(stringButter);

    System.out.println("========返回字符串========");
    System.out.println(stringButter.toString());

    System.out.println("=======清空之前内容=======");
    stringButter.clear();
    stringButter.append("sadness");
    System.out.println(stringButter);

    System.out.println("=========内容反转=========");
    System.out.println(stringButter.reverse());

    System.out.println("=======指定内容反转=======");
    System.out.println(stringButter.reverse(1, 3));
  }
}
