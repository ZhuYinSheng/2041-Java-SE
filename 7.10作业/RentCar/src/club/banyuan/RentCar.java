package club.banyuan;

import java.util.Scanner;

public class RentCar {

  public static void menu() {
    while (true) {
      System.out.println("**** 租车系统菜单 ****\n"
          + "1.添加汽车\n"
          + "2.出租汽车\n"
          + "3.归还汽车\n"
          + "4.汽车保养\n"
          + "5.结束保养\n"
          + "6.查询信息\n"
          + "7.退出系统");

      Scanner scanner = new Scanner(System.in);
      String input = scanner.nextLine();
      switch (input) {
        case "1":
          addCar();
          break;
        case "2":
          break;
        case "3":
          break;
        case "4":
          break;
        case "5":
          break;
        case "6":
          break;
        case "7":
          System.out.println("已退出，谢谢！");
          System.exit(0);
          break;
        default:
          System.out.println("输入不合法，请重新输入！");
          menu();
      }
    }
  }


  public static void addCar() {
    System.out.print("请输入添加的车型请输入添加的车型\n"
        + "Van: 卡车\n"
        + "Car: 轿车\n"
        + "请输入：");
    Scanner scanner = new Scanner(System.in);
    while (scanner.hasNext()) {
      String input = scanner.nextLine();
      if (input.equals("Car")) {
        int year = scanner.nextInt();
        System.out.println("出厂年份：" + year);
        String factory = scanner.nextLine();
        System.out.println("厂家：" + factory);
        int carNumber = scanner.nextInt();
        System.out.println("车辆编号：V_" + carNumber);
        int seatNumber = scanner.nextInt();
        if (seatNumber == 4 || seatNumber == 7) {
          System.out.println("输入轿车座数(4/7)：" + seatNumber);
        } else {
          System.out.println("输入不合法，请重新输入！");
          return;
        }
        String date = scanner.nextLine();
        System.out.println("保养日期(年-月-日)：" + date);
      } else if (input.equals("Van")) {

      }
    }
  }

  public static void main(String[] args) {
    menu();
  }
}
