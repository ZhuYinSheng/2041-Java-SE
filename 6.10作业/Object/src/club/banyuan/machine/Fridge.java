package club.banyuan.machine;

import club.banyuan.animal.Elephant;
import club.banyuan.animal.Lion;

public class Fridge {

  public int heightInCM;
  public Elephant storageElephant;
  public Lion storageLion;

  /**
   * 增加判断，输出冰箱已满。
   *
   * @param elephant
   */
  public void store(Elephant elephant) {
    if (storageElephant != null || storageLion != null) {
      System.out.println("冰箱已经满了");
    }
    storageElephant = elephant;
  }

  /**
   * 增加判断，输出冰箱已满。
   *
   * @param lion
   */
  public void store(Lion lion) {
    if (storageElephant != null || storageLion != null) {
      System.out.println("冰箱已经满了");
    }
    storageLion = lion;
  }

  /**
   * 删除大象
   *
   * @return
   */
  public Elephant remove() {
    Elephant ele = storageElephant;
    storageElephant = null;
    return ele;
  }
}
