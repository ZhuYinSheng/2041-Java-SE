package club.banyuan;

public class Time {

  int hour;
  int minute;
  int second;

  public void setTime(int aHour, int aMinute, int aSecond) {
    hour = (aHour % 24) + aMinute / 60;
    minute = (aMinute % 60) + (aSecond / 60);
    second = aSecond % 60;
  }

  public String toString() {
    String result;
    result = hour + ":" + minute + ":" + second;
    System.out.printf("%02d:%02d:%02d\n", hour, minute, second);
    return result;
  }

  public void nextSecond() {
    second += 1;
    if (second == 60) {
      minute += 1;
      second = 0;
    } else if (minute == 60) {
      hour += 1;
      minute = 0;
    } else if (hour == 24) {
      hour = 0;
    }
  }

  public static void main(String[] args) {
    Time time = new Time();
    time.setTime(26, 76, 68);
    time.toString();
    time.nextSecond();
    time.toString();
  }
}