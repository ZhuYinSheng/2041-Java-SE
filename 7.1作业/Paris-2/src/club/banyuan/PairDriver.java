package club.banyuan;

import jdk.jfr.StackTrace;

class PairDriver<K, V> {

  /**
   * 创建几个体育场对，然后打印容量最大的体育场名称。
   */

  @SuppressWarnings("unchecked")
  public static void main(String[] args) {

    Pair<String, Integer>[] stadiums = new Pair[3];
    stadiums[0] = new Pair<>("五棵松", 25000);
    stadiums[1] = new Pair<>("鸟巢", 109901);
    stadiums[2] = new Pair<>("奥体中心", 66233);

    System.out.println(stadiums[0]);
    System.out.println(largestStadium(stadiums));
  }

  /**
   * 返回容量最大的体育场的名称。
   *
   * @param stadiums ObjectPairs的数组，其中包含一个体育管名称，还有一个数字作为体育馆容量
   * @return 容量最大的体育馆的名称
   */
  public static String largestStadium(Pair<String, Integer>[] stadiums) {
    Pair<String, Integer> maxSecond = stadiums[0];
    for(Pair<String, Integer> one : stadiums) {
      int second1 = Integer.parseInt(one.getSecond().toString().replace("," , ""));
      int second2 = Integer.parseInt((maxSecond.getSecond().toString().replace(",", "")));
      if (second1 > second2) {
        maxSecond = one;
      }
    }

    return maxSecond.getFirst();
  }

}