package club.banyuan;

import java.util.Scanner;

public class GuessFourNum {

  private static final char[] value = {'5', '2', '8', '6'};
  private static int index = 0;
  private static int curNum = 0;

  public static void guessFourNum() {
    Scanner scanner = new Scanner(System.in);
    String input = scanner.next();
    while (input.length() != 4) {
      System.out.println("输入有误，请输入4个数字");
      input = scanner.next();
    }
    char[] temp = input.toCharArray();

    while (index != 4) {
      count(temp);
      judgePrint();
      if (index != 4) {
        curNum = 0;
        index = 0;
        guessFourNum();
      }
    }
  }

  public static void count(char[] temp) {
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 4; j++) {
        if (value[i] == temp[j]) {
          curNum++;
          if (i == j) {
            index++;
          }
        }
      }
    }
  }

  public static void judgePrint() {
    if (curNum == 4 & index == 4) {
      System.out.println("回答正确");
    } else if (index == 0 & curNum != 0) {
      System.out.printf("包含了%d个正确的数字\n但是这些数字位置错误\n", curNum);
    } else {
      System.out.printf("包含了%d个正确的数字\n%d个数字的位置正确\n", curNum, index);
    }
  }

  public static void main(String[] args) {
    System.out.println("猜一猜4个不重复的数字，请输入4个数字： ");
    GuessFourNum.guessFourNum();
  }
}