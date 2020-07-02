package club.banyuan;

public class RectangleMeasurer implements Measurer<Rectangle> {

  @Override
  public double measure(Rectangle anObject) {
    if (anObject != null) {
      return ((Rectangle) anObject).width * ((Rectangle) anObject).height;
    }
    throw new IllegalArgumentException("不是矩形类");
  }
}
