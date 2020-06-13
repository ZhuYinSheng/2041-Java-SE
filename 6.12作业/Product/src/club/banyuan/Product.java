package club.banyuan;

public class Product {

  private String name;
  private double price;
  private static int scanCode = 1000;
  private int num;

  public Product(String name, double price) {
    this.name = name;
    this.price = price;
    scanCode++;
  }

  public String getName() {
    return name;
  }

  public int getScanCode() {
//    int randomCode = (int) (1000 + Math.random() * (10000 - 1000 + 1));
//    scanCode =randomCode;
    return scanCode;
  }

  public double getPrice() {
    return price;
  }

  public void changePrice(double price) {
    this.price = price;
  }

  public int getNum() {
    return num;
  }

  public void setNum(int num) {
    this.num = num;
  }

  String getInfo() {
    String printing = "--- 产品信息 ---\n名称：" + name + "\n编码：" + scanCode + "\n价格：" + price;
    System.out.println(printing);
    return printing;
  }

  boolean buy(int scanNum) {
    this.num = num - scanNum;
    if (scanNum > num) {
      return false;
    }
    return true;
  }
}
