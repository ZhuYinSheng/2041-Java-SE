package club.banyuan;

public class AreaCalculator {

//  public void show(Circle circle) {
//    System.out.println(circle.getShapeName() + "面积是" + String.format("%.1f", circle.area()));
//    System.out.println(circle.getShapeName() + "周长是" + String.format("%.1f", circle.perimeter()));
//  }
//
//  public void show(Rectangle rectangle) {
//    System.out.println(rectangle.getShapeName() + "面积是" + String.format("%s",rectangle.area()));
//    System.out.println(rectangle.getShapeName() + "周长是" + String.format("%s", rectangle.perimeter()));
//  }

  public void show(Shape shape) {
    System.out.println(shape.getShapeName() + "面积是" + String.format("%s",shape.area()));
    System.out.println(shape.getShapeName() + "周长是" + String.format("%s",shape.perimeter()));
  }
}
