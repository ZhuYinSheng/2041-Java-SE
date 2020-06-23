package club.banyuan;

public class Rectangle extends Shape {

  private double length;
  private double width;

  public Rectangle(double length, double width) {
    this.length = length;
    this.width = width;
  }

  @Override
  public double area() {
    return length * width;
  }

  @Override
  public double perimeter() {
    return 2 * (length + width);
  }

  @Override
  public String getShapeName() {
    return "矩形";
  }
}
