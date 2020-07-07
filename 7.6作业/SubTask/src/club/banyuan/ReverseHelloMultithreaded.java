package club.banyuan;

public class ReverseHelloMultithreaded extends Thread {

  static int num = 50;

  @Override
  public void run() {
    if (num > 0) {
      System.out.println("Hello from thread " + num);
      ReverseHelloMultithreaded reverseHelloMultithreaded = new ReverseHelloMultithreaded();
      reverseHelloMultithreaded.start();
      num--;
    }
  }

  public static void doReverseHello() {

    ReverseHelloMultithreaded reverseHelloMultithreaded = new ReverseHelloMultithreaded();
    reverseHelloMultithreaded.start();
//        Thread thread = new Thread(() -> {
//            for (int i = 50; i >= 1; i--) {
//                System.out.println("Hello from thread " + i);
//            }
//        });
//        thread.start();

  }

}
