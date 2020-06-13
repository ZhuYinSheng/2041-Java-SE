package club.banyuan;

public class Circle {

  private double r;

  public Circle(double r) {           // 构造方法
    this.r = r;
  }

  public Circle(Circle circle) {
    this.r = circle.r;
  }

  public void setRadius(double r) {
    this.r = r;
  }

  public double calPerimeter() {
    return 2 * Math.PI * r;
  }

  public double calArea() {
    return Math.PI * r * r;          // 静态方法无法使用非静态内容。
  }
}