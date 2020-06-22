package club.banyuan;

public class FourNumber {

  int rightNumber;
  int positionNumber;

  public int getRightNumber() {
    return rightNumber;
  }

  public void setRightNumber(int rightNumber) {
    this.rightNumber = rightNumber;
  }

  public int getPositionNumber() {
    return positionNumber;
  }

  public void setPositionNumber(int positionNumber) {
    this.positionNumber = positionNumber;
  }

  public void positionRight() {
    rightNumber++;
    positionNumber++;
  }

  public void numberRight() {
    rightNumber++;
  }

  boolean isSuccess() {
    return GuessNumber.ARRAY_SIZE == positionNumber;
  }

  void printInformation() {
    System.out.println("包含了" + rightNumber + "个正确的数字。");
    if (positionNumber == 0) {
      System.out.println("但是这些数字位置错误。");
    } else {
      System.out.println(positionNumber + "个数字的位置正确。");
    }
  }
}