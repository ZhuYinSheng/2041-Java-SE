package club.banyuan;

import java.util.LinkedList;
import java.util.List;
import java.util.Iterator;

public class PointUtils {

  /**
   * 返回具有最大Y值的点。如果存在多个这样的点，则只需选择一个即可。
   */
  public static Point highestPoint(List<Point> points) {
    Iterator<Point> pointIterator = points.iterator();

    // TODO 使用迭代器完成此方法!
    Point max = points.get(0);
    while (pointIterator.hasNext()) {
      Point temp = pointIterator.next();
      if (temp.getY() > max.getY()) {
        max = temp;
      }
    }

    return max;
  }

  /**
   * 返回一个新点，新点的X值是所有给定点的X值的平均值，Y值是所有给定点的Y值的平均值。
   */
  public static Point centroid(List<Point> points) {
    Iterator<Point> pointIterator = points.iterator();
    // TODO 使用迭代器完成此方法!
    int sumX = 0;
    int sumY = 0;
    int count = 0;
    while (pointIterator.hasNext()) {
      Point average = pointIterator.next();
      sumX = sumX + average.getX();
      sumY = sumY + average.getY();
      count++;
    }

    return new Point(sumX / count,sumY / count);
  }

  public void test() {
    List<Point> points = new LinkedList<>();
    points.add(new Point(1, 1));
    points.add(new Point(1, 3));
    points.add(new Point(3, 1));
    points.add(new Point(3, 3));

    /* 应该是Point [x = 3，y = 3]或Point [x = 1，y = 3] */
    System.out.println(highestPoint(points));
    // 结果是[x = 3，y = 3] 或  [x = 1，y = 3]中的一个

    // 应该是Point[x=2,y=2]
    System.out.println(centroid(points));

    points = new LinkedList<Point>();
    points.add(new Point(1, 1));
    points.add(new Point(1, -1));
    points.add(new Point(-1, 1));
    points.add(new Point(-1, -1));

    /* 应该是Point[x=1,y=1] 或[x=-1,y=1] */
    System.out.println(highestPoint(points));

    // 应该是[x=0,y=0]
    System.out.println(centroid(points));
  }
}
