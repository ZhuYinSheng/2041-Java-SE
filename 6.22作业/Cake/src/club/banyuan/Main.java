package club.banyuan;

import java.util.Random;

public class Main {

  public static Cake[] makeCake() {
    Cake[] cakes = new Cake[10];
    Random random = new Random(10);

    for (int i = 0; i < cakes.length; i++) {
      if (i % 2 == 0) {
        cakes[i] = new ReadyMadeCake(i, random.nextDouble() * 20, random.nextInt(20));
      } else {
        cakes[i] = new OrderCake(i, random.nextDouble() * 20, random.nextInt(20));
      }
    }
    return cakes;
  }

  public static void cakeTotalPrice(Cake[] cakes) {
    double cakePrice = 0;

    for (Cake cake : cakes) {
      cakePrice = cakePrice + cake.calcPrice();
    }
    System.out.printf("所有蛋糕的总价：%.2f\n", cakePrice);
  }

  public static void cakePriceAndQuantity(Cake[] cakes) {
    double cakeReadyPrice = 0;
    int cakeReadyQuantity = 0;

    for (Cake cake : cakes) {
      if (cake instanceof ReadyMadeCake) {
        ReadyMadeCake readyMadeCake = (ReadyMadeCake) cake;
        cakeReadyPrice += readyMadeCake.calcPrice();
        cakeReadyQuantity += readyMadeCake.getQuantity();
      }
    }
    System.out.printf("ReadyMadeCake蛋糕的总价之和：%.2f\n", cakeReadyPrice);
    System.out.println("ReadyMadeCake蛋糕的质量之和：" + cakeReadyQuantity);
  }

  public static void maxPriceCake(Cake[] cakes) {
    Cake maxPrice = cakes[0];
    for (int i = 0; i < cakes.length; i++) {
      if (cakes[i].calcPrice() < maxPrice.calcPrice()) {
        maxPrice = cakes[i];
      }
    }
    System.out.println("最高价蛋糕的编号：" + maxPrice.id);

    if (maxPrice instanceof ReadyMadeCake) {
      System.out.println("最高价蛋糕按个数卖。");
    } else {
      System.out.println("最高价蛋糕按斤卖。");
    }
  }

  public static void main(String[] args) {
    Cake[] cakes = makeCake();
    cakeTotalPrice(cakes);
    cakePriceAndQuantity(cakes);
    maxPriceCake(cakes);
  }
}
