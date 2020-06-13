package club.banyuan;

public class Main {

  public static void main(String[] args) {

    Product product = new Product("华为", 5000);
    product.setNum(1000);
    product.getInfo();
    System.out.println("库存是否充足：" + product.buy(500));

    System.out.println();

    product.changePrice(4000);
    product.getInfo();
    System.out.println("库存是否充足：" + product.buy(1500));

    System.out.println();

    Product product1 = new Product("小米", 3000);
    product1.getInfo();
  }
}
