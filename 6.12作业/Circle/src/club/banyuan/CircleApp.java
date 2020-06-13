package club.banyuan;

public class CircleApp {

  public static void main(String[] args) {
    double rd = 12.3;
    System.out.println("半径 = " + rd);

    Circle circle1 = new Circle(rd);
    double cir1 = circle1.calPerimeter();
    double area1 = circle1.calArea();

    circle1.setRadius(16.6);

    Circle circle2 = new Circle(circle1);
    double cir2 = circle2.calPerimeter();
    double area2 = circle2.calArea();

    Circle circle3 = circle2;
    double cir3 = circle3.calPerimeter();
    double area3 = circle3.calArea();


    System.out.println("circle1");
    System.out.println("周长：" + cir1);
    System.out.println("面积：" + area1);

    System.out.println("==============");

    System.out.println("circle2");
    System.out.println("周长：" + cir2);
    System.out.println("面积：" + area2);

    System.out.println("=============");

    circle2.setRadius(18.8);

    System.out.println("circle3");
    System.out.println("周长：" + cir3);
    System.out.println("面积：" + area3);

    System.out.println("==============");

    circle2 = null;
    System.out.println(circle2);
    System.out.println(circle3);
  }
}
