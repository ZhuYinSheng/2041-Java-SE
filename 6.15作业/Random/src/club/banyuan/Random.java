package club.banyuan;

public class Random {

  public static int randomInt(int from, int to) {
    return (int) (Math.random() * (to - from + 1) + from);
  }

  public static void main(String[] args) {
    for (int i = 0; i < 10; i++) {
      System.out.println(randomInt(-10, 5));
    }
  }
}
