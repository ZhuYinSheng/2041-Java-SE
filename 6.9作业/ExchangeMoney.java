package club.banyuan;

public class ExchangeMoney {

  /**
   * 有1.5元钱兑换1分，2分，5分硬币100枚，每种面值至少一个，请输出所有的兑换方案，并统计方案的总数
   *
   * @param args
   */
  public static void main(String[] args) {

    int totalMoney = 150;
    int countMoney = 100;
    int count = 0;
    for (int i = 0; i < 100; i++) {
      for (int j = 0; j < 100 / 2; j++) {
        for (int k = 0; k < 100 / 5; k++) {
          if (i + 2 * j + 5 * k == 150 && i + j + k == 100) {
            System.out.println("兑换方案：" + "1分：" + i + " " + "2分：" + j + " " + "5分：" + k + " ");
            count++;
          }
        }
      }
    }
    System.out.println("一共有 " + count + " 种方法");
  }
}
