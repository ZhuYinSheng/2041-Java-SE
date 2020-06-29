package club.banyuan;

public enum Weekday {
  MONDAY("星期一"),
  TUESDAY("星期二"),
  WEDNESDAY("星期三"),
  THURSDAY("星期四"),
  FRIDAY("星期五"),
  SATURDAY("星期六"),
  SUNDAY("星期日"),
  ;

  private final String name;

  Weekday(String name) {
    this.name = name;
  }

  boolean isWeekday() {
    return !isHoliday();
  }

  boolean isHoliday() {
    return this == SATURDAY || this == SUNDAY;
  }

  @Override
  public String toString() {
    return name;
  }
}
