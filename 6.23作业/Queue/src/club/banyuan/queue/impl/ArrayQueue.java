package club.banyuan.queue.impl;

import club.banyuan.queue.Queue;
import com.sun.jdi.Value;

public class ArrayQueue implements Queue {

  private int CAPACITY = 5;
  private int addIndex = 0;
  private int deleteIndex = 0;
  private int size;
  private Object[] value = new Object[CAPACITY];

  @Override
  public void add(Object o) {
    if (addIndex % CAPACITY == deleteIndex) {
      Object[] array = new Object[CAPACITY * 2];
      for (int i = 0; i < CAPACITY; i++) {
        array[i] = value[deleteIndex % 5];
        deleteIndex++;
      }
      addIndex = CAPACITY;
      deleteIndex = 0;
      value = array;
    }
    value[size++] = o;
  }

  @Override
  public Object delete() {
    if (isEmpty()) {
      System.out.println("空！");
    }
    deleteIndex = deleteIndex % CAPACITY;
    Object object = value[deleteIndex];
    value[deleteIndex++] = null;
    size--;
    return object;
  }

  @Override
  public boolean isEmpty() {
    return size == 0;
  }

  public void print() {
    for (int i = 0; i < size; i++) {
      System.out.println(value[i]);
    }
  }
}
