package club.banyuan;

public class Main {

  public static void main(String[] args) {
    for (Weekday one : Weekday.values()) {
      if (one.isWeekday()) {
        System.out.println(one + " 是工作日。");
      } else {
        System.out.println(one + " 是假期。");
      }
    }

    Weekday sat = Weekday.SATURDAY;
    for (Weekday day : Weekday.values()) {
      int value = day.compareTo(sat);
      if (value < 0) {
        System.out.println(day + " 与 " + sat + " 的序号差值为 " + value + " 且小于sat的值。");
      } else if (value > 0) {
        System.out.println(day + " 与 " + sat + " 的序号差值为 " + value + " 且大于sat的值。");
      } else {
        System.out.println(day + " 与 " + sat + " 的序号差值为 " + value + " 且等于sat的值。");
      }
    }
  }
}