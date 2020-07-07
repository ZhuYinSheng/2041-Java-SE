package club.banyuan;

public class ReverseHelloMultithreaded extends Thread{


    public static void doReverseHello() {

        Thread thread = new Thread(() -> {
            for (int i = 50; i >= 1; i--) {
                System.out.println("Hello from thread " + i);
            }
        });
        thread.start();

    }

}
