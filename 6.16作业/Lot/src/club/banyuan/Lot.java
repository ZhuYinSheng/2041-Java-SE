package club.banyuan;

import java.util.Scanner;

public class Lot {

  public static void lotRandom() {
    Scanner scanner = new Scanner(System.in);
    int input = scanner.nextInt();
    while (input != 0) {
      int lot = (int) (Math.random() * (100));
      if (lot >= 0 && lot <= 4) {
        System.out.println("大吉");
      } else if (lot >= 5 && lot <= 14) {
        System.out.println("中吉");
      } else if (lot >= 15 && lot <= 29) {
        System.out.println("小吉");
      } else if (lot >= 30 && lot <= 59) {
        System.out.println("吉");
      } else if (lot >= 60 && lot <= 79) {
        System.out.println("末吉");
      } else if (lot >= 80 && lot <= 94) {
        System.out.println("凶");
      } else if (lot >= 95 && lot <= 99) {
        System.out.println("大凶");
      }
      input = scanner.nextInt();
    }
  }

  public static void main(String[] args) {
    Lot.lotRandom();
  }
}
