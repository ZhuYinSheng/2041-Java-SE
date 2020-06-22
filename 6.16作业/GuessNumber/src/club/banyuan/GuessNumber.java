package club.banyuan;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {

  public static int ARRAY_SIZE = 4;

  int[] value;

  public GuessNumber(int[] value) {
    this.value = value;
  }

  public int[] getValue() {
    return value;
  }

  public void setValue(int[] value) {
    this.value = value;
  }

  public FourNumber compare(GuessNumber guessNumber) {
    FourNumber fourNumber = new FourNumber();
    int[] compare = guessNumber.getValue();
    for (int i = 0; i < ARRAY_SIZE; i++) {
      if (value[i] == compare[i]) {
        fourNumber.positionRight();
      } else {
        String source = new String(Arrays.toString(value));
        if (source.contains(compare[i] + "")) {
          fourNumber.getRightNumber();
        }
      }
    }
    return fourNumber;
  }

  public static GuessNumber inputNumber() {
    int[] demo = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    GuessNumber gus = new GuessNumber(new int[ARRAY_SIZE]);
    for (int i = 0; i < ARRAY_SIZE; i++) {
      int index = (int)(Math.random() * (demo.length - i));
      gus.getValue()[i] = demo[index];
      demo[index] = demo[demo.length - i - 1];
    }
    return gus;
  }

  public static GuessNumber scannerNumber() {
    Scanner scanner = new Scanner(System.in);
    if (scanner.hasNext()) {
      String input = scanner.nextLine();
      if (input.length() != ARRAY_SIZE) {
        System.out.println("输入不合法，请重新输入。");
        return scannerNumber();
      }
    }
    System.out.println("输入异常。");
    return null;
  }
}