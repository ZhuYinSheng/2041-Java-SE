package club.banyuan;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Pairs<K, V> implements Iterable<Pair<K, V>> {

  /* 声明一对对象的固定大小的数组（最多10个元素） */

  /**
   * 创建一个集合，该集合将存储成对添加的项目。
   */
  public Pairs() {
  }

  private List<Pair<K, V>> pairs = new ArrayList<>();

  /**
   * 创建一个新的对，并在有空间的情况下将其添加到集合中。
   *
   * @param first  The first object.
   * @param second The second object.
   */
  public boolean addPair(K first, V second) {
    return pairs.add(new Pair<>(first,second));
  }


  @Override
  public Iterator<Pair<K, V>> iterator() {
    return new PairIterator();
  }

  /*
   * 根据以下位置的API文档在此处实现迭代器
   * https://docs.oracle.com/javase/10/docs/api/java/util/Iterator.html
   * 按照规定抛出异常
   */
  private class PairIterator implements Iterator<Pair<K, V>> {

    private List<Pair<K, V>> pairs = new ArrayList<>(Pairs.pai)

    @Override
    public boolean hasNext() {
      throw new UnsupportedOperationException();
    }

    /**
     * 返回迭代器中的下一个对象
     */
    @Override
    public Pair<K, V> next() {
      throw new UnsupportedOperationException();
    }

    /**
     * 从集合中移除next（）返回的上一个对象。
     */
    @Override
    public void remove() {
      throw new UnsupportedOperationException();
    }
  }

}