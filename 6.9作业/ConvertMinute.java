package club.banyuan;

public class ConvertMinute {

  /**
   * 编写一个方法输入分钟时间，向控制台输出多少年，多少天
   *
   * @param minute
   */
  static void convert(long minute) {
    long year =  minute / (24 * 60 * 365);
    int day = (int)(minute / 60 / 24) % 365;
    System.out.printf("%d 分钟是 %d 年 %d 天", minute, year, day);
  }

  public static void main(String[] args) {
    convert(3456789);
  }
}
