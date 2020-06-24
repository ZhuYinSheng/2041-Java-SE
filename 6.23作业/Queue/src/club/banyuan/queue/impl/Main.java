package club.banyuan.queue.impl;

public class Main {

  public static void main(String[] args) {
    ArrayQueue arrayQueue = new ArrayQueue();
    arrayQueue.add(0);
    arrayQueue.add(1);
    arrayQueue.add(2);
    arrayQueue.add(3);
    arrayQueue.add(4);
    arrayQueue.add(5);
    arrayQueue.print();

    arrayQueue.delete();
    arrayQueue.print();
  }
}
