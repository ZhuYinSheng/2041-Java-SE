package club.banyuan;

import java.util.Arrays;

public class Main {

  public static void main(String[] args) {
    System.out.println("猜一猜4个不重复的数字，请输入4个数字：");

    GuessNumber number = GuessNumber.inputNumber();
    System.out.println(Arrays.toString(number.getValue()));

    while(true) {
      GuessNumber userInput = GuessNumber.scannerNumber();

      assert userInput != null;
      FourNumber result = number.compare(userInput);

      if(result.isSuccess()) {
        System.out.println("回答正确。");
        return;
      }

      result.printInformation();

      System.out.println("请输入四个数字：");
    }
  }
}