package club.banyuan;

public class ReverseLetter {

  public String butter = "";

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
   * 反转字符
   *
   * @param str
   * @return
   */
  public static String reverse(String str) {

    char[] charsHead = str.toCharArray();
    char[] charsTail = new char[charsHead.length];
    for (int i = 0; i < charsHead.length; i++) {
      charsTail[charsHead.length - i - 1] = charsHead[i];
    }
    return String.valueOf(charsTail);
  }

  public static void main(String[] args) {
    ReverseLetter reverseLetter = new ReverseLetter();
    String word = "To be or not to be";
    String[] words = word.split(" ");

    System.out.println(words.length);

    for (int i = 0; i < words.length; i++) {
      reverseLetter.append(reverse(words[i]));
      reverseLetter.append(" ");
    }
    System.out.println(reverseLetter.toString());
  }
}
